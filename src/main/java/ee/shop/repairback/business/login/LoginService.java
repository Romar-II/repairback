package ee.shop.repairback.business.login;

import ee.shop.repairback.business.login.dto.UserInfo;
import ee.shop.repairback.domain.infrastrcutre.ValidationService;
import ee.shop.repairback.domain.user.User;
import ee.shop.repairback.domain.user.UserMapper;
import ee.shop.repairback.domain.user.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor

public class LoginService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserInfo login(String username, String password) {
        Optional<User> optionalUser = userRepository.findUserBy(username, password, Status.ACTIVE);
        User user = ValidationService.getValidExistingUser(optionalUser);
        return userMapper.toUserInfo(user);
    }

}
