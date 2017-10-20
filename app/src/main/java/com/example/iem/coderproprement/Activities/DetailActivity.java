package com.example.iem.coderproprement.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.iem.coderproprement.R;
import com.example.iem.coderproprement.SingletonManager.SingletonButton;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ContentView();
    }

    protected void ContentView () {
        Button btnRate = (Button) findViewById(R.id.button_rate);
        final TextView textView = (TextView)findViewById(R.id.tv_detail);
        btnRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(SingletonButton.getInstance().getRate());
                SingletonButton.getInstance();
            }
        });
    }
}
