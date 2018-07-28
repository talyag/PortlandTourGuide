package com.example.android.portlandtourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ArtFragment extends Fragment {


    public ArtFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place
                (getString(R.string.pam),
                getString(R.string.pam_desc),R.drawable.pam));
        places.add(new Place
                (getString(R.string.elk),
                getString(R.string.elk_desc), R.drawable.elk));
        places.add(new Place
                (getString(R.string.pioneer),
                getString(R.string.pioneer_desc),R.drawable.pioneer));
        places.add(new Place
                (getString(R.string.schnitzer),
                        getString(R.string.schnitzer_desc),R.drawable.schnitzer));
        places.add(new Place
                (getString(R.string.portlandia),
                getString(R.string.portlandia_desc),R.drawable.bg_test));
        places.add(new Place
                (getString(R.string.st_johns),
                getString(R.string.st_johns_desc),R.drawable.bg_test));
        places.add(new Place
                (getString(R.string.oregon_mural),
                getString(R.string.oregon_mural_desc),R.drawable.oregon_mural));

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
