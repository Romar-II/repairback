package ee.shop.repairback.domain.modelyear;

import ee.shop.repairback.business.year.dto.ModelYearInfo;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ModelYearMapper {

    ModelYearInfo toDto(ModelYear modelYear);

}