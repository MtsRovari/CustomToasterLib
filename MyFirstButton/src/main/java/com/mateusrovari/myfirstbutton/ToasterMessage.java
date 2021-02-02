package com.mateusrovari.myfirstbutton;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ToasterMessage {

    public static void customToast(Context c, String message) {

        c.startActivity(new Intent(c, MainActivityModule.class));
    }
}
