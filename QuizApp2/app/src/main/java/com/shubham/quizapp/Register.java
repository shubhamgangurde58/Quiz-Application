package com.shubham.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Register extends AppCompatActivity {

    public  static  final String TAG = "TAG";
    EditText fullName , email , password , phone;
    Button btnRegister;
    TextView loginHere;

    ProgressBar progressBar;

    String UserId;

    FirebaseAuth fauth;
    FirebaseFirestore fstore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fullName = findViewById(R.id.fullName);
        email = findViewById(R.id.Email);
        password = findViewById(R.id.Password);
        phone = findViewById(R.id.Phone);

        btnRegister = findViewById(R.id.btnRegister);
        loginHere = findViewById(R.id.createText);
        progressBar = findViewById(R.id.progressBar);

        fauth = FirebaseAuth.getInstance();
        fstore = FirebaseFirestore.getInstance();

        if (fauth.getCurrentUser() != null){

            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            finish();
        }

        loginHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this, Login.class);
                startActivity(intent);
            }
        });

         btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String Email = email.getText().toString().trim();
                      String Password = password.getText().toString().trim();
                final String FullName = fullName.getText().toString();
                final String Phone = phone.getText().toString();

                if(TextUtils.isEmpty(Email)){
                    email.setError("Email is Required");
                    return;
                }
                
                if (TextUtils.isEmpty(Password)){
                    password.setError("Password is Required");
                    return;
                }

                if (Password.length()<6){
                    password.setError("Password must be>=6 Character");
                }

                progressBar.setVisibility(view.VISIBLE);

                fauth.createUserWithEmailAndPassword(Email,Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {


                        if (task.isSuccessful()){

                            FirebaseUser fuser = fauth.getCurrentUser();
                            fuser.sendEmailVerification().addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void unused) {

                                   Toast.makeText(Register.this,"Register Succesfull",Toast.LENGTH_SHORT).show();

                                }
                            }).addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {

                                    Log.d(TAG,"OnFailuer : Email Not Send"+e.getMessage());

                                }
                            });

                            Toast.makeText(Register.this,"User Created",Toast.LENGTH_SHORT).show();
                            UserId = fauth.getCurrentUser().getUid();
                            DocumentReference documentReference = fstore.collection("User").document(UserId);
                            Map<String, Object> user = new HashMap<>();
                            user.put("fName",fullName);
                            user.put("Email",Email);
                            user.put("PhoneNo",phone);

                            startActivity(new Intent(Register.this,MainActivity.class));

                            documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void unused) {

                                    Log.d(TAG,"onSuccess : user Profile is Created for "+UserId);


                                }
                            }).addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {

                                    Log.d(TAG,"onFailure :"+e.toString());

                                }
                            });

                            startActivity(new Intent(Register.this,Login.class));


                        }else {

                            Toast.makeText(Register.this,"Error !"+task.getException().getMessage(),Toast.LENGTH_SHORT).show();


                        }

                    }
                });

            }
        });
    }
}