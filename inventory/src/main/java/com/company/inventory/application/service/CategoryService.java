package com.company.inventory.application.service;

import com.company.inventory.domain.dto.CategoryDTO;
import com.company.inventory.infraestructure.entity.CategoryEntity;
import com.company.inventory.infraestructure.rest.response.rest.CategoryResponseRest;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getAllCategory();

    CategoryDTO getCategoryById(Integer codigo);

    CategoryDTO saveCategory(CategoryDTO categoryDTO);
}
