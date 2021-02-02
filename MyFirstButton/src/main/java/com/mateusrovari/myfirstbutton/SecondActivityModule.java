package com.mateusrovari.myfirstbutton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivityModule extends AppCompatActivity {

    private Button btnSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_module);

        btnSecond = findViewById(R.id.btn_second);

        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //back to main activity from another project

                Intent i = new Intent();
                setResult(RESULT_OK, i);
                finish();
            }
        });

        Toast.makeText(this, "supp second activity", Toast.LENGTH_SHORT).show();
    }
}