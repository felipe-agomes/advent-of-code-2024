package com.fagomes.adventofcode;

import com.fagomes.adventofcode.days.enums.AdventDays;
import com.fagomes.adventofcode.days.interfaces.AdventDay;
import com.fagomes.adventofcode.parts.AdventInput;
import com.fagomes.adventofcode.parts.enums.AdventParts;

public class AdventOfCode {

    public AdventDay getDay(AdventDays adventDay) {
        String className = "com.fagomes.adventofcode.days." + adventDay;

        Class<?> clazz;
        try {
            clazz = Class.forName(className);

            if (!AdventDay.class.isAssignableFrom(clazz)) {
                throw new IllegalArgumentException("Classe inválida para o dia: " + adventDay);
            }

            return (AdventDay) clazz.getConstructor(String.class).newInstance(adventDay);
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Dia não encontrado: " + adventDay, e);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Erro ao criar a instância do dia: " + adventDay, e);
        }
    }

    public AdventInput getInput(AdventDays adventDay, AdventParts adventPart) {
        return null;
    }
}
