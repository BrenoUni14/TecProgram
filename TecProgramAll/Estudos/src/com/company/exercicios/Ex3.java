package com.company.exercicios;

import javax.swing.*;
import java.util.Arrays;

public class Ex3 {

    public static void main(String[] args) {
        //Read 3 values in any order and write them to
        //ascending order;

            // Read three values from the user
            JOptionPane.showMessageDialog(null, "Enter three numbers: ");
            double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "First number:"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Second number:"));
            double num3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Third number:"));

            // Put the numbers into an array
            double[] nums = {num1, num2, num3};

            // Sort the array in ascending order
            Arrays.sort(nums);

            // Print the sorted numbers
            JOptionPane.showMessageDialog(null, "The numbers in ascending order are:");
            for (int i = 0; i < nums.length; i++) {
                JOptionPane.showMessageDialog(null, nums[i] + " ");
            }

    }
}
