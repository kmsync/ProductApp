package com.bilgeadam.productapp.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
//@Table(name = "products")
// Veritabanındaki tablonun adını değiştirmek istemiyorsak,
// bunu yazmaya ve isim vermeye gerek yok.
// Otomatik olarak class adında tablo oluşturulur.
public class Product {

    @Id
    //ID primary key olan alan için yazılır.
    @GeneratedValue(strategy = GenerationType.AUTO)
    // Generated otomatik artan id değeri sağlar.
    private long id;

    private String name;
    private String description;
    private double price;

   // @CreationTimestamp
   // private Date createdAt;

   // @CreationTimestamp
   // private Date updatedAt;



}
