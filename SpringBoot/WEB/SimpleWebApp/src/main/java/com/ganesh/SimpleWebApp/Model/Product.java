package com.ganesh.SimpleWebApp.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

//@Component
@Entity
@Data
@NoArgsConstructor
public class Product {
    @Id
    private int prodId;
    private String prodName;
    private int price;

    public Product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }
}
