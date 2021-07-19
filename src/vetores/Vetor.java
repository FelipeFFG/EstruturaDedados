package vetores;

import java.util.Arrays;


public class Vetor {

    private Aluno[] alunos = new Aluno[100];
    private int totalDeDalunos = 0;

    public void adiciona(Aluno aluno){
      this.garanteEspaco();
      this.alunos[totalDeDalunos] =aluno;
      totalDeDalunos++;
    }

    private boolean posicaoValida(int posicao){
        return posicao>=0 && posicao<=totalDeDalunos;
    }

    private void garanteEspaco(){
        if (totalDeDalunos == alunos.length){
            Aluno[] novoArray = new Aluno[alunos.length*2];
            for (int i = 0;i<alunos.length;i++){
                novoArray[i] = alunos[i];
            }
            this.alunos = novoArray;
        }

    }

    public void adiciona(int posicao,Aluno aluno){
        this.garanteEspaco();
        if (!posicaoValida(posicao)){
            throw new IllegalArgumentException("posicao Invalida");
        }
        for (int i = totalDeDalunos-1;i>=posicao;i-=1){
            alunos[i+1] = alunos[i];
        }
        alunos[posicao] = aluno;
        totalDeDalunos ++;
    }

    private boolean posicaoOcupada(int posicao){
       return posicao>=0 && posicao<totalDeDalunos;
    }

    public Aluno pega(int posicao){
        if (!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posicao invalida");
        }
        return alunos[posicao];
    }

    public void remove(int posicao){
        for (int i= posicao;i<this.totalDeDalunos-1;i++){
            this.alunos[i] = this.alunos[i+1];
        }
        totalDeDalunos --;
        this.alunos[totalDeDalunos] =null;

    }
    public boolean contem(Aluno aluno){
        for (int i = 0; i<totalDeDalunos;i++){
            if (alunos[i].equals(aluno)){
                return true;
            }
        }
        return false;
    }
    public int tamanho(){
        return totalDeDalunos;
    }

    public String toString(){
        return Arrays.toString(alunos);
    }
}

