package com.example.android.warsawtourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {

    @BindView(R.id.guide_items_list_layout) ListView listView;

    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_items_list, container, false);
        ButterKnife.bind(this, rootView);

        final ArrayList<GuideItem> guideItems = new ArrayList<GuideItem>();

        guideItems.add(new GuideItem("San Thai", "10 Próżna St.", R.drawable.san_thai,"(+48) 577 607 775", "12 a.m. - 10 p.m."));
        guideItems.add(new GuideItem("Soto Sushi", "28 Waryńskiego St.", R.drawable.sushi,"(+48) 501 608 806", "12 a.m. - 10 p.m."));
        guideItems.add(new GuideItem("Amber Room", "13 Ujazdowskie Av.", R.drawable.amber,"(+48 22) 523 66 64", "12 a.m. - 11 p.m."));
        guideItems.add(new GuideItem("N31restaurant&bar", "31 Nowogrodzka St.", R.drawable.sowa,"(+48) 600 861 961", "12 a.m. - 11 p.m."));
        guideItems.add(new GuideItem("Polska Różana", "7 Chocimska St.", R.drawable.rozana,"(+48 22) 848 12 25", "12 a.m. - 12 p.m."));
        guideItems.add(new GuideItem("Stolica", "1/3 Szeroki Dunaj St.", R.drawable.stolica,"(+48) 604 598 764", "11 a.m. - 11 p.m."));
        guideItems.add(new GuideItem("Maho", "240/242 Krakowska St.", R.drawable.maho,"(+48 22) 609 15 48", "10 a.m. - 11 p.m."));
        guideItems.add(new GuideItem("Mr India", "47 KEN Av.", R.drawable.mr_india,"(+48 22) 213 06 89", "11 a.m. - 10 p.m."));
        guideItems.add(new GuideItem("Hoża", "25A Hoża St.", R.drawable.hoza,"(+48) 515 037 001", "1 p.m. - 11 p.m."));
        guideItems.add(new GuideItem("InAzia", "2 Bolesława Prusa St.", R.drawable.in_azia,"(+48 22) 450 61 00", "5 p.m. - 11 p.m."));

        GuideItemAdapter adapter = new GuideItemAdapter(getActivity(), guideItems);

        listView.setAdapter(adapter);

        return rootView;
    }
}
