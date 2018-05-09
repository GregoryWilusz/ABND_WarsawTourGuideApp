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
public class AttractionsFragment extends Fragment {
    @BindView(R.id.guide_items_list_layout) ListView listView;

    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_items_list, container, false);
        ButterKnife.bind(this, rootView);

        final ArrayList<GuideItem> guideItems = new ArrayList<GuideItem>();

        guideItems.add(new GuideItem("The Royal Castle", "4 Zamkowy Sq.", R.drawable.royal_castle, " (+48 22) 35 55 170", "11 a.m. - 6 p.m."));
        guideItems.add(new GuideItem("Museum of the History of the Polish Jews", "6 Anielewicza St.", R.drawable.polin, " (+48 22) 47 10 301", "10 a.m. - 6 p.m."));
        guideItems.add(new GuideItem("The Warsaw Rising Museum", "79 Grzybowska St.", R.drawable.mpw, " (+48 22) 539 79 37", "10 a.m. - 6 p.m."));
        guideItems.add(new GuideItem("King Jan III's Palace at Wilanów", "10/16 Stanislawa Kostki Potockiego St.", R.drawable.wilanow, " (+48 22) 54 42 700", "9:30 a.m. - 4 p.m."));
        guideItems.add(new GuideItem("The Royal Łazienki - Gardens", "1 Agrykoli St.", R.drawable.lazienki, " (+48 22) 50 60 028", "9 a.m. - 9 p.m."));
        guideItems.add(new GuideItem("The Fryderyk Chopin Museum in Warsaw", "1 Okólnik St.", R.drawable.chopin, " (+48 22) 441 62 51", "11 a.m. - 8 p.m."));
        guideItems.add(new GuideItem("Copernicus Science Centre", "20 Wybrzeże Kościuszkowskie St.", R.drawable.copernicus, " (+48 22) 596 41 00", "10 a.m. - 6 p.m."));
        guideItems.add(new GuideItem("The Palace of Culture and Science - Viewing Terrace", "1 Defilad Sq.", R.drawable.pkin, " (+48 22) 22 656 76 00", "10 a.m. - 8 p.m."));


        GuideItemAdapter adapter = new GuideItemAdapter(getActivity(), guideItems);

        listView.setAdapter(adapter);

        return rootView;
    }

}
