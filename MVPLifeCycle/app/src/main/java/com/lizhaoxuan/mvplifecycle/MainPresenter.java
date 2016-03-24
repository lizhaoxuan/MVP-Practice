package com.lizhaoxuan.mvplifecycle;

import android.util.Log;

import com.lizhaoxuan.mvplifecycle.base.BasePresenter;

/**
 * Created by lizhaoxuan on 16/3/24.
 */
public class MainPresenter extends BasePresenter<IMainView> implements IMainPresenter {

    private IMainView mainView;

    public void setMainView(IMainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void getData() {
        mainView.showToast("asdasd");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG","onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG", "onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG", "onStop");
    }
}
