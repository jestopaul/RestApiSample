package com.jpappsworld.recycelrviewapp.activity;


public class Monitor{
    // Name of the display
    private String mDisplayName;
    // Number of monitor
    private String mMonitorNumber;
    // Drawable resource ID
    private int mImageResourceId;

    /*
     * Create a new dessert object.
     *
     * @param vName is the name of the Monitor
     * @param vNumber is the corresponding serial number of Monitor
     * @param image is drawable reference ID that corresponds to the Monitor
     * */
    public Monitor(String vName, String vNumber, int imageResourceId)

    {
        mDisplayName = vName;
        mMonitorNumber = vNumber;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the monitor
     */
    public String getMonitorName() {
        return mDisplayName;
    }

    /**
     * Get the  number of monitor
     */
    public String getMonitorSerialNumber() {
        return mMonitorNumber;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}

