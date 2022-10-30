package com.johannes2002895.mycoffeelistshop.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.johannes2002895.mycoffeelistshop.Config;
import com.johannes2002895.mycoffeelistshop.Model.CoffeeDrink;
import com.johannes2002895.mycoffeelistshop.R;

import java.util.List;

public class ListCoffeeDrinkAdapter extends RecyclerView.Adapter<ListCoffeeDrinkAdapter.ListViewHolder> {

    List<CoffeeDrink> listCoffeeDrink;

    //Onclick
    private OnItemClickCallback onItemClickCallback;

    //Onclick Method
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListCoffeeDrinkAdapter(List<CoffeeDrink> list){
        listCoffeeDrink = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_coffee, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Glide.with(holder.itemView.getContext())
                .load(Config.IMAGES_URL + listCoffeeDrink.get(position).getPhotoThumbnail())
                .apply(new RequestOptions().override(100,150))
                .into(holder.imgPhoto);
        holder.tvName.setText(listCoffeeDrink.get(position).getName());
        holder.tvDetail.setText(listCoffeeDrink.get(position).getDetail());

        //Onclick
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listCoffeeDrink.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listCoffeeDrink.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }

    //Onclick Interface
    public interface OnItemClickCallback {
        void onItemClicked(CoffeeDrink data);
    }

}
