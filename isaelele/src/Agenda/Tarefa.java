package Agenda;
import java.util.ArrayList;
import java.util.Scanner;

public class Tarefa {
    private String nomeTarefa, data, descricao;

    public Tarefa(String nomeTarefa, String data, String horario, String descricao) {
        this.nomeTarefa = nomeTarefa;
        this.data = data;
        this.descricao=descricao;
    }

    public Tarefa(){
    }

    public void criarTarefa(){

        Scanner tarefa1 = new Scanner(System.in);

        System.out.println("Digite o nome da tarefa");
        String nometarefa1 = tarefa1.next();

        System.out.println("Digite a data do evento, no formato: DD/MM/AAAA");
        String datatarefa1= tarefa1.next();

        System.out.println("Digite a descrição do evento");
        String desctarefa1 = tarefa1.next();

    }

    Scanner tarefa1= new Scanner(System.in);

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void criarTarefa(ArrayList tarefa){
        tarefa.add(this.nomeTarefa);
        tarefa.add(this.data);
    }
}