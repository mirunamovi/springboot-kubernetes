package com.movileanu.productmicroservices.service;

import com.movileanu.productmicroservices.entity.Product;

public interface ProductService {

    public Product getProductById(int id);
    public Product insertProduct(Product product);
    public Product updateProduct(int id , Product product);
    public void deleteProduct(int id);
}
