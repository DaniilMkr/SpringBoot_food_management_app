package com.daniil.makarov.myApp.controller;

import com.daniil.makarov.myApp.dto.ProductDto;
import com.daniil.makarov.myApp.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
@AllArgsConstructor
public class ProductController {

    private ProductService productService;

    // http://localhost:8090/product

    // Create handler method to add new Product
//    @GetMapping({"/product"})
//    public String addProduct(Model model) {
//        ProductDto productDto = new ProductDto();
//        model.addAttribute("product", productDto);
//        return "product";
//    }


    // http://localhost:8090/home

    // Handler method to return to home page
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    // Handler method to view Product manage page

    // http://localhost:8090/manage_products
    @GetMapping("/manage_products")
    public String mangeProducts(){
        return "manage_products";
    }

    // Handler method to create new Product
    // http://localhost:8090/add_item
    @GetMapping("/add_item")
    public String createProduct(Model model){
        ProductDto productDto = new ProductDto();
        model.addAttribute("product", productDto);
        return "add_item";
    }

    // Handler method to save new Product

    @PostMapping("/products")
    public String saveProduct(@ModelAttribute("product") ProductDto productDto,
                              BindingResult bindingResult,
                              Model model,
                              @RequestParam ("dateOfExpiration") LocalDate localDate){
        if (bindingResult.hasErrors()){
            model.addAttribute("product", productDto);
        return "add_item";
        }
        productService.addProduct(productDto);
        return "redirect:/add_item";

    }

}
