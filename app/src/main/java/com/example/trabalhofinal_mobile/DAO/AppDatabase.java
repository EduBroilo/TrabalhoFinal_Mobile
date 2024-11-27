package com.example.trabalhofinal_mobile.DAO;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.trabalhofinal_mobile.models.ItemsCardapio;

@Database(entities = {ItemsCardapio.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract ItemCardapioDAO ItemCardapioDao();

}