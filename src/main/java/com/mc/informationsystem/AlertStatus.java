package com.mc.informationsystem;

public enum AlertStatus {
    OPEN(0), 
    ASSIGNED(1),
    CLOSEDWITHSUCCESS(2),
    CLOSEDWITHERROR(3);

    private final int code;
    private AlertStatus(int givenCode) {
        this.code = givenCode;
    }
}