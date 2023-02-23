package com.example.toolbar_marco;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class plus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbarplus);

        Toolbar toolbarPlus = findViewById(R.id.toolbarplus);
        setSupportActionBar(toolbarPlus);
        toolbarPlus.setTitle("");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Toast.makeText(this, item.toString(), Toast.LENGTH_SHORT).show();
        switch (item.getItemId()){
            case R.id.action_flecha:
                Intent i = new Intent(plus.this, ToolBarAppBar.class);
                startActivity(i);
                return true;
            case R.id.action_profile:
                Intent p = new Intent(plus.this, profile.class);
                startActivity(p);
                return true;
            case R.id.action_lupa:
                Intent d = new Intent(plus.this, Diccionario.class);
                startActivity(d);
                return true;
            case R.id.action_plus:
                Intent t = new Intent(plus.this, toolbarplus.class);
                startActivity(t);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}