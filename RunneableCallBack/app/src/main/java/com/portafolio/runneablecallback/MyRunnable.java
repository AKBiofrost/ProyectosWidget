package com.portafolio.runneablecallback;

import android.content.Context;

public class MyRunnable implements Runnable {
    private Callback callback;
    private int delay;
    private Context context;
    private Task task;

    public MyRunnable(Task task, Callback callback, Context context) {
        this.callback = callback;
        this.context = context;
        this.task = task;
    }

    @Override
    public void run() {
        try {
            // proceso definido en la UI
            String text = task.execute();
            // Actualizar la UI mediante el callback
            callback.onTaskCompleted(text);
        } catch (Exception e) {
            callback.onTaskFailed(e.getMessage());
        }


    }
}
