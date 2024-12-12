package com.company.inventory.infraestructure.exceptions;

import lombok.Data;

@Data
public class Error {
    private String code;
    private String message;

}
