package com.example.trabalhofinal_mobile.views;

import static android.widget.Toast.LENGTH_SHORT;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trabalhofinal_mobile.R;
import com.example.trabalhofinal_mobile.adapter.PagamentoAdapter;
import com.example.trabalhofinal_mobile.repository.Cart;

public class PagamentoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_pagamento);


        RecyclerView rv = findViewById(R.id.recyclerViewPagamento);
        rv.setLayoutManager(new LinearLayoutManager(this));
        PagamentoAdapter adapter = new PagamentoAdapter(Cart.getInstance().getSelectedItems());
        rv.setAdapter(adapter);



        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView totalPriceTextView = findViewById(R.id.itemTotal);
        double totalPrice = Cart.getInstance().getTotal();
        totalPriceTextView.setText("Total: R$" + totalPrice);

        Button btnPagar = findViewById(R.id.btnPagar);

        btnPagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(PagamentoActivity.this, "Pedido Finalizado!", LENGTH_SHORT).show();
                Cart.getInstance().clearSelection();
            }
        });

    }
}