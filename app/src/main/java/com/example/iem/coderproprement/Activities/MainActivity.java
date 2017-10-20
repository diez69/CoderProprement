package com.example.iem.coderproprement.Activities;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.iem.coderproprement.Activities.DetailActivity;
import com.example.iem.coderproprement.R;
import com.example.iem.coderproprement.SingletonManager.SingletonButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickDetail (View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }

    final TextView textView = (TextView)findViewById(R.id.tv_device);

    public void onClickConnect (View view) {
        textView.setText(SingletonButton.getInstance().getData());
        SingletonButton.getInstance();
    }


}
