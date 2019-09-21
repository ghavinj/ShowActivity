package com.ghavinj.showactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private Button showFirstActivityButton;
    private TextView messageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();
        messageTextView = (TextView) findViewById(R.id.messageTextView);
        showFirstActivityButton = (Button)findViewById(R.id.showFirstButtonID);

        if (extras != null){
            String message = extras.getString("Message");
            int myInt  = extras.getInt("Value");

            
            messageTextView.setText(String.valueOf(myInt));
        }

        showFirstActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondIntent = new Intent(SecondActivity.this, MainActivity.class);

                startActivity(secondIntent);
            }
        });
    }
}
