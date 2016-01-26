package com.shawn.dev;

/**
 * Created by Qijun on 2016/1/25.
 */
public class Probe {

    private static Probe probe = null;

    private Probe() {

    }

    public static Probe build() {
        if (probe == null) {
            synchronized (Probe.class) {
                if (probe == null) {
                    probe = new Probe();
                }
            }
        }
        return probe;
    }

}
