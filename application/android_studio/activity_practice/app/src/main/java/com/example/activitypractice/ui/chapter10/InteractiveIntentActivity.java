package com.example.activitypractice.ui.chapter10;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.activitypractice.R;

public class InteractiveIntentActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private Button buttonAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interactive_intent);

        init();
        initLr();
    }

    private void init() {
        editText1 = findViewById(R.id.interactiveEditText);
        editText2 = findViewById(R.id.interactiveEditText2);
        buttonAdd = findViewById(R.id.interactiveButtonAdd);
    }

    private void initLr() {
        buttonAdd.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), InteractiveIntentSecondActivity.class);
            intent.putExtra("num1", Integer.parseInt(editText1.getText().toString().equals("") ? "0" : editText1.getText().toString()));
            intent.putExtra("num2", Integer.parseInt(editText2.getText().toString().equals("") ? "0" : editText2.getText().toString()));
            startActivityForResult(intent, 0);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            int result = data.getIntExtra("result", 0);
            Toast.makeText(getApplicationContext(), getString(R.string.input_text_content, Integer.toString(result)), Toast.LENGTH_SHORT).show();
        }
    }
}