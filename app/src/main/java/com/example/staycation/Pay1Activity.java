package com.example.staycation;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Pay1Activity extends AppCompatActivity {
    EditText FirstName , LastName , emailAddress , Address , PostCode ,Country , MobilePhone;
    Button submitBtn;

    static String hotelprice;

    public void button1(View view) {

        Alldetails.num_det = MobilePhone.getText().toString();

        Toast.makeText(this, "Going to Card Payment page ", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this , Pay2Activity.class);
        startActivity(intent);
    }
    public void backButton1(View view) {
        Toast.makeText(this , "User Details submitted successfully" , Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay1);

        hotelprice=getIntent().getStringExtra("price");

        FirstName = findViewById(R.id.firstName);
        LastName = findViewById(R.id.lastName);
        emailAddress = findViewById(R.id.emailAddress);
        PostCode = findViewById(R.id.postCode);
        Country = findViewById(R.id.country);
        MobilePhone = findViewById(R.id.mobilePhone);
        Address = findViewById(R.id.address);
        submitBtn = findViewById(R.id.button1);

        submitBtn.setOnClickListener(view -> {
            if(TextUtils.isEmpty(FirstName.getText().toString())) {
                FirstName.setError("First name is mandatory");
                return;
            }
            if(TextUtils.isEmpty(LastName.getText().toString())) {
                LastName.setError("Last name is mandatory");
                return;
            }
            if(TextUtils.isEmpty(emailAddress.getText().toString()) ) {
                emailAddress.setError("Email address is mandatory");
                return;
            }
            if(!isValidEmail(emailAddress.getText().toString())) {
                emailAddress.setError("Invalid email address");
                return;
            }
            if(TextUtils.isEmpty(PostCode.getText().toString())) {
                PostCode.setError("Post Code is mandatory");
                return;
            }
            if(TextUtils.isEmpty(Country.getText().toString())) {
                Country.setError("Country is mandatory");
                return;
            }
            if(TextUtils.isEmpty(MobilePhone.getText().toString())) {
                MobilePhone.setError("Mobile Phone is mandatory");
                return;
            }
            if(!isValidPhoneNumber(MobilePhone.getText().toString())) {
                MobilePhone.setError("Invalid phone number");
                return;
            }
            if(TextUtils.isEmpty(Address.getText().toString())) {
                Address.setError("Address is mandatory");
                return;
            }

            button1(view);
        });
    }
    private boolean isValidEmail(String emailAddress) {
        return !TextUtils.isEmpty(emailAddress) && android.util.Patterns.EMAIL_ADDRESS.matcher(emailAddress).matches();
    }
    private boolean isValidPhoneNumber(String MobilePhone) {
        return !TextUtils.isEmpty(MobilePhone) && android.util.Patterns.PHONE.matcher(MobilePhone).matches()&& MobilePhone.length() == 10;
    }

}