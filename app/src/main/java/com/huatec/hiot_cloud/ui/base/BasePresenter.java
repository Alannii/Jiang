package com.huatec.hiot_cloud.ui.base;

public class BasePresenter<V extends BaseView> {
    private V view;

    public V getView() {
        return view;
    }

    public void setView(V view) {
        this.view = view;
    }

    public boolean viewAttached(){
        return view!=null;
    }

    public void destory(){
        if (viewAttached()){
            view = null;
        }
    }
}
