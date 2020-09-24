package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity
{
    String name, email, password, passwordConfirm;

    EditText userName;
    EditText userEmail;
    EditText userPassword;
    EditText userPasswordConfirm;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = (EditText) findViewById(R.id.userName);
        userEmail = (EditText) findViewById(R.id.userEmail);
        userPassword = (EditText) findViewById(R.id.userPassword);
        userPasswordConfirm = (EditText) findViewById(R.id.userPasswordConfirm);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                name = userName.getText().toString();
                email = userEmail.getText().toString();
                password = userPassword.getText().toString();
                passwordConfirm = userPasswordConfirm.getText().toString();

                if(name.equals(null) || email.equals(null) || password.equals(null) || passwordConfirm.equals(null))
                {
                    showToast("You must enter all information.");
                }

                else if(!password.equals(passwordConfirm))
                {
                    showToast("Passwords do not match.");
                }

                else
                {
                    showToast(name);
                }
            }
        });


    }

    private void showToast(String text)
    {
        Toast.makeText(FormActivity.this, text, Toast.LENGTH_SHORT).show();
    }

}