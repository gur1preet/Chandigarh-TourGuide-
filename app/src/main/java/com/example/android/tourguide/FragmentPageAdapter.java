package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by DELL on 05-02-2017.
 */

public class FragmentPageAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public FragmentPageAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FunFragment();
        } else if (position == 1) {
            return new StayFragment();
        } else if (position == 2) {
            return new EateriesFragment();
        }else {
            return new ShopFragment();
        }
    }


    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.fun_category);
        } else if (position == 1) {
            return mContext.getString(R.string.stay_category);
        } else if (position == 2) {
            return mContext.getString(R.string.eateries_category);
        } else {
            return mContext.getString(R.string.shop_category);
        }
    }
}
