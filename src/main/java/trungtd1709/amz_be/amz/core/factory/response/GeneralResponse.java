package trungtd1709.amz_be.amz.core.factory.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeneralResponse<T> {
    @JsonProperty("code")
    private int code;

    @JsonProperty("message")
    private String message;

    @JsonProperty("data")
    private T data;

    public GeneralResponse(T data) {
        this.data = data;
    }

    public GeneralResponse() {
    }

    public void setStatus(final ResponseStatus status) {
        this.code = status.getCode();
        this.message = status.getMessage();
    }

    public String toString() {
        return "{code=" + this.code + ", message='" + this.message + "', data=" + this.data + '}';
    }
}
