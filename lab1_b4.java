package com.chezis.fptschool;

import java.util.Scanner;
import java.lang.Math;

public class lab1_b4 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double a, b, c;
        System.out.print("Nhập số A : ");
        a = scan.nextFloat();
        System.out.print("Nhập số B : ");
        b = scan.nextFloat();
        System.out.print("Nhập số C : ");
        c = scan.nextFloat();
        double Delta = Math.pow(b,2) - (4 * a * c);
        System.out.printf("Căn Delta là : %lf", Math.sqrt(Delta));
    }

}