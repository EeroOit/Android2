package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ApmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
      if (Intent.ACTION_AIRPLANE_MODE_CHANGED.equals(intent.getAction())) {
          boolean state = intent.getBooleanExtra("state", false);
      if (state) {
          Toast.makeText(context, "AIRPLANE MODE ON", Toast.LENGTH_SHORT).show();

      } else {
          Toast.makeText(context, "AIRPLANE MODE OFF", Toast.LENGTH_SHORT).show();
      }
      }
    }
}
