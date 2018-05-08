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

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }

    public void setmImageResourceID(int mImageResourceID) {
        this.mImageResourceID = mImageResourceID;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public void setmPhoneNumber(String mPhoneNumber) {
        this.mPhoneNumber = mPhoneNumber;
    }

    public String getmOpenHours() {
        return mOpenHours;
    }

    public void setmOpenHours(String mOpenHours) {
        this.mOpenHours = mOpenHours;
    }

    public String getmDateFrom() {
        return mDateFrom;
    }

    public void setmDateFrom(String mDateFrom) {
        this.mDateFrom = mDateFrom;
    }

    public String getmDateTo() {
        return mDateTo;
    }

    public void setmDateTo(String mDateTo) {
        this.mDateTo = mDateTo;
    }

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
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


