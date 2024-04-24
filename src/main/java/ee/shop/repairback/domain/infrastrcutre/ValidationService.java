package ee.shop.repairback.domain.infrastrcutre;

import ee.shop.repairback.domain.infrastrcutre.exception.ForbiddenException;
import ee.shop.repairback.domain.user.User;

import java.util.Optional;

import static ee.shop.repairback.domain.infrastrcutre.error.Error.INCORRECT_CREDENTIALS;

public class ValidationService {

    public static User getValidExistingUser(Optional<User> optionalUser) {
        if (optionalUser.isEmpty()) {
            throw new ForbiddenException(INCORRECT_CREDENTIALS.getMessage(), INCORRECT_CREDENTIALS.getErrorCode());
        }
        return optionalUser.get();
    }
}