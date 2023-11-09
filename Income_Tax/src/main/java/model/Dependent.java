/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Bravo
 */
public class Dependent {
    private String name;
    private int age;
    private double dependentDeduction;

    public Dependent(String name, int age, double dependentDeduction) {
        this.name = name;
        this.age = age;
        this.dependentDeduction = dependentDeduction;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getDependentDeduction() {
        return dependentDeduction;
    }
}
