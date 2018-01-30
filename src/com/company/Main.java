package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Įveskite savo svorį ir ūgį");
        Scanner sc = new Scanner(System.in);
        float kg = sc.nextFloat();
        float m = sc.nextFloat();
        float kmi = kg/(m*m);
        System.out.println("KMI :" + kmi);
    }
}
