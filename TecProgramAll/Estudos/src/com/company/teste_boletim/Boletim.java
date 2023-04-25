package com.company.teste_boletim;

import javax.swing.*;

public class Boletim {
    double n1;
    double n2;
    double media;

    //Construtor com parâmetros


    //Construtor sem parâmetros
    public Boletim(){
        this.n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a Nota 1: "));
        this.n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a Nota 2: "));
    }



    //Métodos
    //mostrará a situação do aluno
    void imprimeBoletim(){
        calculaMedia();
        JOptionPane.showMessageDialog(null, "Dados do Boletim: "+
                "\nNota 1: "+n1+
                "\nNota 2: "+n2+
                "\nMédia: "+media+
                "\nConceito: "+verificaConceito());
    }

    //calculará a media do aluno baseado nos dados inseridos
    void calculaMedia(){
        media = (n1+n2)/2;
    }

    //verificará o conceito do aluno baseado na média
    String verificaConceito(){
        String conceito = "";
        if (media >=8 && media <=10){
            conceito = "A";
        }
        else if (media >= 6){
            conceito ="B";
        }
        else if (media >= 4){
            conceito ="C";
        }
        else{
            conceito ="D";
        }
        return conceito;
    }


}
