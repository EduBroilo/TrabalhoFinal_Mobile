package com.example.trabalhofinal_mobile.models;

public class CategoriaCardapio {
    private String name;
    private String descriptionCategoria;

    public CategoriaCardapio(String name, String description) {
        this.name = name;
        this.descriptionCategoria = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptionCategoria() {
        return descriptionCategoria;
    }

    public void setDescriptionCategoria(String descriptionCategoria) {
        this.descriptionCategoria = descriptionCategoria;
    }
}
