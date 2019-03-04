package io.usman.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    EditText email, password;
    Button login;
    String realEmail, realPasswrod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        realPasswrod = password.getText().toString();
        login = findViewById(R.id.login_button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realEmail = email.getText().toString();
                realPasswrod = password.getText().toString();
                if (realEmail == "johndoe@gmail.com" && realPasswrod == "password") {
                    startActivity(new Intent(LoginPage.this, SplashPage.class));
                } else {
                    Toast.makeText(LoginPage.this, "Please enter johndoe@gmail.com for email and password for password", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
