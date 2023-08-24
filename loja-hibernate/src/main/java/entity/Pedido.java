package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity()
@Table(name = "pedido")

    public class Pedido {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int Id;
    @Column
    private String pessoa;
    private List<Produtos> produtos = new ArrayList<>();

    public Pedido(String pessoa) {
        this.pessoa = pessoa;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }
}
