package com.fagomes.adventofcode.days.enums;

public enum AdventDays {
    DAY_01("Day01"),
    DAY_02("Day02"),
    DAY_03("Day03"),
    DAY_04("Day04"),
    DAY_05("Day05"),
    DAY_06("Day06"),
    DAY_07("Day07"),
    DAY_08("Day08"),
    DAY_09("Day09"),
    DAY_10("Day10"),
    DAY_11("Day11"),
    DAY_12("Day12"),
    DAY_13("Day13"),
    DAY_14("Day14"),
    DAY_15("Day15"),
    DAY_16("Day16"),
    DAY_17("Day17"),
    DAY_18("Day18"),
    DAY_19("Day19"),
    DAY_20("Day20"),
    DAY_21("Day21"),
    DAY_22("Day22"),
    DAY_23("Day23"),
    DAY_24("Day24"),
    DAY_25("Day25");

    private String value;

    AdventDays(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
