package com.example.android.warsawtourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

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

        guideItems.add(new GuideItem("Warsaw Uprising Museum", "Warsaw, Domaniewska 8 St.", R.drawable.festival, "+48 12 34 321", "10:00 - 20:00"));
        guideItems.add(new GuideItem("Warsaw Uprising Museum", "Warsaw, Domaniewska 8 St.", R.drawable.festival, "+48 12 34 321", "10:00 - 20:00"));
        guideItems.add(new GuideItem("Warsaw Uprising Museum", "Warsaw, Domaniewska 8 St.", R.drawable.festival, "+48 12 34 321", "10:00 - 20:00"));
        guideItems.add(new GuideItem("Warsaw Uprising Museum", "Warsaw, Domaniewska 8 St.", R.drawable.festival, "+48 12 34 321", "10:00 - 20:00"));
        guideItems.add(new GuideItem("Warsaw Uprising Museum", "Warsaw, Domaniewska 8 St.", R.drawable.festival, "+48 12 34 321", "10:00 - 20:00"));
        guideItems.add(new GuideItem("Warsaw Uprising Museum", "Warsaw, Domaniewska 8 St.", R.drawable.festival, "+48 12 34 321", "10:00 - 20:00"));
        guideItems.add(new GuideItem("Warsaw Uprising Museum", "Warsaw, Domaniewska 8 St.", R.drawable.festival, "+48 12 34 321", "10:00 - 20:00"));
        guideItems.add(new GuideItem("Warsaw Uprising Museum", "Warsaw, Domaniewska 8 St.", R.drawable.festival, "+48 12 34 321", "10:00 - 20:00"));

        GuideItemAdapter adapter = new GuideItemAdapter(getActivity(), guideItems);

        listView.setAdapter(adapter);

        return rootView;
    }

}
