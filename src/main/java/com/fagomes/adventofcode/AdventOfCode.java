package com.fagomes.adventofcode;

import java.io.InputStream;

import com.fagomes.adventofcode.days.enums.AdventDays;
import com.fagomes.adventofcode.days.interfaces.AdventDay;
import com.fagomes.adventofcode.parts.AdventInput;
import com.fagomes.adventofcode.parts.enums.AdventParts;

public class AdventOfCode {

    public AdventDay getDay(AdventDays adventDay) {
        String className = "com.fagomes.adventofcode.days." + adventDay.getValue();

        Class<?> clazz;
        try {
            clazz = Class.forName(className);

            if (!AdventDay.class.isAssignableFrom(clazz)) {
                throw new IllegalArgumentException("Classe inválida para o dia: " + adventDay);
            }

            return (AdventDay) clazz.getConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Dia não encontrado: " + adventDay, e);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Dia não encontrado: " + adventDay, e);
        }
    }

    public AdventInput getInput(AdventDays adventDay, AdventParts adventPart) {
        String folder = adventDay.getValue().toLowerCase();
        String filename = adventPart.getValue();
        String resourceName = folder + "/" + filename + ".txt";

        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(resourceName);

        return new AdventInput(inputStream);
    }
}
