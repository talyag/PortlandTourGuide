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
                "The oldest art museum on the West Coast.",R.drawable.pam));
        places.add(new Place
                (getString(R.string.elk),
                "Fountain named after a former Portland mayor.", R.drawable.elk));
        places.add(new Place
                (getString(R.string.pioneer),
                "A public square at the heart of downtown.",R.drawable.pioneer));
        places.add(new Place
                (getString(R.string.schnitzer),
                        "A performing arts center.",R.drawable.schnitzer));
        places.add(new Place
                (getString(R.string.portlandia),
                "Trident-wielding statue inspired by the city's seal.",R.drawable.bg_test));
        places.add(new Place
                (getString(R.string.st_johns),
                "A gothic suspension bridge and the tallest bridge in Portland.",R.drawable.bg_test));
        places.add(new Place
                (getString(R.string.oregon_mural),
                "The mural depicts members of the Lewis and Clark Expedition",R.drawable.oregon_mural));

        // Create a new {@link PlaceAdapter}, with {@link Place} data source.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        return rootView;

    }

}
