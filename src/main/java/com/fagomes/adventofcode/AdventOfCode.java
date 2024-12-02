package com.fagomes.adventofcode;

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
            // throw new IllegalArgumentException("Dia não encontrado: " + adventDay, e);
            throw new IllegalArgumentException("Dia não encontrado: ", e);
        } catch (ReflectiveOperationException e) {
            // throw new RuntimeException("Erro ao criar a instância do dia: " + adventDay, e);
            throw new RuntimeException("Dia não encontrado: ", e);
        }
    }

    public AdventInput getInput(AdventDays adventDay, AdventParts adventPart) {
        System.out.println(this.getClass().getClassLoader().getResource("day01-part01.txt"));
        return null;
    }
}
