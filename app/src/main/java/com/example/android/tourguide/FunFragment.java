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
public class FunFragment extends Fragment {


    public FunFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.paintball_heading),getString(R.string.paintball_description),R.drawable.paintball));
        places.add(new Place(getString(R.string.bluo_heading),getString(R.string.bluo_description),R.drawable.bluo));
        places.add(new Place(getString(R.string.mr_heading),getString(R.string.mr_description),R.drawable.mr));
        places.add(new Place(getString(R.string.shoot_heading),getString(R.string.shoot_description),R.drawable.shoot));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(),places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
