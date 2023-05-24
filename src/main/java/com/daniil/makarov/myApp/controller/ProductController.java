package com.daniil.makarov.myApp.controller;

import com.daniil.makarov.myApp.dto.ProductDto;
import com.daniil.makarov.myApp.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Controller
@AllArgsConstructor
public class ProductController {

    private ProductService productService;


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

    // Handler method to edit Product
    @GetMapping("/products/{productId}/edit")
    public String editProduct(@PathVariable("productId")Long id, Model model) {
        ProductDto productDto = productService.getProductById(id);
        model.addAttribute("product", productDto);
        return "edit_product";
    }


    // Handler method to delete product by id

    // http://localhost:8090/products/20/delete

    @GetMapping("/products/{productId}/delete")
    public String deleteProduct(@PathVariable("productId") Long id){
        productService.deleteById(id);
        return "redirect:/products";
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
        return "redirect:/products";

    }

    // Handler method to retrieve all products

    // http://localhost:8090/products
    @GetMapping("/products")
    public String getAllProducts(Model model){
        List<ProductDto> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "products";
    }

}
