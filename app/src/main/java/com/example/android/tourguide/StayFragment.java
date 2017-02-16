package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class StayFragment extends Fragment {


    public StayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.hyatt_heading),getString(R.string.hyatt_description),R.drawable.hyatt));
        places.add(new Place(getString(R.string.mariott_heading),getString(R.string.mariott_description),R.drawable.mariott));
        places.add(new Place(getString(R.string.taj_heading),getString(R.string.taj_description),R.drawable.taj));
        places.add(new Place(getString(R.string.altius_heading),getString(R.string.altius_description),R.drawable.altius));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(),places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
