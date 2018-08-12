package com.example.dev.agomik;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dev.agomik.models.Home_RecyclerShop;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
import ss.com.bannerslider.ImageLoadingService;
import ss.com.bannerslider.Slider;
import ss.com.bannerslider.adapters.SliderAdapter;
import ss.com.bannerslider.viewholder.ImageSlideViewHolder;

public class MainFragment_Home extends Fragment {

    private Adapter_Shop adapter_shop;
    private Home_RecyclerShop model;
    private ArrayList<Home_RecyclerShop> arraylist_shoprecycler;
    private RecyclerView recyclerViewshop,recyclerViewShop2;

    private Slider slider;
    private PicassoImageLoadingService loadingService;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= LayoutInflater.from(getActivity()).inflate(R.layout.main_fragment_home,container,false);

        listdasti();

        slider=(Slider) view.findViewById(R.id.banner_slider);

        loadingService=new PicassoImageLoadingService(getContext());
        Slider.init(loadingService);
        slider.setAdapter(new MainSliderAdapter());


        recyclerViewshop=view.findViewById(R.id.Home_Recycller_bartarinha);

        recyclerViewShop2=view.findViewById(R.id.Home_Recycller_bartarinha2);

        adapter_shop=new Adapter_Shop(getActivity(),arraylist_shoprecycler, new Adapter_Shop.CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                Toast.makeText(getActivity(), position+"", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getActivity(),View_Item.class);
                intent.putExtra("ViewFragment","Brand");
                startActivity(intent);
            }
        });


        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        recyclerViewshop.setLayoutManager(layoutManager);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,true);
        linearLayoutManager.setReverseLayout(true);
        recyclerViewShop2.setLayoutManager(linearLayoutManager);
        recyclerViewshop.setAdapter(adapter_shop);
        recyclerViewShop2.setAdapter(adapter_shop);

        TextView textView_bartarinha=(TextView)view.findViewById(R.id.Home_Textview_bartarinha);
        textView_bartarinha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickTitel("Bartarinha");
            }
        });

        TextView textView_poremtiyaz=(TextView)view.findViewById(R.id.Home_Textview_Poremtiyaz);
        textView_poremtiyaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickTitel("Poremtiyaz");
            }
        });

        return view;
    }

    public void OnClickTitel(String Tag){
        Intent intent = new Intent(getActivity(),ViewHomeItem.class);
        intent.putExtra("ViewFragment",Tag);
        startActivity(intent);
    }


    public void listdasti(){

        arraylist_shoprecycler=new ArrayList<>();
        arraylist_shoprecycler.add(new Home_RecyclerShop(R.drawable.behrooz,"4.6"));
        arraylist_shoprecycler.add(new Home_RecyclerShop(R.drawable.haraz,"2"));
        arraylist_shoprecycler.add(new Home_RecyclerShop(R.drawable.domino,"3.4"));
        arraylist_shoprecycler.add(new Home_RecyclerShop(R.drawable.chitoz,"2.5"));
        arraylist_shoprecycler.add(new Home_RecyclerShop(R.drawable.choopan,"4.8"));
        arraylist_shoprecycler.add(new Home_RecyclerShop(R.drawable.damdaran,"3.9"));
        arraylist_shoprecycler.add(new Home_RecyclerShop(R.drawable.gooshtiran,"5"));

    }

}

class Adapter_Shop extends RecyclerView.Adapter<Adapter_Shop.ShopHolder>{

    public interface CustomItemClickListener {
        public void onItemClick(View v, int position);
    }

    private Context context;
    private ArrayList<Home_RecyclerShop> listshop;
    private CustomItemClickListener clickListener;


    public Adapter_Shop(Context context, ArrayList<Home_RecyclerShop> listshop, CustomItemClickListener clickListener) {
        this.context = context;
        this.listshop = listshop;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public ShopHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.z_m_home_recyclershop_bartarinha,parent,false);
        final ShopHolder holder=new ShopHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onItemClick(v,holder.getPosition());
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ShopHolder holder, int position) {

        Home_RecyclerShop Model =listshop.get(position);

        holder.rate.setText(Model.getRate());
        holder.imageshop.setImageResource(Model.getImage());




    }

    @Override
    public int getItemCount() {
        return listshop.size();
    }

    public class ShopHolder extends RecyclerView.ViewHolder {

        public TextView rate;
        public CircleImageView imageshop;

        public ShopHolder(View itemView) {
            super(itemView);
            rate=(TextView)itemView.findViewById(R.id.z_model_rexyclershop_TextView_Rate);
            imageshop=(CircleImageView) itemView.findViewById(R.id.z_model_rexyclershop_ImageView_shop);

        }
    }
}



 class MainSliderAdapter extends SliderAdapter {


     @Override
     public int getItemCount() {
         return 3;
     }

     @Override
     public void onBindImageSlide(int position, ImageSlideViewHolder imageSlideViewHolder) {

         switch (position){
             case 0:
                 imageSlideViewHolder.bindImageSlide(R.drawable.baner1);
                 break;
             case 1:
                 imageSlideViewHolder.bindImageSlide(R.drawable.baner2);
                 break;
             case 2:
                 imageSlideViewHolder.bindImageSlide(R.drawable.baner3);
                 break;
         }

     }
 }


 class PicassoImageLoadingService implements ImageLoadingService{
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
