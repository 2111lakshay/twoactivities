package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("Value1");
        String value2 = extras.getString("Value2");
        Toast.makeText(getApplicationContext(), "Values are: \n First value:" + value1 + "\n Second Value: " + value2, Toast.LENGTH_LONG).show();

    }
    public void callFirstActivity(View view){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}
