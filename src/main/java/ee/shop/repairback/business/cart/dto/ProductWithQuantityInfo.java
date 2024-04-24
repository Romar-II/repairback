package ee.shop.repairback.business.cart.dto;

import ee.shop.repairback.domain.product.Product;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link Product}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithQuantityInfo implements Serializable {
    Integer productId;
    @Size(max = 255)
    String productName;
    BigDecimal productPrice;
    Integer qty;
}