package com.example.android.warsawtourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by grzegorzwilusz on 5/8/18.
 */

public class GuideItemAdapter extends ArrayAdapter<GuideItem> {
    @BindView(R.id.item_image_view) ImageView itemImage;
    @BindView(R.id.item_name_text_view) TextView itemName;
    @BindView(R.id.item_address_text_view) TextView itemAddress;
    @BindView(R.id.item_opening_hours_text_view) TextView itemOpeningHours;
    @BindView(R.id.item_opening_hours_label) TextView itemOpeningHoursLabel;
    @BindView(R.id.opening_hours_section) LinearLayout itemOpeningHoursSection;
    @BindView(R.id.item_phone_number_text_view) TextView itemPhoneNumber;
    @BindView(R.id.phone_number_section) LinearLayout itemPhoneNumberSection;
    @BindView(R.id.when_festival_section) LinearLayout itemWhenSection;
    @BindView(R.id.item_when_text_view) TextView itemWhen;


    public GuideItemAdapter(@NonNull Context context, ArrayList<GuideItem> guideItems) {
        super(context,0, guideItems);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.guide_item, parent, false);
        }

        ButterKnife.bind(this, listItemView);

        // Get the {@link Word} object located at this position in the list
        final GuideItem currentGuideItem = getItem(position);

        itemName.setText(currentGuideItem.getmName());
        itemAddress.setText(currentGuideItem.getmAddress());
        itemOpeningHours.setText(currentGuideItem.getmOpenHours());
        itemPhoneNumber.setText(currentGuideItem.getmPhoneNumber());

        if (currentGuideItem.getmOpenHours() == null) {
            itemOpeningHoursSection.setVisibility(View.GONE);
        }
        if (currentGuideItem.getmPhoneNumber() == null) {
            itemPhoneNumberSection.setVisibility(View.GONE);
        }

        if (currentGuideItem.hasImage()) {
            itemImage.setImageResource(currentGuideItem.getmImageResourceID());
            itemImage.setVisibility(View.VISIBLE); // to make sure the view is visible
        } else {
            itemImage.setVisibility(View.GONE); // GONE to completely hide an image (with took no extra empty space)
        }

        if (currentGuideItem.getmDateFrom() == null) {
            itemWhenSection.setVisibility(View.GONE);
        } else if (currentGuideItem.getmDateFrom() != null && currentGuideItem.getmDateTo() == null) {
            itemWhen.setText(currentGuideItem.getmDateFrom());
        } else if (currentGuideItem.getmDateFrom() != null && currentGuideItem.getmDateTo() != null) {
            itemWhen.setText(currentGuideItem.getmDateFrom() + " - " + currentGuideItem.getmDateTo());
        }

        return listItemView;
    }
}
