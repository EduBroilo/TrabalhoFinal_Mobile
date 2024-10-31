package com.example.trabalhofinal_mobile.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trabalhofinal_mobile.R;
import com.example.trabalhofinal_mobile.models.ItemsCardapio;

import java.util.List;

public class CardapioAdapter extends RecyclerView.Adapter<CardapioAdapter.CardapioViewHolder> {
    private List<ItemsCardapio> itens;

    public CardapioAdapter(List<ItemsCardapio> itens) {
        this.itens = itens;
    }

    @NonNull
    @Override
    public CardapioAdapter.CardapioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cl = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_items, parent, false);
        CardapioViewHolder vh = new CardapioViewHolder(cl);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull CardapioAdapter.CardapioViewHolder holder, int position) {
        ItemsCardapio item = this.itens.get(position);

        // TODO: set Text to view
       // holder.getView().findViewById();
    }

    @Override
    public int getItemCount() {
        return this.itens.size();
    }

    class CardapioViewHolder extends RecyclerView.ViewHolder {
        private View view;

        public CardapioViewHolder(@NonNull View view) {
            super(view);
            this.view = view;

        }
        public View getView() {
            return this.view;
        }
    }
}
