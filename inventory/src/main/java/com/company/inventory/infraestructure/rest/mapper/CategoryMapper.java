package com.company.inventory.infraestructure.rest.mapper;

import com.company.inventory.domain.dto.CategoryDTO;
import com.company.inventory.infraestructure.entity.CategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface CategoryMapper {
    CategoryEntity toCategoryEntity(CategoryDTO categoryDTO);

    CategoryDTO toCategoryDTO(CategoryEntity categoryEntity);

    List<CategoryDTO> toCategoryDTOList(List<CategoryEntity> categoryEntityList);
}