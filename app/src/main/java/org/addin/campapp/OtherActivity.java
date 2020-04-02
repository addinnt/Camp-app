package org.addin.campapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import org.addin.campapp.adapter.ItemsAdapter;
import org.addin.campapp.models.ItemsModel;

import java.util.ArrayList;
import java.util.List;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        RecyclerView listView = findViewById(R.id.rv_tenda);

        List<ItemsModel> model = new ArrayList<>();
        model.add(new ItemsModel("Lampu Tenda Eiger", "https://s1.bukalapak.com/img/12470502511/w-1000/Recomended_Seller_Lampu_Tenda_Eiger_Warna_Hijau.jpg","Menggunakan SolarCell\n(tidak pakai baterai)","5k"));
        model.add(new ItemsModel("Lanpu Tenda Kecil", "https://wirajayaadventure.files.wordpress.com/2016/09/lampu-tenda.jpg","Menggunakan Baterai","3k"));
        model.add(new ItemsModel("Headlamp", "https://eigerindostore.com/media/catalog/product/cache/image/700x700/e9c3970ab036de70892d86c6d221abfe/9/1/910004422001_2.jpg","Waterproof","5k"));
        model.add(new ItemsModel("Senter", "https://ecs7.tokopedia.net/img/cache/700/product-1/2018/2/19/24600368/24600368_1d4c2a87-443c-4d80-aaaa-0fbb07356333_1000_1000.jpg","Waterproof","5k"));
        model.add(new ItemsModel("Sleeping Bag", "https://eigerindostore.com/media/catalog/product/cache/image/700x700/e9c3970ab036de70892d86c6d221abfe/9/1/910003699001-3.jpg","Ukuran 215x75cm","6k"));
        model.add(new ItemsModel("Matras", "https://eigerindostore.com/media/catalog/product/cache/image/700x700/e9c3970ab036de70892d86c6d221abfe/3/_/3_143.jpg","Ukuran 178x60cm","5k"));
        model.add(new ItemsModel("Hammock", "https://eigerindostore.com/media/catalog/product/cache/image/700x700/e9c3970ab036de70892d86c6d221abfe/9/1/910003322001_6_1.jpg","Berat Max 200kg","8k"));
        model.add(new ItemsModel("Cover Bag", "https://eigerindostore.com/media/catalog/product/cache/image/700x700/e9c3970ab036de70892d86c6d221abfe/2/_/2_139_19.jpg","Tersedia ukuran\n75L/65L/25L","3k"));


        ItemsAdapter adapter = new ItemsAdapter(this, model);
        listView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        listView.setLayoutManager(layoutManager);
    }
}
