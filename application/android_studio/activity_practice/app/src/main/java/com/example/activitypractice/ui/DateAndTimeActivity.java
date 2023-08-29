package com.example.activitypractice.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.activitypractice.R;
import com.google.android.material.appbar.MaterialToolbar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndTimeActivity extends AppCompatActivity {

    final static String LOG_TAG = "date_and_time_activity";
    MaterialToolbar materialToolbar;
    Chronometer chronometer;
    RadioButton radioButtonDate, radioButtonTime;
    CalendarView calendarView;
    TimePicker timePicker;
    Button buttonSave;
    int selectYear, selectMonth, selectDay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_and_time);

        Log.d(LOG_TAG, "in " + LOG_TAG);

        // 날짜 기본 값을 지정하기
        Calendar calendar = new GregorianCalendar();
        selectYear = calendar.get(Calendar.YEAR);
        selectMonth = calendar.get(Calendar.MONTH) + 1;
        selectDay = calendar.get(Calendar.DAY_OF_MONTH);

        materialToolbar = findViewById(R.id.materialToolbarDateAndTime);
        chronometer = findViewById(R.id.chronometerDateAndTime);
        radioButtonDate = findViewById(R.id.radioButtonDateAndTimeDate);
        calendarView = findViewById(R.id.calendarViewDateAndTime);
        radioButtonTime = findViewById(R.id.radioButtonDateAndTimeTime);
        calendarView = findViewById(R.id.calendarViewDateAndTime);
        timePicker = findViewById(R.id.timePickerDateAndTime);
        buttonSave = findViewById(R.id.buttonDateAndTimeSave);

        setSupportActionBar(materialToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // 뒤로가기 버튼 추가

        // 라디오 버튼에 따라 표시되는 위젯이 바뀌도록 하기
        radioButtonDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timePicker.setVisibility(View.INVISIBLE);
                calendarView.setVisibility(View.VISIBLE);
            }
        });
        radioButtonTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timePicker.setVisibility(View.VISIBLE);
                calendarView.setVisibility(View.INVISIBLE);
            }
        });

        // chronometer의 시간 측정을 시작한다.
        chronometer.start();
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer.stop();

                String content = "";
                content += selectYear + ". ";
                content += selectMonth + ". ";
                content += selectDay + ". ";
                content += timePicker.getHour() + ":";
                content += timePicker.getMinute() + " ";
                content += getString(R.string.success_save);

                Toast.makeText(getApplicationContext(), content, Toast.LENGTH_LONG).show();
            }
        });

        // 캘린더의 선택이 변경되는 것을 감지한다.
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                selectYear = year;
                selectMonth = month + 1;
                selectDay = dayOfMonth;
            }
        });
    }


    /**
     * 툴바에 대해 설정한다.
     *
     * @param item The menu item that was selected.
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: {
                // toolbar의 back키를 눌렀을 때 동작
                finish();
                return true;
            }
        }

        return super.onOptionsItemSelected(item);
    }
}