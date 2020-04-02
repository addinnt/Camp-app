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

public class CarrierActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_carrier);

        RecyclerView listView = findViewById(R.id.rv_tenda);

        List<ItemsModel> model = new ArrayList<>();
        model.add(new ItemsModel("Eagle Eye", "https://i.pinimg.com/564x/d5/31/9b/d5319bf0a105f2834208799549d3a3b7.jpg","50-60 Liter","10k"));
        model.add(new ItemsModel("Mountain Smith", "https://i.pinimg.com/564x/65/6d/38/656d38a164757bd66b2cbe55e34155d7.jpg","50-60 Liter","10k"));
        model.add(new ItemsModel("Eiger Alpinist", "https://i.pinimg.com/564x/97/1a/b7/971ab79d9c60ca2671188247711a0759.jpg","70 Liter","15k"));
        model.add(new ItemsModel("Consina Extraterrestrial", "https://i.pinimg.com/564x/0c/7e/d4/0c7ed43bf7bb1594307f796d922a0d08.jpg","70 Liter","15k"));


        ItemsAdapter adapter = new ItemsAdapter(this, model);
        listView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        listView.setLayoutManager(layoutManager);
    }
}
