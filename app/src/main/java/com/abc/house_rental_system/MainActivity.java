package com.abc.house_rental_system;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Onclick1 (View view)
    {
        Intent intent= new Intent(MainActivity.this,Registration.class);
        startActivity(intent);
    }

    public void arun (View view)
    {
        Intent intent= new Intent(MainActivity.this,Registration.class);
        startActivity(intent);
    }
    public void Sample(View view)
    {
        Intent i= new Intent(MainActivity.this,AboutActivity.class);
        startActivity(i);
    }
    public void display(View view)
    {
        Intent intent= new Intent(MainActivity.this,LoginActivity.class);
        startActivity(intent);
    }

}

