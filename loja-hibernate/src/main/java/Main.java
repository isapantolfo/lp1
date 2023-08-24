import entity.Pessoa;
import entity.Endereco;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        Endereco e1 = new Endereco ("professor lins e silva", "sao paulo");
        Endereco e2 = new Endereco ("porto das dunas", "sao paulo");
        Endereco e3 = new Endereco ("25 de janeiro", "sao paulo");
//
//        Session session1 = HibernateUtil.getSessionFactory().openSession();
//
//        Transaction transaction1 = session1.beginTransaction();
//
//        session1.persist(e1);
//        session1.persist(e2);
//        session1.persist(e3);
//
//        List<Endereco> enderecos = session1.createQuery("from enderecos", Endereco.class).list();
//        System.out.println();
//        enderecos.forEach(e -> System.out.println(e));

        Pessoa p1 = new Pessoa ("leticia", "rudeli", " leticiapadraorudeli@gmail.com", e1);
        Pessoa p2 = new Pessoa ("isinha", "totolfo",  "isabellapretinhopantolfo@gmail.com", e2);
        Pessoa p3 = new Pessoa ("luquinhas", "moura", "lucaspalmiteiromoura@gmail.com", e3);

        Session session = HibernateUtil.getSessionFactory().openSession(); // criando sessão, pegando sessão, abrindo sessão

        Transaction transaction = session.beginTransaction(); // transação = varias acoes que eu posso realizar, abrindo uma ação

        session.persist(p1); //salvando p1 no bdd
        session.persist(p2);
        session.persist(p3);

        transaction.commit();

        List<Pessoa> pessoas = session.createQuery("from Pessoa", Pessoa.class).list();

        System.out.println();
        pessoas.forEach(p -> System.out.println(p)); // melhor jeito do forEach pra 1 linha - não precisa colocar o tipo da variavel p

        /*for (Pessoa p: pessoas) {
            System.out.println(p);
        }*/


    }
}
