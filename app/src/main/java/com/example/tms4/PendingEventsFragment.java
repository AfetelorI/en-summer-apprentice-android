package com.example.tms4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class PendingEventsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_pending_events, container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.mRecycleView);

        ArrayList<CardForEvents> cardForEvents = set_for_card_event(); // Get the data for the RecyclerView

        Untold_RecycleViewAdapter adapter = new Untold_RecycleViewAdapter(requireContext(), cardForEvents);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));

        return rootView;
    }

    private ArrayList<CardForEvents> set_for_card_event() {
        // Your data setup for the RecyclerView goes here
        ArrayList<CardForEvents> cardForEvents = new ArrayList<>();
        // Add the cards (e.g., Untold, Electric castle, Soccer, Wine Festival) to the ArrayList here
        cardForEvents.add(new CardForEvents("Untold", "Description for Untold", R.drawable.untold_logo));
        cardForEvents.add(new CardForEvents("Electric Castle", "Description for Electric Castle", R.drawable.ec_logo));
        cardForEvents.add(new CardForEvents("Soccer", "Description for Soccer", R.drawable.fotbal_logo));
        cardForEvents.add(new CardForEvents("Wine Festival", "Description for Wine Festival", R.drawable.vin_logo));
        // Add more cards as needed
        return cardForEvents;
    }
}