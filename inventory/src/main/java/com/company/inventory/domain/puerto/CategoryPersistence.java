package com.company.inventory.domain.puerto;

import com.company.inventory.domain.dto.CategoryDTO;

import java.util.List;

public interface CategoryPersistence {
    List<CategoryDTO> getAllCategory();
}
