package com.daniil.makarov.myApp.service.impl;

import com.daniil.makarov.myApp.dto.ProductDto;
import com.daniil.makarov.myApp.entity.Product;
import com.daniil.makarov.myApp.mapper.ProductMapper;
import com.daniil.makarov.myApp.repository.ProductRepository;
import com.daniil.makarov.myApp.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


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

    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> products = productRepository.findAll();
        List<ProductDto> productDto = products.stream()
                .map((product) -> ProductMapper.mapToDto(product))
                .collect(Collectors.toList());
        return productDto;
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public void editProduct(ProductDto productDto) {
        productRepository.save(ProductMapper.mapToProduct(productDto));
    }

    @Override
    public ProductDto getProductById(Long id) {
        Product product = productRepository.findById(id).get();
        ProductDto productDto = ProductMapper.mapToDto(product);
        return productDto;
    }
}
