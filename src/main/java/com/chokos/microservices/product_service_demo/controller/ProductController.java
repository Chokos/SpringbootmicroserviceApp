package com.chokos.microservices.product_service_demo.controller;


import com.chokos.microservices.product_service_demo.dto.ProductRequest;
import com.chokos.microservices.product_service_demo.dto.ProductResponse;
import com.chokos.microservices.product_service_demo.model.Product;
import com.chokos.microservices.product_service_demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest){

        return productService.createProduct(productRequest);


    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
        return productService.getAllProducts();
    }
}
