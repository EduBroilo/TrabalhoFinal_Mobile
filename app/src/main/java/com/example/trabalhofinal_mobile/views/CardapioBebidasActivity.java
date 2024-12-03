package com.example.trabalhofinal_mobile.views;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trabalhofinal_mobile.R;
import com.example.trabalhofinal_mobile.adapter.CardapioAdapter;
import com.example.trabalhofinal_mobile.models.ItemsCardapio;
import com.example.trabalhofinal_mobile.repository.Cart;
import com.example.trabalhofinal_mobile.repository.ItemCardapioRepository;

import java.util.List;

public class CardapioBebidasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_cardapio_bebidas);

        Cart cart = Cart.getInstance();

        RecyclerView rv = findViewById(R.id.recyclerViewBebidas);
        LinearLayoutManager lln = new LinearLayoutManager(this);
        rv.setLayoutManager(lln);

        List<ItemsCardapio> itemsList = ItemCardapioRepository.getInstance(getApplicationContext())
                .getAppDatabase()
                .ItemCardapioDao()
                .getMenuItemsByCategory("Bebidas");;

        CardapioAdapter adapter = new CardapioAdapter(itemsList);
        adapter.setOnItemClickListener(item -> {
            cart.addItem(item);
            Toast.makeText(this, item.getName() + " added to cart", Toast.LENGTH_SHORT).show();
        });
        rv.setAdapter(adapter);
    }
}