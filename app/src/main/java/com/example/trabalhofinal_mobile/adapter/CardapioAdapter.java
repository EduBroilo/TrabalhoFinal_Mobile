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

public class CardapioAdapter extends RecyclerView.Adapter<CardapioAdapter.CardapioViewHolder> {
    private List<ItemsCardapio> itens;
    private onItemClickListener listener;

    public CardapioAdapter(List<ItemsCardapio> itens) {
        this.itens = itens;
    }

    public void setOnItemClickListener(onItemClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public CardapioAdapter.CardapioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cl = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_items, parent, false);
        return new CardapioViewHolder(cl);
    }

    @Override
    public void onBindViewHolder(@NonNull CardapioAdapter.CardapioViewHolder holder, int position) {

        ItemsCardapio item = this.itens.get(position);

        holder.itemName.setText(item.getName());
        holder.itemSize.setText(item.getSize());
        holder.itemPrice.setText(String.format("R$%.2f", item.getPrice()));
        holder.itemDescription.setText(item.getDescription());

        holder.itemView.setOnClickListener(v -> {
            if (listener != null) {
                listener.onItemClick(item);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.itens.size();
    }

    class CardapioViewHolder extends RecyclerView.ViewHolder {
        TextView itemName, itemSize, itemPrice, itemDescription;

        public CardapioViewHolder(@NonNull View view) {
            super(view);
            itemName = itemView.findViewById(R.id.itemName);
            itemSize = itemView.findViewById(R.id.itemSize);
            itemPrice = itemView.findViewById(R.id.itemPrice);
            itemDescription = itemView.findViewById(R.id.itemDescription);;

        }
    }

    public interface onItemClickListener {
        void onItemClick(ItemsCardapio item);
    }
}
