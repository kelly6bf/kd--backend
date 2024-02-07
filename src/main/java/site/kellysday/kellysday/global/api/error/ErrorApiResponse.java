package site.kellysday.kellysday.global.api.error;

import lombok.Getter;
import site.kellysday.kellysday.global.api.util.GsonUtil;
import site.kellysday.kellysday.global.error.ErrorCode;

import java.time.LocalDateTime;

@Getter
public class ErrorApiResponse {

    private final String errorCode;
    private final String message;
    private final LocalDateTime timestamp = LocalDateTime.now();

    private ErrorApiResponse(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public static ErrorApiResponse of(ErrorCode errorCode) {
        return new ErrorApiResponse(errorCode.getCode(), errorCode.getMessage());
    }

    public static ErrorApiResponse of(ErrorCode errorCode, String message) {
        return new ErrorApiResponse(errorCode.getCode(), message);
    }

    public String convertToJson() {
        return GsonUtil.toJson(this);
    }
}
