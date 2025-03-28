package com.dsa.sample;

import java.util.concurrent.*;

public class DebouncingService {

    public static final Object OBJECT = new Object();
    private static ScheduledExecutorService service = Executors.newScheduledThreadPool(1);

    static ScheduledFuture<?> schedule = null;

    private static void run(String message) {

        if (schedule != null && !schedule.isDone()) {

            System.out.println("Duplicate request cancelled {}" + message + schedule.cancel(false));
        }

        synchronized (OBJECT) {
            schedule = service.schedule(() -> {

                System.out.println(message);
            }, 2, TimeUnit.SECONDS);
        }

    }

    public static void main(String[] args) {
        run("help");
        run("help-2");

        run("help3");
        run("help-4");
        run("help5");
        run("help-6");
        run("help-7");
        run("help-8");
    }
}

