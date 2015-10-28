package com.dragon.blog;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by blessed on 10/27/15.
 */
public class BaseActivity extends Activity {
    private static String TAG = "BaseActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    // set activity title text
    protected void setTitleText(int resID) {
        final TextView title = (TextView) this.findViewById(R.id.tv_header_title);
        Log.e(TAG, "title = " + title);
        Log.e(TAG, "resID = " + resID);
        if (null != title) {
            title.setText(resID);
        }
    }

    protected void setLeftBtnPress(){
        ImageView iv_leftBtn = (ImageView)findViewById(R.id.header_left_btn);
        Log.e(TAG, "iv_leftBtn = " + iv_leftBtn);
        if (iv_leftBtn != null){
            iv_leftBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.e(TAG, "onClick");
                    finish();
                }
            });
        }
    }
}
