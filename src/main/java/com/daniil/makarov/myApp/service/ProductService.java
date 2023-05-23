package com.daniil.makarov.myApp.service;

import com.daniil.makarov.myApp.dto.ProductDto;
import com.daniil.makarov.myApp.entity.Product;

import java.util.List;

public interface ProductService {

    void addProduct(ProductDto product);

    List<ProductDto> getAllProducts();
}
