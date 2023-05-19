package com.daniil.makarov.myApp.mapper;

import com.daniil.makarov.myApp.dto.ProductDto;
import com.daniil.makarov.myApp.entity.Product;

public class ProductMapper {

    // Map Product to ProductDto
    public static ProductDto mapToDto(Product product) {
        ProductDto productDto = new ProductDto(
                product.getId(),
                product.getName(),
                product.getDateOfExpiration());

        return productDto;
    }

    // Map ProductDto to Product
    public static Product mapToProduct(ProductDto productDto) {
        Product product = new Product(
                productDto.getId(),
                productDto.getName(),
                productDto.getDateOfExpiration());
        return product;
    }
}
