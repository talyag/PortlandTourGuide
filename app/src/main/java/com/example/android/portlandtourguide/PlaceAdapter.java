package com.example.android.portlandtourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.support.v7.content.res.AppCompatResources.getDrawable;

public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * @param context The current context. Used to inflate the layout file.
     * @param places  A List of Place objects to display in a list
     */
    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    /**
     * @param position    The position in the list.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup used for inflation.
     * @return The View for the position in the AdapterView.
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the {@link Place} object from a position in the list
        Place currentPlace = getItem(position);

        // Either reuse view or inflate the view
        View placeItemView = convertView;
        if (placeItemView == null) {
            placeItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Find the TextView in list_item.xml with the ID name_text_view
        TextView nameTextView = (TextView) placeItemView.findViewById(R.id.name_text_view);

        // Get the name from the current place object and set text
        nameTextView.setText(currentPlace.getLocationName());

        // Find the TextView in list_item.xml with the ID name_text_view
        TextView detailTextView = (TextView) placeItemView.findViewById(R.id.detail_text_view);

        // Get the name from the current place object and set text
        detailTextView.setText(currentPlace.getLocationDetails());

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) placeItemView.findViewById(R.id.image);

        if (currentPlace.hasImage()) {
            // Get the image resource ID from the current Place object and
            // set the image to imageView
            imageView.setImageResource(currentPlace.getImageResourceId());

            // make sure the view is visible
            imageView.setVisibility(imageView.VISIBLE);
        } else {
            //Otherwise, hide the image view (set to gone)
            imageView.setVisibility(imageView.GONE);
        }


        return placeItemView;
    }

}
