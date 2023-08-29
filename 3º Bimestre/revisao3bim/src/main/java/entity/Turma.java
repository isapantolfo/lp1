package entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table
public class Turma {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Professor professor;
    private int horario;
    private List<Aluno> alunos;
    private String codigo;

    public Turma(Professor professor, int horario, String alunos, String codigo) {
        this.professor = professor;
        this.horario = horario;
        this.alunos = alunos;
        this.codigo = codigo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
