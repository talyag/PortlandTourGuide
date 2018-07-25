package com.example.android.portlandtourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShopFragment extends Fragment {


    public ShopFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place
                ("Saturday Market",
                        "Long-running street market."));
        places.add(new Place
                ("Powell's Books",
                        "The city of books."));
        places.add(new Place
                ("Saturday Market",
                        "A weekend market for local arts and crafts vendors."));
        places.add(new Place
                ("Nike Factory Store",
                        "It's Nike."));
        places.add(new Place
                ("Crafty Wonderland",
                        "Gifts and local products."));
        places.add(new Place
                ("Pioneer Place",
                        "Downtown mall."));
        places.add(new Place
                ("Hawthorne District",
                        "Offbeat neighborhood with various boutique shops."));
        places.add(new Place
                ("Mississippi Records",
                        "Record shop with huge vinyl selection. Record label next door."));

        // Create a new {@link PlaceAdapter}, with {@link Place} data source.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;

    }

}
