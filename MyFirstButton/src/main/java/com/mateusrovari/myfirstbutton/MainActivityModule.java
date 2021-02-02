package com.mateusrovari.myfirstbutton;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityModule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_module);

        Toast.makeText(this, "supp everybody", Toast.LENGTH_SHORT).show();
    }
}