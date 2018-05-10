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
public class ParksFragment extends Fragment {

    @BindView(R.id.guide_items_list_layout) ListView listView;

    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_items_list, container, false);
        ButterKnife.bind(this, rootView);

        final ArrayList<GuideItem> guideItems = new ArrayList<GuideItem>();

        guideItems.add(new GuideItem(getString(R.string.park_1_name), getString(R.string.park_1_addr), R.drawable.mokotow));
        guideItems.add(new GuideItem(getString(R.string.park_2_name), getString(R.string.park_2_addr), R.drawable.saxon));
        guideItems.add(new GuideItem(getString(R.string.park_3_name), getString(R.string.park_3_addr), R.drawable.ujazdow));
        guideItems.add(new GuideItem(getString(R.string.park_4_name), getString(R.string.park_4_addr), R.drawable.skaryszewski));
        guideItems.add(new GuideItem(getString(R.string.park_5_name), getString(R.string.park_5_addr), R.drawable.praga));
        guideItems.add(new GuideItem(getString(R.string.park_6_name), getString(R.string.park_6_addr), R.drawable.natolin));

        GuideItemAdapter adapter = new GuideItemAdapter(getActivity(), guideItems);

        listView.setAdapter(adapter);

        return rootView;
    }

}
