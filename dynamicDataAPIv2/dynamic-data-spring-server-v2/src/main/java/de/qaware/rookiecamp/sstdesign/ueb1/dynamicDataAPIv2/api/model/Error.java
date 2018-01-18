package de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import org.springframework.http.HttpStatus;

import java.util.Objects;

/**
 * business errors
 */
@ApiModel(description = "business errors")
public class Error {

    @JsonProperty
    private ErrorCode errorCode;

    @JsonProperty
    private String message;


    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public Error message(String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Error error = (Error) o;
        return Objects.equals(this.errorCode, error.errorCode) &&
                Objects.equals(this.message, error.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Error {\n");

        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public enum ErrorCode {
        NOT_FOUND(HttpStatus.OK), UNEXPECTED_ERROR(HttpStatus.INTERNAL_SERVER_ERROR), USER_NOT_ALLOWED(HttpStatus.FORBIDDEN), BACKEND_ERROR(HttpStatus.BAD_GATEWAY);

        HttpStatus status;
        ErrorCode(HttpStatus status){
            this.status = status;
        }

        public HttpStatus getHttpStatus() {
            return status;
        }

        public static ErrorCode fromHttpStatusCode(HttpStatus httpCode) {
            switch (httpCode){
                case OK:
                    return NOT_FOUND;
                case INTERNAL_SERVER_ERROR:
                    return UNEXPECTED_ERROR;
                case FORBIDDEN:
                    return USER_NOT_ALLOWED;
                case BAD_GATEWAY:
                    return BACKEND_ERROR;
                default:
                    return UNEXPECTED_ERROR;
            }
        }
    }
}

