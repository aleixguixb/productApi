package com.example.product_api.controller.impl;

import com.example.product_api.controller.ProductApi;
import com.example.product_api.services.ProductService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController implements ProductApi {

    private final ProductService productService;


}
