package com.example.ailish_app_final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }

    public void onClickGetStartedButton (View view){
        Button btnGetStarted = findViewById(R.id.btn_getstarted);
        btnGetStarted.setVisibility(View.GONE);
        LottieAnimationView animationView = findViewById(R.id.loading_animation);
        animationView.setVisibility(View.VISIBLE);
        new Handler().postDelayed(null, 3000);
        Intent loginIntent = new Intent(this, LoginActivity.class);
        startActivity(loginIntent);
    }
}