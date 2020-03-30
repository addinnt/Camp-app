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

public class OutdoorEqAdapter extends RecyclerView.Adapter<OutdoorEqAdapter.ViewHolder> {
    private Context context;
    private List<ItemsModel> items;

    public OutdoorEqAdapter(Context context, List<ItemsModel> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_kategori, parent, false);
        return new OutdoorEqAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            final ItemsModel model = items.get(position);
            holder.tvKategori.setText(model.getKategori());
        Picasso.get().load(model.getLogo()).into(holder.ivLogo);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivLogo;
        TextView tvKategori;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivLogo= itemView.findViewById(R.id.item_logo);
            tvKategori= itemView.findViewById(R.id.kategori_logo);
        }
    }
}
