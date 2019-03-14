package com.example.hoi;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ListOnlineViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView txtEmail;
    ItemClickListener itemClickListenener;
    public ListOnlineViewHolder(View itemView) {
        super(itemView);
        txtEmail=(TextView)itemView.findViewById(R.id.txt_email);
    }

    public void setItemClickListenener(ItemClickListener itemClickListenener) {
        this.itemClickListenener = itemClickListenener;
    }

    @Override
    public void onClick(View view) {
        itemClickListenener.onClick(view, getAdapterPosition());
    }
}
