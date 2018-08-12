package com.example.dev.agomik;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dev.agomik.models.Dastebandi;
import com.example.dev.agomik.models.Dastebandi_zirdaste;
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import java.util.ArrayList;
import java.util.List;

public class MainFragment_dastebandi extends Fragment {

    private RecyclerView recyclerViewDastebandi;
    private Adapter_Dastebandi adapter_dastebandi;
    private ArrayList<Dastebandi_zirdaste> zirmenu;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = LayoutInflater.from(getActivity()).inflate(R.layout.main_fragment_dastebandi,container,false);

        getZirmenu();

        recyclerViewDastebandi=(RecyclerView)view.findViewById(R.id.Dastebandi_Recyclerview);
        adapter_dastebandi=new Adapter_Dastebandi(zirmenu);
        recyclerViewDastebandi.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerViewDastebandi.setAdapter(adapter_dastebandi);



        return view;

    }

    public void getZirmenu() {

        zirmenu=new ArrayList<>();


        ArrayList<Dastebandi> Nan_ghalat= new ArrayList<>();
        Nan_ghalat.add(new Dastebandi("برنج"));
        Nan_ghalat.add(new Dastebandi("نان"));
        Nan_ghalat.add(new Dastebandi("گندم"));
        Nan_ghalat.add(new Dastebandi("جو"));
        Nan_ghalat.add(new Dastebandi("ذرت"));
        Nan_ghalat.add(new Dastebandi("حبوبات"));
        Nan_ghalat.add(new Dastebandi("سویا"));
        Nan_ghalat.add(new Dastebandi("سایر"));

        zirmenu.add(new Dastebandi_zirdaste("نان و غلات حبوبات",Nan_ghalat));


        ArrayList<Dastebandi> Reshteha= new ArrayList<>();
        Reshteha.add(new Dastebandi("ماکارونی"));
        Reshteha.add(new Dastebandi("رشته آش و سوپ"));
        Reshteha.add(new Dastebandi("سایر"));

        zirmenu.add(new Dastebandi_zirdaste("رشته ها",Reshteha));

        ArrayList<Dastebandi> Ghand_shekar = new ArrayList<>();
        Ghand_shekar.add(new Dastebandi("قند"));
        Ghand_shekar.add(new Dastebandi("شکر"));
        Ghand_shekar.add(new Dastebandi("سایر"));

        zirmenu.add(new Dastebandi_zirdaste("قند و شکر",Ghand_shekar));

        ArrayList<Dastebandi> Roghan = new ArrayList<>();
        Roghan.add(new Dastebandi("روغن مایع"));
        Roghan.add(new Dastebandi("روغن جامد"));
        Roghan.add(new Dastebandi("سایر"));

        zirmenu.add(new Dastebandi_zirdaste("روغن",Roghan));

        ArrayList<Dastebandi> Porotoein = new ArrayList<>();
        Porotoein.add(new Dastebandi("اجزای گوسفند"));
        Porotoein.add(new Dastebandi("اجزای گاو و گوساله"));
        Porotoein.add(new Dastebandi("اجزای مرغ و سایر پرندگان"));
        Porotoein.add(new Dastebandi("ماهی ، میگو و خاویار"));
        Porotoein.add(new Dastebandi("سوسیس و کالباس"));
        Porotoein.add(new Dastebandi("تخم مرغ ، بلدرچین و شترمرغ"));
        Porotoein.add(new Dastebandi("قارچ"));
        Porotoein.add(new Dastebandi("سایر"));

        zirmenu.add(new Dastebandi_zirdaste("پروتئین",Porotoein));

        ArrayList<Dastebandi> Labaniyat = new ArrayList<>();
        Labaniyat.add(new Dastebandi("شیر"));
        Labaniyat.add(new Dastebandi("ماست"));
        Labaniyat.add(new Dastebandi("کره"));
        Labaniyat.add(new Dastebandi("پنیر"));
        Labaniyat.add(new Dastebandi("خامه"));
        Labaniyat.add(new Dastebandi("کشک"));
        Labaniyat.add(new Dastebandi("سایر"));

        zirmenu.add(new Dastebandi_zirdaste("لبنیات",Labaniyat));

        ArrayList<Dastebandi> Miveh_sabzijat = new ArrayList<>();
        Miveh_sabzijat.add(new Dastebandi("میوه ها"));
        Miveh_sabzijat.add(new Dastebandi("صیفی و سبزیجات"));
        Miveh_sabzijat.add(new Dastebandi("سایر"));

        zirmenu.add(new Dastebandi_zirdaste("میوه و سبزیجات",Miveh_sabzijat));


        ArrayList<Dastebandi> Nooshidaniha = new ArrayList<>();
        Nooshidaniha.add(new Dastebandi("شربت و آبمیوه"));
        Nooshidaniha.add(new Dastebandi("نوشابه و ماءالشعیر"));
        Nooshidaniha.add(new Dastebandi("دوغ"));
        Nooshidaniha.add(new Dastebandi("آب معدنی"));
        Nooshidaniha.add(new Dastebandi("قهوه"));
        Nooshidaniha.add(new Dastebandi("چای و دمنوش"));
        Nooshidaniha.add(new Dastebandi("عرقیات"));
        Nooshidaniha.add(new Dastebandi("سایر"));

        zirmenu.add(new Dastebandi_zirdaste("نوشیدنی ها",Nooshidaniha));

        ArrayList<Dastebandi> Tanagholat = new ArrayList<>();
        Tanagholat.add(new Dastebandi("شکلات و آبنبات"));
        Tanagholat.add(new Dastebandi("بیسکوئیت"));
        Tanagholat.add(new Dastebandi("مغز و تخمه"));
        Tanagholat.add(new Dastebandi("کیک و کلوچه"));
        Tanagholat.add(new Dastebandi("آلوچه و لواشک"));
        Tanagholat.add(new Dastebandi("آدامس"));
        Tanagholat.add(new Dastebandi("پاستیل"));
        Tanagholat.add(new Dastebandi("پودر کیک و ژله"));
        Tanagholat.add(new Dastebandi("پشمک"));
        Tanagholat.add(new Dastebandi("سایر"));

        zirmenu.add(new Dastebandi_zirdaste("تنقلات",Tanagholat));

        ArrayList<Dastebandi> Chashni_Afzoodani = new ArrayList<>();
        Chashni_Afzoodani.add(new Dastebandi("سس"));
        Chashni_Afzoodani.add(new Dastebandi("آبلیمو،آبغوره و سرکه"));
        Chashni_Afzoodani.add(new Dastebandi("زعفران،زرشک و لیمو عمانی"));
        Chashni_Afzoodani.add(new Dastebandi("ادویه و نمک"));
        Chashni_Afzoodani.add(new Dastebandi("ارد ، نشاسته"));
        Chashni_Afzoodani.add(new Dastebandi("چاشنی و عصاره"));
        Chashni_Afzoodani.add(new Dastebandi("سایر"));

        zirmenu.add(new Dastebandi_zirdaste("چاشنی",Chashni_Afzoodani));

        ArrayList<Dastebandi> Moraba_asal_shireh = new ArrayList<>();
        Moraba_asal_shireh.add(new Dastebandi("مربا"));
        Moraba_asal_shireh.add(new Dastebandi("عسل"));
        Moraba_asal_shireh.add(new Dastebandi("شیره"));
        Moraba_asal_shireh.add(new Dastebandi("سایر"));

        zirmenu.add(new Dastebandi_zirdaste("مربا عسل شیره",Moraba_asal_shireh));

        ArrayList<Dastebandi> Ajil_shirini_khoshkbar = new ArrayList<>();
        Ajil_shirini_khoshkbar.add(new Dastebandi("آجیل"));
        Ajil_shirini_khoshkbar.add(new Dastebandi("خشکبار"));
        Ajil_shirini_khoshkbar.add(new Dastebandi("شیرینی"));
        Ajil_shirini_khoshkbar.add(new Dastebandi("سایر"));

        zirmenu.add(new Dastebandi_zirdaste("خشکبار",Ajil_shirini_khoshkbar));

        ArrayList<Dastebandi> Shooyandeh_behdashti = new ArrayList<>();
        Shooyandeh_behdashti.add(new Dastebandi("شوینده ظروف"));
        Shooyandeh_behdashti.add(new Dastebandi("شوینده لباس"));
        Shooyandeh_behdashti.add(new Dastebandi("پاک کننده سطوح و لکه بر"));
        Shooyandeh_behdashti.add(new Dastebandi("پنبه، دستمال"));
        Shooyandeh_behdashti.add(new Dastebandi("بهداشت کودک و سالمند"));
        Shooyandeh_behdashti.add(new Dastebandi("بهداشت دهان"));
        Shooyandeh_behdashti.add(new Dastebandi("بهداشت بدن و صورت"));
        Shooyandeh_behdashti.add(new Dastebandi("بهداشت و شست و شوی مو"));
        Shooyandeh_behdashti.add(new Dastebandi("سایر"));

        zirmenu.add(new Dastebandi_zirdaste("شوینده بهداشتی",Shooyandeh_behdashti));

        ArrayList<Dastebandi> Arayeshi = new ArrayList<>();
        Arayeshi.add(new Dastebandi("عطر ، ادکلن و اسپری"));
        Arayeshi.add(new Dastebandi("آرایش صورت"));
        Arayeshi.add(new Dastebandi("آرایش چشم"));
        Arayeshi.add(new Dastebandi("آرایش لب"));
        Arayeshi.add(new Dastebandi("آرایش ناخن"));
        Arayeshi.add(new Dastebandi("محصولات پوست"));
        Arayeshi.add(new Dastebandi("آرایش مو"));
        Arayeshi.add(new Dastebandi("لوازم شخصی برقی"));
        Arayeshi.add(new Dastebandi("لوازم شخصی غیر برقی"));
        Arayeshi.add(new Dastebandi("سایر"));

        zirmenu.add(new Dastebandi_zirdaste("لوازم آرایشی",Arayeshi));

        ArrayList<Dastebandi> Farhangi_Sargarmi = new ArrayList<>();
        Farhangi_Sargarmi.add(new Dastebandi("فیلم و سریال"));
        Farhangi_Sargarmi.add(new Dastebandi("لوازم التحریر"));
        Farhangi_Sargarmi.add(new Dastebandi("کتاب"));
        Farhangi_Sargarmi.add(new Dastebandi("اسباب بازی"));
        Farhangi_Sargarmi.add(new Dastebandi("سایر"));

        zirmenu.add(new Dastebandi_zirdaste("سرگرمی فرهنگی",Farhangi_Sargarmi));

        ArrayList<Dastebandi> Malzoomat_khanedari = new ArrayList<>();
        Malzoomat_khanedari.add(new Dastebandi("واکس ، چسب و کبریت"));
        Malzoomat_khanedari.add(new Dastebandi("ابزار نطافت و نگهداری منزل"));
        Malzoomat_khanedari.add(new Dastebandi("ظروف پلاستیکی و یکبارمصرف"));
        Malzoomat_khanedari.add(new Dastebandi("ابزار برقی و غیر برقی"));
        Malzoomat_khanedari.add(new Dastebandi("سفره و کیسه"));
        Malzoomat_khanedari.add(new Dastebandi("لوازم آشپزخانه"));
        Malzoomat_khanedari.add(new Dastebandi("خشبو کننده"));
        Malzoomat_khanedari.add(new Dastebandi("سایر"));

        zirmenu.add(new Dastebandi_zirdaste("ملزومات خانه داری",Malzoomat_khanedari));




    }
}


