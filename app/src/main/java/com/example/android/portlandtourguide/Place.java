package com.example.android.portlandtourguide;

/**
 * {@link Place} a place within a listed within a list of attractions
 * It contains a location and details about the location
 */

public class Place {
    // name of location
    private String mLocationName;

    // details about the location
    private String mLocationDetails;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Place object.
     *
     * @param locationName  is the name of the location
     * @param locationDetails are about the location
     */
    public Place(String locationName, String locationDetails) {
        mLocationName = locationName;
        mLocationDetails = locationDetails;
    }

    /**
     * Create a new Place object.
     *
     * @param locationName  is the name of the location
     * @param locationDetails are about the location
     * @param imageResourceId for location
     */
    public Place(String locationName, String locationDetails, int imageResourceId) {
        mLocationName = locationName;
        mLocationDetails = locationDetails;
        mImageResourceId =  imageResourceId;
    }

    /**
     * Get the string value of location.
     *
     * @return current text in mLocation.
     */
    public String getLocationName() {
        return mLocationName;
    }

    /**
     * Get the string value of locationDetails.
     *
     * @return current text in mLocationDetails.
     */
    public String getLocationDetails() {
        return mLocationDetails;
    }

    /**
     *
     * @return image Id.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


    /**
     *
     * @return check if there is an image or not.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}


