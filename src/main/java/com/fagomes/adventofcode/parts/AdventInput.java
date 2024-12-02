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

        String fullContent = "";
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                fullContent += line + "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fullContent;
    }
}
