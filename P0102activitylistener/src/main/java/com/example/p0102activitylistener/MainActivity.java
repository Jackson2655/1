package com.example.p0102activitylistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);

        return false;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOk:
                tvOut.setText("Нажата кнопка ОК");
                break;
            case R.id.btnCancel:
                tvOut.setText("Нажата кнопка CAncel");*/
        }

    }
}
