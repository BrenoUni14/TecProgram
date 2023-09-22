package Vetores;

import javax.swing.*;
import java.text.DecimalFormat;

public class mediaTemperatura {
    public static void main(String[] args){
        //instânciando variáveis
        final int tam = 7;
        int temp[] = new int [tam];
        int diaAcima = 0, diaAbaixo = 0;
        double soma = 0, media;

        for (int i = 0; i < tam; i++){
            temp[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a temperatura do "+ (i+1)+"° dia"));

            soma += temp[i];
        }

        media = soma / tam;

        //Simplificando o resultado decimal da média
        DecimalFormat df = new DecimalFormat("#.##");
        String numsimplificado = df.format(media);

        for (int i = 0; i < tam; i++){
            if (temp[i] > media){
                diaAcima++;
            }
            else {
                diaAbaixo++;
            }
        }

        JOptionPane.showMessageDialog(null,"A média da temperatura semanal é: "+ numsimplificado);
        JOptionPane.showMessageDialog(null,"A quantidade de números acima da média é de "+ diaAcima+" dias");
        JOptionPane.showMessageDialog(null,"A quantidade de números abaixo da média é de "+ diaAbaixo+" dias");

    }
}
