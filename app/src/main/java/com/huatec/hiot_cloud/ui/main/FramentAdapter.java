package com.huatec.hiot_cloud.ui.main;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import com.huatec.hiot_cloud.utils.Constants;

class FramentAdapter extends FragmentPagerAdapter {

    public FramentAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case Constants.MAIN_VIEWPAGER_INDEX_MESSAGE:
                fragment = MessageFragment.newInstance();
                break;
            case Constants.MAIN_VIEWPAGER_INDEX_EQUIPMENT:
                fragment = EquipmentFragment.newInstance();
                break;
            case Constants.MAIN_VIEWPAGER_INDEX_SCENE:
                fragment = SceneFragment.newInstance();
                break;
            case Constants.MAIN_VIEWPAGER_INDEX_MINE:
                fragment = MineFragment.newInstance();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return Constants.MAIN_FRAGMENT_COUNT;
    }
}
