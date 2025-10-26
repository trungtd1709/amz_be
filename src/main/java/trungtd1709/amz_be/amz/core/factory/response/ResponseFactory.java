package trungtd1709.amz_be.amz.core.factory.response;

import org.springframework.http.HttpStatus;

public class ResponseFactory {

    private ResponseFactory() {
        // Private constructor to prevent instantiation
    }

    /**
     * Creates a successful response with data
     */
    public static <T> GeneralResponse<T> success(T data) {
        GeneralResponse<T> response = new GeneralResponse<>(data);
        response.setStatus(ResponseStatus.SUCCESS);
        return response;
    }

    /**
     * Creates a successful response with custom message
     */
    public static <T> GeneralResponse<T> success(T data, String message) {
        GeneralResponse<T> response = new GeneralResponse<>(data);
        response.setStatus(ResponseStatus.SUCCESS);
        return response;
    }

    /**
     * Creates a created response (for POST operations)
     */
    public static <T> GeneralResponse<T> created(T data) {
        GeneralResponse<T> response = new GeneralResponse<>(data);
        response.setStatus(ResponseStatus.CREATED);
        return response;
    }

    /**
     * Creates an error response with predefined status
     */
    public static <T> GeneralResponse<T> error(ResponseStatus status) {
        GeneralResponse<T> response = new GeneralResponse<>();
        response.setStatus(status);
        return response;
    }

    /**
     * Creates an error response with data
     */
    public static <T> GeneralResponse<T> error(T data, ResponseStatus status) {
        GeneralResponse<T> response = new GeneralResponse<>(data);
        response.setStatus(status);
        return response;
    }

    /**
     * Creates an error response with custom message
     */
    public static <T> GeneralResponse<T> error(String code, String message) {
        GeneralResponse<T> response = new GeneralResponse<>();
        response.setStatus(ResponseStatus.BAD_REQUEST);
        return response;
    }

    /**
     * Creates a validation error response
     */
    public static <T> GeneralResponse<T> validationError(T errors) {
        GeneralResponse<T> response = new GeneralResponse<>(errors);
        response.setStatus(ResponseStatus.VALIDATION_ERROR);
        return response;
    }
}