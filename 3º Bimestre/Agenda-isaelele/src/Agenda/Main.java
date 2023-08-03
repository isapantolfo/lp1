package Agenda;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner escolha = new Scanner(System.in);

        ArrayList<Main> evento = new ArrayList<>();
        ArrayList<Main> tarefa = new ArrayList<>();
        ArrayList<Main> lembrete = new ArrayList<>();

        Evento eventoo = new Evento();


        System.out.println("O que você deseja agendar? Evento  ou Tarefa?");
        System.out.println("Digite 1- evento");
        System.out.println("Digite 2- tarefa");
        System.out.println("Digite 3- lembrete");

        int escolha1 = escolha.nextInt();

       if (escolha1==1){
           eventoo.criarEvento();
       }

       if(escolha1==2){

       }
       if(escolha1==3){

       }
        else
            System.out.println("Opção inválida");
    }

    //listaaq
}
