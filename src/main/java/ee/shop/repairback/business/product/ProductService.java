package ee.shop.repairback.business.product;

import ee.shop.repairback.business.product.dto.ProductInfo;
import ee.shop.repairback.domain.image.Image;
import ee.shop.repairback.domain.image.ImageRepository;
import ee.shop.repairback.domain.product.Product;
import ee.shop.repairback.domain.product.ProductMapper;
import ee.shop.repairback.domain.product.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import util.StringConverter;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    private final ImageRepository imageRepository;

    public List<ProductInfo> getProducts(Integer categoryId, Integer subCategoryId) {
        List<Product> productList;

        if (subCategoryId > 0) {
            productList = productRepository.findProductsBy(subCategoryId);
            List<ProductInfo> productInfos = productMapper.toProductInfos(productList);
            for(ProductInfo productinfo : productInfos){
                Image image = imageRepository.findByProduct_Id(productinfo.getProductId());
                if(image!=null){
                    String imageInString = StringConverter.bytesToString(image.getData());
                    productinfo.setProductImage(imageInString);}
            }
            return productInfos;

        }
        productList = productRepository.findProductsByCategoryId(categoryId);
        List<ProductInfo> productInfos = productMapper.toProductInfos(productList);
        for(ProductInfo productinfo : productInfos){
            Image image = imageRepository.findByProduct_Id(productinfo.getProductId());
            if(image!=null){
                String imageInString = StringConverter.bytesToString(image.getData());
                productinfo.setProductImage(imageInString);}

        }
        return  productInfos;
    }
}
