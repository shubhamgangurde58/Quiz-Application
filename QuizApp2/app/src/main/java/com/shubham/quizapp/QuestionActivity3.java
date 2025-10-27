package com.shubham.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class QuestionActivity3 extends AppCompatActivity {

    String question[] = {

            "1. Who developed the Python language?",
            "2. What is the maximum possible length of an identifier?",
            "3. In which year was the Python language developed?",
            "4. Which one of the following is the correct extension of the Python file?",
            "5. In which year was the Python 3.0 version developed?",

            "6. Which of the following is used to define a block of code in Python?",
            "7. Which of the following is the correct way to define a function in Python?",
            "8. What type of data type is None in Python?",
            "9. Which of the following methods is used to remove an item from a list in Python?",
            "10. Which method is used to add an item at the end of a list in Python?",

    };
    String answer[] = {


            "Guido van Rossum",
            "None of these above",
            "1989",
            ".py",
            "2008",

            "Indentation",
            "def myFunction():",
            "Null type",
            "Both A and B",
            "append()",

    };
    String option[] = {

            "Zim Den","Guido van Rossum","Niene Stom","Wick van Rossum",
            "16","32","64","None of these above",
            "1995","1972","1981","1989",
            ".py",".python",".p","None of these",
            "2008","2000","2010","2005",

            "Parentheses","Curly braces {}","Indentation","Square brackets []",
            "function myFunction():","def myFunction():","create function myFunction:","function = myFunction()",
            "Integer","Boolean","Null type","String",
            "remove()","pop()","delete()","Both A and B",
            "extend()","insert()","append()","add()",
    };

    int flag = 0;

    public static int marks=0,correct=0,wrong=0;

    TextView tv;
    Button btnSubmit,btnQuit;
    RadioGroup radioG;
    RadioButton rb1,rb2,rb3,rb4;
    private TextView questionNumber;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

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

        tv.setText(question[flag]);
        rb1.setText(option[0]);
        rb2.setText(option[1]);
        rb3.setText(option[2]);
        rb4.setText(option[3]);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (radioG.getCheckedRadioButtonId()== -1){

                    Toast.makeText(QuestionActivity3.this, "please select one choice ", Toast.LENGTH_SHORT).show();
                    return;
                }

                RadioButton uans = (RadioButton) findViewById(radioG.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();

                if (ansText.equals(answer[flag]))
                {
                    correct++;
                    Toast.makeText(QuestionActivity3.this, "Correct", Toast.LENGTH_SHORT).show();
                }
                else{
                    wrong++;
                    Toast.makeText(QuestionActivity3.this, "wrong", Toast.LENGTH_SHORT).show();
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
                    else {
                        marks=correct;
                        Intent i = new Intent(QuestionActivity3.this,ResultActivity3.class);
                        startActivity(i);
                    }

                    radioG.clearCheck();

                }

            }
        });


        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),ResultActivity3.class);
                startActivity(i);
            }
        });

    }
}