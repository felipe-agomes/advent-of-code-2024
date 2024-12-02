package com.fagomes.adventofcode.parts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AdventInput {
    private InputStream input;

    public AdventInput(InputStream input) {
        this.input = input;
    }

    public String getFullContent() {
        InputStreamReader inputReader = new InputStreamReader(this.input);

        BufferedReader reader = new BufferedReader(inputReader);

        StringBuilder fullContent = new StringBuilder();
        String line;

        try {
            while ((line = reader.readLine()) != null) {
                fullContent.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (fullContent.length() > 0) {
            fullContent.setLength(fullContent.length() - 1);
        }

        return fullContent.toString();
    }
}
