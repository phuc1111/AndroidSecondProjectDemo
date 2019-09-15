package com.example.androidsecondprojectdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button bt = (Button) findViewById(R.id.button_login);
        final EditText edt1 = findViewById(R.id.edit_text_email);
        final EditText edt2 = findViewById(R.id.edit_text_password);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                intent.putExtra("key1", edt1.getText().toString());
                intent.putExtra("key2", edt2.getText().toString());
                startActivity(intent);
            }
        });
    }
}