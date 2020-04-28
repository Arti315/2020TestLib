package com.pramod.noida;

import android.content.Context;
import android.widget.Toast;

public class Test {
    public static void shortToast(Context context, String string){
        Toast.makeText(context,string, Toast.LENGTH_SHORT).show();
    }

}
