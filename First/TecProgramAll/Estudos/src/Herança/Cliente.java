package Herança;

import javax.swing.*;

public class Cliente extends Pessoa{
    private float valorDivida;

    public Cliente(){}

    public Cliente(float valorDivida) {
        this.valorDivida = valorDivida;
    }

    public Cliente(String nome, String fone, float valorDivida) {
        super(nome, fone);
        this.valorDivida = valorDivida;
    }

    public float getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }

    @Override
    public void print() {
        super.print();
        JOptionPane.showMessageDialog(null, "\nValor Dívida: "+ valorDivida);
    }

    public float calculaJuros(float tx){
        return valorDivida*tx/100;
    }
}
