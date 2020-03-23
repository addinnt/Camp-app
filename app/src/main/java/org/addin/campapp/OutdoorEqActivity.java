package org.addin.campapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.addin.campapp.models.EquipmentModel;

import java.util.ArrayList;
import java.util.List;

public class OutdoorEqActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outdoor_eq);

        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<EquipmentModel> model = new ArrayList<>();
        model.add(new EquipmentModel("Tenda","https://drive.google.com/file/d/11UGtgJs1-m8gWzX2oUSYSvR6THTT7nKb/view?usp=sharing"));
        model.add(new EquipmentModel("Carier","https://drive.google.com/file/d/1x5yOCx0jLvCNp_fU4EoULeL0rT_0XDQn/view?usp=sharing"));
        model.add(new EquipmentModel("Cooking Set","https://drive.google.com/file/d/18AiVYPltf-mYS-uMPSISyR4-tuIGGKWe/view?usp=sharing"));
//        model.add(new EquipmentModel("Lighting"));
//        model.add(new EquipmentModel("Tenda", "Rei Monodome", "https://drive.google.com/file/d/19AP-ZlmRpG728SDkUZgWSCfYKwYFDRkg/view?usp=sharing", "Single Layer Kapasitas 2-3 orang", 20000));
//        model.add(new EquipmentModel("Tenda", "Rei Dome", "https://drive.google.com/file/d/13jnztxaSnsfP-8Rzgzbq6_sYSETYrw0R/view?usp=sharing", "Double Layer Kapasitas 2-3 orang", 25000));

    }
}
