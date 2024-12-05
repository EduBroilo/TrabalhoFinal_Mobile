package com.example.trabalhofinal_mobile.repository;

import com.example.trabalhofinal_mobile.models.ItemsCardapio;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private static Cart instance;
    private final List<ItemsCardapio> selectedItems;

    private Cart() {
        selectedItems = new ArrayList<>();
    }

    public static Cart getInstance() {
        if (instance == null) {
            instance = new Cart();
        }
        return instance;
    }

    public void addItem(ItemsCardapio item) {
        selectedItems.add(item);
    }

    public void removeItem(ItemsCardapio item) {
        selectedItems.remove(item);
    }

    public List<ItemsCardapio> getSelectedItems() {
        return selectedItems;
    }

    public void clearSelection() {
        selectedItems.clear();
    }

    public double getTotal() {
        double total = 0;
        for (ItemsCardapio item : selectedItems) {
            total += item.getPrice();
        }
        return total;
    }

}
