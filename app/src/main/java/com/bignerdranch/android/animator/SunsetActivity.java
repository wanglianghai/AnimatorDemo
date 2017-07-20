package com.bignerdranch.android.animator;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SunsetActivity extends SingleFragmentActivity {

    @Override
    public int getLayoutResId() {
        return R.layout.activity_fragment;
    }

    @Override
    public Fragment createFragment() {
        return SunsetFragment.newInstance();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
