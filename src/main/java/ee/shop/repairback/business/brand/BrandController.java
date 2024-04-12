package ee.shop.repairback.business.brand;


import ee.shop.repairback.business.brand.dto.BrandInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class BrandController {
    private BrandService brandService;

    @GetMapping("/brands")

    public List<BrandInfo> getBrands(){
        return brandService.getBrands();

    }
}
