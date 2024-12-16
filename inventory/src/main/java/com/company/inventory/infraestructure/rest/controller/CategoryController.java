package com.company.inventory.infraestructure.rest.controller;

import com.company.inventory.application.service.CategoryService;
import com.company.inventory.domain.dto.CategoryDTO;
import com.company.inventory.infraestructure.rest.response.CategoryResponse;
import com.company.inventory.infraestructure.rest.response.rest.CategoryResponseRest;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
@Slf4j
public class CategoryController {

    private final CategoryService categoryService;
    @Operation(summary = "EndPoint que devuelve la lista de todos los categoryes")
    @GetMapping
    public ResponseEntity<CategoryResponseRest> getAllCategory() {
        try {
            CategoryResponseRest response = new CategoryResponseRest();
            response.getCategoryResponse().setListCategory(categoryService.getAllCategory());
            response.setMetadata("OK", "200", "success");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            log.error("Error al obtener categorías", e);
            CategoryResponseRest errorResponse = new CategoryResponseRest();
            errorResponse.setMetadata("FAIL", "-1", "unsuccess");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<CategoryResponseRest> getProduct (@PathVariable Integer id){
        try {
            CategoryResponseRest response = new CategoryResponseRest();
            response.setCategoryResponse(new CategoryResponse());
            response.getCategoryResponse().setCategory(categoryService.getCategoryById(id));

            response.setMetadata("OK", "200", "success");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            log.error("Error al obtener categorías", e);
            CategoryResponseRest errorResponse = new CategoryResponseRest();
            errorResponse.setMetadata("FAIL", "-1", "unsuccess");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }

    @Operation(summary = "EndPoint para guardar  Categoria")
    @PostMapping
    public ResponseEntity<CategoryResponseRest> saveCategory(@Valid @RequestBody CategoryDTO categoryDTO) {
        try {

            CategoryResponseRest response = new CategoryResponseRest();
            response.setCategoryResponse(new CategoryResponse());
            response.getCategoryResponse().setCategory(categoryService.saveCategory(categoryDTO));

            response.setMetadata("OK", "200", "success");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            log.error("Error al obtener categorías", e);
            CategoryResponseRest errorResponse = new CategoryResponseRest();
            errorResponse.setMetadata("FAIL", "-1", "unsuccess");
            return ResponseEntity.status(HttpStatus.CONFLICT).body(errorResponse);
        }

    }
}
