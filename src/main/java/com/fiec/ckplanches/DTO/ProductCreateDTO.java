package com.fiec.ckplanches.DTO;

import com.fiec.ckplanches.model.enums.Category;

public record ProductCreateDTO(
    String productName,
    Double productValue,
    String description,
    int[] idSupllies,
    Category category
) {
    
}
