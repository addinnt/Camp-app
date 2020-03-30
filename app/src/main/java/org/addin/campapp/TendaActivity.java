package org.addin.campapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.addin.campapp.models.ItemsModel;

import java.util.ArrayList;
import java.util.List;

public class TendaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenda);


//        RecyclerView listView = findViewById(R.id.rv_tenda);
//
//        List<ItemsModel> model = new ArrayList<>();
//        model.add(new ItemsModel("Single Layer", "https://i.pinimg.com/564x/5c/9a/67/5c9a6707ddd3afaf82c35a24b8d516d1.jpg","2-3 person","20k","Tenda"));
//        model.add(new ItemsModel("Double Layer", "https://i.pinimg.com/564x/2c/da/fe/2cdafe80e0366bb8390aa8e915a01959.jpg","2-3 person","25k","tenda"));
//
//
//
//        TendaAdapter adapter = new TendaAdapter(this, model);
//        listView.setAdapter(adapter);
//
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
//        listView.setLayoutManager(layoutManager);
    }
}
