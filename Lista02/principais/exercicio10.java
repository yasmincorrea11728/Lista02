package principais;

import classes.ClasseEx10 ;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ClasseEx10 c = new ClasseEx10();


        System.out.print("Digite o nome do cliente: ");
        String nome = entrada.nextLine();
        c.setNome(nome);

        System.out.print("Digite o número da conta: ");
        String numero = entrada.nextLine();
        c.setNumero(numero);

        System.out.print("Digite o saldo: ");
        float saldo = entrada.nextFloat();
        c.setSaldo(saldo);

        int opcao = 0;
        do {
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Imprimir os dados da conta");
            System.out.println("0 - Sair");
            System.out.println("Digite uma opcao: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor que você deseja depositar: ");
                    float deposito = entrada.nextFloat();
                    c.Depositar(deposito);
                    break;
                case 2:
                    System.out.println("Digite o valor que você deseja sacar:");
                    float sacar = entrada.nextFloat();
                    c.Sacar(sacar);
                    break;
                case 3:
                    System.out.printf(" Nome do cliente: " + c.getNome() + ", Número da conta: " + c.getNumero() + ", Saldo: " + c.getSaldo() + "\n");
            }
        }
            while (opcao != 0) ;


        }
    }