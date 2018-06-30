package com.example.shivamkumar.passwordgenerator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    Button btnCreatePassword;
    TextView NumberofPassword,LengthofPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        btnCreatePassword = (Button) findViewById(R.id.btnCreatePassword);
    btnCreatePassword.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            NumberofPassword = (EditText) findViewById(R.id.NumberofPassword);
            LengthofPassword = (EditText) findViewById(R.id.LengthofPassword);
            String NumofPass = NumberofPassword.getText().toString();
            String LenofPass = LengthofPassword.getText().toString();
            Intent intent = new Intent(Details.this,Result.class);
            //intent.putExtra("lengthofpassword",LenofPass);

            Bundle extras = new Bundle();
            extras.putString("lengthofpassword",LenofPass);
            extras.putString("numberofpassword",NumofPass);
            intent.putExtras(extras);
            startActivity(intent);
            //startActivity(new Intent(Details.this, Result.class));
            finish();
        }

    });









    }




}
