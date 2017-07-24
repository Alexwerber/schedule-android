package com.alexwerber.scheduleandroid;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    private static final int FRAGMENT_COUNT = 2;
    private static final int TODAY_INDEX = 0;
    private static final int TOMORROW_INDEX = 1;

    private Context mContext;

    public PagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        switch (position){
            case TODAY_INDEX:
                return new TodayFragment();
            case TOMORROW_INDEX:
                return new TomorrowFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }

    public CharSequence getPageTitle(int position) {
        switch(position){
            case TODAY_INDEX:
                return mContext.getString(R.string.tab_today);
            case TOMORROW_INDEX:
                return mContext.getString(R.string.tab_tomorrow);
            default: return null;
        }
    }
}
