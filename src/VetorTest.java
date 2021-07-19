public class VetorTest {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("joao");
        Aluno a2 = new Aluno("josé");

        Vetor lista = new Vetor();
        lista.adicionar(a1);
        lista.adicionar(a2);

        System.out.println(lista);
    }
}
