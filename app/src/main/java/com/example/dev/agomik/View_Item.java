package com.example.dev.agomik;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class View_Item extends AppCompatActivity {

    private ImageView back;
    private TextView TitleHeder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_view_activity);

        back=findViewById(R.id.ViewItem_Imageview_Backarrow);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        TitleHeder=(TextView) findViewById(R.id.ViewItem_TextView_Title);

        Bundle stringTag =getIntent().getExtras();
        String Tag= stringTag.getString("ViewFragment");

        pushFragment(Tag);
    }


    private void pushFragment(String Tag ){

        Fragment fragment=null;

        switch (Tag){
            case "Brand":
                fragment = new View_Item_Fragment_Brand();
                TitleHeder.setText("برند");
                break;
            case "Poremtiyaz":
                fragment=new ViewHomeItem_Fragment_Poremtyaz();
                TitleHeder.setText("پرامتیازترینها");
                break;
        }
        if (fragment != null) {


            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.ViewItem_FrameLayout_View,fragment,Tag).commit();

        }

    }
}
