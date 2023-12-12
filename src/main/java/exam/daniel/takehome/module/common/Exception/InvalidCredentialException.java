package exam.daniel.takehome.module.common.Exception;

import lombok.Getter;

@Getter
public class InvalidCredentialException extends RuntimeException{
    private final String message = "login failed!";
    public InvalidCredentialException() {
        super("login Failed!");
    }
}
