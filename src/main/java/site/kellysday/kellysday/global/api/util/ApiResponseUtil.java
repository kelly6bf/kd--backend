package site.kellysday.kellysday.global.api.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import site.kellysday.kellysday.global.api.error.ErrorApiResponse;
import site.kellysday.kellysday.global.api.success.MultipleSuccessApiResponse;
import site.kellysday.kellysday.global.api.success.SingleSuccessApiResponse;
import site.kellysday.kellysday.global.api.success.SuccessApiResponse;
import site.kellysday.kellysday.global.error.ErrorCode;

import java.util.List;

public class ApiResponseUtil {

    public static ResponseEntity<SuccessApiResponse> success(HttpStatus httpStatus, String message) {
        return ResponseEntity.status(httpStatus)
                .body(new SuccessApiResponse(message));
    }

    public static <T> ResponseEntity<SingleSuccessApiResponse<T>> success(
            HttpStatus httpStatus,
            String message,
            T data
    ) {
        return ResponseEntity.status(httpStatus)
                .body(new SingleSuccessApiResponse<>(message, data));
    }

    public static <T> ResponseEntity<MultipleSuccessApiResponse<T>> success(
            HttpStatus httpStatus,
            String message,
            List<T> data
    ) {
        return ResponseEntity.status(httpStatus)
                .body(new MultipleSuccessApiResponse<>(message, data));
    }

    public static ResponseEntity<ErrorApiResponse> error(ErrorCode errorCode) {
        return ResponseEntity.status(errorCode.getHttpStatus())
                .body(ErrorApiResponse.of(errorCode));
    }

    public static ResponseEntity<ErrorApiResponse> error(ErrorCode errorCode, String message) {
        return ResponseEntity.status(errorCode.getHttpStatus())
                .body(ErrorApiResponse.of(errorCode, message));
    }
}
