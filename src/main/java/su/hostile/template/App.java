package su.hostile.template;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

import static org.springframework.boot.SpringApplication.run;

@Slf4j
@SpringBootApplication
public class App {

    static {
        TimeZone.setDefault(TimeZone.getTimeZone("Etc/UTC"));
        log.info("Default Timezone set to UTC");
    }

    public static void main(String[] args) {
        log.info("Application starting...");
        run(App.class);
    }
}
