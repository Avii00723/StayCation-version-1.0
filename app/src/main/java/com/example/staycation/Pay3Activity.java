package com.example.staycation;

import static com.example.staycation.Home2Activity.tdays;
import static com.example.staycation.Home2Activity.totguest;
import static com.example.staycation.Pay1Activity.hotelprice;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class Pay3Activity extends AppCompatActivity {

    SmsManager smsManager = SmsManager.getDefault();
    TextView o1, o2, o3, o4;
    EditText phone;
    TextView pricelabel;
    String hotelprices=hotelprice;
    String guests= totguest;
    String dayss = tdays;

    int days1=Integer.parseInt(dayss);
    int price=Integer.parseInt(hotelprices);
    int guest1=Integer.parseInt(guests);
    int totalprice=days1*price*guest1;

    String totprice=Integer.toString(totalprice);

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay3);

        pricelabel=findViewById(R.id.pricepay3);
        pricelabel.setText(totprice);

        phone = findViewById(R.id.mobilePhone);


        o1 = findViewById(R.id.textView39);
        o2 = findViewById(R.id.textView40);
        o3 = findViewById(R.id.textView41);
        o4 = findViewById(R.id.textView43);

        o1.setText(Alldetails.hname_det);
        o2.setText(Alldetails.date_det);
        o3.setText(Alldetails.night_det);
        o4.setText(Alldetails.guest_det);
    }
    public void button3(View view) {
        Alldetails.price_det = pricelabel.getText().toString();
        Intent intent = new Intent(Pay3Activity.this , ConfirmActivity.class);
        startActivity(intent);
    }

    public void backButton3(View view ) {
        Intent intent = new Intent(Pay3Activity.this , Pay2Activity.class);
        startActivity(intent);
    }

    public void button312(View view ) {
        String phoneNumber = Alldetails.num_det;
        String m1 = "Dear User, your booking has been confirmed.\nBelow are the details of booking:\n";
        String m3 = "1. Hotel :";
        String m4 = Alldetails.hname_det;
//        String m41 = "\n";
        String m5 = "\n2. Date :";
        String m6 = Alldetails.date_det;
//        String m61 = "\n";
        String m7 = "\n3. Total Price : Rs: ";
        String m8 = pricelabel.getText().toString();
        String m9 = "\nThank you for using our services.";

        String message = m1 + m3 + m4 + m5+ m6+  m7+m8+m9;

        SmsManager smsManager = SmsManager.getDefault();

        ArrayList<String> parts = smsManager.divideMessage(message);

        smsManager.sendMultipartTextMessage(phoneNumber,null, parts, null, null);

        Toast.makeText(getApplicationContext(), "Message Sent", Toast.LENGTH_SHORT).show();
    }
}


