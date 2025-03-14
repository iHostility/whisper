package su.hostile.whisper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/*
 * Author: Voloshin Denis
 * Date: 14-03-2025
 * Time: 22:31
 * E-mail: voloshin.developer@gmail.com
 */
@SpringJUnitConfig
public class AppTest {

    @Autowired
    ApplicationContext context;

    @Test
    void givenAppContext_whenAppStart_thenContextNotNull() {
        assertNotNull(context, "Application context is null");
    }
}
