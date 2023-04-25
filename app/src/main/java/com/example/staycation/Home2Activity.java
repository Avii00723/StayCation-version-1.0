package com.example.staycation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Home2Activity extends AppCompatActivity {

    CardView marriotte_jaipur,tajpalace_delhi,tajhotel_mumbai,radissonblu_indore,aloft_newdelhi,essentialuxhotel_indore,hyattregency_pune,mariotte_indore,novotelaerocity_delhi,novotel_pune,oberoi_mumbai,corinthians_pune,trident_jaipur,umaidbhawan_jaipur,vitshotel_mumbai;
    TextView suggestionhotel;

    static String tdays, totguest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        tdays = getIntent().getStringExtra("days");
        totguest = getIntent().getStringExtra("guests");

        String state=getIntent().getStringExtra("placeId");

        mariotte_indore=findViewById(R.id.marrioteindore_view);
        marriotte_jaipur=findViewById(R.id.mariotte_jaipur_view);
        tajpalace_delhi=findViewById(R.id.taj_palace_delhi_view);
        tajhotel_mumbai=findViewById(R.id.tajhotel_mumbai_view);
        radissonblu_indore=findViewById(R.id.radisson_blu_indore_view);
        aloft_newdelhi=findViewById(R.id.aloft_newdelhi_view);
        essentialuxhotel_indore=findViewById(R.id.essentia_luxuryhotel_indore_view);
        hyattregency_pune=findViewById(R.id.hyatt_regency_pune_view);
        novotel_pune=findViewById(R.id.novotelpune_view);
        novotelaerocity_delhi=findViewById(R.id.novotelaerocity_delhi_view);
        oberoi_mumbai=findViewById(R.id.oberoi_mumbai_view);
        corinthians_pune=findViewById(R.id.corinthians_pune_view);
        trident_jaipur=findViewById(R.id.trident_jaipur_view);
        umaidbhawan_jaipur=findViewById(R.id.umaidbhawan_jaipur_view);
        vitshotel_mumbai=findViewById(R.id.vitshotel_mumbai_view);
        suggestionhotel=findViewById(R.id.suggestedhoteltext);

        String[] cmpstates= new String[]{"delhi", "indore", "mumbai", "pune", "jaipur"};
        Toast.makeText(getApplicationContext(),state,Toast.LENGTH_SHORT).show();

        if (state.equals(cmpstates[0])){
            marriotte_jaipur.setVisibility(View.GONE);
            mariotte_indore.setVisibility(View.GONE);
            tajpalace_delhi.setVisibility(View.VISIBLE);
            tajhotel_mumbai.setVisibility(View.GONE);
            radissonblu_indore.setVisibility(View.GONE);
            aloft_newdelhi.setVisibility(View.VISIBLE);
            essentialuxhotel_indore.setVisibility(View.GONE);
            hyattregency_pune.setVisibility(View.GONE);
            novotelaerocity_delhi.setVisibility(View.VISIBLE);
            oberoi_mumbai.setVisibility(View.GONE);
            corinthians_pune.setVisibility(View.GONE);
            trident_jaipur.setVisibility(View.GONE);
            umaidbhawan_jaipur.setVisibility(View.GONE);
            novotel_pune.setVisibility(View.GONE);
            vitshotel_mumbai.setVisibility(View.GONE);
        }
        else if(state.equals(cmpstates[1])){
            marriotte_jaipur.setVisibility(View.GONE);
            mariotte_indore.setVisibility(View.VISIBLE);
            tajpalace_delhi.setVisibility(View.GONE);
            tajhotel_mumbai.setVisibility(View.GONE);
            radissonblu_indore.setVisibility(View.VISIBLE);
            aloft_newdelhi.setVisibility(View.GONE);
            essentialuxhotel_indore.setVisibility(View.VISIBLE);
            hyattregency_pune.setVisibility(View.GONE);
            novotelaerocity_delhi.setVisibility(View.GONE);
            oberoi_mumbai.setVisibility(View.GONE);
            corinthians_pune.setVisibility(View.GONE);
            trident_jaipur.setVisibility(View.GONE);
            umaidbhawan_jaipur.setVisibility(View.GONE);
            novotel_pune.setVisibility(View.GONE);
            vitshotel_mumbai.setVisibility(View.GONE);
        } else if (state.equals(cmpstates[2])) {
            marriotte_jaipur.setVisibility(View.GONE);
            mariotte_indore.setVisibility(View.GONE);
            tajpalace_delhi.setVisibility(View.GONE);
            tajhotel_mumbai.setVisibility(View.VISIBLE);
            radissonblu_indore.setVisibility(View.GONE);
            aloft_newdelhi.setVisibility(View.GONE);
            essentialuxhotel_indore.setVisibility(View.GONE);
            hyattregency_pune.setVisibility(View.GONE);
            novotelaerocity_delhi.setVisibility(View.GONE);
            oberoi_mumbai.setVisibility(View.VISIBLE);
            corinthians_pune.setVisibility(View.GONE);
            trident_jaipur.setVisibility(View.GONE);
            umaidbhawan_jaipur.setVisibility(View.GONE);
            novotel_pune.setVisibility(View.GONE);
            vitshotel_mumbai.setVisibility(View.VISIBLE);
        } else if (state.equals(cmpstates[3])) {
            marriotte_jaipur.setVisibility(View.GONE);
            mariotte_indore.setVisibility(View.GONE);
            tajpalace_delhi.setVisibility(View.GONE);
            tajhotel_mumbai.setVisibility(View.GONE);
            radissonblu_indore.setVisibility(View.GONE);
            aloft_newdelhi.setVisibility(View.GONE);
            essentialuxhotel_indore.setVisibility(View.GONE);
            hyattregency_pune.setVisibility(View.VISIBLE);
            novotelaerocity_delhi.setVisibility(View.GONE);
            oberoi_mumbai.setVisibility(View.GONE);
            corinthians_pune.setVisibility(View.VISIBLE);
            trident_jaipur.setVisibility(View.GONE);
            umaidbhawan_jaipur.setVisibility(View.GONE);
            novotel_pune.setVisibility(View.VISIBLE);
            vitshotel_mumbai.setVisibility(View.GONE);
        } else if (state.equals(cmpstates[4])) {
            marriotte_jaipur.setVisibility(View.VISIBLE);
            mariotte_indore.setVisibility(View.GONE);
            tajpalace_delhi.setVisibility(View.GONE);
            tajhotel_mumbai.setVisibility(View.GONE);
            radissonblu_indore.setVisibility(View.GONE);
            aloft_newdelhi.setVisibility(View.GONE);
            essentialuxhotel_indore.setVisibility(View.GONE);
            hyattregency_pune.setVisibility(View.GONE);
            novotelaerocity_delhi.setVisibility(View.GONE);
            oberoi_mumbai.setVisibility(View.GONE);
            corinthians_pune.setVisibility(View.GONE);
            trident_jaipur.setVisibility(View.VISIBLE);
            umaidbhawan_jaipur.setVisibility(View.VISIBLE);
            novotel_pune.setVisibility(View.GONE);
            vitshotel_mumbai.setVisibility(View.GONE);
        }
        else {
            marriotte_jaipur.setVisibility(View.GONE);
            mariotte_indore.setVisibility(View.GONE);
            tajpalace_delhi.setVisibility(View.GONE);
            tajhotel_mumbai.setVisibility(View.GONE);
            radissonblu_indore.setVisibility(View.GONE);
            aloft_newdelhi.setVisibility(View.GONE);
            essentialuxhotel_indore.setVisibility(View.GONE);
            hyattregency_pune.setVisibility(View.GONE);
            novotelaerocity_delhi.setVisibility(View.GONE);
            oberoi_mumbai.setVisibility(View.GONE);
            corinthians_pune.setVisibility(View.GONE);
            trident_jaipur.setVisibility(View.GONE);
            umaidbhawan_jaipur.setVisibility(View.GONE);
            novotel_pune.setVisibility(View.GONE);
            vitshotel_mumbai.setVisibility(View.GONE);
            String s="WE ARE AVAILABLE IN THAT CITY BUT WE ARE COMING SOON";
            suggestionhotel.setText(s);
        }
        mariotte_indore.setOnClickListener(v -> {
            Intent intent=new Intent(Home2Activity.this,h14Activity.class);
            startActivity(intent);
        });
        aloft_newdelhi.setOnClickListener(v -> {
            Intent intent=new Intent(Home2Activity.this,h8Activity.class);
            startActivity(intent);

        });
        essentialuxhotel_indore.setOnClickListener(v -> {
            Intent intent=new Intent(Home2Activity.this,h15Activity.class);
            startActivity(intent);
        });
        hyattregency_pune.setOnClickListener(v -> {
            Intent intent=new Intent(Home2Activity.this,h3Activity.class);
            startActivity(intent);
        });
        novotelaerocity_delhi.setOnClickListener(v -> {
            Intent intent=new Intent(Home2Activity.this,h7Activity.class);
            startActivity(intent);
        });
        oberoi_mumbai.setOnClickListener(v -> {
            Intent intent=new Intent(Home2Activity.this,h4Activity.class);
            startActivity(intent);
        });
        corinthians_pune.setOnClickListener(v -> {
            Intent intent=new Intent(Home2Activity.this,h2Activity.class);
            startActivity(intent);
        });
        trident_jaipur.setOnClickListener(v -> {
            Intent intent=new Intent(Home2Activity.this,h11Activity.class);
            startActivity(intent);
        });
        umaidbhawan_jaipur.setOnClickListener(v -> {
            Intent intent=new Intent(Home2Activity.this,h10Activity.class);
            startActivity(intent);
        });
        novotel_pune.setOnClickListener(v -> {
            Intent intent=new Intent(Home2Activity.this,h1Activity.class);
            startActivity(intent);
        });
        vitshotel_mumbai.setOnClickListener(v -> {
            Intent intent=new Intent(Home2Activity.this,h6Activity.class);
            startActivity(intent);
        });

        marriotte_jaipur.setOnClickListener(v -> {
            Intent intent=new Intent(Home2Activity.this,h12Activity.class);
            startActivity(intent);
        });
        tajpalace_delhi.setOnClickListener(v -> {
            Intent intent=new Intent(Home2Activity.this,h9Activity.class);
            startActivity(intent);
        });
        tajhotel_mumbai.setOnClickListener(v -> {
            Intent intent=new Intent(Home2Activity.this,h5Activity.class);
            startActivity(intent);
        });
        radissonblu_indore.setOnClickListener(v -> {
            Intent intent=new Intent(Home2Activity.this,h13Activity.class);
            startActivity(intent);
        });

    }
}