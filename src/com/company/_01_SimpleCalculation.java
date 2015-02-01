package com.company;

import java.util.Scanner;

public class _01_SimpleCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        if (x == 0 && y == 0) {
            System.out.println(0);
            return;
        } else if (y > 0 && x > 0) {
            System.out.println(1);
        } else if (y > 0 && x < 0) {
            System.out.println(2);
        } else if (y < 0 && x < 0) {
            System.out.println(3);
        } else if (y < 0 && x > 0) {
            System.out.println(4);
        } else if (y == 0) {
            System.out.println(6);
        } else if (x == 0) {
            System.out.println(5);
        }
    }
}
