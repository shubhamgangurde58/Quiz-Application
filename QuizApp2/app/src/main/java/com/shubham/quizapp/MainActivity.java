package com.shubham.quizapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;
//import com.google.firebase.database.collection.BuildConfig;

public class MainActivity extends AppCompatActivity {

    NavigationView navigationView;
    ActionBarDrawerToggle actionBarDrawerToggle;
    DrawerLayout drawerLayout;
    SharedPreferences sp2 = null;
    SharedPreferences.Editor ed2 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawerlayout);

        sp2 = getSharedPreferences("SELECTDATA",MODE_PRIVATE);
        ed2 = sp2.edit();

        SharedPreferences sp = getSharedPreferences("DATA",MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        if(sp.getString("C","NODATA").toString().equals("NODATA")) {
            ed.putString("C","1");
        }
        if(sp.getString("CPP","NODATA").toString().equals("NODATA")) {
            ed.putString("CPP","1");
        }
        if(sp.getString("Python","NODATA").toString().equals("NODATA")) {
            ed.putString("Python","1");
        }
        if(sp.getString("HTML","NODATA").toString().equals("NODATA")) {
            ed.putString("HTML","1");
        }
        if(sp.getString("Java","NODATA").toString().equals("NODATA")) {
            ed.putString("Java","1");
        }
        if(sp.getString("CSHARP","NODATA").toString().equals("NODATA")) {
            ed.putString("CSHARP","1");
        }
        if(sp.getString("Score","NODATA").toString().equals("NODATA")) {
            ed.putString("Score","0");
        }
        if(sp.getString("Coins","NODATA").toString().equals("NODATA")) {
            ed.putString("Coins","0");
        }
        ed.commit();


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        navigationView = findViewById(R.id.navigation_view);
        navigationView.setItemIconTintList(null);
        drawerLayout = findViewById(R.id.drawer);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open,
                R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        navigationView.setNavigationItemSelectedListener(new
                                                                 NavigationView.OnNavigationItemSelectedListener() {
                                                                     @Override
                                                                     public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                                                                         switch (item.getItemId()) {
                                                                             // COMMON
//                                                                             case R.id.facebookPage:
//                                                                                 break;
//                                                                             case R.id.website:
//                                                                                 break;
//                                                                             case R.id.nav_privacy_policy:
//                                                                                 break;
//                                                                             case R.id.nav_terms_conditions:
//                                                                                 break;
//                                                                             case R.id.more:
//                                                                                 break;
//                                                                             // COMMON
//                                                                             // IMPORTANT //
//                                                                             case R.id.nav_rate:
//
//                                                                                 Uri uri = Uri.parse("market://details?id=" + getApplication().getPackageName());
//                                                                                 Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
//                                                                                 // To count with Play market backstack, After pressing back button,
//                                                                                 // to taken back to our application, we need to add following flags to intent.
//                                                                                 if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                                                                                     goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
//                                                                                             Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
//                                                                                             Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
//                                                                                 }
//                                                                                 try {
//                                                                                     startActivity(goToMarket);
//                                                                                 } catch (
//                                                                                         ActivityNotFoundException e) {
//                                                                                     startActivity(new Intent(Intent.ACTION_VIEW,
//                                                                                             Uri.parse("http://play.google.com/store/apps/details?id=" + getApplication().getPackageName())));
//                                                                                 }
//
//                                                                                 break;
//
//                                                                             // IMPORTANT //
//                                                                             // IMPORTANT //
//                                                                             case R.id.nav_share:
//
//
//                                                                                 Intent shareIntent = new Intent(Intent.ACTION_SEND);
//                                                                                 shareIntent.setType("text/plain");
//                                                                                 shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Quiz App");
//                                                                                 String shareMessage= "This Is Best Application For Quiz App.\n\n";
//                                                                                 shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID;
//                                                                                 shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
//                                                                                 startActivity(Intent.createChooser(shareIntent, "choose one"));
//
//                                                                                 break;
//
//                                                                             // IMPORTANT //
//                                                                             default:
//                                                                                 throw new IllegalStateException("Unexpected value: " + item.getItemId());
                                                                         }
                                                                         return true;
                                                                         }
                                                                 });

    }
    public void C(View view){
        ed2.putString("COURSE","C");
        ed2.commit();
        Intent i = new Intent(MainActivity.this, C_LevelMenu.class);
        startActivity(i);

    }
    public void Cplus(View view){
        ed2.putString("COURSE","CPP");
        ed2.commit();
        Intent i = new Intent(MainActivity.this,Cpp_LevelMenu.class);
        startActivity(i);

    }
    public void Python(View view){
        ed2.putString("COURSE","Python");
        ed2.commit();
        Intent i = new Intent(MainActivity.this,Python_LevelMenu.class);
        startActivity(i);

    }
    public void Html(View view){
        ed2.putString("COURSE","HTML");
        ed2.commit();
        Intent i = new Intent(MainActivity.this,HTML_LevelMenu.class);
        startActivity(i);

    }
    public void Java(View view){
        ed2.putString("COURSE","Java");
        ed2.commit();
        Intent i = new Intent(MainActivity.this,Java_LevelMenu.class);
        startActivity(i);

    }
    public void CSharp(View view){
        ed2.putString("COURSE","CSHARP");
        ed2.commit();
        Intent i = new Intent(MainActivity.this,CSharp_LevelMenu.class);
        startActivity(i);

    }

}