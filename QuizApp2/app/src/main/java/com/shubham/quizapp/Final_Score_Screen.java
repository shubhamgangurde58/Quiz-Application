package com.shubham.quizapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Final_Score_Screen extends AppCompatActivity {

    public TextView levelValue, coinsValue , scoreValue;
    public Button restartButton;
    public int level = 0;  // Example initial level
    public int coins = 0;  // Example initial coins
    public int score = 0;
    public String selectedCourse = null;
    SharedPreferences sp = null;
    SharedPreferences sp2 = null;
    //SharedPreferences.Editor ed = null;
   // int level = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_score_screen);

        sp = getSharedPreferences("SELECTDATA",MODE_PRIVATE);
        //ed = sp.edit();
        selectedCourse = sp.getString("COURSE","NODATA");
        sp2 = getSharedPreferences("DATA",MODE_PRIVATE);


        Bundle B = getIntent().getExtras();
        level = B.getInt("Level");

        // Initialize views
        levelValue = findViewById(R.id.levelValue);
        coinsValue = findViewById(R.id.coinsValue);
        scoreValue = findViewById(R.id.scoreValue);
        restartButton = findViewById(R.id.restartButton);

        // Set initial values
        levelValue.setText(sp2.getString(selectedCourse,"0"));
        coinsValue.setText(sp2.getString("Coins","0"));
        scoreValue.setText(sp2.getString("Score","0"));

        // Set animation for transition effects
        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        // Apply animation to the CardView (optional)
        findViewById(R.id.scoreCardContainer).startAnimation(fadeIn);

        // Restart Button Logic
        restartButton.setOnClickListener(v -> {
            // Increase level and coins as an example
                // level++;
                 //coins += 10;

            startActivity(new Intent(Final_Score_Screen.this,MainActivity.class));

            // Update level and coins with animation
            updateScore(fadeIn);
        });
    }
    private void updateScore(Animation fadeIn) {
        // Animate the updates of Level and Coins
        levelValue.startAnimation(fadeIn);
        coinsValue.startAnimation(fadeIn);

        // Update the text
        levelValue.setText(String.valueOf(level));
        coinsValue.setText(String.valueOf(coins));
    }
}
