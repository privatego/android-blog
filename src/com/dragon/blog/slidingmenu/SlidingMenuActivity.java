package com.dragon.blog.slidingmenu;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import com.dragon.blog.BaseActivity;
import com.dragon.blog.R;

/**
 * Created by blessed on 10/27/15.
 */
public class SlidingMenuActivity extends BaseActivity implements View.OnClickListener{

    TextView btnShowMenu = null;
    DrawerLayout drawerLayout = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding_menu);
        setTitleText(R.string.str_slidingmenu_title);
        setLeftBtnPress();

        initView();
    }

    private void initView() {
        btnShowMenu = (TextView)findViewById(R.id.btn_show_menu);
        btnShowMenu.setOnClickListener(this);
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_show_menu:
                drawerLayout.openDrawer(Gravity.LEFT);
                break;
            default:
                break;
        }
    }
}
