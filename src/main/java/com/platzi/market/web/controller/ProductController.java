package com.platzi.market.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platzi.market.domain.Product;

@RestController
@RequestMapping("/products")
public class ProductController {


  @GetMapping("/all")
  private List<Product> getAll() {
    //logica para devolver una lista de productos
    return null;
  }
  
}
