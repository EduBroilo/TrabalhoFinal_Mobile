package com.example.trabalhofinal_mobile.views;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.trabalhofinal_mobile.R;
import com.example.trabalhofinal_mobile.models.CategoriaCardapio;
import com.example.trabalhofinal_mobile.models.ItensCardapio;
import com.example.trabalhofinal_mobile.repository.ItemCardapioRepository;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Exemplos categorias

        CategoriaCardapio beverages = new CategoriaCardapio("Bebidas", "Bebidas, quente e frias.");
        CategoriaCardapio mainCourse = new CategoriaCardapio("Principal", "Pratos principais.");
        CategoriaCardapio sideDishes = new CategoriaCardapio("Acompanhamentos", "Petiscos para acompanhar a comida.");

        // Exemplos Itens den Cardapio

        ItensCardapio coke = new ItensCardapio("Coke", "Coca-Cola", "Small", 3.99, beverages);
        ItensCardapio burger = new ItensCardapio("Burger", "Hamburger de frango, 300g", "Small", 23.40, mainCourse);
        ItensCardapio fries = new ItensCardapio("Fries", "Batata Frita, 200g", "Small", 7.99, sideDishes);

        // Exemplo Cardápio

        ItemCardapioRepository Cardapio = ItemCardapioRepository.getInstance();
        Cardapio.addItemCardapio(coke);
        Cardapio.addItemCardapio(burger);
        Cardapio.addItemCardapio(fries);

        // Step 4: Retrieve and display the menu items (for example, logging them)

        List<ItensCardapio> menuItems = Cardapio.getItensCardapio();
        for (ItensCardapio item : menuItems) {
            Log.d("MenuActivity", item.toString());
        }
    }
}