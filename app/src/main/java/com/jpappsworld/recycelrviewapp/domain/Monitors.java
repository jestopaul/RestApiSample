package com.jpappsworld.recycelrviewapp.domain;

public class Monitors {

    // Name of the display
    private String mDisplayName;
    // Number of monitor
    private String mMonitorNumber;

    public Monitors(String mDisplayName, String mMonitorNumber, int mImageResourceId) {
        this.mDisplayName = mDisplayName;
        this.mMonitorNumber = mMonitorNumber;
        this.mImageResourceId = mImageResourceId;
    }

    // Drawable resource ID
    private int mImageResourceId;

    public String getmDisplayName() {
        return mDisplayName;
    }

    public void setmDisplayName(String mDisplayName) {
        this.mDisplayName = mDisplayName;
    }

    public String getmMonitorNumber() {
        return mMonitorNumber;
    }

    public void setmMonitorNumber(String mMonitorNumber) {
        this.mMonitorNumber = mMonitorNumber;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }


}
