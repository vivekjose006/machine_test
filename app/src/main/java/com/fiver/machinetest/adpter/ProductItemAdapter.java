package com.fiver.machinetest.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.fiver.machinetest.R;
import com.fiver.machinetest.model.ProductModel;


import java.util.List;

public class ProductItemAdapter extends RecyclerView.Adapter<ProductItemAdapter.ProductViewHolder> {

    private Context context;
    private List<ProductModel.Product> itemDataList;

    public ProductItemAdapter(Context context, List<ProductModel.Product> itemDataList) {
        this.context = context;
        this.itemDataList = itemDataList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.produt_item_layout, viewGroup, false);
        return new ProductViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder productViewHolder, int i) {


        Glide.with(context)
                .load(itemDataList.get(i).imageUrl)
                .centerCrop()
                .into(productViewHolder.imgView);
        productViewHolder.description.setText(itemDataList.get(i).description);
        productViewHolder.price.setText(String.valueOf(itemDataList.get(i).price));
        productViewHolder.product_titles.setText(itemDataList.get(i).title);

    }

    @Override
    public int getItemCount() {
        return (itemDataList != null ? itemDataList.size() : 0);
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder{

        TextView product_titles;
        ImageView imgView;
        TextView price;
        TextView description;




        public ProductViewHolder(View itemView) {
            super(itemView);

         product_titles = itemView.findViewById(R.id.item_title);
           imgView= itemView.findViewById(R.id.image_view);
           price =itemView.findViewById(R.id.price_textview);
           description=itemView.findViewById(R.id.description);


        }



    }
}
