package com.ganesh.SimpleWebApp.Controller;


import com.ganesh.SimpleWebApp.Model.Product;
import com.ganesh.SimpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

//    ProductService ps=new ProductService();
    @Autowired
    ProductService ps;
    Product p;

    @RequestMapping("/products")
    public List<Product> getProducts()
    {
        List<Product> allProducts=ps.getProducts();
        return allProducts;
    }

    @GetMapping("/products/{id}")
    public Product getIdproduct(@PathVariable("id") int id)  //pathparam for rest api
    {

        return ps.getIDProduct(id);
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product p)
    {
        return ps.addProduct(p);
    }

    @PutMapping("/update")
    public Product update(Product p)
    {
        //update 101 id iphone price from 5000 to 100000
        return ps.update(p);
    }

    @DeleteMapping("delete/{id}")
    public void deleteIdProduct(@PathVariable("id") int id)
    {
        //delete 104 id product
        ps.deleteIdProduct(id);
    }
}
