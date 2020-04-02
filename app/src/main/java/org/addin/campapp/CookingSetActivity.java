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

public class CookingSetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cooking_set);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        RecyclerView listView = findViewById(R.id.rv_tenda);

        List<ItemsModel> model = new ArrayList<>();
        model.add(new ItemsModel("Nesting", "https://s.blanja.com/picspace/160/100512/600.600_6666020f44ec498a8b9fe842f27e22f6.jpg","Tanpa windproof","5k"));
        model.add(new ItemsModel("Nesting", "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/medium//104/MTA-3998065/andess_kompor_camping_windproof_kompor_outdoor_type_bunga_full02.jpg","Dengan windproof","8k"));
        model.add(new ItemsModel("Panci Set", "https://ae01.alicdn.com/kf/HTB1hbzAQFXXXXb5XXXXq6xXFXXXg/Non-stick-Pot-perjalanan-Panci-Portabel-Outdoor-Camping-Hiking-Memasak-Set-Peralatan-Masak-peralatan-makan.jpg","Bisa sewa terpisah","4k"));


        ItemsAdapter adapter = new ItemsAdapter(this, model);
        listView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        listView.setLayoutManager(layoutManager);
    }
}
