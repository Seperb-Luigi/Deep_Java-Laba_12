package com.dev;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the shift value (integer): ");
            int shift = scanner.nextInt();
            scanner.nextLine();
            CaCiCore cipher = new CaCiCore(shift);
            System.out.print("Enter text to encrypt: ");
            String originalText = scanner.nextLine();
            String encryptedText = cipher.encrypt(originalText);
            System.out.println("Encrypted text: " + encryptedText);
            String decryptedText = cipher.decrypt(encryptedText);
            System.out.println("Decrypted text: " + decryptedText);
        }
    }
}
