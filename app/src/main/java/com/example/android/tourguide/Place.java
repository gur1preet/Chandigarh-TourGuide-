package com.example.android.tourguide;

/**
 * Created by DELL on 05-02-2017.
 */

public class Place {
    private String mDescription;
    private String mPlace;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Place(String place,String description, int imageResourceId) {
        mPlace = place;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    public String getDescription(){
        return mDescription;
    }

    public  String getPlace(){
        return mPlace;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
