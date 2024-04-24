package ee.shop.repairback.domain.orderitem;

import ee.shop.repairback.business.cart.dto.OrderItemRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface OrderItemMapper {

    

}