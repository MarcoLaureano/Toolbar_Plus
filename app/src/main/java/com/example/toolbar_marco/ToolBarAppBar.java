package com.example.toolbar_marco;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ToolBarAppBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolBar =  findViewById(R.id.toolbarplus);
        setSupportActionBar(toolBar);
        toolBar.setTitle("XD");

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
                    Intent i = new Intent(ToolBarAppBar.this, startPage.class);
                    startActivity(i);
                    return true;
                case R.id.action_profile:
                    Intent p = new Intent(ToolBarAppBar.this, profile.class);
                    startActivity(p);
                    return true;
                case R.id.action_lupa:
                    Intent d = new Intent(ToolBarAppBar.this, Diccionario.class);
                    startActivity(d);
                    return true;
                case R.id.action_plus:
                    Intent t = new Intent(ToolBarAppBar.this, toolbarplus.class);
                    startActivity(t);
                    return true;
            }
            return super.onOptionsItemSelected(item);
        }
}

