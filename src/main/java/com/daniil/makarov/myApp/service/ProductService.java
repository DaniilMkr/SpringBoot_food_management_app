package com.daniil.makarov.myApp.service;

import com.daniil.makarov.myApp.dto.ProductDto;
import java.util.List;

public interface ProductService {

    void addProduct(ProductDto product);

    List<ProductDto> getAllProducts();

    void deleteById(Long id);

    void updateProduct(ProductDto productDto);
    ProductDto getProductById(Long id);

}
