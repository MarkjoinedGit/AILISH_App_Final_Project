package com.example.ailish_app_final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SIgnUpActivity extends AppCompatActivity {
    private EditText username;
    private EditText numberPhone;
    private EditText password;
    private EditText confirmedPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void onSignUpBtnClick(View view){
        username = findViewById(R.id.editTextUsername);
        numberPhone = findViewById(R.id.editTextPhoneNumber);
        password = findViewById(R.id.editTextPassword);
        confirmedPassword = findViewById(R.id.editTextConfirmedPassword);
        Toast.makeText( this, username.getText()+"-"+numberPhone.getText()+"-"+password.getText()+"-"+confirmedPassword.getText(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}