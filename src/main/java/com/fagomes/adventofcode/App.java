package com.fagomes.adventofcode;

import com.fagomes.adventofcode.days.enums.AdventDays;
import com.fagomes.adventofcode.days.interfaces.AdventDay;
import com.fagomes.adventofcode.parts.AdventInput;
import com.fagomes.adventofcode.parts.enums.AdventParts;

public class App {
    public static void main(String[] args) {
        AdventOfCode adventOfCode = new AdventOfCode();

        AdventDay adventDay = adventOfCode.getDay(AdventDays.DAY_01);
        AdventInput adventInput = adventOfCode.getInput(AdventDays.DAY_01, AdventParts.PART_1);

        System.out.println(adventDay.resolve(adventInput, AdventParts.PART_1));
    }
}
