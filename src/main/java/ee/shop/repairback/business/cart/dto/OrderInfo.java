package ee.shop.repairback.business.cart.dto;

import ee.shop.repairback.domain.order.Order;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Order}
 */
@Value
public class OrderInfo implements Serializable {
    Integer orderId;
    Integer userId;
    String orderStatus;
}