package com.example.new_stbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.DodgerBlue)));
        go_sec_page();
    }
    void go_sec_page(){
        Button b_sec_page=(Button) findViewById(R.id.b_main);
        b_sec_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_sec_page();
            }
        });
    }
    void open_sec_page() {
        Intent intent = new Intent(this, PhotoActivaty.class);
        startActivity(intent);


    }
}