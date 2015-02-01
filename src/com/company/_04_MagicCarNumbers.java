package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class _04_MagicCarNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight = Integer.parseInt(scanner.nextLine());
        char[] letters = {'A', 'B', 'C', 'E', 'H', 'K', 'M', 'P', 'T', 'X'};
        HashMap<Character, Integer> lettersWeights = new HashMap<Character, Integer>();
        lettersWeights.put('A', 10);
        lettersWeights.put('B', 20);
        lettersWeights.put('C', 30);
        lettersWeights.put('E', 50);
        lettersWeights.put('H', 80);
        lettersWeights.put('K', 110);
        lettersWeights.put('M', 130);
        lettersWeights.put('P', 160);
        lettersWeights.put('T', 200);
        lettersWeights.put('X', 240);
        int count = 0;

        for (int i = 0; i <= 9999; i++) {
            if (isMagic(i)) {
                for (int j = 0; j < letters.length; j++) {
                    for (int k = 0; k < letters.length; k++) {
                        if (weight == calculateWeight(i, letters[j], letters[k], lettersWeights)) {
                            count++;
                            //System.out.println("CA" + i + letters[j] + letters[k]);
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static boolean isMagic(int number) {
        int d1, d2, d3, d4;
        if (number < 10) { d1 = d2 = d3 = 0; d4 = number;}
        else if (number >= 10 && number <100) {
            d1 = d2 = 0;
            d4 = number % 10;
            d3 = (number / 10) % 10;
        } else if (number >= 100 && number <1000) {
            d1 = 0;
            d4 = number % 10;
            d3 = (number / 10) % 10;
            d2 = (number / 100) % 10;
        } else if (number == 0) {
            return true;
        }
        else {
            d4 = number % 10;
            d3 = (number / 10) % 10;
            d2 = (number / 100) % 10;
            d1 = (number / 1000) % 10;
        }
        if (d1 == d2 && d2 == d3 && d3 == d4) {
            return true;
        } else if (d2 == d3 && d3 == d4) {
            return true;
        } else if (d1 == d2 && d2 == d3) {
            return true;
        } else if (d1 == d2 && d3 == d4) {
            return true;
        } else if (d1 == d3 && d2 == d4) {
            return true;
        } else if (d1 == d4 && d2 == d3) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isMagic2(int number) {
        String plate = Integer.toString(number);
        while (plate.length() < 4) {
            plate = "0" + plate;
        }
        if (plate.charAt(0) == plate.charAt(1)
                && plate.charAt(1) == plate.charAt(2)
                && plate.charAt(2) == plate.charAt(3)) {
            return true;
        } else if (plate.charAt(1) == plate.charAt(2)
                && plate.charAt(2) == plate.charAt(3)) {
            return true;
        } else if (plate.charAt(0) == plate.charAt(1)
                && plate.charAt(1) == plate.charAt(2)) {
            return true;
        } else if (plate.charAt(0) == plate.charAt(1)
                && plate.charAt(2) == plate.charAt(3)) {
            return true;
        } else if (plate.charAt(0) == plate.charAt(2)
                && plate.charAt(1) == plate.charAt(3)) {
            return true;
        } else if (plate.charAt(0) == plate.charAt(3)
                && plate.charAt(1) == plate.charAt(2)) {
            return true;
        }
        return false;
    }

    public static int calculateWeight(int digits, char x, char y, HashMap<Character, Integer> weights) {
        int d1, d2, d3, d4;
        if (digits < 10) { d1 = d2 = d3 = 0; d4 = digits;}
        else if (digits >= 10 && digits <100) {
            d1 = d2 = 0;
            d4 = digits % 10;
            d3 = (digits / 10) % 10;
        } else if (digits >= 100 && digits <1000) {
            d1 = 0;
            d4 = digits % 10;
            d3 = (digits / 10) % 10;
            d2 = (digits / 100) % 10;
        } else {
            d4 = digits % 10;
            d3 = (digits / 10) % 10;
            d2 = (digits / 100) % 10;
            d1 = (digits / 1000) % 10;
        }
        int result = 40 + d1 + d2 + d3 + d4;
        result += weights.get(x);
        result += weights.get(y);
        return result;
    }
}