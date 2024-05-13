package com.chezis.fptschool;
import com.chezis.fptschool.lab1_b3;

import java.util.Scanner;
import java.lang.Math;

public class lab1_b3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị cạnh hình lập phương : ");
        double a = sc.nextInt();
        double canBac = 3;
        System.out.printf("Thể tích của hình lập phương là : %.0f",Math.pow(a,canBac));


    }

}
