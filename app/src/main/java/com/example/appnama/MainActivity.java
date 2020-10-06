package com.example.appnama;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String a;
    private EditText mShow;
    private TextView mShowText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShow = findViewById(R.id.txt_edit_nama);
        mShowText = findViewById(R.id.txt_nama);

    }

    private boolean validasi(){
        a = mShow.getText().toString().trim();
        boolean isEmpty = false;
        if (TextUtils.isEmpty(a)){
            isEmpty = true;
            mShow.setError("Tidak boleh kososng!");
        }
        return isEmpty;
    }

    public void showInputNama(View view) {
        boolean isEmpty = validasi();
        if (mShow!=null){
            String mshow = mShow.getText().toString();
            mShowText.setText(mshow);
        }
    }
}


