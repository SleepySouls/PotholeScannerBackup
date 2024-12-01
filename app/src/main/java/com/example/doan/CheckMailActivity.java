package com.example.doan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CheckMailActivity extends AppCompatActivity {
    private TextView tvLogin;
    private Button btnConfirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_mail);

        tvLogin = findViewById(R.id.text_login);
        tvLogin.setOnClickListener(v -> {
            startActivity(new Intent(CheckMailActivity.this, LoginActivity.class));
        });

        btnConfirm = findViewById(R.id.confirm_button_checkmail);
        btnConfirm.setOnClickListener(v -> {
            startActivity(new Intent(CheckMailActivity.this, CreatePasswdActivity.class));
        });


    }
}