package com.programacion.movil.estemanp.androidmvcapplication.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.programacion.movil.estemanp.androidmvcapplication.Controller.ApplicationController;
import com.programacion.movil.estemanp.androidmvcapplication.R;

import java.util.List;

public class NewUser extends AppCompatActivity {

    EditText nombre;
    EditText apellido;
    EditText edad;
    EditText usuario;
    EditText password;
    EditText confirmPassword;

    ApplicationController applicationController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);

        //applicationController = new ApplicationController();
        applicationController = (ApplicationController)getApplication();

        nombre = (android.widget.EditText) this.findViewById(R.id.nombre);
        apellido = (android.widget.EditText) this.findViewById(R.id.apellido);
        edad = (android.widget.EditText) this.findViewById(R.id.edad);
        usuario = (android.widget.EditText) this.findViewById(R.id.usuario);
        password = (android.widget.EditText) this.findViewById(R.id.password);
        confirmPassword = (android.widget.EditText) this.findViewById(R.id.confirmPassword);

    }

    public void crear(View view)
    {
        if (applicationController.validarNuevoUsuario(password.getText().toString(), confirmPassword.getText().toString()))
        {
            applicationController.crearUsuario(nombre.getText().toString(), apellido.getText().toString(),
                                        Integer.valueOf(edad.getText().toString()), usuario.getText().toString(), password.getText().toString());
            Toast.makeText(this, "Usuario Guardado", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, MainActivity.class));
        }else
        {
            Toast.makeText(this, "Contraseñas erradas, digite la contraseña de forma coherente.", Toast.LENGTH_SHORT).show();
        }
    }
}
