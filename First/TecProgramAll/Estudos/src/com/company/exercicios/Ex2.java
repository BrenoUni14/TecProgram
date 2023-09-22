package com.company.exercicios;

import javax.swing.*;

public class Ex2 {
    //Calculate the fine: Read the speed of a car and the
    //Maximum speed for the street:
    //1. Inform 50 reais if you are up to 10km/h above;
    //2. Enter 100 reais if you are between 11km/h and 30km/h above;
    //3. Inform 300 reais if you are above 31km/h;

    public static void main(String[] args) {


        double speedCar = Double.parseDouble(JOptionPane.showInputDialog(null, "Type the vehicle speed per hour: "));
        double maxSpeed = Double.parseDouble(JOptionPane.showInputDialog(null, "Type the road limit Speed: "));

        if (speedCar == maxSpeed || speedCar < maxSpeed){
            JOptionPane.showMessageDialog(null, "You're good to go!!");
        }
        else if(speedCar > maxSpeed + 10) {
            JOptionPane.showMessageDialog(null, "You have to pay R$ 50,00 for the illegal act");
        } else if (speedCar > maxSpeed + 11 && speedCar > maxSpeed + 30) {
            JOptionPane.showMessageDialog(null, "You have to pay R$ 100,00 for the illegal act");
        }
        else{
            JOptionPane.showMessageDialog(null, "You have to pay R$ 300,00 for the illegal act");
        }
    }
}
