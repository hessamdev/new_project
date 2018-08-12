package com.example.dev.agomik;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dev.agomik.models.Model_Gozaresh;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainFragment_gozaresh extends Fragment {

    private RecyclerView recyclerView;
    private AdapterGozaresh adapter;
    private ArrayList<Model_Gozaresh> listgozaresh;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.main_fragment_gozaresh,container,false);

        setdatalist();

        recyclerView=(RecyclerView)view.findViewById(R.id.Gozaresh_recyclerview);

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getActivity());
        adapter=new AdapterGozaresh(listgozaresh);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);




        return view;
}

public void setdatalist(){
    listgozaresh =new ArrayList<>();
        listgozaresh.add(new Model_Gozaresh(R.drawable.gooshtiran,"02:02","97/1/20"));
        listgozaresh.add(new Model_Gozaresh(R.drawable.damdaran,"02:02","97/3/15"));
        listgozaresh.add(new Model_Gozaresh(R.drawable.domino,"02:10","97/5/07"));
        listgozaresh.add(new Model_Gozaresh(R.drawable.damdaran,"05:40","97/1/30"));
        listgozaresh.add(new Model_Gozaresh(R.drawable.choopan,"02:20","97/2/20"));
        listgozaresh.add(new Model_Gozaresh(R.drawable.chitoz,"21:02","97/1/20"));
        listgozaresh.add(new Model_Gozaresh(R.drawable.haraz,"02:02","97/1/20"));
    listgozaresh.add(new Model_Gozaresh(R.drawable.gooshtiran,"02:02","97/1/20"));
    listgozaresh.add(new Model_Gozaresh(R.drawable.damdaran,"02:02","97/3/15"));
    listgozaresh.add(new Model_Gozaresh(R.drawable.domino,"02:10","97/5/07"));
    listgozaresh.add(new Model_Gozaresh(R.drawable.damdaran,"05:40","97/1/30"));
    listgozaresh.add(new Model_Gozaresh(R.drawable.choopan,"02:20","97/2/20"));
    listgozaresh.add(new Model_Gozaresh(R.drawable.chitoz,"21:02","97/1/20"));
    listgozaresh.add(new Model_Gozaresh(R.drawable.haraz,"02:02","97/1/20"));
}




}


class AdapterGozaresh extends RecyclerView.Adapter<AdapterGozaresh.ViewHolder>{

    private ArrayList<Model_Gozaresh> list=new ArrayList<>();

    public AdapterGozaresh(ArrayList<Model_Gozaresh> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.z_m_gozaresh,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Model_Gozaresh modelGozaresh = list.get(position);

        holder.circleImageView.setImageResource(modelGozaresh.getImage());
        holder.mdata.setText(modelGozaresh.getData());
        holder.mtime.setText(modelGozaresh.getTime());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public CircleImageView circleImageView;
        public TextView mtime,mdata;

        public ViewHolder(View itemView) {
            super(itemView);

            circleImageView=(CircleImageView)itemView.findViewById(R.id.z_model_gozaresh_circularimage);
            mtime=(TextView)itemView.findViewById(R.id.z_model_gozaresh_textview_time);
            mdata=(TextView)itemView.findViewById(R.id.z_model_gozaresh_textview_data);

        }
    }
}