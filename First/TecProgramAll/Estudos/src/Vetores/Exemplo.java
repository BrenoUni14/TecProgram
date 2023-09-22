package Vetores;

public class Exemplo {

    public static void main(String[] args) throws Exception {
        Vetor2 vetor = new Vetor2(5);

        try{
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
            vetor.adiciona("elemento 4");
            vetor.adiciona("elemento 5");
            vetor.adiciona("elemento 6");
            vetor.adiciona("elemento 7");
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());

        System.out.println("");
        System.out.println(vetor.adicionaLugar(0, "elemento 0"));
        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());

        System.out.println("");
        System.out.println(vetor.busca(1));
        System.out.println(vetor.busca1("elemento 3"));

        System.out.println("");
        vetor.removeLugar(4);
        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());


    }
}
