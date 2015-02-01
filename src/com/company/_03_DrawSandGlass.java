package com.company;

import java.util.Scanner;

public class _03_DrawSandGlass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = n; i >= 1; i -= 2) {
            String asterisks = new String(new char[i]).replace("\0", "*");
            String spaces = new String(new char[(n - i) / 2]).replace("\0", ".");
            System.out.println(spaces + asterisks + spaces);
        }
        for (int i = 3; i <= n; i += 2) {
            String asterisks = new String(new char[i]).replace("\0", "*");
            String spaces = new String(new char[(n - i) / 2]).replace("\0", ".");
            System.out.println(spaces + asterisks + spaces);
        }
    }
}