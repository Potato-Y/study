package com.example.activitypractice.ui.chapter9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

public class DrawExActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_draw_ex);
        // XML 파일 대신 재정의한 클래스를 화면에 띄운다.
        setContentView(new MyGraphicView(this));
    }

    // View 클래스를 상속받아 MyGraphicView 클래스를 재정의
    private static class MyGraphicView extends View {
        // 재정의한 클래스의 생성자
        public MyGraphicView(Context context) {
            super(context);
        }

        // 클래스가 생성되거나 무효화(invalidate)되면 호출되는 메서드
        // 일반적으로 화면에 그려질 내용을 이곳에 코딩함
        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawColor(Color.YELLOW);

            Paint paint = new Paint();

            // 크레파스 색 정하기
            paint.setColor(Color.BLACK);
            // 크레파스 굵기 정하기
            paint.setStrokeWidth(30f);
            // 도화지에 좌표로 표시하기
            canvas.drawPoint(360, 640, paint);

            paint.setColor(Color.WHITE);
            canvas.drawRect(160, 140, 360, 640, paint);

            // 도화지에 좌표로 표시하기
            paint.setColor(Color.YELLOW);
            RectF rect = new RectF();
            rect.set(180, 160, 300, 600);
            canvas.drawRect(rect, paint);

            // 원 그리기
            paint.setColor(Color.RED);
            rect.set(500, 700, 700, 900);
            canvas.drawArc(rect, 0, 360, true, paint);
        }
    }
}