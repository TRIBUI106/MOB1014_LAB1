/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chezis.fptschool;
import java.util.Scanner;


/**
 *
 * @author Administrator
 */
public class lab1_b2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nhập chiều dài hình chữ nhật : ");
        int a = scan.nextInt();
        System.out.print("Nhập chiều rộng hình chữ nhật : ");
        int b = scan.nextInt();
        
        System.out.printf("Chu Vi : %d\n", (a+b)*2 );
        System.out.printf("Diện tích : %d", a*b );
        
    }
}
