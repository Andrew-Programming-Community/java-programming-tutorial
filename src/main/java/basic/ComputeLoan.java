package basic;

import java.util.Scanner;

public class ComputeLoan {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter annual interest,e.g , 4.5%");
    double annualInterestRate = input.nextDouble();

    double monthlyInterestRate = annualInterestRate / 1200;

    System.out.println("Enter years:");
    int numberOfYears = input.nextInt();

    System.out.println("Enter loan amount");
    double loanAmount = input.nextDouble();

    double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math
        .pow(1 + monthlyInterestRate, numberOfYears * 12));

    double totalPayment = monthlyPayment * numberOfYears * 12;

    System.out.println("The monthly payment is $" + (int)monthlyPayment);
    System.out.println("The total payment is $" + (int)totalPayment);

  }

}
