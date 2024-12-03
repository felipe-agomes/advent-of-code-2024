package com.fagomes.adventofcode.days;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.fagomes.adventofcode.days.interfaces.AdventDay;
import com.fagomes.adventofcode.parts.AdventInput;
import com.fagomes.adventofcode.parts.enums.AdventParts;

public class Day01 implements AdventDay {

    @Override
    public String resolve(AdventInput adventInput, AdventParts adventPart) {
        String[] input = adventInput.getLines();
        List<Long> leftSide = Arrays.asList(input).stream()
            .map((line) -> Long.parseLong(line.substring(0, line.indexOf(" "))))
            .collect(Collectors.toList());
        List<Long> rightSide = Arrays.asList(input).stream()
            .map((line) -> Long.parseLong(line.substring(line.lastIndexOf(" ") + 1)))
            .collect(Collectors.toList());

        leftSide.sort((a, b) -> a.compareTo(b));
        rightSide.sort((a, b) -> a.compareTo(b));

        Long result = 0L;
        for (int i = 0; i < input.length; i++) {
            result += Math.abs(leftSide.get(i) - rightSide.get(i));
        }

        return String.valueOf(result);
    }
}
