package com.programming.android.tabhost;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

/**
 * Created by Na on 11/21/2016.
 */

public class Tab3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear);
        linearLayout.setBackgroundColor(Color.parseColor("#3982d7"));
    }
}