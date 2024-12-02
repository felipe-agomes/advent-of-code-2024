package com.fagomes.adventofcode.parts.enums;

public enum AdventParts {
    PART_01_TEST("part01-test"),
    PART_01("part01"),
    PART_02_TEST("part02-test"),
    PART_02("part02");


    private String value;

    AdventParts(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
