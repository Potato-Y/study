package com.example.activitypractice.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.activitypractice.R;
import com.google.android.material.appbar.MaterialToolbar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileAccessActivity extends AppCompatActivity {

    final static String LOG_TAG = "file_access_activity";
    final static String FILE_NAME = "file_access_data.txt";

    MaterialToolbar materialToolbar;
    EditText editTextContent;
    Button buttonSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_access);

        Log.d(LOG_TAG, "in file_access_activity");

        materialToolbar = findViewById(R.id.fileAccessMaterialToolbar);
        editTextContent = findViewById(R.id.editTextTextContent);
        buttonSave = findViewById(R.id.buttonSave);

        setSupportActionBar(materialToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // 뒤로가기 버튼 추가

        loadContent();

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveToInnerStorage(editTextContent.getText().toString());
            }
        });
    }

    private void saveToInnerStorage(String text) {
        try {
            // 내부 저장소의 전달된 파일 이름의 파일 출력 스트림을 가져온다.
            FileOutputStream fileOutputStream = openFileOutput(FILE_NAME, Context.MODE_PRIVATE);
            // 파일 출력 스트림에 text를 바이트로 변환하여 write 한다.
            fileOutputStream.write(text.getBytes());
            // 파일 출력 스트림을 닫는다.
            fileOutputStream.close();

            Toast.makeText(getApplicationContext(), R.string.success_save, Toast.LENGTH_SHORT);
        } catch (FileNotFoundException e) {
            Toast.makeText(getApplicationContext(), R.string.load_file_error, Toast.LENGTH_SHORT);
            Log.w(LOG_TAG, "FAIL: save file\n" + e.getMessage());
        } catch (IOException e) {
            Toast.makeText(getApplicationContext(), R.string.load_file_error, Toast.LENGTH_SHORT);
            Log.w(LOG_TAG, "FAIL: save file\n" + e.getMessage());
        }
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

    /**
     * 컨텐츠를 불러온다.
     */
    public void loadContent() {
        try {
            editTextContent.setText(loadFormInnerStorage(FILE_NAME));
        } catch (IOException e) {
            Toast.makeText(getApplicationContext(), "파일을 불러오는 중 오류가 발생했습니다.", Toast.LENGTH_SHORT);
            Log.w(LOG_TAG, "FAIL: load file\n" + e.getMessage());
        }
    }


    /**
     * 파일에서 데이터를 불러온다.
     *
     * @param fileName
     * @return
     * @throws IOException
     */
    private String loadFormInnerStorage(String fileName) throws IOException {
        FileInputStream fileInputStream = openFileInput(fileName);

        StringBuffer stringBuffer = new StringBuffer();
        byte[] buffer = new byte[40];
        int byteRead;

        // 파일의 끝을 만날 때까지 40바이트씩 읽어 buffer에 저장
        while ((byteRead = fileInputStream.read(buffer)) != -1) {
            // buffer 배열의 바이트 데이터를 문자열로 변환
            String str = new String(buffer, 0, byteRead);

            // 변환한 문자열을 스트칭 버퍼에 저장
            stringBuffer.append(str);
        }

        // 파일 닫기
        fileInputStream.close();

        return stringBuffer.toString();
    }
}