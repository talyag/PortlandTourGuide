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
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place
                (getString(R.string.deschutes),
                        getString(R.string.deschutes_desc)));
        places.add(new Place
                (getString(R.string.stumptown),
                        getString(R.string.stumptown_desc)));
        places.add(new Place
                (getString(R.string.screen_door),
                        getString(R.string.screen_door_desc)));
        places.add(new Place
                (getString(R.string.voodoo),
                        getString(R.string.voodoo_desc)));
        places.add(new Place
                (getString(R.string.alder_cart),
                        getString(R.string.alder_desc)));
        places.add(new Place
                (getString(R.string.paa_dee),
                        getString(R.string.paa_dee_desc)));
        places.add(new Place
                (getString(R.string.salt_straw),
                        getString(R.string.salt_straw_desc)));
        places.add(new Place
                (getString(R.string.pokemon),
                        getString(R.string.pokemon_desc)));
        places.add(new Place
                (getString(R.string.danwei),
                        getString(R.string.danwei_desc)));

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
