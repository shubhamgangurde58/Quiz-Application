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

public class QuestionActivity2 extends AppCompatActivity {

    String question[] = {

            "1. Who invented the C++ programming language?",
            "2. In which year was the C++ programming language invented",
            "3. Which of the following is used to declare a constant in C++?",
            "4. Which of the following is the correct syntax to read the single character to console in the C++ language?",
            "5. What is the default access specifier for members of a class in C++?",

            "6. Which of the following is the correct syntax to print the message in C++ language?",
            "7. Which of the following is a feature of object-oriented programming?",
            "8. The C++ language is ______ object-oriented language.",
            "9. C++ is a ___ type of language.",
            "10. Which of the following features must be supported by any programming language to become a pure object-oriented programming language?",
    };
    String answer[] = {

            "Bjarne Stroustrup",
            "1979",
            "const",
            "get(ch)",
            "private",

            "cout <<\"Hello world!\";",
            "Inheritance",
            "Semi Object-oriented or Partial Object-oriented",
            "Middle-level language",
            "All of the above",

    };
    String option[] = {

            "Dennis Ritchie","Bjarne Stroustrup","James Gosling","Guido van Rossum",
            "1972","1979","1983","1990",
            "const","static","final","immutable",
            "Read ch()","Getline vh()","get(ch)","Scanf(ch)",
            "public","private","protected","none",

            "cout <<\"Hello world!\";","Cout << Hello world! ;","Out <<\"Hello world!;","None of the above",
            "Inheritance","Multithreading","Exception handling","None of the above",
            "Pure Object oriented","Not Object oriented","Semi Object-oriented or Partial Object-oriented","None of the above",
            "High-level Language","Low-level language","Middle-level language","None of the above",
            "Encapsulation","Inheritance","Polymorphism","All of the above",

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
        setContentView(R.layout.activity_question2);

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

                    Toast.makeText(QuestionActivity2.this, "please select one choice ", Toast.LENGTH_SHORT).show();
                    return;
                }

                RadioButton uans = (RadioButton) findViewById(radioG.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();

                if (ansText.equals(answer[flag]))
                {
                    correct++;
                    Toast.makeText(QuestionActivity2.this, "Correct", Toast.LENGTH_SHORT).show();
                }
                else{
                    wrong++;
                    Toast.makeText(QuestionActivity2.this, "wrong", Toast.LENGTH_SHORT).show();
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
                        Intent i = new Intent(QuestionActivity2.this,ResultActivity2.class);
                        startActivity(i);
                    }

                    radioG.clearCheck();

                }

            }
        });


        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),ResultActivity2.class);
                startActivity(i);
            }
        });

    }
}