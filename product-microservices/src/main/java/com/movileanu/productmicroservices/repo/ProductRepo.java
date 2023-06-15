package com.movileanu.productmicroservices.repo;

import com.movileanu.productmicroservices.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product,Integer> {
}
