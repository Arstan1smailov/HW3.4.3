package com.example.hw343;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LangAdapter extends RecyclerView.Adapter<LangAdapter.LangViewHolder> {
    private TextView textView;
    private ArrayList<String> langs;
    public LangAdapter (ArrayList<String> langs){
        this.langs = langs;
    }
    @NonNull
    @Override
    public LangViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LangViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.lang_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LangViewHolder holder, int position) {
        textView.setText(langs.get(position));
    }

    @Override
    public int getItemCount() {
        return langs.size();
    }

    class LangViewHolder extends RecyclerView.ViewHolder {
        public LangViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.TV);
        }
    }
}
