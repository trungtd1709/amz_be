package trungtd1709.amz_be.amz.core.factory.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class GeneralResponse<T> {
    @JsonProperty("status")
    private ResponseStatus status;
    @JsonProperty("data")
    private T data;

    public GeneralResponse(T data) {
        this.data = data;
    }

    public String toString() {
        return "{status=" + this.status + ", data=" + this.data.toString() + '}';
    }

    @JsonProperty("status")
    public void setStatus(final ResponseStatus status) {
        this.status = status;
    }

    @JsonProperty("data")
    public void setData(final T data) {
        this.data = data;
    }

    public GeneralResponse() {
    }
}
