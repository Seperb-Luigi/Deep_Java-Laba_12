package com.dev;

public class CaCiCore {
    private final int shift;

    public CaCiCore(int shift) {
        this.shift = normalizeShift(shift);
    }

    private int normalizeShift(int shift) {
        return (shift % 26 + 26) % 26;
    }

    public String encrypt(String input) {
        return processText(input, shift);
    }

    public String decrypt(String input) {
        return processText(input, -shift);
    }

    private String processText(String input, int shiftValue) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char processedChar = (char) ((c - base + shiftValue + 26) % 26 + base);
                result.append(processedChar);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
