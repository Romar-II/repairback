package ee.shop.repairback.domain.order;

import ee.shop.repairback.business.cart.dto.OrderInfo;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface OrderMapper {
    Order toEntity(OrderInfo orderInfo);

    OrderInfo toDto(Order order);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Order partialUpdate(OrderInfo orderInfo, @MappingTarget Order order);
}