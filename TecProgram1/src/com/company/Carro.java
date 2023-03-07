package com.company;

public class Carro {
    Motor m = new Motor();
    Roda r = new Roda();

    public void ligar(){
        System.out.println("Ligando!!!");
        m.ligar();
    }
}
