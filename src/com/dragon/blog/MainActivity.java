package com.dragon.blog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.dragon.blog.animation.AnimationActivity;
import com.dragon.blog.slidingmenu.SlidingMenuActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private Button btn_sliding_menu;
    private Button btn_animation;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        btn_sliding_menu = (Button)findViewById(R.id.btn_sliding_menu);
        btn_sliding_menu.setOnClickListener(this);

        btn_animation = (Button)findViewById(R.id.btn_animation);
        btn_animation.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_sliding_menu:
                Intent slidingIntent = new Intent(MainActivity.this, SlidingMenuActivity.class);
                startActivity(slidingIntent);
                break;
            case R.id.btn_animation:
                Intent animIntent = new Intent(MainActivity.this, AnimationActivity.class);
                startActivity(animIntent);
                break;

            default:
                break;
        }
    }
}
