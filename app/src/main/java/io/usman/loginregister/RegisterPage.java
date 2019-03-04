package io.usman.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterPage extends AppCompatActivity {
    EditText firstName, lastName, dateOfBirth, email, password;
    Button registerConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        firstName = findViewById(R.id.firstname);
        lastName = findViewById(R.id.lastname);
        dateOfBirth = findViewById(R.id.date_of_birth);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        registerConfirm = findViewById(R.id.register_confirm);


        registerConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String firstname = firstName.getText().toString();
                    String lastname = lastName.getText().toString();
                    String dateofbirth = dateOfBirth.getText().toString();
                    String emailAddress = email.getText().toString();
                    String pass = password.getText().toString();

                    startActivity(new Intent(RegisterPage.this, LoginPage.class));
                } catch (IllegalArgumentException e) {

                    //Ensures the app does no crash if missing 1 or more input from user
                    Toast.makeText(getApplicationContext(), e.getMessage() + "Please enter the required information", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
