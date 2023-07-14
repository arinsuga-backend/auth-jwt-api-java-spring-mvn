package com.arins.appbase.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.arins.appbase.dto.DtoProduct;


@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    @GetMapping
    public DtoProduct product() {
        var hasil = new DtoProduct(99L, "dodi", 7312D);
        
        return hasil;
    }

}
