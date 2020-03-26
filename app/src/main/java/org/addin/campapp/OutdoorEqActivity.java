package org.addin.campapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.addin.campapp.adapter.OutdoorAdapter;
import org.addin.campapp.models.EquipmentModel;

import java.util.ArrayList;
import java.util.List;

public class OutdoorEqActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outdoor_eq);

        RecyclerView listView = findViewById(R.id.rv_teams);

        List<EquipmentModel> model = new ArrayList<>();
        model.add(new EquipmentModel("Tenda","https://i.pinimg.com/564x/2c/5f/41/2c5f4123dd48e8ac88bc7dc998552ac6.jpg"));
        model.add(new EquipmentModel("Carier","https://i.pinimg.com/564x/fb/a1/36/fba136c2524febe97ed5b0c3a412a553.jpg"));
        model.add(new EquipmentModel("Cooking Set","https://i.pinimg.com/564x/38/10/7e/38107e1aa733212c1cc5d9c0f71a738c.jpg"));
        model.add(new EquipmentModel("Lighting","https://i.pinimg.com/564x/df/1d/04/df1d044a5995d3db0e776b18cbad3a6c.jpg"));
        model.add(new EquipmentModel("Other","https://i.pinimg.com/564x/69/61/96/696196bc1abc9d3e31ae4c197d163047.jpg"));



//        model.add(new EquipmentModel("Lighting"));
//        model.add(new EquipmentModel("Tenda", "Rei Monodome", "https://drive.google.com/file/d/19AP-ZlmRpG728SDkUZgWSCfYKwYFDRkg/view?usp=sharing", "Single Layer Kapasitas 2-3 orang", 20000));
//        model.add(new EquipmentModel("Tenda", "Rei Dome", "https://drive.google.com/file/d/13jnztxaSnsfP-8Rzgzbq6_sYSETYrw0R/view?usp=sharing", "Double Layer Kapasitas 2-3 orang", 25000));
        OutdoorAdapter adapter = new OutdoorAdapter(this, model);
        listView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        listView.setLayoutManager(layoutManager);
    }
}
