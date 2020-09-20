package main;

import calculator.CalculatorDiscount;
import model.Budget;
import model.Item;
import tax.Tax;
import tax.imp.ICMS;
import tax.imp.ICPP;
import tax.imp.ISS;

public class Main {
    public static void main(String[] args) {
       Tax iss = new ISS(new ICMS(new ICPP()));
       Budget budget = new Budget(500);
       double value = iss.calculate(budget);
        System.out.println(value);
    }
}
