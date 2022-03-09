package club.aibyte;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Author Yang Chan
 * @Package_name club.aibyte
 * @Project_name Blog_YangChan
 * @Create 2022-03 05
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFountException extends RuntimeException {
    public NotFountException() {
    }

    public NotFountException(String message) {
        super(message);
    }

    public NotFountException(String message, Throwable cause) {
        super(message, cause);
    }
}
