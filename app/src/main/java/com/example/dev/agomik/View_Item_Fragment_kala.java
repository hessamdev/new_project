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
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dev.agomik.models.Home_RecyclerShop;
import com.example.dev.agomik.models.Model_DasteBandi_Recycler_Brand;
import com.example.dev.agomik.models.Model_Gozaresh;
import com.example.dev.agomik.models.Model_Recycler_Sherkat;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class View_Item_Fragment_kala extends Fragment {


    private RecyclerView recyclerViewSherkat;
    private ArrayList<Model_Recycler_Sherkat> list;
    private AdapterSherkat adapterSherkat;



    private CircleImageView kalaimage;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final View view =LayoutInflater.from(getActivity()).inflate(R.layout.itemview_fragment_kala,container,false);


        kalaimage=(CircleImageView) view.findViewById(R.id.Kala_CircleImageview_Heder);
        kalaimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        setlist();


        recyclerViewSherkat=(RecyclerView)view.findViewById(R.id.Kala_Recycler_Sherkat);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        recyclerViewSherkat.setLayoutManager(layoutManager);

        recyclerViewSherkat.setAdapter(new AdapterSherkat(list, getActivity(), new AdapterSherkat.CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                Toast.makeText(getActivity(), "PopUp", Toast.LENGTH_SHORT).show();

            }
        }));

        return view;
    }

    public void setlist(){
        list=new ArrayList<>();
        list.add(new Model_Recycler_Sherkat("10.000","نقدی","فوری"));

    }



    public void OnClick_Brand(){
        Intent intent=new Intent(getActivity(),View_Item.class);
        intent.putExtra("ViewFragment","Sherkat");
        startActivity(intent);
    }


    static class AdapterSherkat extends RecyclerView.Adapter<AdapterSherkat.ViewHolder> {


        public interface CustomItemClickListener {
            public void onItemClick(View v, int position);
        }


        ArrayList<Model_Recycler_Sherkat> list;
        Context context;
        CustomItemClickListener customItemClickListener;


        public AdapterSherkat(ArrayList<Model_Recycler_Sherkat> list, Context context, CustomItemClickListener customItemClickListener) {
            this.list = list;
            this.context = context;
            this.customItemClickListener = customItemClickListener;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.z_m_recycler_sherkat,parent,false);
            final ViewHolder holder=new ViewHolder(view);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    customItemClickListener.onItemClick(v,holder.getPosition());
                }
            });
            return holder;
        }

        @Override
        public void onBindViewHolder(@NonNull AdapterSherkat.ViewHolder holder, int position) {

            Model_Recycler_Sherkat model = list.get(position);

            holder.gheymat.setText(model.getGheymat());
            holder.pardakht.setText(model.getPardakht());
            holder.tahvil1.setText(model.getTahvil());



        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            TextView gheymat,pardakht,tahvil1;

            public ViewHolder(View itemView) {
                super(itemView);

                gheymat=(TextView)itemView.findViewById(R.id.gheymat);
                pardakht=(TextView)itemView.findViewById(R.id.pardakht);
                tahvil1=(TextView)itemView.findViewById(R.id.tahvil);


            }
        }
    }
}




