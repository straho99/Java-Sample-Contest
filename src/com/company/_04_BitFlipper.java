package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class _04_BitFlipper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger number = new BigInteger(scanner.nextLine());
        String binary = number.toString(2);

        while (binary.length() < 64) {
            binary = "0" + binary;
        }
        //System.out.println("Before: " + binary);
        StringBuilder flipped = new StringBuilder();
        int j = 0;
        while (j < binary.length() - 2) {
            if (binary.charAt(j) == binary.charAt(j + 1) && binary.charAt(j + 1) == binary.charAt(j + 2)) {
                char bitToAppend = binary.charAt(j) == '0' ? '1' : '0';
                flipped.append(new char[]{bitToAppend, bitToAppend, bitToAppend});
                j += 3;
            } else {
                flipped.append(binary.charAt(j));
                j++;
            }
        }
        while (j < binary.length()) {
            flipped.append(binary.charAt(j));
            j++;
        }
        //System.out.println("After : " + flipped);
        BigInteger result = new BigInteger(flipped.toString(), 2);
        System.out.println(result);
    }
}
