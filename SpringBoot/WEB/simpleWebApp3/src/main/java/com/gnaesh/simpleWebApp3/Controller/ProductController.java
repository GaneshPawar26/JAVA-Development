package com.gnaesh.simpleWebApp3.Controller;


import com.gnaesh.simpleWebApp3.Model.Product;
import com.gnaesh.simpleWebApp3.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {


    @Autowired
    ProductService ps;
    @GetMapping("/products")
    public List<Product> products()
    {
        return ps.products();

    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product p)
    {
        return ps.addproduct(p);
    }

}
