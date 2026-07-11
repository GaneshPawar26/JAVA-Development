package com.ganesh.SimpleWebApp.service;


import com.ganesh.SimpleWebApp.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> allProducts= new ArrayList<>(Arrays.asList(

            new Product(101,"Iphone",5000),
            new Product(102,"Nikon Camera",500000),
            new Product(103,"Shure Mic",10000)));


    @Autowired
    ProductService repo;


    public List<Product> getProducts()
    {
        return allProducts;
    }

    public Product getIDProduct(int id)
    {
        //can use simple for loop also
                return allProducts.stream().filter(p->p.getProdId()==id)
                .findFirst().orElse(new Product(100,"No iem",0));

    }

    public Product addProduct(Product p)
    {
        allProducts.add(p);
        return p;
    }

    public Product update()
    {
        int id=101;
        Product p=getIDProduct(id);
        p.setPrice(100000);
        return p;
    }


    public void deleteIdProduct(int id)
    {
        Product p=getIDProduct(id);
        allProducts.remove(p);
    }


}
