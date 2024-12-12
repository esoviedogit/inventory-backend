package com.company.inventory.infraestructure.conf;

import com.company.inventory.application.service.CategoryService;
import com.company.inventory.application.service.impl.CategoryServiceImpl;
import com.company.inventory.domain.puerto.CategoryPersistence;
import com.company.inventory.infraestructure.adapter.CategoryAdapter;
import com.company.inventory.infraestructure.repository.CategoryRepository;
import com.company.inventory.infraestructure.rest.mapper.CategoryMapper;

import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;
    @Bean
    public CategoryService categoryService() {
        return new CategoryServiceImpl(categoryPersistence());
    }

    @Bean
    public CategoryPersistence categoryPersistence() {
        return new CategoryAdapter(categoryMapper, categoryRepository);
    }
}