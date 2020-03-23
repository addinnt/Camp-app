package org.addin.campapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.addin.campapp.R;
import org.addin.campapp.models.EquipmentModel;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class OutdoorAdapter extends RecyclerView.Adapter<OutdoorAdapter.ViewHolder> {

    private Context context;
    private List<EquipmentModel> items;

    public OutdoorAdapter(Context context, List<EquipmentModel> items) {
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
        EquipmentModel item = items.get(position);
        // Atur image di baris ini, dapat menggunakan Picasso atau Glide
        holder.kategoriText.setText(item.getKategori());

        //menampilkan gambar menggunakan picasso
        Picasso.get().load(item.getLogo()).into(holder.logoImage);
    }

    @Override
    public int getItemCount() {
        return (items != null ) ? items.size():0 ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView logoImage;
        TextView kategoriText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            logoImage = itemView.findViewById(R.id.image_logo);
            kategoriText = itemView.findViewById(R.id.text_kategori);
        }
    }
}
