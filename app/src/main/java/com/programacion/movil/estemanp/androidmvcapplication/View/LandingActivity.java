package com.programacion.movil.estemanp.androidmvcapplication.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.programacion.movil.estemanp.androidmvcapplication.R;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        Toast.makeText(this, "Bienvenido!!", Toast.LENGTH_SHORT).show();
    }
}