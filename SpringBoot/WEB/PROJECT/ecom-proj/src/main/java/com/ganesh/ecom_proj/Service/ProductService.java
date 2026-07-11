package com.ganesh.ecom_proj.Service;

import com.ganesh.ecom_proj.Model.Product;
import com.ganesh.ecom_proj.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo pr;
    public List<Product> products() {

        return pr.findAll();
    }

    public Product getproduct(int id) {

        return pr.findById(id).orElse(new Product());
    }
}
