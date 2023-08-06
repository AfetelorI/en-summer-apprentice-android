package com.example.tms4;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class EventsPagerAdapter extends FragmentStateAdapter {
    public EventsPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
       switch (position) {
           case 0:
               return new PendingEventsFragment();
           case 1:
               return new PendingOrdersFragment();
           case 2:
               return new PendingMoreFragment();
           default: return null;
       }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
