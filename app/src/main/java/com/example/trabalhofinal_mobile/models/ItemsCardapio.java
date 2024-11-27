package com.example.trabalhofinal_mobile.models;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class ItemsCardapio {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private String description;
    private String size;
    private double price;
    private String category;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

}
