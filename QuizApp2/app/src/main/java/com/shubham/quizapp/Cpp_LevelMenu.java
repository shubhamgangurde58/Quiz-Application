package com.shubham.quizapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cpp_LevelMenu extends AppCompatActivity {

    String level = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cpp_levelmenu);
        SharedPreferences sp = getSharedPreferences("DATA",MODE_PRIVATE);
        level = sp.getString("CPP","1");
        Toast.makeText(this, "Level:"+sp.getString("CPP","1"), Toast.LENGTH_SHORT).show();
    }

    public void cpp_level1(View view) {

        Intent i = new Intent(Cpp_LevelMenu.this, QuestionActivity1.class);
        i.putExtra("Level", 1);
        startActivity(i);

    }

    public void cpp_level2(View view) {
        if (level.equals("1")) {
            Toast.makeText(this, "Please Clear the Level 1 first", Toast.LENGTH_SHORT).show();
        } else {
            Intent i = new Intent(Cpp_LevelMenu.this, QuestionActivity1.class);
            i.putExtra("Level", 2);
            startActivity(i);
        }

    }

    public void cpp_level3(View view) {
        if (level.equals("1") || level.equals("2")) {
            Toast.makeText(this, "Please Clear the Level 2 first", Toast.LENGTH_SHORT).show();
        } else {
            Intent i = new Intent(Cpp_LevelMenu.this, QuestionActivity1.class);
            i.putExtra("Level", 3);
            startActivity(i);
        }
    }
}