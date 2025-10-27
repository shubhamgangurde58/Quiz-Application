package com.shubham.quizapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.shubham.quizapp.utils.QuestionSetCSharp;
import com.shubham.quizapp.utils.QuestionSetc;
import com.shubham.quizapp.utils.QuestionSetcpp;
import com.shubham.quizapp.utils.QuestionSethtml;
import com.shubham.quizapp.utils.QuestionSetjava;
import com.shubham.quizapp.utils.QuestionSetpython;

import java.util.HashMap;
import java.util.Map;

public class QuestionActivity1 extends AppCompatActivity {

    Map<Integer,String[]> queMap = new HashMap<>();
    Map<Integer,String[]> optionsMap = new HashMap<>();
    Map<Integer,String[]> ansMap = new HashMap<>();


    int flag = 0;

    public static int marks=0,correct=0,wrong=0;

    TextView tv;
    Button btnSubmit,btnQuit;
    RadioGroup radioG;
    RadioButton rb1,rb2,rb3,rb4;
   private TextView questionNumber;

    String[] question, option, answer;
    int selectedLevel = 0;
    String selectedCourse = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        Bundle B = getIntent().getExtras();
        selectedLevel = B.getInt("Level");
        SharedPreferences sp = getSharedPreferences("SELECTDATA",MODE_PRIVATE);

        selectedCourse = sp.getString("COURSE","NODATA");

        if(selectedCourse.equals("C"))
        {
            queMap.put(1, QuestionSetc.question1);
            optionsMap.put(1, QuestionSetc.option1);
            ansMap.put(1, QuestionSetc.answer1);
            queMap.put(2, QuestionSetc.question2);
            optionsMap.put(2, QuestionSetc.option2);
            ansMap.put(2, QuestionSetc.answer2);
            queMap.put(3, QuestionSetc.question3);
            optionsMap.put(3, QuestionSetc.option3);
            ansMap.put(3, QuestionSetc.answer3);
        }
        if(selectedCourse.equals("CPP"))
        {
            queMap.put(1, QuestionSetcpp.question1);
            optionsMap.put(1, QuestionSetcpp.option1);
            ansMap.put(1, QuestionSetcpp.answer1);
            queMap.put(2, QuestionSetcpp.question2);
            optionsMap.put(2, QuestionSetcpp.option2);
            ansMap.put(2, QuestionSetcpp.answer2);
            queMap.put(3, QuestionSetcpp.question3);
            optionsMap.put(3, QuestionSetcpp.option3);
            ansMap.put(3, QuestionSetcpp.answer3);
        }

        if(selectedCourse.equals("Python"))
        {
            queMap.put(1, QuestionSetpython.question1);
            optionsMap.put(1, QuestionSetpython.option1);
            ansMap.put(1, QuestionSetpython.answer1);
            queMap.put(2, QuestionSetpython.question2);
            optionsMap.put(2, QuestionSetpython.option2);
            ansMap.put(2, QuestionSetpython.answer2);
            queMap.put(3, QuestionSetpython.question3);
            optionsMap.put(3, QuestionSetpython.option3);
            ansMap.put(3, QuestionSetpython.answer3);
        }

        if(selectedCourse.equals("HTML"))
        {
            queMap.put(1, QuestionSethtml.question1);
            optionsMap.put(1, QuestionSethtml.option1);
            ansMap.put(1, QuestionSethtml.answer1);
            queMap.put(2, QuestionSethtml.question2);
            optionsMap.put(2, QuestionSethtml.option2);
            ansMap.put(2, QuestionSethtml.answer2);
            queMap.put(3, QuestionSethtml.question3);
            optionsMap.put(3, QuestionSethtml.option3);
            ansMap.put(3, QuestionSethtml.answer3);
        }

        if(selectedCourse.equals("Java"))
        {
            queMap.put(1, QuestionSetjava.question1);
            optionsMap.put(1, QuestionSetjava.option1);
            ansMap.put(1, QuestionSetjava.answer1);
            queMap.put(2, QuestionSetjava.question2);
            optionsMap.put(2, QuestionSetjava.option2);
            ansMap.put(2, QuestionSetjava.answer2);
            queMap.put(3, QuestionSetjava.question3);
            optionsMap.put(3, QuestionSetjava.option3);
            ansMap.put(3, QuestionSetjava.answer3);
        }

        if(selectedCourse.equals("CSHARP"))
        {
            queMap.put(1, QuestionSetCSharp.question1);
            optionsMap.put(1, QuestionSetCSharp.option1);
            ansMap.put(1, QuestionSetCSharp.answer1);
            queMap.put(2, QuestionSetCSharp.question2);
            optionsMap.put(2, QuestionSetCSharp.option2);
            ansMap.put(2, QuestionSetCSharp.answer2);
            queMap.put(3, QuestionSetCSharp.question3);
            optionsMap.put(3, QuestionSetCSharp.option3);
            ansMap.put(3, QuestionSetCSharp.answer3);
        }




