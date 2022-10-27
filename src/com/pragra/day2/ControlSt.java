package com.pragra.day2;

import java.util.Scanner;

public class ControlSt {
    public static void main(String[] args) {
        //int y;
        //System.out.println("Enter the number : ");
        //Scanner sc=new Scanner(System.in);
        //int Captured = sc.nextInt();
        //System.out.println(Captured);

        ControlSt N = new ControlSt();
        //N.TestEvenOrOdd(9);
        // N.CheckPositiveOrNegative(-8);
        // N.TestMonthDays(2);
        //  N.GreatestOf3(3, 4, 5);
        //Loop(4);

        for (int z=0;z<=4;z++){
            System.out.println(z);
        }
    }
        public static void TestEvenOrOdd ( int x){
            if (x % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
        }
        public static void CheckPositiveOrNegative ( int x){
            if (x > 0) {
                System.out.println("Positive number");
            } else if (x < 0) {
                System.out.println("Negative Number");
            } else {
                System.out.println("Zero number");
            }
        }
        public static void TestMonthDays ( int month){
            System.out.println("Enter the number : ");
            Scanner sc=new Scanner(System.in);
            int Captured = sc.nextInt();
            System.out.println(Captured);


            if (month == 1) {
                System.out.println("31");
            } else if (month == 2) {
                System.out.println("31");
            } else if (month == 3) {
                System.out.println("31");
            } else if (month == 4) {
                System.out.println("31");
            } else if (month == 5) {
                System.out.println("31");
            } else if (month == 6) {
                System.out.println("31");
            } else if (month == 7) {
                System.out.println("31");
            } else if (month == 8) {
                System.out.println("31");
            } else if (month == 9) {
                System.out.println("31");
            } else if (month == 10) {
                System.out.println("31");
            } else if (month == 11) {
                System.out.println("31");
            } else if (month == 12) {
                System.out.println("31");
            } else {
                System.out.println("Wrong Input");
            }

        }
        public static void GreatestOf3 ( int a, int b, int c){
            if (a >= b && a >= c) {
                System.out.println("Greatest Number is" + a);
            } else if (b >= c && b >= a) {
                System.out.println("Greatest Number is" + b);
            } else {
                System.out.println("Greatest Number is" + " " + c);
            }
        }
        public static void CheckEligibility ( boolean IsActive){
            if (IsActive) {
                System.out.println("Eligible");
            }
        }

    }






