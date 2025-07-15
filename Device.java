package com.elemica.supply.chain.assign01;

public interface Device {
    default void powerOn() {
        System.out.println("Device is powering on...");
    }

    static void deviceType() {
        System.out.println("Electronic device");
    }
}
