package com.example.myapplication;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;
    class MainActivity extends Activity implements View.OnClickListener {
        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Button btnNext = findViewById(R.id.button_next_activity);
            btnNext.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(this, SecondaryActivity.class);
            startActivity(intent);
        }
    }

