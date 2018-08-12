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
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class View_Item_Fragment_kala extends Fragment {


    private GridView gridView;
    private ArrayList<Home_RecyclerShop> list;

    private ArrayList<Model_DasteBandi_Recycler_Brand> listCategury;
    private RecyclerView recyclerCategury;

    private CircleImageView brand;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view =LayoutInflater.from(getActivity()).inflate(R.layout.itemview_fragment_brand,container,false);


        brand=(CircleImageView) view.findViewById(R.id.Brand_CircleImage_logo);
        brand.setImageResource(R.drawable.domino);

        listdasti();
        setListcategury();

        recyclerCategury=(RecyclerView) view.findViewById(R.id.Brand_Recycler_Dastebandi);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        linearLayoutManager.setReverseLayout(true);
        recyclerCategury.setLayoutManager(linearLayoutManager);
        recyclerCategury.setAdapter(new AdapterRecycler(getActivity(), listCategury, new Adapter_Shop.CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                Toast.makeText(getActivity(), "FILTER", Toast.LENGTH_SHORT).show();
            }
        }));


        gridView=(GridView)view.findViewById(R.id.Brand_gridview_Kala);


        gridView.setAdapter(new AdapterGrid(getActivity(),list));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                OnClick_Brand();
            }
        });

        return view;
    }

    private void listdasti(){
        list=new ArrayList<>();


        list.add(new Home_RecyclerShop(R.drawable.kala1,"2"));
        list.add(new Home_RecyclerShop(R.drawable.kala2,"3.4"));
        list.add(new Home_RecyclerShop(R.drawable.kala3,"2.5"));
        list.add(new Home_RecyclerShop(R.drawable.kala4,"4.8"));
        list.add(new Home_RecyclerShop(R.drawable.kala5,"3.9"));
        list.add(new Home_RecyclerShop(R.drawable.kala6,"5"));
        list.add(new Home_RecyclerShop(R.drawable.kala8,"5"));

        list.add(new Home_RecyclerShop(R.drawable.kala1,"2"));
        list.add(new Home_RecyclerShop(R.drawable.kala2,"3.4"));
        list.add(new Home_RecyclerShop(R.drawable.kala3,"2.5"));
        list.add(new Home_RecyclerShop(R.drawable.kala4,"4.8"));
        list.add(new Home_RecyclerShop(R.drawable.kala5,"3.9"));
        list.add(new Home_RecyclerShop(R.drawable.kala6,"5"));
        list.add(new Home_RecyclerShop(R.drawable.kala8,"5"));

        list.add(new Home_RecyclerShop(R.drawable.kala1,"2"));
        list.add(new Home_RecyclerShop(R.drawable.kala2,"3.4"));
        list.add(new Home_RecyclerShop(R.drawable.kala3,"2.5"));
        list.add(new Home_RecyclerShop(R.drawable.kala4,"4.8"));
        list.add(new Home_RecyclerShop(R.drawable.kala5,"3.9"));
        list.add(new Home_RecyclerShop(R.drawable.kala6,"5"));
        list.add(new Home_RecyclerShop(R.drawable.kala8,"5"));





    }

    private void setListcategury(){
        listCategury=new ArrayList<>();

        listCategury.add(new Model_DasteBandi_Recycler_Brand("تمامی موارد"));
        listCategury.add(new Model_DasteBandi_Recycler_Brand("ماست"));
        listCategury.add(new Model_DasteBandi_Recycler_Brand("دوغ"));
        listCategury.add(new Model_DasteBandi_Recycler_Brand("شیر"));
        listCategury.add(new Model_DasteBandi_Recycler_Brand("پنیر"));
        listCategury.add(new Model_DasteBandi_Recycler_Brand("بستنی"));
        listCategury.add(new Model_DasteBandi_Recycler_Brand("بستنی"));
        listCategury.add(new Model_DasteBandi_Recycler_Brand("ماست"));
        listCategury.add(new Model_DasteBandi_Recycler_Brand("دوغ"));
        listCategury.add(new Model_DasteBandi_Recycler_Brand("شیر"));
        listCategury.add(new Model_DasteBandi_Recycler_Brand("پنیر"));
        listCategury.add(new Model_DasteBandi_Recycler_Brand("بستنی"));

    }

    public void OnClick_Brand(){
        Intent intent=new Intent(getActivity(),View_Item.class);
        intent.putExtra("ViewFragment","Brand");
        startActivity(intent);
    }


    private class AdapterGrid extends BaseAdapter{

        private Context context;
        private ArrayList<Home_RecyclerShop> listgrid;

        public AdapterGrid(Context context, ArrayList<Home_RecyclerShop> listgrid) {
            this.context = context;
            this.listgrid = listgrid;
        }

        @Override
        public int getCount() {
            return listgrid.size();
        }

        @Override
        public Object getItem(int position) {
            return listgrid.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            // TODO Auto-generated method stub
            View grid;
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            if (convertView == null) {

                grid = new View(context);
                Home_RecyclerShop Model = listgrid.get(position);
                grid = inflater.inflate(R.layout.z_m_home_recyclershop_kala, null);
                CircleImageView imageView=(CircleImageView) grid.findViewById(R.id.z_model_rexyclershop_ImageView_kala);
                TextView textView = (TextView) grid.findViewById(R.id.z_model_rexyclershop_TextView_Rate_kala);
                textView.setText(Model.getRate());
                Picasso.get().load(Model.getImage()).resize(500,500).into(imageView);

            } else {
                grid = (View) convertView;
            }

            return grid;
        }

    }

    private static class AdapterRecycler extends RecyclerView.Adapter<AdapterRecycler.ViewHolder>{

        public interface CustomItemClickListener {
            public void onItemClick(View v, int position);
        }

        private Context context;
        private ArrayList<Model_DasteBandi_Recycler_Brand> listCategury;
        private Adapter_Shop.CustomItemClickListener clickListener;

        public AdapterRecycler(Context context, ArrayList<Model_DasteBandi_Recycler_Brand> listCategury, Adapter_Shop.CustomItemClickListener clickListener) {
            this.context = context;
            this.listCategury = listCategury;
            this.clickListener = clickListener;
        }

        @NonNull
        @Override
        public AdapterRecycler.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View view=LayoutInflater.from(context).inflate(R.layout.z_m_recycler_dastebandi_brand
            ,parent
            ,false);

            final AdapterRecycler.ViewHolder holder=new ViewHolder(view);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickListener.onItemClick(v,holder.getPosition());
                }
            });

            return holder;
        }

        @Override
        public void onBindViewHolder(@NonNull AdapterRecycler.ViewHolder holder, int position) {
            Model_DasteBandi_Recycler_Brand Model = listCategury.get(position);

            holder.categury.setText(Model.getName());

        }

        @Override
        public int getItemCount() {
            return listCategury.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {

            TextView categury;
            public ViewHolder(View itemView) {
                super(itemView);

                categury=(TextView)itemView.findViewById(R.id.z_model_recycler_dastebandi_brand);

            }
        }
    }


}




