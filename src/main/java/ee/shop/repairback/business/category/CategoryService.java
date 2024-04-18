package ee.shop.repairback.business.category;

import ee.shop.repairback.business.category.dto.CategoryInfo;
import ee.shop.repairback.business.category.dto.SubCategoryInfo;
import ee.shop.repairback.domain.category.Category;
import ee.shop.repairback.domain.category.CategoryMapper;
import ee.shop.repairback.domain.category.CategoryRepository;
import ee.shop.repairback.domain.subcategory.SubCategory;
import ee.shop.repairback.domain.subcategory.SubCategoryMapper;
import ee.shop.repairback.domain.subcategory.SubCategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final SubCategoryRepository subCategoryRepository;
    private final CategoryMapper categoryMapper;
    private final SubCategoryMapper subCategoryMapper;


    public List<CategoryInfo> getCategoryInfos() {
        List<Category> categories = categoryRepository.findAll();
        List<CategoryInfo> categoryInfos = categoryMapper.toCategoryInfos(categories);
        for (CategoryInfo categoryInfo : categoryInfos) {
            List<SubCategory> subCategories = subCategoryRepository.findSubCategoryBy(categoryInfo.getCategoryId());
            List<SubCategoryInfo> subCategoryInfos = subCategoryMapper.toSubCategoryInfos(subCategories);
            categoryInfo.setSubCategories(subCategoryInfos);
        }
        return categoryInfos;


    }
}
