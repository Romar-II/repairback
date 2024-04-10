package ee.shop.repairback.domain.brand;

import ee.shop.repairback.business.brand.BrandInfo;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface BrandMapper {
    Brand toEntity(BrandInfo brandInfo);

    BrandInfo toDto(Brand brand);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Brand partialUpdate(BrandInfo brandInfo, @MappingTarget Brand brand);
}