package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Amount: ");
        int loanValue = scanner.nextInt();
        System.out.println("Enter the Interest rate: ");
        int interestRate = scanner.nextInt();
        System.out.println("Enter the time in months: ");
        int payTime = scanner.nextInt();

        double monthlyRate = calculateMonthlyRate(loanValue, interestRate, payTime);
        double overallDebt = (monthlyRate * payTime);

        System.out.printf("Monthly rate: %.2f euros %n", monthlyRate);
        System.out.println("Number of payments: " + payTime);
        System.out.printf("Overall debt: %.2f euros %n", overallDebt);
    }
    static double calculateMonthlyRate(double debtValue, double interestRate, int paybackDuration) {
        double monthlyInterestRate = interestRate / 12;
        double numerator = debtValue * monthlyInterestRate;
        double denominator = 1 - Math.pow(1 + monthlyInterestRate, -paybackDuration);
        return numerator / denominator;
    }

}