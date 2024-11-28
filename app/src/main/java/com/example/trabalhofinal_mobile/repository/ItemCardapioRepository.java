package com.example.trabalhofinal_mobile.repository;

import android.content.Context;

import androidx.room.Room;

import com.example.trabalhofinal_mobile.DAO.AppDatabase;
import com.example.trabalhofinal_mobile.models.ItemsCardapio;

import java.util.ArrayList;
import java.util.List;


public class ItemCardapioRepository {

    private static ItemCardapioRepository instance;
    private static Context context;
    private static AppDatabase db;
    private List<ItemsCardapio> baseDadosCardapio;

    private ItemCardapioRepository() {
        baseDadosCardapio = new ArrayList<>();
        db = Room.databaseBuilder(context, AppDatabase.class, "banco_da_app").allowMainThreadQueries().fallbackToDestructiveMigration().build();
        baseDadosCardapio.addAll(db.ItemCardapioDao().getAll());
    }

    public static ItemCardapioRepository getInstance(Context ctx) {
        if (instance == null) {
            context = ctx;
            instance = new ItemCardapioRepository();
        }
        return instance;
    }

    public void insert(ItemsCardapio item) {
        db.ItemCardapioDao().insertMenuItem(item);
        baseDadosCardapio.add(item);
    }

    public void delete(ItemsCardapio item) {
        db.ItemCardapioDao().deleteMenuItem(item);
        baseDadosCardapio.remove(item);
    }

    public AppDatabase getAppDatabase() {
        return db;
    }
}
