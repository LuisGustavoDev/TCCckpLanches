package com.fiec.ckplanches.DTO;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.fiec.ckplanches.model.supply.Supply;

public record ProductCreateDTO(
    String productName,
    Double productValue,
    MultipartFile imagem, // Arquivo da imagem
    String description,
    List<Supply> supplies 
) {
    
}
