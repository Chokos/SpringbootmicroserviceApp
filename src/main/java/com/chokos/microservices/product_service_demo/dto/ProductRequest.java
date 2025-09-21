package com.chokos.microservices.product_service_demo.dto;

import java.math.BigDecimal;

public record ProductRequest(String id, String name, String description, BigDecimal price) {//what is record


}
