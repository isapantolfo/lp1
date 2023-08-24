package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity()
@Table(name = "pedido")

    public class Pedido {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int Id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;
    @ManyToMany(cascade= CascadeType.ALL)
    @JoinTable(name="pedido_produto",
            joinColumns = @JoinColumn(name="prdutos_id"), //coloca a coluna que representa a tabela que estamos, no caso, dados do pedido
            inverseJoinColumns = @JoinColumn(name="produtos_id") //tabela de relaionamento
    )
    private List<Produtos> produtos;

    public Pedido(Pessoa pessoa)
    {
        this.pessoa = pessoa;
    }

    public Pedido(Pessoa pessoa, List<Produtos> produtos) {
        this.pessoa = pessoa;
        this.produtos = produtos;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "Id=" + Id +
                ", pessoa=" + pessoa +
                ", produtos=" + produtos +
                '}';
    }
}
