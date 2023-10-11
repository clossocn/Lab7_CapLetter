package com.example.lab7_capletter;

public class Lab7_CapLetter {
        public static void main(String[] args) {
            int height = 7; // Height of the letter C

            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= 5; j++) {
                    if (i == 1 || i == height || j == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
}
