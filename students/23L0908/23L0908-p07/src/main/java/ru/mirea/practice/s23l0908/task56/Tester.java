package ru.mirea.practice.s23l0908.task56;

import java.util.Scanner;

public final class Tester {

    private Tester() {
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter String: ");
            String string = in.nextLine();
            ProcessStrings str = new ProcessStrings(string);
            System.out.println("Length: " + str.length());
            System.out.println("Odd String: " + str.strOdd());
            str.reserveString();
            System.out.println("Reserve String: " + str.getStr());
        }
    }
}
