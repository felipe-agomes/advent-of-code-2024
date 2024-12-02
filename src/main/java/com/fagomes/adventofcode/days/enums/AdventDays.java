package com.fagomes.adventofcode.days.enums;

public enum AdventDays {
    DAY_01("Day01");

    private String value;

    AdventDays(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
