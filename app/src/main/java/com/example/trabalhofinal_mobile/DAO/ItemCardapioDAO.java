package com.example.trabalhofinal_mobile.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.trabalhofinal_mobile.models.ItemsCardapio;

import java.util.List;

@Dao
public interface ItemCardapioDAO {

    @Insert
    void insertMenuItem(ItemsCardapio item);

    @Update
    void updateMenuItem(ItemsCardapio item);

    @Delete
    void deleteMenuItem(ItemsCardapio item);

    @Query("SELECT * FROM ItemsCardapio")
    List<ItemsCardapio> getAll();

    @Query("SELECT * FROM ItemsCardapio WHERE category = :category")
    List<ItemsCardapio> getMenuItemsByCategory(String category);
}
