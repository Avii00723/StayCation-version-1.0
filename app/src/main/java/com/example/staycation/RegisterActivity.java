package com.example.staycation;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {

    public EditText names, lnames, email,mobile,country,Password1;
    CheckBox box;
    Button register;
    boolean check;

    private FirebaseAuth mauth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mauth = FirebaseAuth.getInstance();

        names=findViewById(R.id.names);
        lnames=findViewById(R.id.names2);
        email =findViewById(R.id.emailid);
        mobile=findViewById(R.id.mobile);
        country=findViewById(R.id.gender);
        Password1=findViewById(R.id.Password1);
        box=findViewById(R.id.box);
        register =findViewById(R.id.registerb);

        register.setOnClickListener(v -> {
            check=checkData();
            if(check) {
                Alldetails.fname_det = names.getText().toString();
                Alldetails.lname_det = lnames.getText().toString();
                Alldetails.number_det = mobile.getText().toString();
                Alldetails.email_det = email.getText().toString();
                Alldetails.addr_det = country.getText().toString();

                registerNew();
            }
        });
    }

    private void registerNew() {
        String Email, password;

        Email = email.getText().toString();
        password = Password1.getText().toString();

        if (TextUtils.isEmpty(Email)) {
            Toast.makeText(getApplicationContext(), "Please enter email!!", Toast.LENGTH_LONG).show();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(getApplicationContext(), "Please enter password!!", Toast.LENGTH_LONG).show();
            return;
        }

        mauth
                .createUserWithEmailAndPassword(Email, password)
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        Toast.makeText(getApplicationContext(), "Registration successful!", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                        startActivity(intent);
                    }
                    else {

                        Toast.makeText(getApplicationContext(), "Registration failed!!" + " Please try again later", Toast.LENGTH_LONG).show();
                    }
                });
    }
    boolean isEmail(EditText text) {
        CharSequence email = text.getText().toString();
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }
    boolean checkData(){
        if(isEmpty(names)){
           names.setError("First Name is required");
           return false;
        }

        if(isEmpty(lnames)){
            lnames.setError("Last Name is required");
            return false;
        }

        if(!isEmail(email)){
            email.setError("Enter valid email");
            return false;
        }

        if(isEmpty(Password1)){
            Password1.setError("Password is required");
            return false;
        }
        if(Password1.length()<8){
            Password1.setError("Password length must be greater than 8");
            return false;
        }

        if(mobile.length()<10){
            mobile.setError("Invalid mobile number");
            return false;
        }

        if(isEmpty(country)){
            country.setError("Country is required");
            return false;
        }

        if(!box.isChecked()){
            box.setError("check this box");
            Toast t = Toast.makeText(this, "Check this box!", Toast.LENGTH_SHORT);
            t.show();
            return false;
        }
        return true;
    }
}