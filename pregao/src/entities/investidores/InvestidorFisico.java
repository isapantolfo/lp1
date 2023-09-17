package entities.investidores;

import entities.Carteira;
import estruturas_de_dados.lista.ListaEncadeada;

public class InvestidorFisico extends Investidor{
    private String cpf;

    public InvestidorFisico(int id, String nome, double saldo, ListaEncadeada<Carteira> carteiras, String cpf) {
        super(id, nome, saldo, carteiras);
        this.setCpf(cpf);
    }
    
    public String getCpf() {

        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean validarCpf(){
        String cpfValidando = getCpf();
        int mult = 2;
        for(int i = 0; i < cpfValidando.length(); i ++){
            int chart = cpfValidando.charAt(i);
            int conta  = chart * mult;
            mult++;  
        }
        
        return false;
    }
}
