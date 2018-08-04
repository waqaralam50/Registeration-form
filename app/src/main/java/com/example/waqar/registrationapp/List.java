package com.example.waqar.registrationapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class List extends AppCompatActivity {
    ListView lst;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Bundle bundle=getIntent().getExtras();
        String sname=bundle.getString("sname");
        String semail=bundle.getString("semail");
        String sphone=bundle.getString("sphone");
        String spassword=bundle.getString("spassword");
        String scpassword=bundle.getString("scpassword");

        String[] list={sname,semail,sphone};
        lst=(ListView) findViewById(R.id.listview);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        lst.setAdapter(arrayAdapter);
        btn=findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(List.this,MainActivity.class);

                startActivity(i);
            }
        });
    }
}
