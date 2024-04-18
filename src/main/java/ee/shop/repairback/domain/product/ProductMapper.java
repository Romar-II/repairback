package ee.shop.repairback.domain.product;

import ee.shop.repairback.business.product.dto.ProductInfo;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductMapper {

    @Mapping(source = "id", target = "productId")
    @Mapping(source = "name", target = "productName")
    @Mapping(source = "description", target = "productDescription")
    @Mapping(source = "price", target = "productPrice")
    ProductInfo toProductInfo(Product product);

    List<ProductInfo> toProductInfos(List<Product> products);
}