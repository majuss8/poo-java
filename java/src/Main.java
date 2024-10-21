import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Aluno alunos [] = new Aluno[100];
        ArrayList <Aluno> alunosA = new ArrayList<>();
        Aluno q = new Aluno();
        alunosA.add(q);
        alunosA.add(0, new Aluno()); // empurra a var que estava no indice 0

        alunosA.size();
        alunosA.contains(q); // true ou false

        alunosA.indexOf(q);

        alunosA.isEmpty(); // esta vazio?
        alunosA.get(0); // alunos[0]
        alunosA.remove(q); // retira o objeto da arraylist
        alunosA.remove(0); // remove a partir do indice

        for (int i = 0; i < alunosA.size(); i++) {
            System.out.println(alunosA.get(i));
        }

        for (Aluno aux: alunosA){ // aux = alunosA.get(0);
            System.out.println(aux);  // for que percorre a array de ponta a ponta
            if (aux.curso.equals("ADS")){
                System.out.println("Aluno de ADS");
            }
        }

        for (Aluno aux:alunos) {

        }
    }
}