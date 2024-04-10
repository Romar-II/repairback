package ee.shop.repairback.domain.brand;

import ee.shop.repairback.business.brand.dto.BrandInfo;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface BrandMapper {

@Mapping(source = "id", target = "brandId")
@Mapping(source = "name", target = "brandName")
    BrandInfo toBrandInfo(Brand brand);

    List<BrandInfo> toBrandInfos(List<Brand> brands);





}