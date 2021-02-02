package com.mateusrovari.myfirstbutton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static com.mateusrovari.myfirstbutton.MainActivityModule.ARG_BACK;

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

                onBackPressed();
            }
        });

        Toast.makeText(this, "second activity", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(SecondActivityModule.this, MainActivityModule.class);
        i.putExtra(ARG_BACK, true);
        finish();
    }
}