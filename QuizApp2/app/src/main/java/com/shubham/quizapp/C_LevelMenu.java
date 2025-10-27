package com.shubham.quizapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class C_LevelMenu extends AppCompatActivity {


    String level =  "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_levelmenu);
        SharedPreferences sp = getSharedPreferences("DATA",MODE_PRIVATE);
        level = sp.getString("C","1");
        Toast.makeText(this, "Level:"+sp.getString("C","1"), Toast.LENGTH_SHORT).show();
    }

    public void c_level1(View view){

        Intent i = new Intent(C_LevelMenu.this, QuestionActivity1.class);
        i.putExtra("Level",1);
        startActivity(i);

    }

    public void c_level2(View view){
        if(level.equals("1")) {
            Toast.makeText(this, "Please Clear the Level 1 first", Toast.LENGTH_SHORT).show();
        } else {
            Intent i = new Intent(C_LevelMenu.this, QuestionActivity1.class);
            i.putExtra("Level",2);
            startActivity(i);
        }

    }

    public void c_level3(View view){
        if(level.equals("1") || level.equals("2")) {
            Toast.makeText(this, "Please Clear the Level 2 first", Toast.LENGTH_SHORT).show();
        } else {
            Intent i = new Intent(C_LevelMenu.this, QuestionActivity1.class);
            i.putExtra("Level",3);
            startActivity(i);
        }


    }
}