package com.example.android.warsawtourguideapp;

/**
 * Created by grzegorzwilusz on 5/8/18.
 */

public class GuideItem {
    private String mName;
    private String mAddress;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mPhoneNumber;
    private String mOpenHours;
    private String mDateFrom;
    private String mDateTo;

    public GuideItem(String mName, String mAddress, int mImageResourceID, String mPhoneNumber, String mOpenHours) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mImageResourceID = mImageResourceID;
        this.mPhoneNumber = mPhoneNumber;
        this.mOpenHours = mOpenHours;
    }

    public GuideItem(String mName, String mAddress, int mImageResourceID) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mImageResourceID = mImageResourceID;
    }

    public GuideItem(String mName, String mAddress, String mDateFrom, String mDateTo) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mDateFrom = mDateFrom;
        this.mDateTo = mDateTo;
    }

    public GuideItem(String mName, String mAddress, String mDateFrom) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mDateFrom = mDateFrom;
    }

    public String getmName() {
        return mName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public String getmOpenHours() {
        return mOpenHours;
    }

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    public String getmDateFrom() {
        return mDateFrom;
    }

    public String getmDateTo() {
        return mDateTo;
    }

    @Override
    public String toString() {
        return "GuideItem{" +
                "mName='" + mName + '\'' +
                ", mAddress='" + mAddress + '\'' +
                ", mImageResourceID=" + mImageResourceID +
                ", mPhoneNumber='" + mPhoneNumber + '\'' +
                ", mOpenHours='" + mOpenHours + '\'' +
                ", mDateFrom='" + mDateFrom + '\'' +
                ", mDateTo='" + mDateTo + '\'' +
                '}';
    }
}


