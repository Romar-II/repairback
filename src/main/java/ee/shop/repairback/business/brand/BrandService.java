package ee.shop.repairback.business.brand;

import ee.shop.repairback.business.brand.dto.BrandInfo;
import ee.shop.repairback.domain.brand.Brand;
import ee.shop.repairback.domain.brand.BrandMapper;
import ee.shop.repairback.domain.brand.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BrandService {

    private final BrandRepository brandRepository;
    private final BrandMapper brandMapper;

    public List<BrandInfo> getBrands() {
        List<Brand> brands = brandRepository.findAll();
        return brandMapper.toBrandInfos(brands);
    }
}
