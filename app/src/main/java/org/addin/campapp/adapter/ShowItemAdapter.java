package org.addin.campapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.addin.campapp.R;
import org.addin.campapp.ShowItemActivity;
import org.addin.campapp.models.ItemsModel;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class ShowItemAdapter extends RecyclerView.Adapter<ShowItemAdapter.ViewHolder> {

    private Context context;
    private List<ItemsModel> items;

    public ShowItemAdapter(Context context, List<ItemsModel> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_kategori, parent, false);
        return new ShowItemAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShowItemAdapter.ViewHolder holder, int position) {
        final ItemsModel model = items.get(position);
        holder.kategoriText.setText(model.getKategori());
        holder.cardView.setOnClickListener((new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ShowItemActivity.class);
                intent.putExtra("image_url", model.getLogo());
                intent.putExtra("image_name", model.getKategori());
                context.startActivity(intent);
            }
        }));

        Picasso.get().load(model.getLogo()).into(holder.ivLogo);
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivLogo;
        TextView kategoriText;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivLogo= itemView.findViewById(R.id.kategori_logo);
            kategoriText = itemView.findViewById(R.id.text_kategori);
            cardView = itemView.findViewById(R.id.card_view);

        }
    }
}
