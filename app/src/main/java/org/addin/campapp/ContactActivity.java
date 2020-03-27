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

public class ContactActivity extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }


    public void handleInstagram(View view) {
//        getPackageManager().getLaunchIntentForPackage("com.instagram.android");
//
//        newInstagramProfileIntent(getPackageManager(),"https://www.instagram.com/malangcamp/");

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

        //newFacebookIntent(context.getPackageManager(),"https://www.facebook.com/malang.camp");

//        Uri uri = Uri.parse("https://www.facebook.com/malang.camp/");
//        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);
//
//        likeIng.setPackage("com.facebook.katana");
//
//        try {
//            startActivity(likeIng);
//        } catch (ActivityNotFoundException e) {
//            startActivity(new Intent(Intent.ACTION_VIEW,
//                    Uri.parse("https://www.facebook.com/malang.camp/")));
//        }

        Intent facebookIntent = getOpenFacebookIntent(this);
        startActivity(facebookIntent);

    }

    public static Intent getOpenFacebookIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.facebook.katana", 0); //Checks if FB is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("fb://profile/254175194653125")); //Trys to make intent with FB's URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/malang.camp/")); //catches and opens a url to the desired page
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

//        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
//                Uri.parse("http://maps.google.com/maps?saddr=20.344,34.34&daddr=20.5666,45.345"));
//        startActivity(intent);
    }

    /**
     * Intent to open the official Instagram app to the user's profile. If the Instagram app is not
     * installed then the Web Browser will be used.</p>
     *
     * Example usage:</p> {@code newInstagramProfileIntent(context.getPackageManager(),
     *     "http://instagram.com/jaredrummler");}</p>
     *
     * @param pm
     *            The {@link PackageManager}. You can find this class through
     *            {@link Context#getPackageManager()}.
     * @param url
     *            The URL to the user's Instagram profile.
     * @return The intent to open the Instagram app to the user's profile.
     */
//    public static Intent newInstagramProfileIntent(PackageManager pm, String url) {
//        final Intent intent = new Intent(Intent.ACTION_VIEW);
//        try {
//            if (pm.getPackageInfo("com.instagram.android", 0) != null) {
//                if (url.endsWith("/")) {
//                    url = url.substring(0, url.length() - 1);
//                }
//                final String username = url.substring(url.lastIndexOf("/") + 1);
//                // http://stackoverflow.com/questions/21505941/intent-to-open-instagram-user-profile-on-android
//                intent.setData(Uri.parse("http://instagram.com/_u/" + username));
//                intent.setPackage("com.instagram.android");
//                return intent;
//            }
//        } catch (PackageManager.NameNotFoundException ignored) {
//        }
//        intent.setData(Uri.parse(url));
//        return intent;
//    }
//
//    /**
//     * <p>Intent to open the official Facebook app. If the Facebook app is not installed then the
//     * default web browser will be used.</p>
//     *
//     * <p>Example usage:</p>
//     *
//     * {@code newFacebookIntent(ctx.getPackageManager(), "https://www.facebook.com/JRummyApps");}
//     *
//     * @param pm
//     *     The {@link PackageManager}. You can find this class through {@link
//     *     Context#getPackageManager()}.
//     * @param url
//     *     The full URL to the Facebook page or profile.
//     * @return An intent that will open the Facebook page/profile.
//     */
//    public static Intent newFacebookIntent(PackageManager pm, String url) {
//        Uri uri = Uri.parse(url);
//        try {
//            ApplicationInfo applicationInfo = pm.getApplicationInfo("com.facebook.katana", 0);
//            if (applicationInfo.enabled) {
//                // http://stackoverflow.com/a/24547437/1048340
//                uri = Uri.parse("fb://facewebmodal/f?href=" + url);
//            }
//        } catch (PackageManager.NameNotFoundException ignored) {
//        }
//        return new Intent(Intent.ACTION_VIEW, uri);
//    }
}

