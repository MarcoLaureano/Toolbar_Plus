package com.example.toolbar_marco;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class LogIn extends AppCompatActivity {
    TextView nom, cognom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        nom = findViewById(R.id.nom);
        cognom = findViewById(R.id.cognom);

        Bundle getUsernameNames = getIntent().getExtras();

        nom.setText(getUsernameNames.getString("nom"));
        cognom.setText(getUsernameNames.getString("cognom"));
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
                Intent i = new Intent(LogIn.this, ToolBar.class);
                startActivity(i);
                return true;
            case R.id.action_profile:
                Intent p = new Intent(LogIn.this, LogIn.class);
                startActivity(p);
                return true;
            case R.id.action_lupa:
                Intent d = new Intent(LogIn.this, Diccionario.class);
                startActivity(d);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}