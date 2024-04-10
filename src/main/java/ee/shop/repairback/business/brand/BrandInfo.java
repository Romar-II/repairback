package ee.shop.repairback.business.brand;

import ee.shop.repairback.domain.brand.Brand;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link Brand}
 */



@Data
@AllArgsConstructor
@NoArgsConstructor
public class BrandInfo implements Serializable {
    private Integer brandId;
    private String brandName;
}