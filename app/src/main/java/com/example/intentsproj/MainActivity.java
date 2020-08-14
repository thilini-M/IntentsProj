package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.view.Gravity.*;

public class MainActivity extends AppCompatActivity {

    Button button;
    Toast toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onclickButtonlister();
    }

    public void onclickButtonlister() {
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Context context = getApplicationContext();
                        CharSequence text = "Navigate to Second Activity";
                        int duration = Toast.LENGTH_SHORT;
                        toast = Toast.makeText(context, text, duration);
                        toast.setGravity(CENTER_VERTICAL, 0, 0);
                        toast.show();
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(intent);
                    }
                }
        );

    }
}

