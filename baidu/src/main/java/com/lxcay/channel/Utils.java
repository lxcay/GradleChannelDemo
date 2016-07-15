package com.lxcay.channel;

import android.content.Context;
import android.content.Intent;

/**
 * Created by lixiangos0170 on 2016/7/15.
 */
public class Utils {
    public static void startActivity(Context ctx){
        Intent intent = new Intent(ctx, BaiduMainActivity.class);
        ctx.startActivity(intent);
    }
}
