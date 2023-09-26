package com.example.clicker1;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.DisplayContext;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView viewCount;
    Button button_1;

    Button button_2;

    int count_zm = 0;

    Switch switch_zm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewCount = (TextView) findViewById(R.id.textView);

        viewCount = findViewById(R.id.textView);
        button_1 = findViewById(R.id.button_in_1);
        button_2 = findViewById(R.id.button_in_2);
        switch_zm = findViewById(R.id.switch1);





        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count_zm ++;
                viewCount.setText(" " + count_zm);
            }
        });

        switch_zm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean on) {
                if (on) {
                    button_1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            count_zm --;
                            viewCount.setText(" " + count_zm);
                        }




                    });
                }
                else {
                    button_1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            count_zm ++;
                            viewCount.setText(" " + count_zm);
                        }
                    });
                }



            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count_zm = 0;
                viewCount.setText(" " + count_zm);
            }
        });

    }
}