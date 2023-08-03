package Agenda;
import java.util.ArrayList;
import java.util.Scanner;

public class Lembrete {
    private String nomeLembrete, data, horario, descricao;

    public Lembrete(String nomeLembrete, String data, String horario, String descricao) {
        this.nomeLembrete = nomeLembrete;
        this.data = data;
        this.horario = horario;
        this.descricao = descricao;
    }
    public Lembrete(){
    }

    public void criarLembrete(){

    {
        Scanner lembrete1 = new Scanner(System.in);

        System.out.println("Digite o nome do lembrete");
        String nomelembrete1 = lembrete1.next();

        System.out.println("Digite a data do lembrete");
        String datalembrete1 = lembrete1.next();

        System.out.println("Digite o horário do lembrete");
        String descricaolembrete = lembrete1.next();
    }

}

    public String getNomeLembrete() {
        return nomeLembrete;
    }

    public void setNomeLembrete(String nomeLembrete) {
        this.nomeLembrete = nomeLembrete;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void adiconarLembrete (ArrayList lembrete){
        lembrete.add(this.nomeLembrete);
        lembrete.add(this.data);
        lembrete.add(this.horario);
    }
}
