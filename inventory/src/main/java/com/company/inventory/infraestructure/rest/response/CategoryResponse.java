package com.company.inventory.infraestructure.rest.response;

import com.company.inventory.domain.dto.CategoryDTO;
import lombok.Data;

import java.util.List;
@Data
public class CategoryResponse {
    public CategoryDTO category;
    public List<CategoryDTO> listCategory;
}
