package com.company.inventory.infraestructure.rest.response.rest;

import com.company.inventory.infraestructure.rest.response.CategoryResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CategoryResponseRest extends ResponseRest {
    CategoryResponse categoryResponse = new CategoryResponse();
}
