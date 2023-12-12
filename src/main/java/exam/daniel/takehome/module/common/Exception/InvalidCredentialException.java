package exam.daniel.takehome.module.common.Exception;

import lombok.Getter;

@Getter
public class InvalidCredentialException extends RuntimeException{
    private final String message = "Login Failed!";
    public InvalidCredentialException() {
        super("Login Failed!");
    }
}
