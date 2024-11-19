package com.example.doan;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ForgotPwdActivity extends AppCompatActivity {
    private EditText etRecoveryEmail;
    private Button btnConfirmEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.forgot_pwd);
        etRecoveryEmail = findViewById(R.id.recovery_email);
        btnConfirmEmail = findViewById(R.id.btn_for_confirm_email);
        btnConfirmEmail.setOnClickListener(v -> {
            String recoveryEmail = etRecoveryEmail.getText().toString();
            if (recoveryEmail.isEmpty()) {
                Toast.makeText(ForgotPwdActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            }
        });
    }
}