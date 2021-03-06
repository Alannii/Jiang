package com.huatec.hiot_cloud.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.huatec.hiot_cloud.R;
import com.huatec.hiot_cloud.ui.base.BaseFragment;
import com.huatec.hiot_cloud.ui.base.BasePresenter;

public class SceneFragment extends BaseFragment {

    public static SceneFragment newInstance() {
        SceneFragment fragment = new SceneFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void injectIndependies() {

    }

    @Override
    public BasePresenter createPresent() {
        return null;
    }

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,container,false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView imageView = view.findViewById(R.id.main_fragment_im);
        imageView.setImageResource(R.drawable.heiren_3);
    }
}
