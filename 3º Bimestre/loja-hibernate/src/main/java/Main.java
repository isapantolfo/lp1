import entity.Pedido;
import entity.Pessoa;
import entity.Endereco;
import entity.Produtos;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        gerenciarPedido();
    }

    public static void gerenciarPedido(){

        Pessoa pessoa1 = new Pessoa ("lelet", "rudeli", " leticiapadraorudeli@gmail.com", new Endereco("iwr", "dh"));
        Pessoa pessoa2 = new Pessoa ("isinha", "totolfo",  "isabellapretinhopantolfo@gmail.com", new Endereco("Porto das Dunas", "São-Paulo"));
        Pessoa pessoa3 = new Pessoa ("luquinhas", "moura", "lucaspalmiteiromoura@gmail.com", new Endereco("25 de Janeiro","São Paulo"));

        Session session = HibernateUtil.getSessionFactory().openSession(); // criando sessão, pegando sessão, abrindo sessão

        Transaction transaction = session.beginTransaction(); // transação = varias acoes que eu posso realizar, abrindo uma ação

        session.persist(pessoa1); //salvando pessoa1 no bdd
        session.persist(pessoa2);
        session.persist(pessoa3);

        transaction.commit();

        List<Pessoa> pessoas = session.createQuery("from Pessoa", Pessoa.class).list();

        pessoas.forEach(p -> System.out.println(p));

        Produtos produto1=new Produtos("jaqueta", 135.00);
        Produtos produto2= new Produtos("blusa", 50.00);
        Produtos produto3= new Produtos("camiseta", 70.00);


        Pedido pedido1= new Pedido(pessoa1, Arrays.asList(produto1, produto2));
        Pedido pedido2= new Pedido(pessoa2, Arrays.asList(produto2));
        Pedido pedido3= new Pedido(pessoa3, Arrays.asList(produto3));

        transaction = session.beginTransaction(); // transação = varias acoes que eu posso realizar, abrindo uma ação

        session.persist(pedido1);
        session.persist(pedido2);
        session.persist(pedido3);

        transaction.commit();

        List<Pedido> pedidos = session.createQuery("from Pedido", Pedido.class).list();

        pedidos.forEach(p -> System.out.println(p));
    }
}
