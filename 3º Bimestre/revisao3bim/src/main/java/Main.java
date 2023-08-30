import entity.Aluno;
import entity.Nota;
import entity.Professor;
import entity.Turma;

import org.hibernate.Transaction;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;


//importando todos os pacotes referente as class, com *

public class Main {

    public static void main(String[] args) {


       Professor professor1 = new Professor("12345", "567.654.345-98", "Igor", "SP0987654");
       Professor professor2 = new Professor("6789", "482.542.473-54", "Luk", "SP2012953");

       Aluno aluno1 = new Aluno("14565", "Isabella", "SP3091805", 0.0);
       Aluno aluno2 = new Aluno("14505", "Isabela", "SP3092805", 0.0);

       Turma turma1 = new Turma(professor1, 0700, "4627");
       Turma turma2 = new Turma(professor2, 1200, "4536");

       Nota nota1 = new Nota(turma1, 7.3);
       Nota nota2 = new Nota(turma1, 7.8);
       Nota nota3 = new Nota(turma1, 8.7);
       Nota nota4 = new Nota(turma1, 5.7);

       aluno1.add(nota1, nota2, nota3, nota4);
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();



    }
}
