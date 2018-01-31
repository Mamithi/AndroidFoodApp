package com.mamithi.delivery.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mamithi.delivery.Interface.ItemClickListener;
import com.mamithi.delivery.R;

/**
 * Created by mamithi on 1/31/18.
 */

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
   public TextView textMenuName;
   public ImageView imageView;

   private ItemClickListener itemClickListener;

    public MenuViewHolder(View itemView) {
        super(itemView);

        textMenuName = itemView.findViewById(R.id.menu_name);
        imageView = itemView.findViewById(R.id.menu_image);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view,getAdapterPosition(),false);

    }
}
