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

        guideItems.add(new GuideItem(getString(R.string.rest_1_name), getString(R.string.rest_1_addr), R.drawable.san_thai,getString(R.string.rest_1_phone), getString(R.string.rest_1_hours)));
        guideItems.add(new GuideItem(getString(R.string.rest_2_name), getString(R.string.rest_2_addr), R.drawable.sushi,getString(R.string.rest_2_phone), getString(R.string.rest_2_hours)));
        guideItems.add(new GuideItem(getString(R.string.rest_3_name), getString(R.string.rest_3_addr), R.drawable.amber,getString(R.string.rest_3_phone), getString(R.string.rest_3_hours)));
        guideItems.add(new GuideItem(getString(R.string.rest_4_name), getString(R.string.rest_4_addr), R.drawable.sowa,getString(R.string.rest_4_phone), getString(R.string.rest_4_hours)));
        guideItems.add(new GuideItem(getString(R.string.rest_5_name), getString(R.string.rest_5_addr), R.drawable.rozana,getString(R.string.rest_5_phone), getString(R.string.rest_5_hours)));
        guideItems.add(new GuideItem(getString(R.string.rest_6_name), getString(R.string.rest_6_addr), R.drawable.stolica,getString(R.string.rest_6_phone), getString(R.string.rest_6_hours)));
        guideItems.add(new GuideItem(getString(R.string.rest_7_name), getString(R.string.rest_7_addr), R.drawable.maho,getString(R.string.rest_7_phone), getString(R.string.rest_7_hours)));
        guideItems.add(new GuideItem(getString(R.string.rest_8_name), getString(R.string.rest_8_addr), R.drawable.mr_india,getString(R.string.rest_8_phone), getString(R.string.rest_8_hours)));
        guideItems.add(new GuideItem(getString(R.string.rest_9_name), getString(R.string.rest_9_addr), R.drawable.hoza,getString(R.string.rest_9_phone), getString(R.string.rest_9_hours)));
        guideItems.add(new GuideItem(getString(R.string.rest_10_name), getString(R.string.rest_10_addr), R.drawable.in_azia, getString(R.string.rest_10_phone), getString(R.string.rest_10_hours)));

        GuideItemAdapter adapter = new GuideItemAdapter(getActivity(), guideItems);

        listView.setAdapter(adapter);

        return rootView;
    }
}
