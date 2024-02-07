package site.kellysday.kellysday.global.api.success;

import lombok.Getter;

@Getter
public class SingleSuccessApiResponse<T> extends SuccessApiResponse {

    private final T data;

    public SingleSuccessApiResponse(String message, T data) {
        super(message);
        this.data = data;
    }
}
