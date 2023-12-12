package exam.daniel.takehome.module.auth.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserResponse {
    private String lastName;
    private String firstName;
    private String middleName;
    private String birthDate;
}
