package com.company;

import java.util.Scanner;

public class Cc {

    public static void main(String[] args) {
        String s;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        s = in.nextLine();

        String encryptedToString = aTillZ(s);
        System.out.print(encryptedToString);


    }

    static String aTillZ(String s) {
        StringBuilder encryptedSentence = new StringBuilder();

        for (int currentLetter = 0; currentLetter < s.length(); currentLetter++) {

            char originalLetter = s.charAt(currentLetter);
            if (originalLetter == 197) {
                originalLetter = 91;
            }
            if (originalLetter == 196) {
                originalLetter = 92;
            }
            if (originalLetter == 214) {
                originalLetter = 93;
            }
            if (originalLetter == 229) {
                originalLetter = 123;
            }
            if (originalLetter == 228) {
                originalLetter = 124;
            }
            if (originalLetter == 246) {
                originalLetter = 125;
            }
            boolean ifBigLetter = originalLetter >= 65 && originalLetter <= 93;
            boolean ifSmallLetter = originalLetter >= 97 && originalLetter <= 125;

            int encryptedLetter = (int) (originalLetter + 3);
            if (ifBigLetter) {
                int finishedEncryptedLetter = (encryptedLetter - 65);
                char backToA = (char) (finishedEncryptedLetter % 29 + 65);
                if (backToA == 91) {
                    backToA = 197;
                }
                if (backToA == 92) {
                    backToA = 196;
                }
                if (backToA == 93) {
                    backToA = 214;
                }
                encryptedSentence.append(backToA);
            } else if (ifSmallLetter) {
                int finishedEncryptedLetter = (encryptedLetter - 97);
                char backToA = (char) (finishedEncryptedLetter % 29 + 97);
                if (backToA == 123) {
                    backToA = 229;
                }
                if (backToA == 124) {
                    backToA = 228;
                }
                if (backToA == 125) {
                    backToA = 246;
                }
                encryptedSentence.append(backToA);
            } else {
                encryptedSentence.append(originalLetter);
            }
        }
        return encryptedSentence.toString();
    }

}