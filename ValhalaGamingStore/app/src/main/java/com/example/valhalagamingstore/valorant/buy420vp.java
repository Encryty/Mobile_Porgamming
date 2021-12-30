package com.example.valhalagamingstore.valorant;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.valhalagamingstore.Item;
import com.example.valhalagamingstore.MainActivity;
import com.example.valhalagamingstore.MyOrder;
import com.example.valhalagamingstore.R;

public class buy420vp extends AppCompatActivity {

    Button btnOrderMore, add420vp, btnMyOrder;
    EditText q_420_vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_420_vp);

        btnMyOrder = findViewById(R.id.btnMyOrder);
        btnOrderMore = findViewById(R.id.btnOrderMore);
        add420vp = findViewById(R.id.add420vp);
        q_420_vp = findViewById(R.id.qty_420_vp);

        btnMyOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buy420vp.this, MyOrder.class);
                startActivity(intent);
            }
        });

        btnOrderMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buy420vp.this, ListValorant.class);
                startActivity(intent);
            }
        });

        add420vp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Item item = new Item();
                item.name = "420 Valorant Point";
                item.price = 49000;
                item.quantity = Integer.parseInt(q_420_vp.getText().toString());
                Toast.makeText(buy420vp.this,"You Ordered "+item.name+" With Quantity "
                + q_420_vp.getText().toString(),Toast.LENGTH_SHORT).show();
                MainActivity.Items.add(item);
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