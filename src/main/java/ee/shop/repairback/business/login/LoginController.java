package ee.shop.repairback.business.login;


import ee.shop.repairback.business.login.dto.UserInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class LoginController {

    private LoginService loginService;


    @GetMapping("/login")
   public UserInfo login(@RequestParam String username, @RequestParam String password) {
        return loginService.login(username, password);
    }

}
