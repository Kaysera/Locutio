package com.a404.kaysera.localchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Esto es un comment de pruebita
    //Esto es un comment nuevo porque tengo varios ordenadores
    TextView tv;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);
    }

    public void button (View v){
        Intent intent = new Intent(getApplicationContext(), MyWifiActivity.class);
        startActivity(intent);
    }

}
