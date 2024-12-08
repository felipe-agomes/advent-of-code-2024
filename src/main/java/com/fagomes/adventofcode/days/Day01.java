package com.fagomes.adventofcode.days;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.fagomes.adventofcode.days.interfaces.AdventDay;
import com.fagomes.adventofcode.parts.AdventInput;
import com.fagomes.adventofcode.parts.enums.AdventParts;

public class Day01 implements AdventDay {

    @Override
    public String resolve(AdventInput adventInput, AdventParts adventPart) {
        if (adventPart == AdventParts.PART_01 || adventPart == AdventParts.PART_01_TEST) {
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
        } else {
            String[] input = adventInput.getLines();
            List<Long> leftSide = Arrays.asList(input).stream()
                .map((line) -> Long.parseLong(line.substring(0, line.indexOf(" "))))
                .collect(Collectors.toList());
            List<Long> rightSide = Arrays.asList(input).stream()
                .map((line) -> Long.parseLong(line.substring(line.lastIndexOf(" ") + 1)))
                .collect(Collectors.toList());
            
            Long result = 0L;
            for (Long leftItem : leftSide) {
                int count = 0;
                for (Long rightItem : rightSide) {
                    count += leftItem.equals(rightItem) ? 1 : 0;
                }
                result = result + (leftItem * count);
            }

            return String.valueOf(result);
        }
    }
}
