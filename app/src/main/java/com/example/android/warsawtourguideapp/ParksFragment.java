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

        guideItems.add(new GuideItem("Mokotów Field", "Mokotów District", R.drawable.mokotow));
        guideItems.add(new GuideItem("Saxon Garden", "Śródmieście District", R.drawable.saxon));
        guideItems.add(new GuideItem("Ujazdów Park", "Śródmieście District", R.drawable.ujazdow));
        guideItems.add(new GuideItem("Skaryszewski Park", "Praga District", R.drawable.skaryszewski));
        guideItems.add(new GuideItem("Praga Park", "Praga District", R.drawable.praga));
        guideItems.add(new GuideItem("Natolin Park", "Wilanów District", R.drawable.natolin));

        GuideItemAdapter adapter = new GuideItemAdapter(getActivity(), guideItems);

        listView.setAdapter(adapter);

        return rootView;
    }

}
