package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class _02_Tribonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger t1 = new BigInteger(scanner.nextLine());
        BigInteger t2 = new BigInteger(scanner.nextLine());
        BigInteger t3 = new BigInteger(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        if (n == 1) {
            System.out.println(t1);
            return;
        } else if (n == 2) {
            System.out.println(t2);
            return;
        } else if (n == 3) {
            System.out.println(t3);
            return;
        } else {
            BigInteger result = new BigInteger("0");
            for (int i = 4; i <= n; i++) {
                result = (t1.add(t2.add(t3)));
                t1 = t2;
                t2 = t3;
                t3 = result;
            }
            System.out.println(result);
        }
    }
}
