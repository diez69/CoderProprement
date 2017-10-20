package com.example.iem.coderproprement.Activities;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.iem.coderproprement.Activities.DetailActivity;
import com.example.iem.coderproprement.R;
import com.example.iem.coderproprement.SingletonManager.SingletonButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ContentView();
    }

    protected void ContentView () {

        Button btnConnect = (Button) findViewById(R.id.button_connect);
        final TextView textView = (TextView)findViewById(R.id.tv_device);
        btnConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(SingletonButton.getInstance().isConnected());
                SingletonButton.getInstance();
            }
        });

        Button btnDetail = (Button) findViewById(R.id.button_detail);
        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, DetailActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
    }
}

