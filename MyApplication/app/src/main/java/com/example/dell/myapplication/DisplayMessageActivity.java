package com.example.dell.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        TextView names = (TextView) findViewById(R.id.name);
        names.setText(name);
    }
}
