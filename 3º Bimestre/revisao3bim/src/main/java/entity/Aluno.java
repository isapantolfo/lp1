package entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table
public class Aluno {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String senha;
    private List<Nota> notas = new ArrayList<>();
    private String nome;
    private String prontuario;
    private double media;

    public Aluno(String senha, String nome, String prontuario, double media) {
        this.senha = senha;
        this.nome = nome;
        this.prontuario = prontuario;
        this.media = media;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
