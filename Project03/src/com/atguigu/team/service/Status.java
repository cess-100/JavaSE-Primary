package com.atguigu.team.service;

public class Status {
    public static final Status VACATION = new Status("VACATION");
    public static final Status FREE = new Status("FREE");
    public static final Status BUSY = new Status("BUSY");

    private final String NAME;

    private Status(String name) {
        this.NAME = name;
    }

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return NAME;
    }
}
