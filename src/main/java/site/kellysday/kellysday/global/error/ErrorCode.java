package site.kellysday.kellysday.global.error;

import org.springframework.http.HttpStatus;

public interface ErrorCode {

    String getCode();

    HttpStatus getHttpStatus();

    String getMessage();
}
