package com.gnaesh.simpleWebApp3.Service;

import com.gnaesh.simpleWebApp3.Model.Product;
import com.gnaesh.simpleWebApp3.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    @Autowired
    ProductRepo pr;
    public List<Product> products()
    {
        return pr.findAll();
    }

    public Product addproduct(Product p)
    {
        pr.save(p);
        return p;
    }
}
