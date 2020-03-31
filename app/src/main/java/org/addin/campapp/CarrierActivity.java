package org.addin.campapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.addin.campapp.adapter.ItemsAdapter;
import org.addin.campapp.models.ItemsModel;

import java.util.ArrayList;
import java.util.List;

public class CarrierActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_carrier);

        RecyclerView listView = findViewById(R.id.rv_tenda);

        List<ItemsModel> model = new ArrayList<>();
        model.add(new ItemsModel("Eagle Eye", "https://i.pinimg.com/564x/d5/31/9b/d5319bf0a105f2834208799549d3a3b7.jpg","50-60 Liter","10k"));
        model.add(new ItemsModel("Mountain Smith", "https://i.pinimg.com/564x/65/6d/38/656d38a164757bd66b2cbe55e34155d7.jpg","50-60 Liter","10k"));


        ItemsAdapter adapter = new ItemsAdapter(this, model);
        listView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        listView.setLayoutManager(layoutManager);
    }
}
