package org.ganesh.SimpleWebApp2.Controller;

import org.ganesh.SimpleWebApp2.Model.Product;
import org.ganesh.SimpleWebApp2.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService ps;
    @GetMapping("/")
    public String home()
    {
        return "hello this is home page";
    }

    @GetMapping("/products")
    public List<Product> allProducts()
    {
       return ps.allProducts();
    }

    @PostMapping("/add")
    public Product add(@RequestBody Product p)
    {
        return ps.add(p);
    }

    @PutMapping("/update")
    public Product update(@RequestBody Product p)
    {
        return ps.update(p);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id)
    {
        ps.delete(id);
    }

}
