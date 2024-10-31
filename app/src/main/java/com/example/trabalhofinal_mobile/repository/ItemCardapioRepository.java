package com.example.trabalhofinal_mobile.repository;

import com.example.trabalhofinal_mobile.models.ItemsCardapio;

import java.util.ArrayList;
import java.util.List;


public class ItemCardapioRepository {

    private static ItemCardapioRepository instance;
    private static List<ItemsCardapio> baseDadosCardapio;

    private ItemCardapioRepository() {
        baseDadosCardapio = new ArrayList<>();
    }

    public static ItemCardapioRepository getInstance() {
        if (instance == null) {
            instance = new ItemCardapioRepository();
        }
        return instance;
    }

    public void addItemCardapio(ItemsCardapio item) {
        baseDadosCardapio.add(item);
    }

    public List<ItemsCardapio> getItensCardapio() {
        return baseDadosCardapio;
    }
}
