package com.example.activitypractice.ui.chapter10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.activitypractice.R;

public class InteractiveIntentSecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interactive_intent_second);

        Intent intent = getIntent();
        final int calValue = intent.getIntExtra("num1", 0) + intent.getIntExtra("num2", 0);

        Button button = findViewById(R.id.interactiveSecondButtonBack);
        button.setOnClickListener(v -> {
            Intent outIntent = new Intent(getApplicationContext(), InteractiveIntentActivity.class);
            outIntent.putExtra("result", calValue);
            setResult(RESULT_OK, outIntent);
            finish();
        });
    }
}