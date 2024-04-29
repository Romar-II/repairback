package ee.shop.repairback.domain.order;

import ee.shop.repairback.business.cart.dto.OrderInfo;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface OrderMapper {

@Mapping(source = "id",target = "orderId")
    OrderInfo toDto(Order order);
    List<OrderInfo> toOrderInfos(List<Order> order);


}