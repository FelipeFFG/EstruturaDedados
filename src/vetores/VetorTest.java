package vetores;

public class VetorTest {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("joao");
        Aluno a2 = new Aluno("josé");

        Aluno a4 = new Aluno("Marcos");
        Aluno a5 = new Aluno("Antollena");

        Vetor lista = new Vetor();
        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a4);
        lista.adiciona(a5);

        System.out.println(lista);
        System.out.println(lista.tamanho());
        System.out.println(lista.contem(a1));

        Aluno a3 = new Aluno("Danilo");
        System.out.println(lista.contem(a3));

       // vetores.Aluno x = lista.pega(158);
       // System.out.println(x);

        lista.adiciona(1,a3);
        System.out.println(lista);


        lista.remove(3);
        System.out.println(lista);
        for (int i =0; i<300;i++){
            Aluno y = new Aluno("joao" +i);
            lista.adiciona(y);
        }
        System.out.println(lista);



    }
}
