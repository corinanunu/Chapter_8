package com.company.Task8_6;

import java.util.Scanner;

public class SavingAccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double newAnnualInterestRate;

        SavingsAccountClass saver1 = new SavingsAccountClass(2000.00);
        SavingsAccountClass saver2 = new SavingsAccountClass(3000.00);

        SavingsAccountClass.modifyInterestRate(0.04);

        System.out.println("------------------------------------------------");
        System.out.printf("|%46s|", "Annual Interests Rate is = "+SavingsAccountClass.getAnnualInterestRate());
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.printf("|%5s | %18s| %18s|", "","Account1 = "+saver1.getSavingBalance(), "Account2 = "+saver2.getSavingBalance());
        System.out.println();
        System.out.println("       -----------------------------------------");
        System.out.printf("|%5s | %18s| %18s|", "Month", "Saving Balance", "Saving Balance2");
        System.out.println();
        System.out.println("------------------------------------------------");
        for(int i = 0; i < 12; i++){
            System.out.printf("|%5d | %15f   | %15f   |", (i+1), saver1.calculateMonthlyInterest(), saver2.calculateMonthlyInterest());
            System.out.println();
        }
        System.out.println("------------------------------------------------");
        System.out.println();

        SavingsAccountClass.modifyInterestRate(0.05);
        System.out.println("------------------------------------------------");
        System.out.printf("|%46s|", "Annual Interests Rate is = "+SavingsAccountClass.getAnnualInterestRate());
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.printf("|%5s | %11s%.2f| %11s%.2f|", "","Account1 = ", saver1.getSavingBalance(), "Account2 = ", saver2.getSavingBalance());
        System.out.println();
        System.out.println("       -----------------------------------------");
        System.out.printf("|%5s | %18s| %18s|", "Month", "Saving Balance", "Saving Balance2");
        System.out.println();
        System.out.println("------------------------------------------------");
        for(int i = 0; i < 12; i++){
            System.out.printf("|%5d | %15f   | %15f   |", (i+1), saver1.calculateMonthlyInterest(), saver2.calculateMonthlyInterest());
            System.out.println();
        }
        System.out.println("------------------------------------------------");
    }

}