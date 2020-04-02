package org.addin.campapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class ContactActivity extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_contact);
    }


    public void handleInstagram(View view) {

        Uri uri = Uri.parse("http://instagram.com/_u/malangcamp/");
        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

        likeIng.setPackage("com.instagram.android");

        try {
            startActivity(likeIng);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://instagram.com/malangcamp/")));
        }

    }

    public void handleFacebook(View view) {

        Uri uri = Uri.parse("https://www.facebook.com/malang.camp/");
        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

        likeIng.setPackage("com.facebook.katana");

        try {
            startActivity(likeIng);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/malang.camp/")));
        }
    }



    public void handleMaps(View view) {
        Uri uri = Uri.parse("https://goo.gl/maps/5VJ1DuuSA9aasoan7/");
        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

        likeIng.setPackage("com.google.android.maps");

        try {
            startActivity(likeIng);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://goo.gl/maps/5VJ1DuuSA9aasoan7/")));
        }

    }


}

