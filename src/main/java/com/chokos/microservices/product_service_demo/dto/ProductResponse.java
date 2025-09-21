package com.chokos.microservices.product_service_demo.dto;

import java.math.BigDecimal;
import java.util.List;

public record ProductResponse(String id, String name , String description, BigDecimal price) {

}
