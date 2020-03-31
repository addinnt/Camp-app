package org.addin.campapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.addin.campapp.R;
import org.addin.campapp.models.ItemsModel;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ViewHolder> {

    private Context context;
    private List<ItemsModel> items;

    public ItemsAdapter(Context context, List<ItemsModel> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ItemsModel item = items.get(position);
        holder.nameText.setText(item.getNama());
        holder.descText.setText(item.getDesc());
        holder.priceText.setText(item.getHarga());

        // Atur image di baris ini, dapat menggunakan Picasso atau Glide
        //menampilkan gambar menggunakan picasso
        Picasso.get().load(item.getLogo()).into(holder.logoImage);
        Picasso.get().setLoggingEnabled(true);


    }

    @Override
    public int getItemCount() {

        return (items != null ) ? items.size():0 ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView logoImage;
        TextView nameText;
        TextView priceText;
        TextView descText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            logoImage= itemView.findViewById(R.id.item_logo);
            nameText = itemView.findViewById(R.id.item_name);
            priceText =itemView.findViewById(R.id.item_price);
            descText = itemView.findViewById(R.id.item_desc);
        }
    }
}
