package com.example.activitypractice.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.activitypractice.R;

import org.jetbrains.annotations.NotNull;

public class CustomDialogExActivity extends Dialog implements View.OnClickListener {

    /// 참고 자료
    /// https://kiwinam.com/posts/16/android-custom-dialog-click-callback/ https://github.com/kiwinam/CustomDialogExample/blob/master/app/src/main/java/com/example/charlie/dialogtest/CustomDialog.java
    /// https://bottlecok.tistory.com/entry/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C%EC%BB%A4%EC%8A%A4%ED%85%80-%EB%8B%A4%EC%9D%B4%EC%96%BC%EB%A1%9C%EA%B7%B8-ClickListener%EC%99%80-Callback-%EC%82%AC%EC%9A%A9%ED%95%98%EB%8A%94-%EB%B2%95

    private CustomDialogExListener customDialogExListener;

    EditText editText;
    Button buttonSave;

    public void setCustomDialogExListener(CustomDialogExListener customDialogExListener) {
        this.customDialogExListener = customDialogExListener;
    }

    public CustomDialogExActivity(@NotNull Context context, String activityName) {
        super(context);
        setContentView(R.layout.activity_custom_dialog);

        editText = findViewById(R.id.editTextTextCustomDialogEx);
        buttonSave = findViewById(R.id.buttonCustomDialogExSave);

        // 리스너 설정
        buttonSave.setOnClickListener(this);

        // 받은 데이터 출력
        Toast.makeText(getContext(), context.getString(R.string.opened_in_activity, activityName), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonCustomDialogExSave) {
            // save 버튼을 누른 경우 입력한 데이터 반환
            customDialogExListener.onSaveClicked(editText.getText().toString());
            dismiss();
        }
    }
}
