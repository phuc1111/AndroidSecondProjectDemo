package com.example.androidsecondprojectdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent intent = getIntent();
        String value1 = intent.getStringExtra("key1");
        String value2 = intent.getStringExtra("key2");

        TextView tv1 = findViewById(R.id.tvEmail);
        tv1.setText(tv1.getText().toString() + "\t" + value1);
        TextView tv2 = findViewById(R.id.tvPassword);
        tv2.setText(tv2.getText().toString() + "\t" + value2);
        TextView tv = (TextView) findViewById(R.id.tvHello);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                finish();
                Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
