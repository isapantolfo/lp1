import estruturas_de_dados.fila.Fila;
import estruturas_de_dados.lista.ListaEncadeada;
import estruturas_de_dados.pilha.Pilha;
import estruturas_de_dados.arvore.Arvore;


public class Main{ 
    public static void main(String[] args) {
        Arvore<Integer> arvore = new Arvore<Integer>();
        arvore.addElemento(10);
        arvore.addElemento(7);
        arvore.addElemento(5);
        arvore.addElemento(15);
        arvore.ordemCrescente(arvore.getRaiz());
    }
}