package com.example.valhalagamingstore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


import com.example.valhalagamingstore.freefire.ListFreeFire;
import com.example.valhalagamingstore.mobilelegend.ListMobileLegend;
import com.example.valhalagamingstore.valorant.ListValorant;
import com.example.valhalagamingstore.genshinimpact.ListGenshinImpact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Item> Items = new ArrayList<>();
    Button btnMyOrder;
    CardView btnValorant, btnGenshinImpact, btnMobileLegend, btnfreefire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnValorant = findViewById(R.id.btnValorant);
        btnGenshinImpact = findViewById(R.id.btnGenshinImpact);
        btnMobileLegend = findViewById(R.id.btnMobileLegend);
        btnfreefire = findViewById(R.id.btnFreeFire);
        btnMyOrder = findViewById(R.id.btnMyOrder);

        btnMyOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MyOrder.class);
                startActivity(intent);
            }
        });

        btnValorant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListValorant.class);
                startActivity(intent);
            }
        });

        btnGenshinImpact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListGenshinImpact.class);
                startActivity(intent);
            }
        });

        btnMobileLegend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListMobileLegend.class);
                startActivity(intent);
            }
        });

        btnfreefire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListFreeFire.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.nav_mainmenu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.navHome:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}