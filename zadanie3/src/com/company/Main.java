package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner wejscie = new Scanner(System.in);
        System.out.println("podaj liczbe wierszy");
        int wiersze = wejscie.nextInt();

        System.out.println("podaj liczbe kolumn");
        int kolumny = wejscie.nextInt();

        System.out.println("==========================================");

        for(int j = 1; j <= wiersze; j++) {
            for(int i = 1; i < kolumny; i++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
