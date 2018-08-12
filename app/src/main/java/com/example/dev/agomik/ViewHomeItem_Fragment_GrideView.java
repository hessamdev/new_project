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
import android.widget.TextView;

import com.example.dev.agomik.models.Home_RecyclerShop;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewHomeItem_Fragment_GrideView extends Fragment {

    private GridView gridView;
    private ArrayList<Home_RecyclerShop> list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view =LayoutInflater.from(getActivity()).inflate(R.layout.viewhomeitem_fragment_grideview,container,false);

        listdasti();

        gridView=(GridView)view.findViewById(R.id.Bartarinha_GridView);

        gridView.setAdapter(new AdapterGrid(getActivity(),list));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                OnClick_Brand();
            }
        });
        return view;

    }

    public void OnClick_Brand(){
        Intent intent=new Intent(getActivity(),View_Item.class);
        intent.putExtra("ViewFragment","Brand");
        startActivity(intent);
    }

    private void listdasti(){
        list=new ArrayList<>();

        list.add(new Home_RecyclerShop(R.drawable.behrooz,"4.6"));
        list.add(new Home_RecyclerShop(R.drawable.haraz,"2"));
        list.add(new Home_RecyclerShop(R.drawable.domino,"3.4"));
        list.add(new Home_RecyclerShop(R.drawable.chitoz,"2.5"));
        list.add(new Home_RecyclerShop(R.drawable.choopan,"4.8"));
        list.add(new Home_RecyclerShop(R.drawable.damdaran,"3.9"));
        list.add(new Home_RecyclerShop(R.drawable.gooshtiran,"5"));

        list.add(new Home_RecyclerShop(R.drawable.behrooz,"4.6"));
        list.add(new Home_RecyclerShop(R.drawable.haraz,"2"));
        list.add(new Home_RecyclerShop(R.drawable.domino,"3.4"));
        list.add(new Home_RecyclerShop(R.drawable.chitoz,"2.5"));
        list.add(new Home_RecyclerShop(R.drawable.choopan,"4.8"));
        list.add(new Home_RecyclerShop(R.drawable.damdaran,"3.9"));
        list.add(new Home_RecyclerShop(R.drawable.gooshtiran,"5"));

        list.add(new Home_RecyclerShop(R.drawable.behrooz,"4.6"));
        list.add(new Home_RecyclerShop(R.drawable.haraz,"2"));
        list.add(new Home_RecyclerShop(R.drawable.domino,"3.4"));
        list.add(new Home_RecyclerShop(R.drawable.chitoz,"2.5"));
        list.add(new Home_RecyclerShop(R.drawable.choopan,"4.8"));
        list.add(new Home_RecyclerShop(R.drawable.damdaran,"3.9"));
        list.add(new Home_RecyclerShop(R.drawable.gooshtiran,"5"));

        list.add(new Home_RecyclerShop(R.drawable.behrooz,"4.6"));
        list.add(new Home_RecyclerShop(R.drawable.haraz,"2"));
        list.add(new Home_RecyclerShop(R.drawable.domino,"3.4"));
        list.add(new Home_RecyclerShop(R.drawable.chitoz,"2.5"));
        list.add(new Home_RecyclerShop(R.drawable.choopan,"4.8"));
        list.add(new Home_RecyclerShop(R.drawable.damdaran,"3.9"));
        list.add(new Home_RecyclerShop(R.drawable.gooshtiran,"5"));

        list.add(new Home_RecyclerShop(R.drawable.behrooz,"4.6"));
        list.add(new Home_RecyclerShop(R.drawable.haraz,"2"));
        list.add(new Home_RecyclerShop(R.drawable.domino,"3.4"));
        list.add(new Home_RecyclerShop(R.drawable.chitoz,"2.5"));
        list.add(new Home_RecyclerShop(R.drawable.choopan,"4.8"));
        list.add(new Home_RecyclerShop(R.drawable.damdaran,"3.9"));
        list.add(new Home_RecyclerShop(R.drawable.gooshtiran,"5"));

        list.add(new Home_RecyclerShop(R.drawable.behrooz,"4.6"));
        list.add(new Home_RecyclerShop(R.drawable.haraz,"2"));
        list.add(new Home_RecyclerShop(R.drawable.domino,"3.4"));
        list.add(new Home_RecyclerShop(R.drawable.chitoz,"2.5"));
        list.add(new Home_RecyclerShop(R.drawable.choopan,"4.8"));
        list.add(new Home_RecyclerShop(R.drawable.damdaran,"3.9"));
        list.add(new Home_RecyclerShop(R.drawable.gooshtiran,"5"));

        list.add(new Home_RecyclerShop(R.drawable.behrooz,"4.6"));
        list.add(new Home_RecyclerShop(R.drawable.haraz,"2"));
        list.add(new Home_RecyclerShop(R.drawable.domino,"3.4"));
        list.add(new Home_RecyclerShop(R.drawable.chitoz,"2.5"));
        list.add(new Home_RecyclerShop(R.drawable.choopan,"4.8"));
        list.add(new Home_RecyclerShop(R.drawable.damdaran,"3.9"));
        list.add(new Home_RecyclerShop(R.drawable.gooshtiran,"5"));

        list.add(new Home_RecyclerShop(R.drawable.behrooz,"4.6"));
        list.add(new Home_RecyclerShop(R.drawable.haraz,"2"));
        list.add(new Home_RecyclerShop(R.drawable.domino,"3.4"));
        list.add(new Home_RecyclerShop(R.drawable.chitoz,"2.5"));
        list.add(new Home_RecyclerShop(R.drawable.choopan,"4.8"));
        list.add(new Home_RecyclerShop(R.drawable.damdaran,"3.9"));
        list.add(new Home_RecyclerShop(R.drawable.gooshtiran,"5"));

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
                grid = inflater.inflate(R.layout.z_m_home_recyclershop_bartarinha, null);
                CircleImageView imageView=(CircleImageView) grid.findViewById(R.id.z_model_rexyclershop_ImageView_shop);
                TextView textView = (TextView) grid.findViewById(R.id.z_model_rexyclershop_TextView_Rate);
                textView.setText(Model.getRate());
                imageView.setImageResource(Model.getImage());
            } else {
                grid = (View) convertView;
            }

            return grid;
        }

        }
    }




