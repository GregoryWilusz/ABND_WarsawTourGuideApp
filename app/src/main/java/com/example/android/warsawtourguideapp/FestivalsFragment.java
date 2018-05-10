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
public class FestivalsFragment extends Fragment {

    @BindView(R.id.guide_items_list_layout) ListView listView;

    public FestivalsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_items_list, container, false);
        ButterKnife.bind(this, rootView);

        final ArrayList<GuideItem> guideItems = new ArrayList<GuideItem>();

        guideItems.add(new GuideItem(getString(R.string.fest_1_name), getString(R.string.fest_1_addr), getString(R.string.fest_1_date_from), getString(R.string.fest_1_date_to)));
        guideItems.add(new GuideItem(getString(R.string.fest_2_name), getString(R.string.fest_2_addr), getString(R.string.fest_2_date_from)));
        guideItems.add(new GuideItem(getString(R.string.fest_3_name), getString(R.string.fest_3_addr), getString(R.string.fest_3_date_from), getString(R.string.fest_3_date_to)));
        guideItems.add(new GuideItem(getString(R.string.fest_4_name), getString(R.string.fest_4_addr), getString(R.string.fest_4_date_from), getString(R.string.fest_4_date_to)));
        guideItems.add(new GuideItem(getString(R.string.fest_5_name), getString(R.string.fest_5_addr), getString(R.string.fest_5_date_from), getString(R.string.fest_5_date_to)));
        guideItems.add(new GuideItem(getString(R.string.fest_6_name), getString(R.string.fest_6_addr), getString(R.string.fest_6_date_from), getString(R.string.fest_6_date_to)));
        guideItems.add(new GuideItem(getString(R.string.fest_7_name), getString(R.string.fest_7_addr), getString(R.string.fest_7_date_from)));
        

        GuideItemAdapter adapter = new GuideItemAdapter(getActivity(), guideItems);

        listView.setAdapter(adapter);

        return rootView;
    }

}
