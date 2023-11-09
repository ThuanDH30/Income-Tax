/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;
import java.util.Scanner;
import model.Dependent;

/**
 *
 * @author Bravo
 */
public class TaxCalculatorView {
    private Scanner scanner;

    public TaxCalculatorView() {
        scanner = new Scanner(System.in);
    }

    public double getUserInputDouble(String prompt) {
        double userInput;
        while (true) {
            try {
                System.out.print(prompt);
                userInput = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        return userInput;
    }

    public int getUserInputInt(String prompt) {
        int userInput;
        while (true) {
            try {
                System.out.print(prompt);
                userInput = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        return userInput;
    }

    public String getUserInputString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void displayTaxCalculation(double tax, double totalIncome, List<Dependent> dependents) {
        System.out.println("Tax Calculation Summary");
        System.out.println("Total Income: " + totalIncome);

        System.out.println("\nDependents:");
        for (Dependent dependent : dependents) {
            System.out.println("Name: " + dependent.getName() + ", Age: " + dependent.getAge() +
                    ", Deduction: " + dependent.getDependentDeduction());
        }

        System.out.println("\nTax to be paid: " + tax);
    }
}
