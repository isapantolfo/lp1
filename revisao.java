import java.io.PrintStream;
import java.util.Scanner;
public class revisao {

    public static void main(String[] args) {

        Scanner nome = new Scanner(System.in);

        double valor1, valor2, valor3 ;
        int opc;
        String[] nomes = new String[3];
        double[][] contas = new double[4][4];
        int contlin = 0 ;
        int contcol = 0;


        System.out.println("digite o primeiro nome:");
        nomes[0] = nome.next();

        System.out.println("digite o segundo nome:");
        nomes[1] = nome.next();

        System.out.println("digite o terceiro nome:");
        nomes[2] = nome.next();

        mostrarnome(nomes);

        int cont;

        for (cont = 0; cont < 4; cont++) {
            System.out.println("Digite um valor inteiro de opc:");
            opc = nome.nextInt();
            condicoes(opc, nomes);
        }

        System.out.println("digite o primeiro número");
        valor1= nome.nextDouble();

        System.out.println("digite o segundo número");
        valor2= nome.nextDouble();

        System.out.println("digite o tereiro número");
        valor3= nome.nextDouble();

        matrizcontas(contas, valor1, valor2, valor3, contlin, contcol);

    }

    public static void mostrarnome(String[] nomes) {
        System.out.println("nomes digitados: ");
        System.out.println(nomes[0] + " " + nomes[1] + " " + nomes[2]);
    }

    public static void condicoes(int opc, String[] nomes) {
        if (opc == 1) {
            System.out.println(nomes[0]);
        }

        if (opc >= 2 && opc <= 10) {
            System.out.println(nomes[1]);
        }
        if (opc > 10) {
            System.out.println(nomes[2]);
        }
        if (opc == 0) {
            System.out.println("opção inválida");
        }
    }

    public static void matrizcontas(double[][] contas, double valor1, double valor2, double valor3, int contlin, int contcol ) {
        for (contlin=1; contlin < 4; contlin++); {
            for (contcol=1; contcol < 4; contcol++);{
                System.out.println(contas[0][0]= 0);
                System.out.printf(String.valueOf(contas[0][1] = valor1));
                System.out.printf(String.valueOf(contas[0][2]= valor2));
                System.out.printf(String.valueOf(contas[0][3]= valor3));

                System.out.println(contas[1][0]= valor1);
                System.out.printf(String.valueOf(contas[1][1]=valor1*valor1));
                System.out.printf(String.valueOf(contas[1][2]= valor1-valor2));
                System.out.printf(String.valueOf(contas[1][3]= valor1-valor3));

                System.out.println(contas[2][0]= valor2);
                System.out.printf(String.valueOf(contas[2][1]=valor2-valor1));
                System.out.printf(String.valueOf(contas[2][2]= valor2*valor2));
                System.out.printf(String.valueOf(contas[2][3]= valor2-valor3));

                System.out.println(contas[3][0]= valor3);
                System.out.printf(String.valueOf(contas[3][1]=valor3-valor1));
                System.out.printf(String.valueOf(contas[3][2]= valor3*valor2));
                System.out.printf(String.valueOf(contas[3][3]= valor3*valor3));



            }

        }

        }
    }