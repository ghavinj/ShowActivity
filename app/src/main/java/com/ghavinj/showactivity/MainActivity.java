package com.ghavinj.showactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button showNextActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showNextActivityButton = (Button)findViewById(R.id.showButtonID);

        showNextActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Message", "Hello from first activity");
                intent.putExtra("secondMessage", "Hello Again!");
                intent.putExtra("Value", 123);
                startActivity(intent);
            }
        });
    }
}
