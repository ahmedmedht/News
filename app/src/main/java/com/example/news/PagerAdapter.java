package com.example.news;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.news.Fragment.EntertainmentFragment;
import com.example.news.Fragment.HealthFragment;
import com.example.news.Fragment.HomeFragment;
import com.example.news.Fragment.ScienceFragment;
import com.example.news.Fragment.SportsFragment;
import com.example.news.Fragment.TechnologyFragment;

public class PagerAdapter extends FragmentPagerAdapter {
    int tabcount;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new HomeFragment();
            case 1:
                return new SportsFragment();
            case 2:
                return new HealthFragment();
            case 3:
                return new ScienceFragment();
            case 4:
                return new EntertainmentFragment();
            case 5:
                return new TechnologyFragment();

            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
