package com.example.dev.agomik;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {


    //leak


    private ImageView search_;
    CircleImageView hederdrawer;
    private ImageView drawer;

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);



//        LayoutInflater inflater =
//                (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View menuLayout = inflater.inflate(R.layout.z_m_heder_drawer,null);
//        hederdrawer=(ImageView)menuLayout.findViewById(R.id.z_m_heder_drawer);

        Typeface yekan= Typeface.createFromAsset(getAssets(),"fonts/BYekan.ttf");


        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
        bottomNav.setSelectedItemId(R.id.nav_home);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MainFragment_Home()).commit();
        }




        init();
        seton();
        setUpdrawer(navigationView);



    }



    public void init(){

        Toolbar toolbar=(Toolbar)findViewById(R.id.Mainactivity_Toolbar);
        search_=(ImageView)findViewById(R.id.AppBar_Imageview_search);

        drawerLayout=(DrawerLayout)findViewById(R.id.Mainactivity_DrawerLayout);
        navigationView=(NavigationView)findViewById(R.id.MainActivity_NavigationView);
        drawer=(ImageView)findViewById(R.id.AppBar_Imageview_Drawer);


        View hederview=navigationView.getHeaderView(0);
        hederdrawer=(CircleImageView) hederview.findViewById(R.id.z_heder_drawer);
        Picasso.get().load(R.drawable.heder_drawer).resize(600,300).into(hederdrawer);


    }







    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    Fragment selectfragment = null;

                    switch (item.getItemId()){
                        case R.id.nav_home:
                            selectfragment=new MainFragment_Home();
                            break;
                        case R.id.nav_dastebandi:
                            selectfragment = new MainFragment_dastebandi();
                            break;
                        case R.id.nav_gozaresh:
                            selectfragment=new MainFragment_gozaresh();

                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectfragment).commit();

                    return true;
                }
            };

    public void seton(){



        search_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent _int_Search = new Intent(MainActivity.this,Search.class);
                startActivity(_int_Search);
                finish();


            }
        });

        drawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.END);
            }
        });

    }
    public void setUpdrawer(NavigationView navigationView){
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                setDrawerListener(item);
                return true;
            }
        });
    }


    public void setDrawerListener(MenuItem menu){
        switch (menu.getItemId()){

            case R.id.edit_profile:
                Toast.makeText(this, "Virayesh", Toast.LENGTH_SHORT).show();

        }


    }

    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.END)){
            drawerLayout.closeDrawer(GravityCompat.END);
        }else {
            super.onBackPressed();
        }
    }
}
