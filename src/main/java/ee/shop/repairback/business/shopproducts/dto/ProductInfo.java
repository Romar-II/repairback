package ee.shop.repairback.business.shopproducts.dto;

import ee.shop.repairback.domain.product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link Product}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductInfo implements Serializable {
    Integer productId;
    String productName;
    BigDecimal productPrice;
    String productDescription;
}