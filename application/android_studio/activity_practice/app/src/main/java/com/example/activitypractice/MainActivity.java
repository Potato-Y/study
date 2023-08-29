package com.example.activitypractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.activitypractice.ui.DateAndTimeActivity;
import com.example.activitypractice.ui.FileAccessActivity;
import com.example.activitypractice.ui.MenusAndDialogsActivity;

public class MainActivity extends AppCompatActivity {

    Button buttonFileAccess, buttonDateAndTime, buttonMenusAndDialogs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonFileAccess = findViewById(R.id.buttonFileAccess); // file access 페이지를 여는 버튼 연결
        buttonDateAndTime = findViewById(R.id.buttonDateAndTime); // date & time 페이지를 여는 버튼 연결
        buttonMenusAndDialogs = findViewById(R.id.buttonMenusAndDialogs); // Menu & Dialog 페이지를 여는 버튼 연결

        buttonFileAccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FileAccessActivity.class);
                startActivity(intent);
            }
        });
        buttonDateAndTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DateAndTimeActivity.class);
                startActivity(intent);
            }
        });
        buttonMenusAndDialogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MenusAndDialogsActivity.class);
                startActivity(intent);
            }
        });
    }
}