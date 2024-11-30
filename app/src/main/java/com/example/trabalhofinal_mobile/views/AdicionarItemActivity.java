package com.example.trabalhofinal_mobile.views;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.trabalhofinal_mobile.R;
import com.example.trabalhofinal_mobile.models.ItemsCardapio;
import com.example.trabalhofinal_mobile.repository.ItemCardapioRepository;

public class AdicionarItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        ItemCardapioRepository Cardapio = ItemCardapioRepository.getInstance(this);

        setContentView(R.layout.activity_adicionar_item);

        EditText editTextName = findViewById(R.id.EditTextNome);
        EditText editTextDescription = findViewById(R.id.EditTextDescricao);
        EditText editTextCategory = findViewById(R.id.EditTextCategoria);
        EditText editTextSize = findViewById(R.id.EditTextTamanho);
        EditText editTextPrice = findViewById(R.id.EditTextPreco);
        Button btnSubmit = findViewById(R.id.btnAdicionar);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Obtem Valores dos Campos Informados

                String name = editTextName.getText().toString();
                String description = editTextDescription.getText().toString();
                String category = editTextCategory.getText().toString();
                String size = editTextSize.getText().toString();
                String Textprice = editTextPrice.getText().toString();
                double price = Double.parseDouble(String.valueOf(Double.parseDouble(Textprice)));

                // Cria Objetos


                ItemsCardapio novo = new ItemsCardapio();
                novo.setId(0);
                novo.setName(name);
                novo.setSize(size);
                novo.setDescription(description);
                novo.setCategory(category);
                novo.setPrice(price);

                // Adiciona à Instância

                Cardapio.insert(novo);

                editTextName.setText("");
                editTextCategory.setText("");
                editTextDescription.setText("");
                editTextPrice.setText("");
                editTextSize.setText("");
            }
        });
    }
}