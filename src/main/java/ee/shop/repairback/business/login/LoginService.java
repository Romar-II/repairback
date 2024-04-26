package ee.shop.repairback.business.login;

import ee.shop.repairback.business.login.dto.UserInfo;
import ee.shop.repairback.domain.infrastrcutre.ValidationService;
import ee.shop.repairback.domain.role.Role;
import ee.shop.repairback.domain.role.RoleRepository;
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
    private final RoleRepository roleRepository;

    public UserInfo login(String username, String password) {
        Optional<User> optionalUser = userRepository.findUserBy(username, password, Status.ACTIVE);
        User user = ValidationService.getValidExistingUser(optionalUser);
        return userMapper.toUserInfo(user);
    }

    public void addNewUserRegistration(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setStatus(Status.ACTIVE);
        Role role = roleRepository.getReferenceById(2);
        role.setId(2);
        userRepository.save(user);

    }

}
