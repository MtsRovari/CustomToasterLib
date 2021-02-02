package com.mateusrovari.myfirstbutton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityModule extends AppCompatActivity {

    private Button btnFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_module);

        btnFirst = findViewById(R.id.btn_first);

        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivityModule.this, SecondActivityModule.class));
            }
        });

        Toast.makeText(this, "supp main everybody", Toast.LENGTH_SHORT).show();
    }
}