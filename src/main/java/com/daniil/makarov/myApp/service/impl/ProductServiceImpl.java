package com.daniil.makarov.myApp.service.impl;

import com.daniil.makarov.myApp.dto.ProductDto;
import com.daniil.makarov.myApp.entity.Product;
import com.daniil.makarov.myApp.mapper.ProductMapper;
import com.daniil.makarov.myApp.repository.ProductRepository;
import com.daniil.makarov.myApp.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;


    // Save product into database
    @Override
    public void addProduct(ProductDto productDto) {
        Product product = ProductMapper.mapToProduct(productDto);
        productRepository.save(product);
    }

}
