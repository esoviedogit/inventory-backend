package com.company.inventory.infraestructure.adapter;

import com.company.inventory.infraestructure.rest.mapper.CategoryMapper;
import com.company.inventory.domain.dto.CategoryDTO;
import com.company.inventory.infraestructure.repository.CategoryRepository;
import com.company.inventory.domain.puerto.CategoryPersistence;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@RequiredArgsConstructor
@Transactional
public class CategoryAdapter implements CategoryPersistence {
    private final CategoryMapper categoryMapper;
    private final CategoryRepository categoryRepository;
    @Override
    public List<CategoryDTO> getAllCategory() {
        return categoryMapper.toCategoryDTOList(categoryRepository.findAll());
    }
}
