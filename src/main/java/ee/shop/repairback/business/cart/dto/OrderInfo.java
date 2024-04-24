package ee.shop.repairback.business.cart.dto;

import ee.shop.repairback.domain.order.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Order}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo implements Serializable {
    Integer orderId;
    Integer userId;
    String orderStatus;
}