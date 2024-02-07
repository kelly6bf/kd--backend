package site.kellysday.kellysday.global.error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import site.kellysday.kellysday.global.api.error.ErrorApiResponse;
import site.kellysday.kellysday.global.api.util.ApiResponseUtil;

import static site.kellysday.kellysday.global.error.GlobalErrorCode.GLOBAL_SERVER_ERROR;
import static site.kellysday.kellysday.global.error.GlobalErrorCode.INVALID_REQUEST_METHOD;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    protected ResponseEntity<ErrorApiResponse> handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException exception) {
        log.error("[handle HttpRequestMethodNotSupportedException] - {}", INVALID_REQUEST_METHOD.getMessage());

        return ApiResponseUtil.error(INVALID_REQUEST_METHOD);
    }

    @ExceptionHandler
    protected ResponseEntity<ErrorApiResponse> handleException(Exception exception) {
        log.error("[handle Exception] - {}", exception.getMessage());

        return ApiResponseUtil.error(GLOBAL_SERVER_ERROR);
    }
}
