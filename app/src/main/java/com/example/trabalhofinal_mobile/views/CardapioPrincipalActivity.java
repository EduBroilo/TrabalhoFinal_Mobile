package com.example.trabalhofinal_mobile.views;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trabalhofinal_mobile.R;
import com.example.trabalhofinal_mobile.adapter.CardapioAdapter;
import com.example.trabalhofinal_mobile.repository.ItemCardapioRepository;

import java.util.ArrayList;

public class CardapioPrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_cardapio_principal);

        RecyclerView rv = findViewById(R.id.recyclerViewPrincipal);
        LinearLayoutManager lln = new LinearLayoutManager(this);
        rv.setLayoutManager(lln);
        CardapioAdapter ca = new CardapioAdapter(ItemCardapioRepository.getInstance().getItensCardapio());
        rv.setAdapter(ca);
    }
}