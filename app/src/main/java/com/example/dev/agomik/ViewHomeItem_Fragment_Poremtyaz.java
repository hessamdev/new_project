package com.example.dev.agomik;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ViewHomeItem_Fragment_Poremtyaz extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view =LayoutInflater.from(getActivity()).inflate(R.layout.viewhomeitem_fragment_poremtyaz,container,false);



        return view;
    }

}
