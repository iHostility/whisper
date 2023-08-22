package su.hostile.whisper.exception;

/*
 * Author: Voloshin Denis
 * Date: 22-08-2023
 * Time: 20:54
 * E-mail: voloshin.developer@gmail.com
 */
public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(final String message) {

        super(message);
    }
}
