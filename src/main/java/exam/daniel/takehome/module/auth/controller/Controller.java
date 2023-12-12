package exam.daniel.takehome.module.auth.controller;

import exam.daniel.takehome.module.auth.response.UserResponse;
import exam.daniel.takehome.module.auth.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/auth")
public class Controller {

    private UserService userService;
    @RequestMapping(value = "/login", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<UserResponse> userLogin(@RequestHeader("Authorization") String auth){
        return ResponseEntity.ok(userService.getUserInfo(auth));
    }
}
