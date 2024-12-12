package com.company.inventory.application.service.impl;

import com.company.inventory.domain.dto.CategoryDTO;
import com.company.inventory.domain.puerto.CategoryPersistence;
import com.company.inventory.application.service.CategoryService;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryPersistence categoryPersistence;
    @Override
    public List<CategoryDTO> getAllCategory() {
        return categoryPersistence.getAllCategory();
    }
}
