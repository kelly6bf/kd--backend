package site.kellysday.kellysday.global.error;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.METHOD_NOT_ALLOWED;

@Getter
public enum GlobalErrorCode implements ErrorCode {

    INVALID_REQUEST_METHOD("GB-C-0001", METHOD_NOT_ALLOWED, "유효하지 않은 요청 메서드입니다."),

    GLOBAL_SERVER_ERROR("GB-S-0001", INTERNAL_SERVER_ERROR, "Internal Server Error");

    private final String code;
    private final HttpStatus httpStatus;
    private final String message;

    GlobalErrorCode(
            String code,
            HttpStatus httpStatus,
            String message
    ) {
        this.code = code;
        this.httpStatus = httpStatus;
        this.message = message;
    }
}
