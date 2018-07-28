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
                (getString(R.string.powells),
                        getString(R.string.powells_desc)));
        places.add(new Place
                (getString(R.string.saturday_market),
                        getString(R.string.saturday_desc)));
        places.add(new Place
                (getString(R.string.floating_world),
                        getString(R.string.floating_world_desc)));
        places.add(new Place
                (getString(R.string.crafty),
                        getString(R.string.crafty_desc)));
        places.add(new Place
                (getString(R.string.pioneer_place),
                        getString(R.string.pioneer_place_desc)));
        places.add(new Place
                (getString(R.string.hawthorne),
                        getString(R.string.hawthorne_desc)));
        places.add(new Place
                (getString(R.string.records),
                        getString(R.string.records_desc)));
        places.add(new Place
                (getString(R.string.antique),
                        getString(R.string.antique_desc)));

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
