package com.dragon.blog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.dragon.blog.slidingmenu.SlidingMenuActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private Button btn_sliding_menu;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        btn_sliding_menu = (Button)findViewById(R.id.btn_sliding_menu);
        btn_sliding_menu.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_sliding_menu:
                Intent slidingIntent = new Intent(MainActivity.this, SlidingMenuActivity.class);
                startActivity(slidingIntent);
                break;

            default:
                break;
        }
    }
}
