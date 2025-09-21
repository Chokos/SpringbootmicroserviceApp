package com.chokos.microservices.product_service_demo.service;


import com.chokos.microservices.product_service_demo.dto.ProductRequest;
import com.chokos.microservices.product_service_demo.dto.ProductResponse;
import com.chokos.microservices.product_service_demo.model.Product;
import com.chokos.microservices.product_service_demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Arrays.stream;

@Service
@RequiredArgsConstructor// we do not use Use1 with this lombok annotation
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    /* *Use1
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    } */

    public ProductResponse createProduct (ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.name())// cause i am using record i can access the fields inside with using ther direct name and not the getName())No need for setters and getters
                .description(productRequest.description())
                .price(productRequest.price())
                .build();
        productRepository.save(product);
        log.info("Product created succesfully");// used with the help of lombok and the anotation of @Slf4j

        return new ProductResponse(product.getId(),product.getName(),product.getDescription(),product.getPrice());

    }

    public List<ProductResponse> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(product-> new ProductResponse(product.getId(),product.getName(),product.getDescription(),product.getPrice()))
                .toList();
    }
}
