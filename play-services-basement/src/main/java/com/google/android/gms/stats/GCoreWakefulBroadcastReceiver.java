package com.google.android.gms.stats;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class GCoreWakefulBroadcastReceiver extends BroadcastReceiver {
    public static boolean completeWakefulIntent(@NonNull Context context, @Nullable Intent intent) {
        if (intent == null) return false;
        return false;
    }
}
