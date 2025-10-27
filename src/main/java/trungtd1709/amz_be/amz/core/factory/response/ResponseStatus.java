package trungtd1709.amz_be.amz.core.factory.response;

import lombok.Getter;

@Getter
public enum ResponseStatus {
    // Success responses
    SUCCESS(200, "SUCCESS"),
    CREATED(201, "CREATED"),

    // Client error responses
    BAD_REQUEST(400, "BAD_REQUEST"),
    UNAUTHORIZED(401, "UNAUTHORIZED"),
    FORBIDDEN(403, "FORBIDDEN"),
    NOT_FOUND(404, "NOT_FOUND"),
    VALIDATION_ERROR(422, "VALIDATION_ERROR"),
    DUPLICATE(409, "DUPLICATE"),

    // Server error responses
    INTERNAL_SERVER_ERROR(500, "INTERNAL_SERVER_ERROR"),
    SERVICE_UNAVAILABLE(503, "SERVICE_UNAVAILABLE");

    private final int code;
    private final String message;

    ResponseStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }
}