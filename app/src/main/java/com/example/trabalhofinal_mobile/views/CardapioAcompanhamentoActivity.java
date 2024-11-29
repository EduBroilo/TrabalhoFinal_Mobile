package com.example.trabalhofinal_mobile.views;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trabalhofinal_mobile.R;
import com.example.trabalhofinal_mobile.adapter.CardapioAdapter;
import com.example.trabalhofinal_mobile.models.ItemsCardapio;
import com.example.trabalhofinal_mobile.repository.ItemCardapioRepository;

import java.util.List;

public class CardapioAcompanhamentoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_cardapio_acompanhamento);

        RecyclerView rv = findViewById(R.id.recyclerViewAcompanhamentos);
        LinearLayoutManager lln = new LinearLayoutManager(this);
        rv.setLayoutManager(lln);

        List<ItemsCardapio> itemsList = ItemCardapioRepository.getInstance(getApplicationContext())
                .getAppDatabase()
                .ItemCardapioDao()
                .getMenuItemsByCategory("Acompanhamento");;

        CardapioAdapter adapter = new CardapioAdapter(itemsList);
        rv.setAdapter(adapter);
    }
}