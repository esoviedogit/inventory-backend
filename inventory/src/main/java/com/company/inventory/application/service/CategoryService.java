package com.company.inventory.application.service;

import com.company.inventory.domain.dto.CategoryDTO;
import com.company.inventory.infraestructure.rest.response.rest.CategoryResponseRest;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CategoryService {
      public List<CategoryDTO> getAllCategory();
}
