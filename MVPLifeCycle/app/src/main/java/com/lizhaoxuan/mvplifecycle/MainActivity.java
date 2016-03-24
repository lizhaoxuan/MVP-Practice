package com.lizhaoxuan.mvplifecycle;

import android.os.Bundle;
import android.widget.Toast;

import com.lizhaoxuan.mvplifecycle.base.BaseActivity;

public class MainActivity extends BaseActivity<MainPresenter>
        implements IMainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setPresenter(MainPresenter.class);
        getPresenter().setMainView(this);
        getPresenter().getData();
    }

    @Override
    public void showToast(String str) {
        Toast.makeText(this, str, Toast.LENGTH_LONG).show();
    }


}
