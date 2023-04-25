package com.example.staycation;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    EditText Emailid,Password1;
    TextView textView2;
    Button Loginbutton1;
    boolean check;

    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitylogin);

        mAuth = FirebaseAuth.getInstance();

        textView2=findViewById(R.id.textView2);
        Emailid = findViewById(R.id.Emailid);
        Password1 = findViewById(R.id.Password1);
        Loginbutton1 =findViewById(R.id.Loginbutton1);

        textView2.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
        });

        Loginbutton1.setOnClickListener(v -> {
                loginUserAccount();
        });
    }
    private void loginUserAccount()
    {
        String email, password;
        email = Emailid.getText().toString();
        password = Password1.getText().toString();

        if (TextUtils.isEmpty(email)) {Toast.makeText(getApplicationContext(), "Please enter email!!", Toast.LENGTH_LONG).show();
            return;
        }

        if (TextUtils.isEmpty(password)) {Toast.makeText(getApplicationContext(), "Please enter password!!",Toast.LENGTH_LONG).show();
            return;
        }

        if(!isEmail(Emailid)){
            Emailid.setError("Enter valid email");
            return;
        }

        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(
                        task -> {
                            if (task.isSuccessful()) {Toast.makeText(getApplicationContext(), "Login successful!!", Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                                startActivity(intent);
                            }
                            else
                            {
                                Toast.makeText(getApplicationContext(), "Login failed!!\n If new user please register.", Toast.LENGTH_LONG).show();
                            }
                        });
    }

    boolean isEmail(EditText text) {
        CharSequence email = text.getText().toString();
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

}
