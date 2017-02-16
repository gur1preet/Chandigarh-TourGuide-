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
public class EateriesFragment extends Fragment {


    public EateriesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.brew_estate_heading),getString(R.string.brew_estate_description),R.drawable.brew_estate));
        places.add(new Place(getString(R.string.pashtun_heading),getString(R.string.pashtun_descritpion),R.drawable.pashtun));
        places.add(new Place(getString(R.string.bbq_nation_heading),getString(R.string.bbq_nation_description),R.drawable.bbq_nation));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(),places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
