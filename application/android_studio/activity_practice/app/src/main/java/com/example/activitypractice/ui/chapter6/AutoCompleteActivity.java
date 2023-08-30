package com.example.activitypractice.ui.chapter6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

import com.example.activitypractice.R;

public class AutoCompleteActivity extends AppCompatActivity {

    private String[] items = {"CSI-뉴욕", "CSI-라스베가스", "CSI-마이애미", "Friends", "Fringe", "Lost"};
    private AutoCompleteTextView autoCompleteTextView;
    private MultiAutoCompleteTextView multiAutoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);

        init();
        initData();
    }

    public void init() {
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        multiAutoCompleteTextView = findViewById(R.id.multiAutoCompleteTextView);
    }

    public void initData() {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, items);
        autoCompleteTextView.setAdapter(adapter);

        // ,를 통해 단어를 구분할 수 있는 tokenizer를 생성한다.
        MultiAutoCompleteTextView.CommaTokenizer tokenizer = new MultiAutoCompleteTextView.CommaTokenizer();
        multiAutoCompleteTextView.setTokenizer(tokenizer);
        multiAutoCompleteTextView.setAdapter(adapter);
    }
}