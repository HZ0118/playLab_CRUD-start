package models;

import java.util.*;
import javax.persistence.*;
import play.data.format.*;
import play.data.validation.*;
import com.avaje.ebean.*;

@Entity
public class Product extends Model{
    //Properties
    @Id
    private Long id;
    private String name;
    private String description;
    private int stock;
    private double price;

    //Default constructor
    public Product(){
    }

    //Constructor to initialise object
    public Product(Long id, String name, String description, int stock, double price){
        this.id = id;
        this.name = name;
        this.description = description;
        this.stock = stock;
        this.price = price;
    }

    //Generic query helper for entity computer with id Long
    public static Finder<Long,Product> find = new Finder<Long,Product>(Product.class);

    //Find all Products in the database
    //Filter product name
    public static List<Product> findAll(){
        return Product.find.all();
    }

    //get and set ID
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    //get and set name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    //get and set description
    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    //get and set stock
    public int getStock(){
        return stock;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    //get and set price
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

}