package com.dam.mfa1411;

import static android.view.SoundEffectConstants.CLICK;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

Button button1;
TextView mtv;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_layout);

        button1 = findViewById(R.id.button1);
        mtv = findViewById(R.id.mtv);
        button1.setTextColor(Color.YELLOW);
        button1.setBackgroundColor(Color.BLUE);
        button1.setText(R.string.bust);


     ;
    }
    public void
}