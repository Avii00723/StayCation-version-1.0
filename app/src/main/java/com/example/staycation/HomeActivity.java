package com.example.staycation;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.Calendar;

public class HomeActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button serch_btn;
    Spinner no_of_dates;
    Spinner no_of_guests;

    static String no_of_days, no_of_guest;

    String indate;
    EditText date;
    String places;
    AutoCompleteTextView place;
    CardView marriotte_jaipur,tajpalace_delhi,tajhotel_mumbai,radissonblu_indore;
    private  static  final String[] STATES=new String[]{
            "delhi","indore","jaipur","mumbai","pune"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        place=findViewById(R.id.places);
        date=findViewById(R.id.dates);
        no_of_dates=findViewById(R.id.nights_to_stay);
        no_of_guests=findViewById(R.id.No_of_Guests);
        marriotte_jaipur=findViewById(R.id.mariottejaipursuggestion);
        tajpalace_delhi=findViewById(R.id.tajpalacedelhisuggestion);
        tajhotel_mumbai=findViewById(R.id.tajhotelsuggestion);
        radissonblu_indore=findViewById(R.id.radissonbluindoresuggestion);

        ArrayAdapter<CharSequence> datesadapter= new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.nights));
        datesadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        no_of_dates.setAdapter(datesadapter);
//        no_of_dates.setSelection(0);

        ArrayAdapter<CharSequence> guestadapter=new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.Guests));
        guestadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        no_of_guests.setAdapter(guestadapter);
//        no_of_guests.setSelection(0);


        serch_btn=findViewById(R.id.search_button);
        ArrayAdapter<String> stateadapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,STATES);
        place.setAdapter(stateadapter);

        place.setOnItemClickListener((parent, view, position, id) -> places=parent.getItemAtPosition(position).toString());

        date.setOnClickListener(v -> {
            final Calendar calendar=Calendar.getInstance();
            int year=calendar.get(Calendar.YEAR);
            int month=calendar.get(Calendar.MONTH);
            int day=calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datepickdialog=new DatePickerDialog(HomeActivity.this,(view, year1, month1, dayOfMonth) -> {
                indate = dayOfMonth + "/" + (month1 + 1) + "/" + year1;
                Log.d("Selected date", indate);
                date.setText(indate);
            }, year,month,day);
            datepickdialog.show();
        });
        serch_btn.setOnClickListener(v -> {

            no_of_days = no_of_dates.getSelectedItem().toString();
            no_of_guest = no_of_guests.getSelectedItem().toString();

            Alldetails.date_det = date.getText().toString();
            Alldetails.night_det = (String) no_of_dates.getSelectedItem();
            Alldetails.guest_det = (String) no_of_guests.getSelectedItem();

//            Log.i("Main", no_of_days + "asfsf");
            Intent intent = new Intent(HomeActivity.this, Home2Activity.class);
            intent.putExtra("placeId", places);
            intent.putExtra("dateofbooking", indate);
            intent.putExtra("days", no_of_days);
            intent.putExtra("guests", no_of_guest);
            intent.putExtra("no_of_days", String.valueOf(no_of_dates));
            startActivity(intent);

        });
        marriotte_jaipur.setOnClickListener(v -> {
            Intent intent=new Intent(HomeActivity.this,Homeh1Activity.class);
            startActivity(intent);
        });
        tajpalace_delhi.setOnClickListener(v -> {
            Intent intent=new Intent(HomeActivity.this, Homeh4Activity.class);
            startActivity(intent);
        });
        tajhotel_mumbai.setOnClickListener(v -> {
            Intent intent=new Intent(HomeActivity.this, Homeh2Activity.class);
            startActivity(intent);
        });
        radissonblu_indore.setOnClickListener(v -> {
            Intent intent=new Intent(HomeActivity.this, Homeh3Activity.class);
            startActivity(intent);
        });


    }

    public void home1(View view) {
        Intent intent = new Intent(HomeActivity.this , HomeActivity.class);
        startActivity(intent);
    }
    public void home2(View view) {
        Intent intent = new Intent(HomeActivity.this , ConfirmActivity.class);
        startActivity(intent);
    }
    public void home3(View view) {
        Intent intent = new Intent(HomeActivity.this , ProfileActivity.class);
        startActivity(intent);
    }

    public void home4(View view) {
        Intent intent = new Intent(HomeActivity.this , LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
