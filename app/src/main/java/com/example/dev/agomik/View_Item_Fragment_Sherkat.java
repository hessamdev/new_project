package com.example.dev.agomik;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.dev.agomik.models.Home_RecyclerShop;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
import ss.com.bannerslider.ImageLoadingService;
import ss.com.bannerslider.Slider;
import ss.com.bannerslider.adapters.SliderAdapter;
import ss.com.bannerslider.viewholder.ImageSlideViewHolder;

public class View_Item_Fragment_Sherkat extends Fragment {

    private CircleImageView sherkat;

    private Slider slider;
    private PicassoImageLoadingService loadingService;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view =LayoutInflater.from(getActivity()).inflate(R.layout.itemview_fragment_sherkat,container,false);

        sherkat=(CircleImageView) view.findViewById(R.id.Sherkat_CircleImageview_Heder);
        Picasso.get().load(R.drawable.arka).resize(100,100).into(sherkat);

        slider=(Slider)view.findViewById(R.id.kala_slider);
        loadingService=new PicassoImageLoadingService(getActivity());
        Slider.init(loadingService);
        slider.setAdapter(new MainSliderAdapter());


        return view;
    }


    class MainSliderAdapter extends SliderAdapter {


        @Override
        public int getItemCount() {
            return 2;
        }

        @Override
        public void onBindImageSlide(int position, ImageSlideViewHolder imageSlideViewHolder) {

            switch (position){
                case 0:
                    imageSlideViewHolder.bindImageSlide(R.drawable.banerkala1);
                    break;
                case 1:
                    imageSlideViewHolder.bindImageSlide(R.drawable.banerkala2);
                    break;

            }

        }
    }

    class PicassoImageLoadingService implements ImageLoadingService {
        public Context context;

        public PicassoImageLoadingService(Context context) {
            this.context = context;
        }

        @Override
        public void loadImage(String url, ImageView imageView) {
            Picasso.get().load(url).into(imageView);
        }

        @Override
        public void loadImage(int resource, ImageView imageView) {
            Picasso.get().load(resource).into(imageView);
        }

        @Override
        public void loadImage(String url, int placeHolder, int errorDrawable, ImageView imageView) {
            Picasso.get().load(url).placeholder(placeHolder).error(errorDrawable).into(imageView);

        }
    }


}




