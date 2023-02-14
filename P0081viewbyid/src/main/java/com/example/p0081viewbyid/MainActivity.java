package com.example.p0081viewbyid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView = (TextView) findViewById(R.id.myText);
        myTextView.setText("New text in TextView");
        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setText("My button");
        btn1.setEnabled(false);
        CheckBox cb1=(CheckBox) findViewById(R.id.cb1);
        cb1.setChecked(true);
        return false;
    }
}