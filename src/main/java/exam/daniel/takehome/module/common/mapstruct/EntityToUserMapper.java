package exam.daniel.takehome.module.common.mapstruct;

import exam.daniel.takehome.module.auth.entity.User;
import exam.daniel.takehome.module.auth.response.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EntityToUserMapper {
    EntityToUserMapper INSTANCE = Mappers.getMapper(EntityToUserMapper.class);
    @Mapping(source = "birthDate", target = "birthDate", dateFormat = "MM/dd/yyyy")
    UserResponse entityToModel(User user);
}
