package com.programacion.movil.estemanp.androidmvcapplication.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.programacion.movil.estemanp.androidmvcapplication.Controller.ApplicationController;
import com.programacion.movil.estemanp.androidmvcapplication.R;

public class MainActivity extends AppCompatActivity {

    ApplicationController appController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appController = (ApplicationController)getApplication();

    }

    public void toLogin(View view)
    {
        startActivity(new Intent(this, LoginActivity.class));
    }

    public void toNewUser(View view)
    {
        startActivity(new Intent(this, NewUser.class));
    }

}
