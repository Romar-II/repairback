package ee.shop.repairback.business.cart.dto;

import ee.shop.repairback.domain.orderitem.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link OrderItem}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemRequest implements Serializable {
    private Integer productId;
    private Integer repairItemId;
}