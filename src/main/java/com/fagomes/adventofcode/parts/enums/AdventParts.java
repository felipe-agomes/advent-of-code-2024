package com.fagomes.adventofcode.parts.enums;

public enum AdventParts {
    PART_1("part01");

    private String value;

    AdventParts(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
