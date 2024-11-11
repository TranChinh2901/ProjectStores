package com.example.mobile_stores.controllers;

import com.example.mobile_stores.models.Product;
import com.example.mobile_stores.services.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/")
public class ProductsController {

    @Autowired
    private ProductsRepository repo;

    @GetMapping("/")
    public String homeProductList(Model model) {
        List<Product> products = repo.findAll();
        model.addAttribute("products", products);
        return "products/index";
    };

    @GetMapping("/product")
    public String showProductList(Model model) {
        List<Product> products = repo.findAll();
        model.addAttribute("products", products);
        return "products/product";
    };

    @GetMapping("/cart")
    public String cartProductList(Model model) {
        List<Product> products = repo.findAll();
        model.addAttribute("products", products);
        System.out.println("Cart page accessed");
        return "products/cart";
    };

    @GetMapping("/tintuc")
    public String tintucProductList(Model model) {
        List<Product> products = repo.findAll();
        model.addAttribute("products", products);
        return "products/tintuc";
    };

    @GetMapping("/xemthem/{id}")
    public String showProductDetails(@PathVariable("id") Long productId, Model model) {
        Product product = repo.findById(productId).orElse(null);
        model.addAttribute("product", product);
        return "products/xemthem";
    }

};
