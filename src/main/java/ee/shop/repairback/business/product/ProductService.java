package ee.shop.repairback.business.product;

import ee.shop.repairback.business.product.dto.ProductInfo;
import ee.shop.repairback.domain.product.Product;
import ee.shop.repairback.domain.product.ProductMapper;
import ee.shop.repairback.domain.product.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public List<ProductInfo> getProducts(Integer categoryId, Integer subCategoryId) {
        List<Product> productList;

        if (subCategoryId > 0) {
            productList = productRepository.findProductsBy(subCategoryId);
            List<ProductInfo> productInfos = productMapper.toProductInfos(productList);
            return productInfos;

        }
        productList = productRepository.findProductsByCategoryId(categoryId);
        List<ProductInfo> productInfos = productMapper.toProductInfos(productList);
        return  productInfos;
    }
}
