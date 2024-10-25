package com.example.product_api.services;

import com.example.product_api.commons.entities.Product;

public interface ProductService {
    // POST
    Product saveProduct(Product productRequest);
    // GET
    Product getProductById(Long id);
    // PUT
    Product updateProduct(Long id);
    // DELETE
    void deleteProduct(Long id);
}
