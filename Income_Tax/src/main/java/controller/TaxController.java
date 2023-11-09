/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.TaxCalculatorView;
import java.util.ArrayList;
import java.util.List;
import model.Dependent;
import model.TaxCalculatorController;
import model.TaxCalculatorModel;

/**
 *
 * @author Bravo
 */
public class TaxController  {
     private TaxCalculatorController taxCalculatorController;
    private TaxCalculatorView taxCalculatorView;

    public TaxController() {
        this.taxCalculatorController = new TaxCalculatorController();
        this.taxCalculatorView = new TaxCalculatorView();
    }

    public void runTaxCalculator() {
        setupTaxCalculator();

        // Perform the tax calculation and print the result
        double tax = taxCalculatorController.calculateTax();
        double totalIncome = taxCalculatorController.getTotalIncome();
        List<Dependent> dependents = taxCalculatorController.getDependents();

        taxCalculatorView.displayTaxCalculation(tax, totalIncome, dependents);
    }

    private void setupTaxCalculator() {
        double totalIncome = taxCalculatorView.getUserInputDouble("Enter total income: ");

        List<Dependent> dependents = new ArrayList<>();
        int numDependents = taxCalculatorView.getUserInputInt("Enter the number of dependents: ");
        for (int i = 0; i < numDependents; i++) {
            String name = taxCalculatorView.getUserInputString("Enter dependent name: ");
            int age = taxCalculatorView.getUserInputInt("Enter dependent age: ");
            double deduction = taxCalculatorView.getUserInputDouble("Enter dependent deduction: ");
            dependents.add(new Dependent(name, age, deduction));
        }

        TaxCalculatorModel model = new TaxCalculatorModel(totalIncome, dependents);
        taxCalculatorController.setTaxCalculatorModel(model);
    }
}
