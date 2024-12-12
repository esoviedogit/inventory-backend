package com.company.inventory.infraestructure.repository;

import com.company.inventory.infraestructure.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity,Long> {
}
