package exam.daniel.takehome.module.auth.service.impl;

import exam.daniel.takehome.module.auth.entity.User;
import exam.daniel.takehome.module.auth.repository.UserRepository;
import exam.daniel.takehome.module.auth.response.UserResponse;
import exam.daniel.takehome.module.auth.service.UserService;
import exam.daniel.takehome.module.common.CryptoUtil;
import exam.daniel.takehome.module.common.Exception.InvalidCredentialException;
import exam.daniel.takehome.module.common.mapstruct.EntityToUserMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    private final int INDEX_USERNAME = 0;
    private final int INDEX_PASSWORD = 1;
    @Override
    public UserResponse getUserInfo(String auth) {
        log.info("UserServiceImpl ==== getUserInfo() === Auth {}",auth);

        if(this.isValidAuth(auth)){
            String decodedAuth = CryptoUtil.Base64ToString(auth.substring(6));
            String[] authArray = this.authExtractor(decodedAuth);
            String passwordInMD5 = CryptoUtil.StringToMD5(authArray[INDEX_PASSWORD]);
            Optional<User> user = userRepository.findByusername(authArray[INDEX_USERNAME]);
            if(user.isPresent() && ObjectUtils.nullSafeEquals(user.get().getPassword(),passwordInMD5)){
                return EntityToUserMapper.INSTANCE.entityToModel(user.get());
            }
        }
        throw new InvalidCredentialException();
    }

    private String[] authExtractor(String decodedAuth){
        return decodedAuth.split(":");
    }

    private Boolean isValidAuth(String auth){
        return !ObjectUtils.isEmpty(auth) && auth.startsWith("Basic ");
    }
}
