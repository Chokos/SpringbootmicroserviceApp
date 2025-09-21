package com.chokos.microservices.product_service_demo.repository;

import com.chokos.microservices.product_service_demo.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
