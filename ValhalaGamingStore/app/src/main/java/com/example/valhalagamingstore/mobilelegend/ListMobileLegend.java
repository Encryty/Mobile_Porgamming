package com.example.valhalagamingstore.mobilelegend;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.valhalagamingstore.MainActivity;
import com.example.valhalagamingstore.MyOrder;
import com.example.valhalagamingstore.R;

public class ListMobileLegend extends AppCompatActivity {

    Button btnMyOrder;
    CardView btn256diamond, btn367diamond, btn503diamond, btn774diamond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_mobile_legend);

        btn256diamond = findViewById(R.id.btn256diamond);
        btn367diamond = findViewById(R.id.btn367diamond);
        btn503diamond = findViewById(R.id.btn503diamond);
        btn774diamond = findViewById(R.id.btn774diamond);
        btnMyOrder = findViewById(R.id.btnMyOrder);

        btnMyOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListMobileLegend.this, MyOrder.class);
                startActivity(intent);
            }
        });

        btn256diamond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListMobileLegend.this, buy256diamond.class);
                startActivity(intent);
            }
        });

        btn367diamond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListMobileLegend.this, buy367diamond.class);
                startActivity(intent);
            }
        });

        btn503diamond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListMobileLegend.this, buy503diamond.class);
                startActivity(intent);
            }
        });

        btn774diamond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListMobileLegend.this, buy774diamond.class);
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