package ee.shop.repairback.domain.product;

import ee.shop.repairback.business.cart.dto.ProductWithQuantityInfo;
import ee.shop.repairback.domain.orderitem.OrderItem;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductWithQtyMapper {
 @Mapping(source = "id",target = "productId")
 @Mapping(source = "name",target = "productName")
 @Mapping(source = "price",target = "productPrice")

    ProductWithQuantityInfo toProductWithQuantityInfo(Product product);
    List<ProductWithQuantityInfo> toProductWithQuantityInfos (List<Product>  products);

}