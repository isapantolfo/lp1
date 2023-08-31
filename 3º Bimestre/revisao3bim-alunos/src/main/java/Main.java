import entity.Aluno;
import entity.Nota;
import entity.Professor;
import entity.Turma;

import org.hibernate.Transaction;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;


//importando todos os pacotes referente as class, com *

public class Main {

    public static void main(String[] args) {
        Professor professor1 = new Professor("12345", "567.654.345-98", "Igor", "SP0987654");
        Professor professor2 = new Professor("6789", "482.542.473-54", "Motta", "SP2012953");

        List<Professor> professorList = new ArrayList<>();
        professorList.add(professor1);
        professorList.add(professor2);


        Nota nota1 = new Nota(new Turma(professor1, 700, "123"), 9.6);
        Nota nota2 = new Nota(new Turma(professor1, 900, "456"), 6.3);
        Nota nota3 = new Nota(new Turma(professor2, 1000, "789"), 8.5);
        Nota nota4 = new Nota(new Turma(professor2, 700, "111"), 6.7);


        List<Nota> notaList = new ArrayList<>();
        notaList.add(nota1);
        notaList.add(nota2);
        notaList.add(nota3);
        notaList.add(nota4);

        Aluno aluno1 = new Aluno("1234", "Isa", "SP3092526", 9.7);
        Aluno aluno2 = new Aluno("5678", "Lele", "SP3091805", 9.7);
        Aluno aluno3 = new Aluno("7316", "Luquinhas", "SP3092805", 9.7);


        List<Aluno> alunoList = new ArrayList<>();
        alunoList.add(aluno1);
        alunoList.add(aluno2);
        alunoList.add(aluno3);

        Turma turma1 = new Turma(professor1, 700, "12345");
        Turma turma2 = new Turma(professor2, 1000, "32579");

        turma1.setProfessor(professor1); //atribuindo professor1 a turma1
        turma1.setAlunos(alunoList);

        turma2.setProfessor(professor2);
        turma2.setAlunos(alunoList);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction(); //comecando transacao

        session.persist(turma1);
        session.persist(turma2);

        transaction.commit();//fechando transacao

        List<Turma> turmas_lista = session.createQuery("from Turma", Turma.class).list();

        for (Turma t : turmas_lista) {
            System.out.println(t);
        }

        System.out.println(turma1);
        System.out.println(turma2);

        System.out.println(turmas_lista.get(0));
    }


}
