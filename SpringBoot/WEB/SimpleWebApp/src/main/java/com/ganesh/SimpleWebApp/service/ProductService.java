package com.ganesh.SimpleWebApp.service;


import com.ganesh.SimpleWebApp.Model.Product;
import com.ganesh.SimpleWebApp.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

//    List<Product> allProducts= new ArrayList<>(Arrays.asList(
//
//            new Product(101,"Iphone",5000),
//            new Product(102,"Nikon Camera",500000),
//            new Product(103,"Shure Mic",10000)));


    @Autowired
    ProductRepo repo;


    public List<Product> getProducts()
    {
        return repo.findAll();
    }

    public Product getIDProduct(int id)
    {
        return repo.findById(id).orElse(new Product(0,"no item",0));
    }

    public Product addProduct(Product p)
    {
        return repo.save(p);
    }

    public Product update(Product p)
    {
       return repo.save(p);

    }


    public void deleteIdProduct(int id)
    {
        repo.deleteById(id);
    }


}
