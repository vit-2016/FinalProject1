package com.example.finalproject.activity.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.finalproject.R;

public class LoginActivity extends AppCompatActivity {

    private EditText login;
    private EditText password;

    private Button log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initUI();
    }

    private void initUI(){
        login = findViewById(R.id.loginET);
        password = findViewById(R.id.passwordET);
        log = findViewById(R.id.loginB);
    }

    public void onClick(View view){

        if(login.getText().length()!=0 && password.getText().length()!=0){
            switch (view.getId()) {
                case R.id.loginB:
                    Intent intent = new Intent(this, MainActivity.class);
                    startActivity(intent);
                    break;
                default:
                    break;
            }
        }else {
            Toast.makeText(this, "Неверный логин или пароль", Toast.LENGTH_LONG).show();
        }
    }
}
