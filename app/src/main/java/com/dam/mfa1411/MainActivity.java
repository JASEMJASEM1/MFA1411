package com.dam.mfa1411;

import static android.view.SoundEffectConstants.CLICK;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

Button button2;
TextView mtv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_layout);

        button2 = findViewById(R.id.button2);
        button2.setTextColor(Color.YELLOW);
        button2.setBackgroundColor(Color.BLUE);
        button2.setText(CLICK);


     ;
    }
}