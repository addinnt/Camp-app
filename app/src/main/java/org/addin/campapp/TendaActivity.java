package org.addin.campapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.addin.campapp.adapter.ItemsAdapter;
import org.addin.campapp.models.ItemsModel;

import java.util.ArrayList;
import java.util.List;

public class TendaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenda);


        RecyclerView listView = findViewById(R.id.rv_tenda);

        List<ItemsModel> model = new ArrayList<>();
        model.add(new ItemsModel("Single Layer", "https://i.pinimg.com/564x/5c/9a/67/5c9a6707ddd3afaf82c35a24b8d516d1.jpg","2-3 person","20k"));
        model.add(new ItemsModel("Double Layer", "https://i.pinimg.com/564x/2c/da/fe/2cdafe80e0366bb8390aa8e915a01959.jpg","2-3 person","25k"));
        model.add(new ItemsModel("Single Layer", "https://i.pinimg.com/564x/0f/c5/62/0fc562287835135a1328597f4d0ab792.jpg","3-5 person","25k"));
        model.add(new ItemsModel("Double Layer", "https://i.pinimg.com/564x/2b/b9/1a/2bb91afdb1ba057f1afdd43b50be7a97.jpg","3-5 person","30k"));
        model.add(new ItemsModel("Double Layer", "https://i.pinimg.com/564x/b1/15/1c/b1151c702a9435906b877d51319afdf8.jpg","5-8 person","40k"));


        ItemsAdapter adapter = new ItemsAdapter(this, model);
        listView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        listView.setLayoutManager(layoutManager);
    }
}
