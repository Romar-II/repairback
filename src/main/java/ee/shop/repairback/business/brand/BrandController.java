package ee.shop.repairback.business.brand;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BrandController {
    private BrandService brandService;
}
