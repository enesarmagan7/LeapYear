package Letcode;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class LeapYear {


    public static void main(String[] args) {
        int year = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Yıl Giriniz: ");
        year=sc.nextInt();
        if(year%4==0 && year%100!=0){
            System.out.println(year+ " bir artık yıldır!");
        }else if(year%400!=0){
            System.out.println(year+ " bir artık yıl değildir!");

        }
        if(year%400==0){
            System.out.println(year+ " bir artık yıldır!");
        }

    }
}
