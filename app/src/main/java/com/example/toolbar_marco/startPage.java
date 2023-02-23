package com.example.toolbar_marco;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class startPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        Toolbar toolbarStartPage = findViewById(R.id.toolbarplus);
        setSupportActionBar(toolbarStartPage);
        toolbarStartPage.setTitle("");

        Button next_btn_1 = findViewById(R.id.next_start);
        next_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextBtn_start1 = new Intent(startPage.this, ToolBarAppBar.class);
                startActivity(nextBtn_start1);
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
                Intent i = new Intent(startPage.this, ToolBarAppBar.class);
                startActivity(i);
                return true;
            case R.id.action_profile:
                Intent p = new Intent(startPage.this, profile.class);
                startActivity(p);
                return true;
            case R.id.action_lupa:
                Intent d = new Intent(startPage.this, Diccionario.class);
                startActivity(d);
                return true;
            case R.id.action_plus:
                Intent t = new Intent(startPage.this, toolbarplus.class);
                startActivity(t);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}