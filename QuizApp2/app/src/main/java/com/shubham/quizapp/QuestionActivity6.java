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

public class QuestionActivity6 extends AppCompatActivity {

    String question[] = {

            "1. Which keyword is used to create an instance of a class?",
            "2. Which of the following is NOT a valid access modifier in C#?",
            "3. Which of the following data types can hold only true or false values in C#?",
            "4. Which of the following is used to handle exceptions in C#?",
            "5. Which of the following keywords is used for inheritance in C#?",
            
            "6. C# is a programming language, developed by ___.",
            "7. What is the extension of a C# language file?",
            "8. Who is the founder of C# programming language?",
            "9. .Net CLR is equivalent to?",
            "10. SOAP in C# stands for ___.",
    };
    String answer[] = {

            "new",
            "transient",
            "bool",
            "try-catch",
            ": (colon)",

            "Microsoft",
            ".cs",
            "Anders Hejlsberg",
            "Java Virtual Machine",
            "Simple Object Access Protocol",

    };
    String option[] = {

            "class","struct","new","this",
            "private","public","transient","protected",
            "bool","int","char","string",
            "try-catch","try-except","exception-catch","error-catch",
            "extends","super","base"," : (colon)",

            "Oracle","Microsoft","GNU project","Google",
            ".c",".cpp",".cs",".csp",
            "Anders Hejlsberg","Douglas Crockford","Rasmus Lerdorf","Brendan Eich",
            "Common Type System","Common Language Specification","Common Language Runtime","Java Virtual Machine",
            "Simple Object Access Protocol","Simple Object Access Program","Standard Object Access Protocol","Standard Object Access Program",
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
        setContentView(R.layout.activity_question6);

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

                    Toast.makeText(QuestionActivity6.this, "please select one choice ", Toast.LENGTH_SHORT).show();
                    return;
                }

                RadioButton uans = (RadioButton) findViewById(radioG.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();

                if (ansText.equals(answer[flag]))
                {
                    correct++;
                    Toast.makeText(QuestionActivity6.this, "Correct", Toast.LENGTH_SHORT).show();
                }
                else{
                    wrong++;
                    Toast.makeText(QuestionActivity6.this, "wrong", Toast.LENGTH_SHORT).show();
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
                        Intent i = new Intent(QuestionActivity6.this,ResultActivity6.class);
                        startActivity(i);
                    }

                    radioG.clearCheck();

                }

            }
        });


        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),ResultActivity6.class);
                startActivity(i);
            }
        });



    }
}