        final TextView score = (TextView) findViewById(R.id.textView4);
        TextView textView = (TextView)  findViewById(R.id.DispName);
        Intent intent = getIntent();

        questionNumber = findViewById(R.id.DispName);
        btnSubmit = (Button) findViewById(R.id.buttonNext);

        btnQuit = (Button) findViewById(R.id.buttonquit);
        tv = (TextView) findViewById(R.id.tvQuestion);

        radioG = (RadioGroup) findViewById(R.id.answerGroup);
        rb1 = (RadioButton)  findViewById(R.id.redioBtnA);
        rb2 = (RadioButton)  findViewById(R.id.redioBtnB);
        rb3 = (RadioButton)  findViewById(R.id.redioBtnC);
        rb4 = (RadioButton)  findViewById(R.id.redioBtnD);

            question = queMap.get(selectedLevel);
            option = optionsMap.get(selectedLevel);
            answer = ansMap.get(selectedLevel);

        tv.setText(question[flag]);
        rb1.setText(option[0]);
        rb2.setText(option[1]);
        rb3.setText(option[2]);
        rb4.setText(option[3]);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (radioG.getCheckedRadioButtonId()== -1){
                    Toast.makeText(QuestionActivity1.this, "please select one choice ", Toast.LENGTH_SHORT).show();
                    return;
                }

                RadioButton uans = (RadioButton) findViewById(radioG.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();

                if (ansText.equals(answer[flag]))
                {
                    correct++;
                    Toast.makeText(QuestionActivity1.this, "Correct", Toast.LENGTH_SHORT).show();
                }
                else{
                    wrong++;
                    Toast.makeText(QuestionActivity1.this, "wrong", Toast.LENGTH_SHORT).show();
                }
                flag++;
                if (score!=null){
                    score.setText(""+correct);
                    if (flag<question.length)
                    {
                        tv.setText(question[flag]);
                        rb1.setText(option[flag*4]);
                        rb2.setText(option[flag*4 + 1]);
                        rb3.setText(option[flag*4 + 2]);
                        rb4.setText(option[flag*4 + 3]);
                        questionNumber.setText(flag+"/"+question.length+" Question");
                    }
                    else
                    {
                        marks=correct;
                        SharedPreferences sp = getSharedPreferences("DATA",MODE_PRIVATE);
                        int score = Integer.parseInt(sp.getString("Score","0"));
                        Toast.makeText(QuestionActivity1.this, "Prev Socre:"+score, Toast.LENGTH_SHORT).show();
                        score = score + correct;
                        Toast.makeText(QuestionActivity1.this, "New Score:"+score, Toast.LENGTH_SHORT).show();
                        SharedPreferences.Editor ed = sp.edit();
                        ed.putString("Score",String.valueOf(score));
                        if(correct==10) {
                            int coins  = Integer.parseInt(sp.getString("Coins","0")) + 10;
                            ed.putString("Coins",String.valueOf(coins));
                        }
                        if(correct>=8) {
                            int level = Integer.parseInt(sp.getString(selectedCourse,"0"));
                            Toast.makeText(QuestionActivity1.this, "Congratulations!!! You passed this Level.", Toast.LENGTH_SHORT).show();
                            if(selectedLevel==1) {
                                ed.putString(selectedCourse,"2");
                            } else if(selectedLevel==2) {
                                ed.putString(selectedCourse,"3");
                            }
                        }
                        ed.commit();
                        Intent i = new Intent(QuestionActivity1.this, ResultActivity.class);
                        startActivity(i);
                    }
                    radioG.clearCheck();
                }

            }
        });

        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sp = getSharedPreferences("DATA",MODE_PRIVATE);
                int score = Integer.parseInt(sp.getString("Score","0"));
                Toast.makeText(QuestionActivity1.this, "Prev Socre:"+score, Toast.LENGTH_SHORT).show();
                score = score + correct;
                Toast.makeText(QuestionActivity1.this, "New Score:"+score, Toast.LENGTH_SHORT).show();
                SharedPreferences.Editor ed = sp.edit();
                ed.putString("Score",String.valueOf(score));
                if(correct==10) {
                    int coins  = Integer.parseInt(sp.getString("Coins","0")) + 10;
                    ed.putString("Coins",String.valueOf(coins));
                }
                if(correct>=8) {
                    int level = Integer.parseInt(sp.getString(selectedCourse,"0"));
                    Toast.makeText(QuestionActivity1.this, "Congratulations!!! You passed this Level.", Toast.LENGTH_SHORT).show();
                    if(selectedLevel==1) {
                        ed.putString(selectedCourse,"2");
                    } else if(selectedLevel==2) {
                        ed.putString(selectedCourse,"3");
                    }
                }
                ed.commit();
                Intent i = new Intent(getApplicationContext(),ResultActivity.class);
                i.putExtra("Level",selectedLevel);
                startActivity(i);
            }
        });
    }
}