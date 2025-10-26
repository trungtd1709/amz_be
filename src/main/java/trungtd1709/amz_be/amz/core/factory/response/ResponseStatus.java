package trungtd1709.amz_be.amz.core.factory.response;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum ResponseStatus {
    // Success responses
    SUCCESS("SUCCESS", "Operation completed successfully"),
    CREATED("CREATED", "Resource created successfully"),

    // Client error responses
    BAD_REQUEST("BAD_REQUEST", "Invalid request parameters"),
    UNAUTHORIZED("UNAUTHORIZED", "Authentication required"),
    FORBIDDEN("FORBIDDEN", "Access denied"),
    NOT_FOUND("NOT_FOUND", "Resource not found"),
    VALIDATION_ERROR("VALIDATION_ERROR", "Validation failed"),
    DUPLICATE("DUPLICATE", "Resource already exists"),

    // Server error responses
    INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR", "Internal server error occurred"),
    SERVICE_UNAVAILABLE("SERVICE_UNAVAILABLE", "Service temporarily unavailable");

    private final String code;
    private final String message;

    ResponseStatus(String code, String message) {
        this.code = code;
        this.message = message;
    }
}