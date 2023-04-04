package Herança;

import javax.swing.*;

public class Fornecedor extends Pessoa{
    private float valorCompra;
    Fornecedor(){}

    public Fornecedor(String nome, String fone, float valorCompra) {
        super(nome, fone);
        this.valorCompra = valorCompra;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    @Override
    public void print() {
        super.print();
        JOptionPane.showMessageDialog(null, "\nValor Compra: "+valorCompra);
    }

    public void calculaImpostos( float imposto){
        valorCompra+= valorCompra*imposto/100;
    }
}
