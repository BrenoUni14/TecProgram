package com.company;

public class Main {

    public static void main(String[] args) {
	int a = 10;
    double x = 3.14;
    String t = "texto";

    Carro c1 =  new Carro();
    Carro c2 = new Carro();
    Carro c3 = c2;

    c2.r.expessura = 145;
    c2.r.peso = 5;

    c3.ligar();

        System.out.println("Fim");

    }
}
