package org.addin.campapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OutdoorEqActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outdoor_eq);

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
