package entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table (name="aluno")

public class Aluno {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @Column
    private String senha;

    @Column
    private String nome;
    @Column
    private String prontuario;
    @Column
    private double media;

    @OneToMany (cascade = CascadeType.ALL) //um aluno tem muitas notas
    @JoinTable (name="notas_do_aluno")
    private List<Nota> notas;

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

    @Override
    public String toString() {
        return "Aluno{" +
                "senha='" + senha + '\'' +
                ", nome='" + nome + '\'' +
                ", prontuario='" + prontuario + '\'' +
                ", media=" + media +
                ", notas=" + notas +
                '}';
    }
}
