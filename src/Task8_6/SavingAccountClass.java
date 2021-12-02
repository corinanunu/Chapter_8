package com.company.Task8_6;

public class SavingsAccountClass {
    static double annualInterestRate = 0.0;
    private double savingBalance = 0.0;

    public SavingsAccountClass() {
    }

    public SavingsAccountClass(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccountClass.annualInterestRate = annualInterestRate;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public double calculateMonthlyInterest(){

        //double newSavingBalance = ((annualInterestRate*savingBalance)+savingBalance)/12;
        double newSavingBalance = (getAnnualInterestRate()*getSavingBalance())/12;
        savingBalance = newSavingBalance+savingBalance;
        return newSavingBalance;
    }

    static void modifyInterestRate(double newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate;
    }
}