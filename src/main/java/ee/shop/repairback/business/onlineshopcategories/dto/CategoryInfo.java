package ee.shop.repairback.business.onlineshopcategories.dto;

import ee.shop.repairback.domain.category.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Category}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryInfo implements Serializable {
    Integer id;
    String name;
}