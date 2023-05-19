package com.daniil.makarov.myApp.controller;

import com.daniil.makarov.myApp.dto.ProductDto;
import com.daniil.makarov.myApp.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class ProductController {

    private ProductService productService;

    // http://localhost:8090/product

    // Create new Product method
    @GetMapping({"/product"})
    public String addProduct(Model model) {
        ProductDto productDto = new ProductDto();
        model.addAttribute("product", productDto);
        return "product";
    }


    // http://localhost:8090/home

    // Create new Product method
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    // http://localhost:8090/manage_products
    @GetMapping("/manage_products")
    public String mangeProducts(){
        return "manage_products";
    }

    // http://localhost:8090/add_item
    @GetMapping("/add_item")
    public String addItem(Model model){
        ProductDto productDto = new ProductDto();
        model.addAttribute("product", productDto);
        return "add_item";
    }

}
