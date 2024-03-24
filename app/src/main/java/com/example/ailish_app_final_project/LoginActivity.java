package com.example.ailish_app_final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText numberPhone;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onCreateAccountBtnClick(View view){
        Intent intent = new Intent(this, SIgnUpActivity.class);
        startActivity(intent);
    }

    public void onSignInBtnClick(View view){
        numberPhone = findViewById(R.id.editTextPhoneNumber);
        password = findViewById(R.id.editTextPassword);
        Toast.makeText( this, numberPhone.getText()+"--"+password.getText(), Toast.LENGTH_SHORT).show();
    }
}