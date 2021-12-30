package com.example.valhalagamingstore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyCompleteAdapter extends RecyclerView.Adapter<MyCompleteAdapter.MyViewHolder>{

    Context context;

    public MyCompleteAdapter(Context ct){
        context = ct;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.mycompleteorderlist,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        String quantityTemp = String.valueOf(MainActivity.Items.get(position).quantity);
        String priceTemp = String.valueOf(MainActivity.Items.get(position).price);

        holder.item.setText(MainActivity.Items.get(position).name);
        holder.quantity.setText(quantityTemp);
        holder.price.setText(priceTemp);

        Item item = MainActivity.Items.get(position);
    }

    @Override
    public int getItemCount() {
        return MainActivity.Items.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView item, quantity, price;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            item = itemView.findViewById(R.id.item);
            quantity = itemView.findViewById(R.id.itemQuantity);
            price = itemView.findViewById(R.id.itemPrice);
        }

    }


}
