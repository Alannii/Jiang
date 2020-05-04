package com.huatec.hiot_cloud.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.RadioGroup;

import com.huatec.hiot_cloud.R;
import com.huatec.hiot_cloud.ui.base.BaseActivity;
import com.huatec.hiot_cloud.ui.base.BasePresenter;
import com.huatec.hiot_cloud.utils.Constants;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewPager viewPager = findViewById(R.id.vp_main);
        viewPager.setOffscreenPageLimit(Constants.MAIN_FRAGMENT_COUNT);
        viewPager.setAdapter(new FramentAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT));

        RadioGroup radioGroup = findViewById(R.id.rg_main);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rg_message:
                        viewPager.setCurrentItem(Constants.MAIN_VIEWPAGER_INDEX_MESSAGE);
                        break;
                    case R.id.rg_equipment:
                        viewPager.setCurrentItem(Constants.MAIN_VIEWPAGER_INDEX_EQUIPMENT);
                        break;
                    case R.id.rg_scene:
                        viewPager.setCurrentItem(Constants.MAIN_VIEWPAGER_INDEX_SCENE);
                        break;
                    case R.id.rg_mine:
                        viewPager.setCurrentItem(Constants.MAIN_VIEWPAGER_INDEX_MINE);
                        break;
                }
            }
        });

    }

    @Override
    public void injectIndependies() {

    }

    @Override
    public BasePresenter createPresent() {
        return null;
    }
}
