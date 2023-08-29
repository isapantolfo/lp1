import entity.Aluno;
import entity.Nota;
import entity.Professor;
import entity.Turma;

public class Main {

    public static void main(String[] args) {


       Professor professor1 = new Professor("12345", "567665434598", "Igor", "sp0987654");

       Aluno aluno1 = new Aluno("14565", "Isabella", "sp3091805", 0.0);
       Aluno aluno2 = new Aluno("14505", "Isabela", "sp3092805", 0.0);

       Turma turma1 = new Turma(professor1, 0700, "uj", "390787");

       Nota nota1 = new Nota(turma1, 0.0);


    }
}
