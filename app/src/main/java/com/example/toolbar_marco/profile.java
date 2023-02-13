package com.example.toolbar_marco;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class profile extends AppCompatActivity {
    Button btnLogIn;
    EditText nom,cognom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        nom =findViewById(R.id.nom);
        cognom=findViewById(R.id.cognom);
        btnLogIn=findViewById(R.id.btn_login);

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log =new Intent( profile.this, LogIn.class);
                log.putExtra("nom", nom.getText().toString());
                log.putExtra("cognom", cognom.getText().toString());
                startActivity(log);
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
                Intent i = new Intent(profile.this, ToolBar.class);
                startActivity(i);
                return true;
            case R.id.action_profile:
                Intent p = new Intent(profile.this, profile.class);
                startActivity(p);
                return true;
            case R.id.action_lupa:
                Intent d = new Intent(profile.this, Diccionario.class);
                startActivity(d);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}