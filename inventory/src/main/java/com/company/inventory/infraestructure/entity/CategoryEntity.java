package com.company.inventory.infraestructure.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="category")
public class CategoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codigocategoria")
    private Integer codigoCategoria;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;

}
