package com.kinetiqa.glacier.core.connection.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.kinetiqa.glacier.core.connection.service.BackgroundSyncService;

public class AlarmReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.d("Alarm", "BroadcastReceiver, in onReceive:");

		context.startService(new Intent(context,
				BackgroundSyncService.class));
	}

}