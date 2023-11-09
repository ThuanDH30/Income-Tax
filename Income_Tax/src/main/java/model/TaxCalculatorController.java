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
public class TaxCalculatorController {
    private TaxCalculatorModel taxCalculatorModel;

    public void setTaxCalculatorModel(TaxCalculatorModel model) {
        this.taxCalculatorModel = model;
    }

    public double calculateTax() {
        return taxCalculatorModel.calculateTax();
    }

    public double getTotalIncome() {
        return taxCalculatorModel.getTotalIncome();
    }

    public List<Dependent> getDependents() {
        return taxCalculatorModel.getDependents();
    }
}


