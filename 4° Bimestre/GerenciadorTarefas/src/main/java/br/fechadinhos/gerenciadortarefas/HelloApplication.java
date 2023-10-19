package br.fechadinhos.gerenciadortarefas;

import br.fechadinhos.gerenciadortarefas.model.Usuario;
import br.fechadinhos.gerenciadortarefas.utill.HibernateUtil;
import javafx.animation.Transition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void init() throws Exception {

        Usuario user1 = new Usuario("isabella", "pantolfo", "pantolfoo","123");
        Usuario user2 = new Usuario("leticia", "abreu", "lele","456");


        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(user1);
        session.persist(user2);

        transaction.commit();

        Usuario usuario1 = session.get(Usuario.class, 1);
        System.out.println(usuario1);

        Usuario usuario2 = session.get(Usuario.class, 2);
        System.out.println(usuario2);
    }

    public static void main(String[] args) {
        launch();
    }
}