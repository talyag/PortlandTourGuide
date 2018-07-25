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
                        "A forest in the city.",R.drawable.forest_park));
        places.add(new Place
                (getString(R.string.rose_test),
                        "Many rose varieties.",R.drawable.rose_test));
        places.add(new Place
                (getString(R.string.laurelhurst),
                        "Lush park with a pond.",R.drawable.laurelhurst));
        places.add(new Place
                (getString(R.string.tanner),
                        "Park with a fish pond.",R.drawable.tanner));
        places.add(new Place
                (getString(R.string.waterfront),
                        "A downtown park along the Willamette waterfront.",R.drawable.bg_test));
        places.add(new Place
                (getString(R.string.south_park),
                        "A park spanning several blocks.",R.drawable.south_park));

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