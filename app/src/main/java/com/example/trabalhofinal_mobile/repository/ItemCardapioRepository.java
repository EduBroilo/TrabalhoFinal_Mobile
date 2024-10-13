package com.example.trabalhofinal_mobile.repository;

import com.example.trabalhofinal_mobile.models.ItensCardapio;

import java.util.ArrayList;
import java.util.List;


// Implementar Singleton
public class ItemCardapioRepository {

    private static ItemCardapioRepository instance;
    private List<ItensCardapio> baseDadosCardapio;

    private ItemCardapioRepository() {
        baseDadosCardapio = new ArrayList<>();
    }

    public static ItemCardapioRepository getInstance() {
        if (instance == null) {
            instance = new ItemCardapioRepository();
        }
        return instance;
    }

    public void addItemCardapio(ItensCardapio item) {
        baseDadosCardapio.add(item);
    }

    public List<ItensCardapio> getItensCardapio() {
        return baseDadosCardapio;
    }
}
