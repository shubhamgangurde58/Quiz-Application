package com.shubham.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity2 extends AppCompatActivity {

    TextView tv1,tv2,tv3;
    Button btnRestart;
    TextView resulttext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);

        tv1 = (TextView) findViewById(R.id.tvres);
        tv2 = (TextView) findViewById(R.id.tvres2);
        tv3 = (TextView) findViewById(R.id.tvres3);

        btnRestart = (Button) findViewById(R.id.btnRestart);
        resulttext = findViewById(R.id.resultText);

        StringBuffer sb = new StringBuffer();
        sb.append("Correct Answer : "+QuestionActivity2.correct+"\n");

        StringBuffer sb2 = new StringBuffer();
        sb2.append("Wrong Answer : "+QuestionActivity2.wrong+"\n");

        StringBuffer sb3 = new StringBuffer();
        sb3.append("Final Score : "+QuestionActivity2.correct+"\n");

        StringBuffer sb4 = new StringBuffer();
        sb4.append(QuestionActivity2.correct+ "/" + "10");

        tv1.setText(sb);
        tv2.setText(sb2);
        tv3.setText(sb3);
        resulttext.setText(sb4);

        QuestionActivity2.correct=0;
        QuestionActivity2.wrong=0;

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(ResultActivity2.this,MainActivity.class));

            }
        });
    }

    public  void scoreScreen(View view){

        startActivity(new Intent(ResultActivity2.this,Final_Score_Screen.class));

    }
}