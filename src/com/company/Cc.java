package com.company;

import java.util.Scanner;

public class Cc {

    public static void main(String[] args) {
        /*int a;
        float b;*/
        String s;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        s = in.nextLine();

//        for (int cryptoChar = 65; cryptoChar < 247; cryptoChar++) {
//
//            System.out.println((char) cryptoChar + " " + cryptoChar);
//
//        }
//        System.out.println((int)firstLetter+" "+ifBigFirstLetter);
//        if (ifBigFirstLetter){
//            System.out.println((char)(ifBigFirstLetter+3));
//        }


//        System.out.println(s);


//        char firstLetter = s.charAt(0);
//        boolean ifBigFirstLetter = firstLetter >= 65 && firstLetter <= 90;
//        if (ifBigFirstLetter == true) {
//            System.out.println((char) (firstLetter + 3));
//        }
//        //Begin small letters!
//
//        boolean ifSmallFirstLetter = firstLetter >= 97 && firstLetter <= 122;
//        if (ifSmallFirstLetter == true) {
//            System.out.println((char) (firstLetter + 3));
//
//
//        }

        String encryptedToString = aTillZ(s);
        System.out.print(encryptedToString);


    }

    public static String aTillZ(String s) {
        StringBuilder encryptedSentence = new StringBuilder();

        for (int currentLetter = 0; currentLetter < s.length(); currentLetter++) {

            int originalLetter = (int) (s.charAt(currentLetter)/*+currentLetter*/);
            if (originalLetter == 197) {
                originalLetter = 91;
            }
            if (originalLetter == 196) {
                originalLetter = 92;
            }
            if (originalLetter == 214) {
                originalLetter = 93;
            }
//            Begin small letters!
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
            int encryptedLetter = (int) (originalLetter);
            if (ifBigLetter == true) {
                finishedEncryptedLetter =  (encryptedLetter - 65);
                backToA =  (finishedEncryptedLetter % 29 + 65);
                if (backToA == 91) {
                    backToA = 197;
                }
                if (backToA == 92) {
                    backToA = 196;
                }
                if (backToA == 93) {
                    backToA = 214;
                }
                encryptedSentence.append(encryptedLetter);
            } else if (ifSmallLetter == true) {
                finishedEncryptedLetter = (encryptedLetter - 97);
//                backToA = (char) (finishedEncryptedLetter % 29 + 97);
//                if (backToA == 123) {
//                    backToA = 229;
//                }
//                if (backToA == 124) {
//                    backToA = 228;
//                }
//                if (backToA == 125) {
//                    backToA = 246;
//                }
//                encryptedSentence.append(backToA);
//            } else {
//                encryptedSentence.append(originalLetter);
            }
        }
        return encryptedSentence.toString();
    }

}
/*
BIG:
A 65
B 66
C 67
D 68
E 69
F 70
G 71
H 72
I 73
J 74
K 75
L 76
M 77
N 78
O 79
P 80
Q 81
R 82
S 83
T 84
U 85
V 86
W 87
X 88
Y 89
Z 90
Å 197
Ä 196
Ö 214

small:
a 97
b 98
c 99
d 100
e 101
f 102
g 103
h 104
i 105
j 106
k 107
l 108
m 109
n 110
o 111
p 112
q 113
r 114
s 115
t 116
u 117
v 118
w 119
x 120
y 121
z 122
å 229
ä 228
ö 246
*/