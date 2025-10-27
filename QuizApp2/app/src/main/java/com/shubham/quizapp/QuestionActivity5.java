package com.shubham.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionActivity5 extends AppCompatActivity {

    String question[] = {

            "1. Who invented the Java programming language?",
            "2. In which year was the Java programming language invented?",
            "3. Which of the following is an immediate subclass of the Panel class?",
            "4. In which memory a String is stored, when we create a string using new operator?",
            "5. Which of the following is a marker interface?",

            "6. Which of the following option leads to the portability and security of Java?",
            "7. Which of the following is not a Java features?",
            "8.  _____ is used to find and fix bugs in the Java programs.",
            "9. Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?",
            "10. Which of the following for loop declaration is not valid?",
    };
    String answer[] = {

            "James Gosling",
            "1991",
            "Applet class",
            "Heap memory",
            "Remote interface",

            "Bytecode is executed by JVM",
            "Use of pointers",
            "JDB",
            "Javadoc tool",
            "for ( int i = 99; i >= 0; i / 9 )",

    };
    String option[] = {

            "Dennis Ritchie","Bjarne Stroustrup","James Gosling","Guido van Rossum",
            "1985","1991","1995","2000",
            "Applet class","Window class","Frame class","Dialog class",
            "Stack","String memory","Heap memory","Random storage space",
            "Runnable interface","Remote interface","Readable interface","Result interface",

            "Bytecode is executed by JVM","The applet makes the Java code secure and portable","Use of exception handling","Dynamic binding between objects",
            "Dynamic","Architecture Neutral","Use of pointers","Object-oriented",
            "JVM","JRE","JDK","JDB",
            "javap tool","javaw command","Javadoc tool","javah command",
            "for ( int i = 99; i >= 0; i / 9 )","for ( int i = 7; i <= 77; i += 7 )","for ( int i = 20; i >= 2; - -i )","for ( int i = 2; i <= 20; i = 2* i )",

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
        setContentView(R.layout.activity_question5);

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

                    Toast.makeText(QuestionActivity5.this, "please select one choice ", Toast.LENGTH_SHORT).show();
                    return;
                }

                RadioButton uans = (RadioButton) findViewById(radioG.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();

                if (ansText.equals(answer[flag]))
                {
                    correct++;
                    Toast.makeText(QuestionActivity5.this, "Correct", Toast.LENGTH_SHORT).show();
                }
                else{
                    wrong++;
                    Toast.makeText(QuestionActivity5.this, "wrong", Toast.LENGTH_SHORT).show();
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
                        Intent i = new Intent(QuestionActivity5.this, ResultActivity5.class);
                        startActivity(i);
                    }

                    radioG.clearCheck();

                }

            }
        });


        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), ResultActivity5.class);
                startActivity(i);
            }
        });

    }
}