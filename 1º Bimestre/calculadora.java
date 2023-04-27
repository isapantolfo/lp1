import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opc;
        conta();
        System.out.println("");
        System.out.println("deseja continuar usando a calculadora?");
        System.out.println("1- SIM // 2- NÃo");
        opc = scan.nextInt();

        while (opc == 1) {
            conta();
        }
        if (opc == 2) {
            System.out.println("Obrigada!");
        }


    }

    private static void conta() {
        Scanner scan = new Scanner(System.in);

        double n1, n2, resultado;

        System.out.println("");
        System.out.println("Com qual operador deseja realizar sua operação?");
        System.out.println("+ para soma");
        System.out.println("- para subtração");
        System.out.println("* para subtração ");
        System.out.println("/ para divisão");
        char opc = scan.next().charAt(0);

        while (opc != '+' && opc != '-' && opc != '*' && opc != '/') {
            System.out.println("operador inválido.");
            System.out.println("");
        }

        System.out.println("");
        System.out.println("digite o primeiro número");
        n1 = scan.nextDouble();

        System.out.println("digite o segundo número");
        n2 = scan.nextDouble();


            switch (opc) {
                case '+':
                    resultado = n1 + n2;
                    System.out.println("resultado da soma= " + resultado);
                    break;

                case '-':
                    resultado = n1 - n2;
                    System.out.println("resultado da subtração= " + resultado);
                    break;

                case '*':
                    resultado = n1 * n2;
                    System.out.println("resultado da multiplicação= " + resultado);
                    break;

                case '/':
                    resultado = n1 / n2;
                    System.out.println("resultado da divisão= " + resultado);
                    break;
            }
        }
    }



