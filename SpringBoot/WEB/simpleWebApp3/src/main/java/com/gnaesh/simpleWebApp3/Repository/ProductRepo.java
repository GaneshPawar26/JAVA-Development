package com.gnaesh.simpleWebApp3.Repository;

import com.gnaesh.simpleWebApp3.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepo extends JpaRepository<Product ,Integer> {


}
