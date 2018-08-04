package com.example.waqar.registrationapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText email;
    EditText phone;
    EditText password;
    EditText cpassword;

    String sname;
    String semail;
    String sphone;
    String spassword;
    String scpassword;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);
        password=findViewById(R.id.password);
        cpassword =findViewById(R.id.cpassword);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,List.class);
                sname=name.getText().toString().trim();
                semail=email.getText().toString().trim();
                sphone=phone.getText().toString().trim();

                        spassword=password.getText().toString();
                        scpassword=cpassword.getText().toString();


                            i.putExtra("sname", sname);
                            i.putExtra("semail", semail);
                            i.putExtra("sphone", sphone);
                            i.putExtra("spassword", spassword);
                            i.putExtra("scpassword", scpassword);
                if (spassword.length()==scpassword.length()) {

                startActivity(i);}
                else{
                            Toast.makeText(getApplicationContext(),"password does not matched",Toast.LENGTH_SHORT).show();
                            }
            }
        });
    }
}
