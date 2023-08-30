package com.example.activitypractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.activitypractice.ui.DateAndTimeActivity;
import com.example.activitypractice.ui.FileAccessActivity;
import com.example.activitypractice.ui.MenusAndDialogsActivity;
import com.example.activitypractice.ui.chapter10.InteractiveIntentActivity;
import com.example.activitypractice.ui.chapter6.AutoCompleteActivity;
import com.example.activitypractice.ui.chapter6.BarExActivity;
import com.example.activitypractice.ui.chapter6.ViewContainerActivity;
import com.example.activitypractice.ui.chapter6.ViewFlipperActivity;
import com.example.activitypractice.ui.chapter9.DrawExActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonFileAccess = findViewById(R.id.buttonFileAccess); // file access 페이지를 여는 버튼 연결
        setButtonOnclickListener(buttonFileAccess, FileAccessActivity.class);

        final Button buttonDateAndTime = findViewById(R.id.buttonDateAndTime); // date & time 페이지를 여는 버튼 연결
        setButtonOnclickListener(buttonDateAndTime, DateAndTimeActivity.class);

        final Button buttonMenusAndDialogs = findViewById(R.id.buttonMenusAndDialogs); // Menu & Dialog 페이지를 여는 버튼 연결
        setButtonOnclickListener(buttonMenusAndDialogs, MenusAndDialogsActivity.class);

        final Button buttonAutoComplete = findViewById(R.id.buttonAutoComplete); // 이하 생략
        setButtonOnclickListener(buttonAutoComplete, AutoCompleteActivity.class);

        final Button buttonBarEx = findViewById(R.id.buttonBarEx);
        setButtonOnclickListener(buttonBarEx, BarExActivity.class);

        final Button buttonViewContainer = findViewById(R.id.buttonViewContainer);
        setButtonOnclickListener(buttonViewContainer, ViewContainerActivity.class);

        final Button buttonViewFlipper = findViewById(R.id.buttonViewFlipper);
        setButtonOnclickListener(buttonViewFlipper, ViewFlipperActivity.class);

        setButtonOnclickListener((Button) findViewById(R.id.buttonDrawEx), DrawExActivity.class);
        setButtonOnclickListener((Button) findViewById(R.id.buttonInteractive), InteractiveIntentActivity.class);
    }

    private void setButtonOnclickListener(Button button, Class<?> clazz) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setGoToPage(clazz);
            }
        });
    }

    private void setGoToPage(Class<?> clazz) {
        Intent intent = new Intent(getApplicationContext(), clazz);
        startActivity(intent);
    }
}