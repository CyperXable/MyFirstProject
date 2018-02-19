package com.example.myfirstproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class StreetActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_street);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String Name = intent.getStringExtra(MainActivity.Name);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(Name);

    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DateActivity.class);
        startActivity(intent);
    }

}
