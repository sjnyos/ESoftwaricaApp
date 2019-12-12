package com.machamasisuraj.esoftwaricaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etUsername, etPassword;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUsername = findViewById(R.id.etUsername);
        etPassword=findViewById(R.id.etPassword);
        btnLogin=findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);

    }

    public void  callonError(){
        etUsername.setError("Username and Password is Incorrect.");
        etUsername.requestFocus();
        Toast.makeText(this, "Either Username or Password is Incorrect", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==btnLogin.getId()){

            if(TextUtils.isEmpty(etUsername.getText().toString()) || TextUtils.isEmpty(etPassword.getText().toString())){
                callonError();
                return;
            }
            if(etUsername.getText().toString().equals("softwarica") && etPassword.getText().toString().equals("coventry")){
                Intent intent = new Intent(MainActivity.this,BottomNavActivity.class);
                startActivity(intent);
            }
            else{
                callonError();
            }



        }

    }
}
