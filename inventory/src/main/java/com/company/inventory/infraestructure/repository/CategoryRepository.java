package com.company.inventory.infraestructure.repository;

import com.company.inventory.infraestructure.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<CategoryEntity,Long> {
    Optional<CategoryEntity> findByCodigoCategoria(Integer codigoCategory);
}
