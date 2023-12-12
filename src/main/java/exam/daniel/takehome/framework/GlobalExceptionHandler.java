package exam.daniel.takehome.framework;

import exam.daniel.takehome.framework.globalresponse.ErrorResponse;
import exam.daniel.takehome.module.common.Exception.InvalidCredentialException;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ResponseBody
    @ExceptionHandler(value = InvalidCredentialException.class)
    public ResponseEntity<ErrorResponse> serviceException(HttpServletResponse response, InvalidCredentialException ex) {
        ErrorResponse error = new ErrorResponse(ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.UNAUTHORIZED);
    }
}
