package Agenda;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\uD83D\uDDD3 AGENDA \uD83D\uDDD3");
        System.out.println("");

        Scanner escolha = new Scanner(System.in);


        ArrayList<Main> tarefa = new ArrayList<>();
        ArrayList<Main> lembrete = new ArrayList<>();

        Evento eventoo = new Evento();
        Tarefa tarefaa= new Tarefa();


        System.out.println("O que você deseja agendar? Evento  ou Tarefa?");
        System.out.println("Digite 1- evento");
        System.out.println("Digite 2- tarefa");
        System.out.println("Digite 3- lembrete");

        int escolha1 = escolha.nextInt();


        switch(escolha1){
            case 1:
                eventoo.criarEvento();
            break;

            case 2:
                tarefaa.criarTarefa();
            break;

            default:
                System.out.println("opção inválida");

        }
    }

    //listaaq
}
