package trungtd1709.amz_be.amz.core.domain.constant;

import lombok.Data;
import lombok.Getter;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ResponseStatusCode {
    String code;
    int httpCode;
}
