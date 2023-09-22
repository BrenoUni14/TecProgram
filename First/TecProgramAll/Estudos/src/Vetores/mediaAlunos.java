package Vetores;
import  java.util.ArrayList;
import javax.swing.JOptionPane;

public class mediaAlunos {
    public static void main(String[] args){
        final int tam = 5;
        String[] nome = new String[tam];
        float[] nota = new float[tam];

        double soma = 0, media;

        for (int i = 0; i < tam; i++){
            nome[i] = JOptionPane.showInputDialog(null, "Digite o nome do "+ (i+1)+"° aluno");
            nota[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota do aluno: "+nome[i]));

            soma+= nota[i];
        }

        media =  soma / tam;

        for (int i = 0; i < tam; i++){
            if (nota[i] > media){
                JOptionPane.showMessageDialog(null, "Parabéns "+nome[i]+" você está acima da média!!!" );
            }
        }


    }
}
