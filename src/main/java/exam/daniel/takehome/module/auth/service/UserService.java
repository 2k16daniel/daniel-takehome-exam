package exam.daniel.takehome.module.auth.service;

import exam.daniel.takehome.module.auth.response.UserResponse;

public interface UserService {
     UserResponse getUserInfo(String auth);
}
