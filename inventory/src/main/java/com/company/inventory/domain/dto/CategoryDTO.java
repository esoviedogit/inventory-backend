package com.company.inventory.domain.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {
    private Integer codigoCategoria;
    private String nombre;
    private String descripcion;
}
