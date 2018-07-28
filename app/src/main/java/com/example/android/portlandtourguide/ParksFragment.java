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
public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place
                (getString(R.string.forest_park),
                        getString(R.string.forest_park_desc),R.drawable.forest_park));
        places.add(new Place
                (getString(R.string.rose_test),
                        getString(R.string.rose_test_desc),R.drawable.rose_test));
        places.add(new Place
                (getString(R.string.laurelhurst),
                        getString(R.string.laurelhurst_desc),R.drawable.laurelhurst));
        places.add(new Place
                (getString(R.string.tanner),
                        getString(R.string.tanner_desc),R.drawable.tanner));
        places.add(new Place
                (getString(R.string.waterfront),
                        getString(R.string.waterfront_desc),R.drawable.waterfront));
        places.add(new Place
                (getString(R.string.mill_ends),
                        getString(R.string.mill_ends_desc),R.drawable.mill_ends));
        places.add(new Place
                (getString(R.string.south_park),
                        getString(R.string.south_park_desc),R.drawable.south_park));

        // Create a new {@link PlaceAdapter}, with {@link Place} data source.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find {@link ListView} in the view hierarchy of the {@link Activity}.
        // View ID list is declared in the place_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter}
        listView.setAdapter(adapter);

        return rootView;

    }

}