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
public class lab1_b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Nhập họ & tên : ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập điểm sinh viên : ");
        
        try{
            int inputScore = scanner.nextInt();
            System.out.println("");
            System.out.println("Họ và tên sinh viên là : " +hoTen);
            System.out.println("Điểm sinh viên là : " +inputScore);
        }
        catch (Exception Loi){
            System.out.println("");
            System.out.println("Không nhận được giá trị điểm");
            System.out.println("Họ và tên sinh viên là : " +hoTen);
        }
    }
}
