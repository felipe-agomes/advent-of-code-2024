package com.fagomes.adventofcode;

import com.fagomes.adventofcode.days.enums.AdventDays;
import com.fagomes.adventofcode.days.interfaces.AdventDay;
import com.fagomes.adventofcode.parts.AdventInput;
import com.fagomes.adventofcode.parts.enums.AdventParts;

public class App {
    public static void main(String[] args) {
        AdventOfCode adventOfCode = new AdventOfCode();

        AdventDays day = AdventDays.DAY_01;
        AdventParts part = AdventParts.PART_01_TEST;

        AdventDay adventDay = adventOfCode.getDay(day);
        AdventInput adventInput = adventOfCode.getInput(day, part);

        System.out.println(adventDay.resolve(adventInput, part));
    }
}
