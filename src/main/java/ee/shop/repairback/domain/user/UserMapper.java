package ee.shop.repairback.domain.user;

import ee.shop.repairback.business.login.dto.UserInfo;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    @Mapping(source = "id",target = "userId")
    @Mapping(source = "role.name",target = "roleName")

    UserInfo toUserInfo(User user);

}