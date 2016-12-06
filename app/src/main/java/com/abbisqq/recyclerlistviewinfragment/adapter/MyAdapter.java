package com.abbisqq.recyclerlistviewinfragment.adapter;

import android.app.Activity;
import android.app.Fragment;
import android.app.LauncherActivity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.abbisqq.recyclerlistviewinfragment.R;
import com.abbisqq.recyclerlistviewinfragment.model.ListItem;

import java.util.List;

/**
 * Created by babis on 7/11/2016.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder>{

        private List<ListItem> listData;
        private LayoutInflater inflater;


    private ItemClickCallBack itemClickCallBack;

    public  interface ItemClickCallBack {
        void onItemClick(int p);
        void onIconClick(int p);

    }

    public void setItemClickCallBack(final ItemClickCallBack itemClickCallBack) {
        this.itemClickCallBack = itemClickCallBack;
    }



    public MyAdapter(List<ListItem> listData, Context c) {
        this.listData = listData;
        this.inflater = LayoutInflater.from(c);
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_item,parent,false);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {

        ListItem item = listData.get(position);
        holder.title.setText(item.getTitle());
        holder.icon.setImageResource(item.getImageRes());



    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView title;
        private ImageView icon;
        private View container;

        public MyHolder(View itemView) {
        super(itemView);

        title = (TextView) itemView.findViewById(R.id.item_text);
        icon = (ImageView) itemView.findViewById(R.id.icon_item);
        container = itemView.findViewById(R.id.container_item);

            icon.setOnClickListener(this);
        container.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            if(view.getId()==R.id.container_item){
                //gets the position of the item hat was clicked
                itemClickCallBack.onItemClick(getAdapterPosition());
            }else{
                itemClickCallBack.onIconClick(getAdapterPosition());
            }
        }
    }
}
