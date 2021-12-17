package com.brcm.apim.magtraining;

import androidx.test.espresso.idling.CountingIdlingResource;

public class CountingIdlingResourceSingleton {

    private static String RESOURCE = "GLOBAL";

    public static CountingIdlingResource countingIdlingResource = new CountingIdlingResource(RESOURCE);

    static void increment() {
        countingIdlingResource.increment();
    }

    static void decrement() {
        if (!countingIdlingResource.isIdleNow()) {
            countingIdlingResource.decrement();
        }
    }
}
