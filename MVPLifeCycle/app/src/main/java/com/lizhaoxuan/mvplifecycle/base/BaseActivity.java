package com.lizhaoxuan.mvplifecycle.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by lizhaoxuan on 16/3/24.
 */
public class BaseActivity<T extends BasePresenter> extends AppCompatActivity {

    private T presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public T setPresenter(Class<T> pClazz) {
        try {
            presenter = pClazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return presenter;
    }

    final public T getPresenter() {
        return presenter;
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.onStart();

    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }
}
