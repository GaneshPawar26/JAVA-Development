package com.ganesh.ecom_proj.Controller;


import com.ganesh.ecom_proj.Model.Product;
import com.ganesh.ecom_proj.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService ps;

    @GetMapping("/products")
    public List<Product> products()
    {
        return ps.products();
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable("id") int id)
            {
               return ps.getproduct(id);
            }
}
