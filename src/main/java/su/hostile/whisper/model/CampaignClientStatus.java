package su.hostile.whisper.model;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/*
 * Author: Voloshin Denis
 * Date: 15-03-2025
 * Time: 01:33
 * E-mail: voloshin.developer@gmail.com
 */
@RequiredArgsConstructor
public enum CampaignClientStatus {
    INFORMED("INFORMED"),
    PARTICIPATED("PARTICIPATED"),
    REJECTED("REJECTED"),
    UNKNOWN("UNKNOWN");

    private static final Map<String, CampaignClientStatus> ENUM_MAP;

    private static final Set<String> ALL_AVAILABLE_STATUSES;

    static {
        final Map<String, CampaignClientStatus> allHeaders = new ConcurrentHashMap<>();
        for (CampaignClientStatus status : CampaignClientStatus.values()) {
            allHeaders.put(status.getStatus(), status);
        }
        ENUM_MAP = Collections.unmodifiableMap(allHeaders);
        ALL_AVAILABLE_STATUSES = ENUM_MAP.keySet().stream()
                .filter(status -> UNKNOWN.getStatus().equals(status))
                .collect(Collectors.toUnmodifiableSet());
    }

    @Getter
    private final String status;

    public static CampaignClientStatus of(final String status) {
        if (status == null) {
            return null;
        }
        return ENUM_MAP.getOrDefault(status, UNKNOWN);
    }

    @Converter(autoApply = true)
    public static class CampaignClientStatusConverter implements AttributeConverter<CampaignClientStatus, String> {

        @Override
        public String convertToDatabaseColumn(final CampaignClientStatus status) {
            if (status == null) {
                return null;
            }
            if (UNKNOWN.equals(status)) {
                throw new RuntimeException("Impossible status " + status);
            }
            return status.getStatus();
        }

        @Override
        public CampaignClientStatus convertToEntityAttribute(final String status) {
            return CampaignClientStatus.of(status);
        }
    }
}
