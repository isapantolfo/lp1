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

    @ManyToMany (cascade = CascadeType.ALL) //muitos alunos, muitas notas
    @JoinTable (name="notas_do_aluno", joinColumns = @JoinColumn(name="id_notas"), inverseJoinColumns = @JoinColumn(name="id_aluno"))
    private List<Nota> notas = new ArrayList<>();

    public Aluno(String senha, String nome, String prontuario, double media) {
        this.senha = senha;
        this.nome = nome;
        this.prontuario = prontuario;
        this.media = media;
        this.notas = new ArrayList();
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


    public void add(Nota nota) {

        this.getNotas().add(nota);

        if (this.notas.size() == 1) {
            media = nota.getNota();
        } else {
            media = (media + nota.getNota()) / 2;
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", senha='" + senha + '\'' +
                ", nome='" + nome + '\'' +
                ", prontuario='" + prontuario + '\'' +
                ", media=" + media +
                ", notas=" + notas +
                '}';
    }
}
