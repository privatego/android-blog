package com.dragon.blog.animation;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.TextView;
import com.dragon.blog.BaseActivity;
import com.dragon.blog.R;

/**
 * Created by blessed on 10/29/15.
 */
public class AnimationActivity extends BaseActivity {

    private TextView tv_value_animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        setTitleText(R.string.str_animation);
        setLeftBtnPress();

        initView();
    }

    private void initView() {
        tv_value_animation = (TextView)findViewById(R.id.tv_value_animation);
        beginValueAnim();
    }

    private void beginValueAnim(){
        ValueAnimator colorAnim = ObjectAnimator.ofInt(tv_value_animation, "background", 0xFFFF8080, 0xFF8080ff);
        colorAnim.setDuration(3000);
        colorAnim.setEvaluator(new ArgbEvaluator());
        colorAnim.setRepeatCount(ValueAnimator.INFINITE);
        colorAnim.setRepeatMode(ValueAnimator.REVERSE);
        colorAnim.start();
    }
}
