package su.hostile.whisper.exception;

/*
 * Author: Voloshin Denis
 * Date: 14-03-2025
 * Time: 22:31
 * E-mail: voloshin.developer@gmail.com
 */
public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(final String message) {

        super(message);
    }
}
