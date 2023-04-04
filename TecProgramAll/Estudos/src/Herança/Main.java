package Herança;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Breno", "40028922", 135.75f);
        c1.print();
        JOptionPane.showMessageDialog(null, "Juros: "+ c1.calculaJuros(12.25f));

        Fornecedor f1 = new Fornecedor("Claibson", "123456789", 1500.89f);
        f1.calculaImpostos(12.5f);
        f1.print();

    }
}
