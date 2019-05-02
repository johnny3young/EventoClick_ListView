package com.ejemplo.app.eventoclick_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtemail, edtpass;
    Button btningresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtemail = findViewById(R.id.edittextemail);
        edtpass = findViewById(R.id.edittextpass);
        btningresar = findViewById(R.id.botoningresar);

        btningresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = edtemail.getText().toString();
                String pass = edtpass.getText().toString();

                if (!email.isEmpty() && !pass.isEmpty()) {
                    Intent myIntent = new Intent(MainActivity.this, HomeActivity.class);
                    myIntent.putExtra("emaildigitado", email);
                    startActivity(myIntent);
                }

            }
        });
    }
}
