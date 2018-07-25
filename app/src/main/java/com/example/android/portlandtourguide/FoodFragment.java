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
                (getString(R.string.stumptown),
                        "Nationally-recognized coffee."));
        places.add(new Place
                (getString(R.string.screen_door),
                        "Chicken and sweet potato waffles."));
        places.add(new Place
                (getString(R.string.alder_cart),
                        "A city block of food carts."));
        places.add(new Place
                (getString(R.string.voodoo),
                        "Quirky doughnut spot."));
        places.add(new Place
                (getString(R.string.salt_straw),
                        "Unique local ice cream chain."));
        places.add(new Place
                (getString(R.string.pok_pok),
                        "Thai restaurant \u22C5 specializing in wings."));
        places.add(new Place
                (getString(R.string.ovation),
                        "Moroccan coffee \u2022 tea."));

        // Create a new {@link PlaceAdapter}, with {@link Place} data source.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        return rootView;

    }

}
