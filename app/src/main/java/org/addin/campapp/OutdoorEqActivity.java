package org.addin.campapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class OutdoorEqActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outdoor_eq);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

//
////        List<ItemsModel> teams = new ArrayList<>();
////        teams.add(new ItemsModel("https://upload.wikimedia.org/wikipedia/commons/0/0c/Cow_female_black_white.jpg", "Mamalia"));
////        teams.add(new ItemsModel("https://upload.wikimedia.org/wikipedia/commons/8/84/Schoenechse.jpg", "Reptil"));
//
////        List<ItemsModel> model = new ArrayList<>();
////        model.add(new ItemsModel("Single Layer", "https://i.pinimg.com/564x/5c/9a/67/5c9a6707ddd3afaf82c35a24b8d516d1.jpg", "2-3 person","20k","Tenda"));
////        model.add(new ItemsModel("Double Layer", "https://i.pinimg.com/564x/2c/da/fe/2cdafe80e0366bb8390aa8e915a01959.jpg",
////                "2-3 person","25k","tenda"));
//
//        List<ItemsModel> model = new ArrayList<>();
//        model.add(new ItemsModel("Tenda","https://i.pinimg.com/564x/2c/5f/41/2c5f4123dd48e8ac88bc7dc998552ac6.jpg"));
//        model.add(new ItemsModel("Carrier","https://i.pinimg.com/564x/fb/a1/36/fba136c2524febe97ed5b0c3a412a553.jpg"));
//        model.add(new ItemsModel("Cooking Set","https://i.pinimg.com/564x/38/10/7e/38107e1aa733212c1cc5d9c0f71a738c.jpg"));
//        model.add(new ItemsModel("Lighting","https://i.pinimg.com/564x/df/1d/04/df1d044a5995d3db0e776b18cbad3a6c.jpg"));
//        model.add(new ItemsModel("Other","https://i.pinimg.com/564x/69/61/96/696196bc1abc9d3e31ae4c197d163047.jpg"));
//
//
//        ShowItemAdapter adapter = new ShowItemAdapter(this, model);
//        teamsView.setAdapter(adapter);
//
//        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 1);
//        teamsView.setLayoutManager(layoutManager);

    }


    public void handleTenda(View view) {
        Intent intent = new Intent(this,TendaActivity.class);
        startActivity(intent);
    }

    public void handleCarrier(View view) {
        Intent intent = new Intent(this,CarrierActivity.class);
        startActivity(intent);
    }

    public void handleCookingSet(View view) {
        Intent intent = new Intent(this,CookingSetActivity.class);
        startActivity(intent);
    }

    public void handleOther(View view) {
        Intent intent = new Intent(this,OtherActivity.class);
        startActivity(intent);
    }
}
