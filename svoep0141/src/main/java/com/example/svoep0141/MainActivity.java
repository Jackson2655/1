package com.example.svoep0141;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox chb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chb = (CheckBox) findViewById(R.id.chb);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, "add");
        menu.add(0, 2, 0, "edit");
        menu.add(0, 3, 2, "copy");
        menu.add(1, 4, 4, "paste");
        menu.add(1, 5, 5, "delete");
        menu.add(1, 6, 1, "что-то еще");
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onPrepareOptionsMenu (Menu menu) {
        menu.setGroupVisible(1, chb.isChecked());
        return super.onPrepareOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected (MenuItem item){
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);

    }

}