class DasteViewHolder extends GroupViewHolder{

    private TextView daste;

    public DasteViewHolder(View itemView) {
        super(itemView);
        daste=(TextView)itemView.findViewById(R.id.z_model_dastebandi_TextView);


    }

    public void setDaste_Titel(String name){
        daste.setText(name);


    }

}

class ZirdasteViewHodler extends ChildViewHolder {

    private TextView zirdaste;

    public ZirdasteViewHodler(View itemView) {
        super(itemView);

        zirdaste=(TextView)itemView.findViewById(R.id.z_model_dastebandi_Textview_child);
    }

    public  void setZirdaste_Titel(String name){
        zirdaste.setText(name);

    }

}


class Adapter_Dastebandi extends ExpandableRecyclerViewAdapter<DasteViewHolder,ZirdasteViewHodler> {


    public Adapter_Dastebandi(List<? extends ExpandableGroup> groups) {
        super(groups);

    }

    @Override
    public DasteViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.z_m_dastebandi_asli,parent,false);


        return new DasteViewHolder(view);
    }

    @Override
    public ZirdasteViewHodler onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.z_m_dastebandi_zirdaste,parent,false);


        return new ZirdasteViewHodler(view);

    }

    @Override
    public void onBindChildViewHolder(ZirdasteViewHodler holder, int flatPosition, ExpandableGroup group, int childIndex) {
        Dastebandi Listasli = (Dastebandi) group.getItems().get(childIndex);

        holder.setZirdaste_Titel(Listasli.getDaste());

    }

    @Override
    public void onBindGroupViewHolder(DasteViewHolder holder, int flatPosition, ExpandableGroup group) {

        holder.setDaste_Titel(group.getTitle());

    }
}
