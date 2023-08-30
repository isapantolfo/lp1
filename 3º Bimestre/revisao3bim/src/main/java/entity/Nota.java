package entity;

import jakarta.persistence.*;

@Entity
@Table (name="boletim")
public class Nota {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private long id;
    @Column
    private double nota;
    @ManyToOne (cascade= CascadeType.ALL)
    @JoinColumn (name ="notas_das_turmas")
    private Turma turma;


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

    @Override
    public String toString() {
        return "Nota{" +
                "nota=" + nota +
                ", turma=" + turma +
                '}';
    }
}
