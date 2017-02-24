package com.myb.bj.my360.mvp.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.myb.bj.my360.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by fengxiu on 2017/2/24.
 */

public class welcomeActivity extends AppCompatActivity{

//    @BindView(R.id.logo_outer_iv) ImageView logo_outer_iv;
    @BindView(R.id.logo_inner_iv) ImageView logo_inner_iv;
//    @OnClick(R.id.logo_outer_iv)

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        ButterKnife.bind(this);

    }
    public void submit(View view){
//        AnimationUtils.loadAnimation(this,R.anim.a)
    }
}
