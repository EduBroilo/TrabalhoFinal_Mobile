package com.example.trabalhofinal_mobile.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trabalhofinal_mobile.R;
import com.example.trabalhofinal_mobile.models.ItemsCardapio;

import java.util.List;

public class PagamentoAdapter extends RecyclerView.Adapter<PagamentoAdapter.PagamentoViewHolder> {

    private List<ItemsCardapio> itemsList;

    public PagamentoAdapter(List<ItemsCardapio> itemsList) {
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public PagamentoAdapter.PagamentoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cl = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_pagamento, parent, false);
        return new PagamentoAdapter.PagamentoViewHolder(cl);
    }

    @Override
    public void onBindViewHolder(@NonNull PagamentoAdapter.PagamentoViewHolder holder, int position) {

        ItemsCardapio item = this.itemsList.get(position);
        holder.nameTextView.setText(item.getName());
        holder.priceTextView.setText(String.format("R$%.2f", item.getPrice()));
    }

    @Override
    public int getItemCount() {
        return this.itemsList.size();
    }

    class PagamentoViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView priceTextView;

        public PagamentoViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.NamePagamento);
            priceTextView = itemView.findViewById(R.id.PricePagamento);
        }
    }
}
