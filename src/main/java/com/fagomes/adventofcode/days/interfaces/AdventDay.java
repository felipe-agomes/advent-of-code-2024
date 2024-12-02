package com.fagomes.adventofcode.days.interfaces;

import com.fagomes.adventofcode.parts.AdventInput;
import com.fagomes.adventofcode.parts.enums.AdventParts;

public interface AdventDay {
    String resolve(AdventInput adventInput, AdventParts adventPart);
}
