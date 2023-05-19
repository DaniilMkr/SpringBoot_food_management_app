package com.daniil.makarov.myApp.service;

import com.daniil.makarov.myApp.dto.ProductDto;
import com.daniil.makarov.myApp.entity.Product;

public interface ProductService {

    void addProduct(ProductDto product);
}
