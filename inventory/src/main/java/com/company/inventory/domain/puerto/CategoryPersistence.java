package com.company.inventory.domain.puerto;

import com.company.inventory.domain.dto.CategoryDTO;

import java.util.List;
import java.util.Optional;

public interface CategoryPersistence {
    List<CategoryDTO> getAllCategory();
    CategoryDTO getCategoryById(Integer codigo);
    CategoryDTO saveCategory(CategoryDTO categoryDTO);
}
