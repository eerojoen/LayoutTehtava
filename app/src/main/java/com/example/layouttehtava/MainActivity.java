package com.example.layouttehtava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton button1;
    Button button2;
    Button button3;
    ImageView picture1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (ToggleButton)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        picture1 = (ImageView)findViewById(R.id.picture1);

        button2.setEnabled(false);
        button3.setEnabled(false);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button1.isChecked()){
                    button2.setEnabled(true);
                    button3.setEnabled(true);
                } else {
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                picture1.setVisibility(View.INVISIBLE);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                picture1.setVisibility(View.VISIBLE);
            }
        });
    }
}
