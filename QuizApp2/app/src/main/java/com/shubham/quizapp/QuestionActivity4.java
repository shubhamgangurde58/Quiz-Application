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

public class QuestionActivity4 extends AppCompatActivity {

    String question[] = {

            "1. Who is the father of HTML?",
            "2. Which of the following is used to read an HTML page and render it?",
            "3. Which element is used for or styling HTML5 layout?",
            "4. Which HTML tag is used to insert an image?",
            "5. Which tag is used to create a dropdown in HTML Form?",

            "6. HTML stands for -",
            "7. The correct sequence of HTML tags for starting a webpage is -",
            "8. Which of the following element is responsible for making the text bold in HTML?",
            "9. Which of the following tag is used for inserting the largest heading in HTML?",
            "10. Which of the following element is responsible for making the text italic in HTML?",

    };
    String answer[] = {

            "Tim Berners-Lee",
            "Web browser",
            "CSS",
            "<img src=”htmllogo.jpg” />",
            "<select>",

            "HyperText Markup Language",
            "HTML, Head, Title, Body",
            "<b>",
            "<h1>",
            "<i>",

    };
    String option[] = {

            "Rasmus Lerdorf","Tim Berners-Lee","Brendan Eich","Sergey Brin",
            "Web server","Web network","Web browser","Web matrix",
            "CSS","jQuery","JavaScript","PHP",
            "<img url=”htmllogo.jpg” />","<img alt=”htmllogo.jpg” />","<img src=”htmllogo.jpg” />","<img link=”htmllogo.jpg” />",
            "<input>","<select>","<text>","<textarea>",

            "HighText Machine Language","HyperText and links Markup Language","HyperText Markup Language","None of these",
            "Head, Title, HTML, body","HTML, Body, Title, Head","HTML, Head, Body , title","HTML, Head, Title, Body",
            "<pre>","<a>","<b>","<br>",
            "<h3>","<h1>","<h5>","<h6>",
            "<i>","<italic>","<it>","<pre>",

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
        setContentView(R.layout.activity_question4);

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

                    Toast.makeText(QuestionActivity4.this, "please select one choice ", Toast.LENGTH_SHORT).show();
                    return;
                }

                RadioButton uans = (RadioButton) findViewById(radioG.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();

                if (ansText.equals(answer[flag]))
                {
                    correct++;
                    Toast.makeText(QuestionActivity4.this, "Correct", Toast.LENGTH_SHORT).show();
                }
                else{
                    wrong++;
                    Toast.makeText(QuestionActivity4.this, "wrong", Toast.LENGTH_SHORT).show();
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
                        Intent i = new Intent(QuestionActivity4.this,ResultActivity4.class);
                        startActivity(i);
                    }

                    radioG.clearCheck();

                }

            }
        });


        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),ResultActivity4.class);
                startActivity(i);
            }
        });

    }
}