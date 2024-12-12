package com.company.inventory.infraestructure.rest.controller;

import com.company.inventory.application.service.CategoryService;
import com.company.inventory.domain.dto.CategoryDTO;
import com.company.inventory.infraestructure.rest.response.rest.CategoryResponseRest;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
@Slf4j
public class CategoryController {

    private final CategoryService categoryService;
    @Operation(summary = "EndPoint que devuelve la lista de todos los gestores")
    @GetMapping
    public ResponseEntity<CategoryResponseRest> getAllCategory() {
        try {
            CategoryResponseRest response = new CategoryResponseRest();
            response.getCategoryResponse().setCategory(categoryService.getAllCategory());
            response.setMetadata("OK", "200", "success");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            log.error("Error al obtener categorías", e);
            CategoryResponseRest errorResponse = new CategoryResponseRest();
            errorResponse.setMetadata("FAIL", "-1", "unsuccess");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }
}
