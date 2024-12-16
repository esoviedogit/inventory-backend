package com.company.inventory.infraestructure.adapter;

import com.company.inventory.infraestructure.entity.CategoryEntity;
import com.company.inventory.infraestructure.exceptions.ResourceNotFoundException;
import com.company.inventory.infraestructure.rest.mapper.CategoryMapper;
import com.company.inventory.domain.dto.CategoryDTO;
import com.company.inventory.infraestructure.repository.CategoryRepository;
import com.company.inventory.domain.puerto.CategoryPersistence;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@RequiredArgsConstructor
@Transactional
public class CategoryAdapter implements CategoryPersistence {
    private final CategoryMapper categoryMapper;
    private final CategoryRepository categoryRepository;

    @Override
    public List<CategoryDTO> getAllCategory() {
        return categoryMapper.toCategoryDTOList(categoryRepository.findAll());
    }

    @Override
    public CategoryDTO getCategoryById(Integer codigo) {
        return categoryMapper.toCategoryDTO(categoryRepository.
                findByCodigoCategoria(codigo).orElseThrow(()-> new ResourceNotFoundException("Recurso no encontrado")
                ));
    }

    @Override
    public CategoryDTO saveCategory(CategoryDTO categoryDTO) {
        CategoryEntity resp = categoryRepository.save(categoryMapper.toCategoryEntity(categoryDTO));
        Objects.requireNonNull(resp, () -> {
            throw new ResourceNotFoundException("Don't Save");
        });
        return categoryMapper.toCategoryDTO(resp);
    }
}
