package Pessoa;

public class TesteApp {

    public static void main(String args[]) {

        FactoryPessoa factory = new FactoryPessoa();
        String nome = "Carlos";
        String sexo = "M";

        factory.getPessoa(nome, sexo);

        System.out.println("e");

        FactoryPessoa factory2 = new FactoryPessoa();
        String nome2 = "Angela";
        String sexo2 = "F";

        factory2.getPessoa(nome2, sexo2);

    }

}
