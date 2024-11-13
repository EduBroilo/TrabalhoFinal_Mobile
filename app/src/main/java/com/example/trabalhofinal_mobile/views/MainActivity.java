package com.example.trabalhofinal_mobile.views;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.trabalhofinal_mobile.R;
import com.example.trabalhofinal_mobile.models.CategoriaCardapio;
import com.example.trabalhofinal_mobile.models.ItemsCardapio;
import com.example.trabalhofinal_mobile.repository.ItemCardapioRepository;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        // layout Main interface

        setContentView(R.layout.activity_main);

        // Exemplos categorias

        CategoriaCardapio beverages = new CategoriaCardapio("Bebidas", "Bebidas, quente e frias.");
        CategoriaCardapio mainCourse = new CategoriaCardapio("Principal", "Pratos principais.");
        CategoriaCardapio sideDishes = new CategoriaCardapio("Acompanhamentos", "Petiscos para acompanhar a comida.");

        // Exemplos Itens den Cardápio

        ItemsCardapio coke = new ItemsCardapio("Coke", "Coca-Cola", "pequeno", 3.99, beverages);
        ItemsCardapio burger = new ItemsCardapio("Burger", "Hamburger de frango, 300g", "pequeno", 23.40, mainCourse);
        ItemsCardapio fries = new ItemsCardapio("Fries", "Batata Frita, 200g", "pequeno", 7.99, sideDishes);

        // Exemplo Cardápio

        ItemCardapioRepository Cardapio = ItemCardapioRepository.getInstance();
        Cardapio.addItemCardapio(coke);
        Cardapio.addItemCardapio(burger);
        Cardapio.addItemCardapio(fries);

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