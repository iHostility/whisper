package su.hostile.whisper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

import static org.springframework.boot.SpringApplication.run;

/*
 * Author: Voloshin Denis
 * Date: 14-03-2025
 * Time: 22:31
 * E-mail: voloshin.developer@gmail.com
 */
@Slf4j
@SpringBootApplication
public class App {

    static {
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/Moscow"));
        log.info("Default Timezone set to Europe/Moscow");
    }

    public static void main(String[] args) {

        log.info("Application starting...");
        run(App.class);
    }
}
