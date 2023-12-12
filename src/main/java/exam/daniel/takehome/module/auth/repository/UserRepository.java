package exam.daniel.takehome.module.auth.repository;

import exam.daniel.takehome.module.auth.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

    //intended method name since in the User Entity, field name is "username" according to the specification
    Optional<User> findByusername(String username);
}
