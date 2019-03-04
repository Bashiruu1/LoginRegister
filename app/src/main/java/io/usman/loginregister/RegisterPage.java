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
                /*
                    Checks to see if first name has at least three characters, last name with 1. date of birth has to have 8 characters
                    email has to have 1 character, password has to be at least 1 character. if the user fails to meet these requirements then
                    then a toast is sent to make the user enter the require information.
                 */
                if (firstName.length() < 3 || lastName.length() < 1 || dateOfBirth.length() < 8 || email.length() < 1 || password.length() < 1) {
                    Toast.makeText(getApplicationContext(), "Please enter the required information", Toast.LENGTH_LONG).show();
                } else {
                    startActivity(new Intent(RegisterPage.this, LoginPage.class));
                }
            }
        });
    }
}
