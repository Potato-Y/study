package com.example.activitypractice.ui.chapter6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

import com.example.activitypractice.R;

public class ViewFlipperActivity extends AppCompatActivity {

    Button buttonPrevious, buttonNext;
    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_flipper);

        buttonPrevious = findViewById(R.id.viewFlipperButtonPrevious);
        buttonNext = findViewById(R.id.viewFlipperButtonNext);
        viewFlipper = findViewById(R.id.viewFlipperViewFlipper);

        // 버튼에 맞게 화면을 이동하기
        buttonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.showPrevious();
            }
        });
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.showNext();
            }
        });
    }
}