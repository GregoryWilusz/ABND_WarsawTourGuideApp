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

        guideItems.add(new GuideItem(getString(R.string.attr_1_name), getString(R.string.attr_1_addr), R.drawable.royal_castle, getString(R.string.attr_1_phone), getString(R.string.attr_1_hours)));
        guideItems.add(new GuideItem(getString(R.string.attr_2_name), getString(R.string.attr_2_addr), R.drawable.polin, getString(R.string.attr_2_phone), getString(R.string.attr_2_hours)));
        guideItems.add(new GuideItem(getString(R.string.attr_3_name), getString(R.string.attr_3_addr), R.drawable.mpw, getString(R.string.attr_3_phone), getString(R.string.attr_3_hours)));
        guideItems.add(new GuideItem(getString(R.string.attr_4_name), getString(R.string.attr_4_addr), R.drawable.wilanow, getString(R.string.attr_4_phone), getString(R.string.attr_4_hours)));
        guideItems.add(new GuideItem(getString(R.string.attr_5_name), getString(R.string.attr_5_addr), R.drawable.lazienki, getString(R.string.attr_5_phone), getString(R.string.attr_5_hours)));
        guideItems.add(new GuideItem(getString(R.string.attr_6_name), getString(R.string.attr_6_addr), R.drawable.chopin, getString(R.string.attr_6_phone), getString(R.string.attr_6_hours)));
        guideItems.add(new GuideItem(getString(R.string.attr_7_name), getString(R.string.attr_7_addr), R.drawable.copernicus, getString(R.string.attr_7_phone), getString(R.string.attr_7_hours)));
        guideItems.add(new GuideItem(getString(R.string.attr_8_name), getString(R.string.attr_8_addr), R.drawable.pkin, getString(R.string.attr_8_phone), getString(R.string.attr_8_hours)));

        GuideItemAdapter adapter = new GuideItemAdapter(getActivity(), guideItems);

        listView.setAdapter(adapter);

        return rootView;
    }

}
