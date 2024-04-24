package ee.shop.repairback.domain.infrastrcutre.error;

import lombok.Data;

@Data
public class ApiError {
    private String message;
    private Integer errorCode;
}

