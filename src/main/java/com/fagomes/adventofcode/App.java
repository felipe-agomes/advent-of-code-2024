package com.fagomes.adventofcode;

import com.fagomes.adventofcode.days.AdventDay;
import com.fagomes.adventofcode.days.AdventDays;
import com.fagomes.adventofcode.parts.AdventParts;

public class App {
    public static void main(String[] args) {
        AdventOfCode adventOfCode = new AdventOfCode();

        AdventDay adventDay = adventOfCode.getDay(AdventDays.DAY_1, AdventParts.PART_1);

        System.out.println(adventDay.resolve());
    }
}
