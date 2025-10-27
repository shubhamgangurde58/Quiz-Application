package com.shubham.quizapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    TextView tv1,tv2,tv3;
    Button btnRestart;

    TextView resulttext;
    int level = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tv1 = (TextView) findViewById(R.id.tvres);
        tv2 = (TextView) findViewById(R.id.tvres2);
        tv3 = (TextView) findViewById(R.id.tvres3);

        SharedPreferences sp = getSharedPreferences("DATA",MODE_PRIVATE);
        level = Integer.parseInt(sp.getString("C","0"));

        btnRestart = (Button) findViewById(R.id.btnRestart);
        resulttext = findViewById(R.id.resultText);

        StringBuffer sb = new StringBuffer();
        sb.append("Correct Answer : "+ QuestionActivity1.correct+"\n");

        StringBuffer sb2 = new StringBuffer();
        sb2.append("Wrong Answer : "+ QuestionActivity1.wrong+"\n");

        StringBuffer sb3 = new StringBuffer();
        sb3.append("Final Score : "+ QuestionActivity1.correct+"\n");

        StringBuffer sb4 = new StringBuffer();
        sb4.append(QuestionActivity1.correct+ "/" + "10");

        tv1.setText(sb);
        tv2.setText(sb2);
        tv3.setText(sb3);
        resulttext.setText(sb4);

        QuestionActivity1.correct=0;
        QuestionActivity1.wrong=0;

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                startActivity(new Intent(ResultActivity.this,MainActivity.class));

            }
        });



    }

    public  void scoreScreen(View view){
        Intent i = new Intent(ResultActivity.this,Final_Score_Screen.class);
        i.putExtra("Level",level);
        startActivity(i);

    }

}