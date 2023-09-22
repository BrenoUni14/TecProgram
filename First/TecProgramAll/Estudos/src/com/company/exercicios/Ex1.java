package com.company.exercicios;

import javax.swing.*;

public class Ex1 {
    public static void main(String[] args) {
        //Read 3 fractional numbers from the keyboard and inform if the
        //first is greater than the sum of the last two;

        double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Type the First number: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Type the Second number: "));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Type the Third number: "));
        double sum = num2 + num3;

        if (num1 > sum){
            JOptionPane.showMessageDialog(null, "The First number is greater than the sum of the two last numbers!");
        }
        else{
            JOptionPane.showMessageDialog(null,"The sum of the two last numbers is greater than the First number");
        }
    }
}
