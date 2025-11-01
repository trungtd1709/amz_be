package trungtd1709.amz_be.amz.core.factory.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseStatus implements Serializable {

    private String code;

    @JsonProperty("message")
    private String message;

    @JsonProperty("responseTime")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private Date responseTime;

    @JsonProperty("displayMessage")
    private String displayMessage;
}