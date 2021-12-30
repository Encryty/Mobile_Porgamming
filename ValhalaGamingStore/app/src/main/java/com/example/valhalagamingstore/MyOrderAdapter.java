package com.example.valhalagamingstore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyOrderAdapter extends RecyclerView.Adapter<MyOrderAdapter.MyViewHolder> {

    Context context;
    Runnable onDelete;

    public MyOrderAdapter(Context ct, Runnable onDelete){
        context = ct;
        this.onDelete = onDelete;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.myorderlist,parent,false);
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

        holder.btnDeleteItem.setOnClickListener(view -> {
            int pos = MainActivity.Items.indexOf(item);
            MainActivity.Items.remove(pos);
            notifyItemRemoved(pos);
            onDelete.run();
            Toast.makeText(context,"Your Item Deleted",Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return MainActivity.Items.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView item, quantity, price;
        Button btnDeleteItem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            btnDeleteItem = itemView.findViewById(R.id.btnDeleteItem);
            item = itemView.findViewById(R.id.item);
            quantity = itemView.findViewById(R.id.itemQuantity);
            price = itemView.findViewById(R.id.itemPrice);
        }

    }

}
