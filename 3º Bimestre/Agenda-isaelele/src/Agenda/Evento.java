package Agenda;
import java.util.ArrayList;
import java.util.Scanner;

public class Evento {
    private String nomeEvento, datai, dataf, local, horarioi, horariof, descricao;

    public Evento(String nomeEvento, String dataf, String datai, String local, String horarioi,String horariof, String descricao) {
        this.nomeEvento = nomeEvento;
        this.dataf = dataf;
        this.datai = datai;
        this.local = local;
        this.horarioi = horarioi;
        this.horariof = horariof;
        this.descricao=descricao;
    }

    public Evento() {
    }

    public void criarEvento() {
        Scanner evento1 = new Scanner(System.in);


        System.out.println("Digite o nome do evento");
        String nomeevento1= evento1.next();

        System.out.println("Digite a data do evento, no formato: DD/MM/AAAA");
        String dataevento1= evento1.next();

        System.out.println("Digite o local do evento");
        String localevento1= evento1.next();

        System.out.println("Digite o horário do evento");
        String horarioevento1= evento1.next();
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getDatai() {
        return datai;
    }

    public void setDatai(String datai) {
        this.datai = datai;
    }

    public String getDataf() {
        return dataf;
    }

    public void setDataf(String dataf) {
        this.dataf = dataf;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getHorarioi() {
        return horarioi;
    }

    public void setHorarioi(String horarioi) {
        this.horarioi = horarioi;
    }

    public String getHorariof() {
        return horariof;
    }

    public void setHorariof(String horariof) {
        this.horariof = horariof;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void adiconarEvento (ArrayList evento){
        evento.add(this.nomeEvento);
        evento.add(this.datai);
        evento.add(this.dataf);
        evento.add(this.horarioi);
        evento.add(this.horariof);
        evento.add(this.descricao);

    }
}
