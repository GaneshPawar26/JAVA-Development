package org.ganesh.SimpleWebApp2.Service;

import org.ganesh.SimpleWebApp2.Model.Product;
import org.ganesh.SimpleWebApp2.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo rp;
    public List<Product> allProducts()
    {
        return rp.findAll();
    }

    public Product add(Product p) {

        return rp.save(p);
    }

    public Product update(Product p) {

        p.setId(101);
        return rp.save(p);
    }

    public void delete(int id) {

        rp.deleteById(id);
    }
}
