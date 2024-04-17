package ee.shop.repairback.business.shopproducts;

import ee.shop.repairback.business.shopproducts.dto.ProductInfo;
import ee.shop.repairback.domain.product.Product;
import ee.shop.repairback.domain.product.ProductMapper;
import ee.shop.repairback.domain.product.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ShopProductsService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public List<ProductInfo> getProducts(Integer categoryId, Integer subCategory) {
        List<Product> productList;

        if (subCategory > 0) {
            productList = productRepository.findProductsBy(subCategory);
            List<ProductInfo> productInfos = productMapper.toProductInfos(productList);
            return productInfos;

        }
        productList = productRepository.findProductsByCategoryId(categoryId);
        List<ProductInfo> productInfos = productMapper.toProductInfos(productList);
        return  productInfos;
    }
}
