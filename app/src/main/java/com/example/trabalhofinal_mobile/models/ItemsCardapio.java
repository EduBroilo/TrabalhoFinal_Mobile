package com.example.trabalhofinal_mobile.models;

public class ItemsCardapio {
    private String name;
    private String description;
    private String size;
    private double price;
    private CategoriaCardapio category;  // Using Category class

    public ItemsCardapio(String name, String description, String size, double price, CategoriaCardapio category) {
        this.name = name;
        this.description = description;
        this.size = size;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategoriaCardapio getCategory() {
        return category;
    }

    public void setCategory(CategoriaCardapio category) {
        this.category = category;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
