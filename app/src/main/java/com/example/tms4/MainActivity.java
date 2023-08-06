package com.example.tms4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<CardForEvents> cardForEvents=new ArrayList<>();
    int[] image_ev ={R.drawable.untold_logo, R.drawable.ec_logo, R.drawable.fotbal_logo, R.drawable.vin_logo};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EventsPagerAdapter eventsPagerAdapter = new EventsPagerAdapter(this);


        ViewPager2 viewPager2 = findViewById(R.id.viewPager);
        viewPager2.setAdapter(eventsPagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("Events");
                    tab.setIcon(R.drawable.icon_events);
                    break;
                case 1:
                    tab.setText("Orders");
                    tab.setIcon(R.drawable.icon_order);
                    break;
                case 2:
                    tab.setText("More");
                    tab.setIcon(R.drawable.more_icon);
                    break;
            }
        }).attach();

        RecyclerView recyclerView = findViewById(R.id.mRecycleView);
        set_for_card_event();

        Untold_RecycleViewAdapter adapter = new Untold_RecycleViewAdapter(this,
                cardForEvents);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    private void set_for_card_event(){
        String[] events_names = getResources().getStringArray(R.array.numele_evenimentului);
        String[] events_desc = getResources().getStringArray(R.array.descriere_eveniment);

        for(int i = 0; i < events_names.length; i++){
            cardForEvents.add(new CardForEvents(events_names[i], events_desc[i], image_ev[i]));
        }
    }
}
