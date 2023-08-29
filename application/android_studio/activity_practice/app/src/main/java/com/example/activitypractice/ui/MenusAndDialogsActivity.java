package com.example.activitypractice.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.activitypractice.R;
import com.example.activitypractice.ui.dialog.CustomDialogExActivity;
import com.example.activitypractice.ui.dialog.CustomDialogExListener;
import com.google.android.material.appbar.MaterialToolbar;

public class MenusAndDialogsActivity extends AppCompatActivity {

    final static String LOG_TAG = "menus_and_dialogs_activity";

    MaterialToolbar materialToolbar;
    private CustomDialogExActivity customDialogExActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus_and_dialogs);

        Log.d(LOG_TAG, "in " + LOG_TAG);

        materialToolbar = findViewById(R.id.materialToolbarMenusAndDialogs);

        setSupportActionBar(materialToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // 뒤로가기 버튼 추가
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // 메뉴 활성화
        getMenuInflater().inflate(R.menu.ex_menu, menu);
        return true;
    }

    /**
     * 툴바에 대해 설정한다.
     *
     * @param item The menu item that was selected.
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == android.R.id.home) {// toolbar의 back키를 눌렀을 때 동작
            finish();
            return true;
        } else if (itemId == R.id.itemExMenuOpen) {
            // open menu 를 눌렀을 경우 dialog 실행
            customDialogExActivity = new CustomDialogExActivity(this, LOG_TAG);
            customDialogExActivity.setCustomDialogExListener(new CustomDialogExListener() {
                @Override
                public void onSaveClicked(String text) {
                    // 데이터를 받은 경우 실행
                    Toast.makeText(MenusAndDialogsActivity.this, getString(R.string.input_text_content, text), Toast.LENGTH_SHORT).show();
                    Log.d(LOG_TAG, getString(R.string.input_text_content, text));
                }
            });
            
            customDialogExActivity.show(); // 화면에 표시
        }

        return super.onOptionsItemSelected(item);
    }
}