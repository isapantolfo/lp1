package entity;

import jakarta.persistence.*;

@Entity
@Table
public class Nota {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Turma turma;
    private double nota;

    public Nota(Turma turma, double nota) {
        this.turma = turma;
        this.nota = nota;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
