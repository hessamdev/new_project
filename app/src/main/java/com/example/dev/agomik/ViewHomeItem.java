package com.example.dev.agomik;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHomeItem extends AppCompatActivity {

    private ImageView back;
    private TextView TitleHeder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_home_item_activity);

        back=findViewById(R.id.Viewhomeitem_Imageview_Backarrow);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        TitleHeder=(TextView) findViewById(R.id.Viewhomeitem_TextView_Title);

        Bundle stringTag =getIntent().getExtras();
        String Tag= stringTag.getString("ViewFragment");

        pushFragment(Tag);





    }

    private void pushFragment(String Tag ){

        Fragment fragment=null;

        switch (Tag){
            case "Bartarinha":
                fragment = new ViewHomeItem_Fragment_GrideView();
                TitleHeder.setText("برترینها");
                break;
            case "Poremtiyaz":
                fragment=new ViewHomeItem_Fragment_Poremtyaz();
                TitleHeder.setText("پرامتیازترینها");
                break;
        }
        if (fragment != null) {


            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.Viewhomeitem_FrameLayout_View,fragment,Tag).commit();

        }

    }




    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
