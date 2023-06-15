package com.movileanu.productmicroservices.controller;


import com.movileanu.productmicroservices.entity.Product;
import com.movileanu.productmicroservices.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/insert")
    public Product insertProduct(@RequestBody Product product){

        return productService.insertProduct(product);
    }

    @GetMapping("/find/{id}")
    public Product getById(@PathVariable int id){

        return productService.getProductById(id);
    }

    @PutMapping("/update/{id}")
    public Product insertProduct(@PathVariable int id ,@RequestBody Product product){

        return productService.updateProduct(id,product);
    }
    @DeleteMapping("/delete/{id}")
    public void insertProduct(@PathVariable int id){

        productService.deleteProduct(id);
    }
}