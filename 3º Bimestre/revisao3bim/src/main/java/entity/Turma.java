package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity //roma a classe uma entidade visível ao Entity manager
@Table(name="turma") //Define a tabela de armazenamento, caso seja necessário.




public class Turma {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @GeneratedValue-geração automática do valor do atribute
    //IDENTITY- (auto increment)
    @Id  //identifica a propriedade que representa a chave primária da tabela
    @Column //configura o nome da coluna em que será armazenada a propriedade.
    private long id;
    @Column
    private String codigo;
    @Column
    private int horario;
    @ManyToMany(cascade = CascadeType.ALL) //muitos alunos podem ter muitas turmas (pensando em materias)
    @JoinTable(name = "alunos_das_turmas")
    private List<Aluno> alunos = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL) //um professor pode ter varias turmas
    @JoinColumn(name = "professor_turma")

    private Professor professor;
    public Turma(Professor professor, int horario, String codigo) {
        this.professor = professor;
        this.horario = horario;
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

    @Override
    public String toString() {
        return "Turma{" +
                "codigo='" + codigo + '\'' +
                ", horario=" + horario +
                ", alunos=" + alunos +
                ", professor=" + professor +
                '}';
    }
}
