package com.lxcay.channel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by lixiang on 2016/7/15.
 */
public class XiaomiMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView t=new TextView(this);
        t.setText("xiaomi");
        t.setTextSize(50);
        setContentView(t);

    }
}
