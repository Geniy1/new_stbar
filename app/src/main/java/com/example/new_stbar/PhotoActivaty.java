package com.example.new_stbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PhotoActivaty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_activaty);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.DodgerBlue)));
        go_main_page();
    }
    void go_main_page(){
        Button b_sec_page=(Button) findViewById(R.id.b_sec);
        b_sec_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_sec_page();
            }
        });
    }
    void open_sec_page(){
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}