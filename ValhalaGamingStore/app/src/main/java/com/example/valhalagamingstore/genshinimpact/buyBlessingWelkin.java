package com.example.valhalagamingstore.genshinimpact;

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

public class buyBlessingWelkin extends AppCompatActivity {

    Button btnOrderMore, addBlessingWelkin, btnMyOrder;
    EditText q_blessing_welkin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_blessing_welkin);

        btnOrderMore = findViewById(R.id.btnOrderMore);
        btnMyOrder = findViewById(R.id.btnMyOrder);
        addBlessingWelkin = findViewById(R.id.addBlessingWelkin);
        q_blessing_welkin= findViewById(R.id.qty_blessing_welkin);

        btnOrderMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buyBlessingWelkin.this, ListGenshinImpact.class);
                startActivity(intent);
            }
        });

        btnMyOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buyBlessingWelkin.this, MyOrder.class);
                startActivity(intent);
            }
        });

        addBlessingWelkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Item item = new Item();
                item.name = "Blessing Welkin";
                item.price = 70000;
                item.quantity = Integer.parseInt(q_blessing_welkin.getText().toString());
                Toast.makeText(buyBlessingWelkin.this,"You Ordered " +item.name+" With Quantity "
                        + q_blessing_welkin.getText().toString(),Toast.LENGTH_SHORT).show();
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