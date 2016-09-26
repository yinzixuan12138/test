package com.example.yinzixuan.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button a=(Button)findViewById(R.id.button);
       final RelativeLayout ac=(RelativeLayout)findViewById(R.id.relativeLayout);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ac.setVisibility(View.INVISIBLE);
            }
        });
    }
}
