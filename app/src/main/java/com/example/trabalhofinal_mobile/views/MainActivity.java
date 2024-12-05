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

        // ClickListener Pagamento

        Button btnPagar = findViewById(R.id.btnPagar);

        btnPagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PagamentoActivity.class);
                startActivity(intent);
            }
        });

    }
}