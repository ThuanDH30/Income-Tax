/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Bravo
 */
public class TaxCalculatorModel {
  private double totalIncome;
    private List<Dependent> dependents;

    public TaxCalculatorModel(double totalIncome, List<Dependent> dependents) {
        this.totalIncome = totalIncome;
        this.dependents = dependents;
    }

    public double calculateTax() {
        double taxableIncome = totalIncome;

        for (Dependent dependent : dependents) {
            taxableIncome -= dependent.getDependentDeduction();
        }

        if (taxableIncome <= 11000000) {
            return 0;
        } else {
            double additionalTaxRate = 0.01;
            double tax = (taxableIncome - 2000000) * additionalTaxRate;

            return tax;
        }
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public List<Dependent> getDependents() {
        return dependents;
    }
}
