package com.mateusrovari.myfirstbutton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityModule extends AppCompatActivity {

    private Button btnFirst, btnBack;

    public static String ARG_BACK = "ARG_BACK";
    private boolean isBackFlow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_module);

        btnFirst = findViewById(R.id.btn_first);
        btnBack = findViewById(R.id.btn_back);
        isBackFlow = getIntent().getBooleanExtra(ARG_BACK, false);

        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivityModule.this, SecondActivityModule.class));
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                setResult(RESULT_OK, i);
                finish();
            }
        });

        if (isBackFlow) {
            Intent i = new Intent();
            setResult(RESULT_OK, i);
            finish();
        }

        Toast.makeText(this, "supp main everybody", Toast.LENGTH_SHORT).show();
    }
}