package com.example.dev.agomik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Search extends AppCompatActivity {

    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        back=(ImageView)findViewById(R.id.Search_Imageview_Backarrow);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Search.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(Search.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
