package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite savo ugi");

        float Ugis = sc.nextFloat();

        System.out.println("Iveskite savo svori");

        float Svoris = sc.nextFloat();

        float KMI = Svoris/(Ugis*Ugis);

        System.out.println("Jusu KMI yra: " + KMI);

	// write your code here
    }
}
