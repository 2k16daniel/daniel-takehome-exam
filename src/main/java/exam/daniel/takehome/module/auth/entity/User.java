package exam.daniel.takehome.module.auth.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Entity(name = "user_db")
@Getter
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String username;
    private String password;
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthDate;
}
