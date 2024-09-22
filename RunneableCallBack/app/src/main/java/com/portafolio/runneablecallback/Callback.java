package com.portafolio.runneablecallback;

import android.content.Context;

public interface Callback {
    void onTaskCompleted(String result);
    void onTaskFailed(String e);
}
