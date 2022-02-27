package com.example.hw343;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private ArrayList<String> langs;
    private RecyclerView recyclerView;
    private LangAdapter langAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.recycles);
        langAdapter = new LangAdapter(langs);
        recyclerView.setAdapter(langAdapter);

    }

    private void loadData() {
        langs = new ArrayList<>();
        langs.add("java");
        langs.add("javascript");
        langs.add("python");
        langs.add("swift");
        langs.add("kotlin");
        langs.add("flutter");
        langs.add("C++");
        langs.add("Go");
        langs.add("C#");
        langs.add("C C");
        langs.add("java");
        langs.add("javascript");
        langs.add("python");
        langs.add("swift");
        langs.add("kotlin");
        langs.add("flutter");
        langs.add("C++");
        langs.add("Go");
        langs.add("C#");
        langs.add("C C");langs.add("java");
        langs.add("javascript");
        langs.add("python");
        langs.add("swift");
        langs.add("kotlin");
        langs.add("flutter");
        langs.add("C++");
        langs.add("Go");
        langs.add("C#");
        langs.add("C C");
    }

}