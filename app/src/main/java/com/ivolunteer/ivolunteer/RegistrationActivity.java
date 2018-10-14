package com.ivolunteer.ivolunteer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistrationActivity extends AppCompatActivity {

    private Button Volunteer;
    private Button Hiring;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Volunteer = findViewById(R.id.btnRegisterVol);
        Hiring = findViewById(R.id.btnRegisterHi);

        Volunteer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistrationActivity.this, VolRegistration1.class);
                startActivity(intent);
            }
        });
        Hiring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistrationActivity.this, HiRegistration1.class);
                startActivity(intent);
            }
        });
    }

}