package com.shubham.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity6 extends AppCompatActivity {

    TextView tv1,tv2,tv3;
    Button btnRestart;
    TextView resulttext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result6);

        tv1 = (TextView) findViewById(R.id.tvres);
        tv2 = (TextView) findViewById(R.id.tvres2);
        tv3 = (TextView) findViewById(R.id.tvres3);

        btnRestart = (Button) findViewById(R.id.btnRestart);
        resulttext = findViewById(R.id.resultText);

        StringBuffer sb = new StringBuffer();
        sb.append("Correct Answer : "+QuestionActivity6.correct+"\n");

        StringBuffer sb2 = new StringBuffer();
        sb2.append("Wrong Answer : "+QuestionActivity6.wrong+"\n");

        StringBuffer sb3 = new StringBuffer();
        sb3.append("Final Score : "+QuestionActivity6.correct+"\n");

        StringBuffer sb4 = new StringBuffer();
        sb4.append(QuestionActivity6.correct+ "/" + "10");

        tv1.setText(sb);
        tv2.setText(sb2);
        tv3.setText(sb3);
        resulttext.setText(sb4);

        QuestionActivity6.correct=0;
        QuestionActivity6.wrong=0;

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(ResultActivity6.this,MainActivity.class));

            }
        });
    }

    public  void scoreScreen(View view){

        startActivity(new Intent(ResultActivity6.this,Final_Score_Screen.class));

    }
}