package exam.daniel.takehome.module.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class Controller {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String userLogin(){
        return "Nice you found this endpoint!";
    }
}
