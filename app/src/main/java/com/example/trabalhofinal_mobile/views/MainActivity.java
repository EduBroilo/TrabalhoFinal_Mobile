package com.example.trabalhofinal_mobile.views;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.trabalhofinal_mobile.R;
import com.example.trabalhofinal_mobile.models.ItemsCardapio;
import com.example.trabalhofinal_mobile.repository.ItemCardapioRepository;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        // layout Main interface

        setContentView(R.layout.activity_main);

        // Exemplos Itens den Cardápio

        ItemCardapioRepository Cardapio = ItemCardapioRepository.getInstance(this);

        ItemsCardapio novo = new ItemsCardapio();
        novo.setId(0);
        novo.setName("Coke");
        novo.setSize("pequeno");
        novo.setDescription("Coca-Cola");
        novo.setCategory("Bebidas");
        novo.setPrice(3.99);

      //  Cardapio.insert(novo);


     //   ItemsCardapio burger = new ItemsCardapio("Burger", "Hamburger de frango, 300g", "pequeno", 23.40, "Principal");
     //   ItemsCardapio fries = new ItemsCardapio("Fries", "Batata Frita, 200g", "pequeno", 7.99, "Acompanhamentos");
     //   Cardapio.insert(coke);
      //  Cardapio.insert(burger);
      //  Cardapio.insert(fries);

        // ClickListener Acompanhamentos

        Button btnAcompanhamentos = findViewById(R.id.btnAcompanhamentos);

        btnAcompanhamentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CardapioAcompanhamentoActivity.class);
                startActivity(intent);
            }
        });

        // ClickListener Principais

        Button btnPrincipais = findViewById(R.id.btnPrincipais);

        btnPrincipais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CardapioPrincipalActivity.class);
                startActivity(intent);
            }
        });

        // ClickListener Bebidas

        Button btnBebidas = findViewById(R.id.btnBebidas);

        btnBebidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CardapioBebidasActivity.class);
                startActivity(intent);
            }
        });

        // ClickListener Adicionar

        Button btnAdicionar = findViewById(R.id.btnAdicionar);

        btnAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdicionarItemActivity.class);
                startActivity(intent);
            }
        });

    }
}