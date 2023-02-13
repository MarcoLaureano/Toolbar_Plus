package com.example.toolbar_marco;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Diccionario extends AppCompatActivity {
    Button btnLogIn;
    SearchView buscador;
    ListView diccionario;

    final ArrayList<String> fruta = new ArrayList<>();
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diccionario);

        buscador = findViewById(R.id.buscador);
        diccionario = findViewById(R.id.frutaList);

        fruta.add("Apple");
        fruta.add("Banana");
        fruta.add("Coconut");
        fruta.add("Dragon Fruit");
        fruta.add("ElderBerry");
        fruta.add("Fig");
        fruta.add("Grape");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,fruta);
        diccionario.setAdapter(adapter);

        buscador.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                adapter.getFilter().filter(s);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_flecha:
                Intent i = new Intent(Diccionario.this, ToolBar.class);
                startActivity(i);
                return true;
            case R.id.action_profile:
                Intent p = new Intent(Diccionario.this, profile.class);
                startActivity(p);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}