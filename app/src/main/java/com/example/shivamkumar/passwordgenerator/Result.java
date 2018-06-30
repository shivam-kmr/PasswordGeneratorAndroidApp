package com.example.shivamkumar.passwordgenerator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.system.ErrnoException;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;
public class Result extends AppCompatActivity {
    TextView result,result2;
    Button btnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result2 = (TextView) findViewById(R.id.result2);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String NumberofPassword = extras.getString("numberofpassword");
        String LengthofPassword = extras.getString("lengthofpassword");
        int len = Integer.parseInt(LengthofPassword);
        int num = Integer.parseInt(NumberofPassword);
        generatepass(num,len);
        btnback = (Button) findViewById(R.id.btnback);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Result.this, Details.class));
                finish();
            }

        });


    }


    public void generatepass(int num,int len) {


            String alphabet = "abcdefghijklmnopqrstuvwxyz@!#$%&*0123456789";
            String s = "";
            String r = "";
            Random random = new Random();
            // int randomLen = 1 + random.nextInt(num);
            for (int j = 1; j <= num; j++) {
                s = "";
                for (int i = 1; i <= len; i++) {
                    char c = alphabet.charAt(random.nextInt(40));
                    s += c;
                }
                r += s + " \n\n";
            }
            result2.setText(r);
            r = "";
            s = "";
            return;



    }
}