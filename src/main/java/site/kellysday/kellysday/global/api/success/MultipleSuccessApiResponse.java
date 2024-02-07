package site.kellysday.kellysday.global.api.success;

import lombok.Getter;

import java.util.List;

@Getter
public class MultipleSuccessApiResponse<T> extends SuccessApiResponse{

    private final List<T> data;

    public MultipleSuccessApiResponse(String message, List<T> data) {
        super(message);
        this.data = data;
    }
}
