package principais;

import classes.ClasseEx9;

import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {

        ClasseEx9 l = new ClasseEx9();
        Scanner entrada = new Scanner(System.in);
        int comando;

        System.out.println("O estado atual da lâmpada:");
        l.Estadol();

        do {
            System.out.println("1 - Ligar a lâmpada");
            System.out.println("2 - Desligar a lâmpada");
            System.out.println("3 - Ver o estado da lâmpada");
            System.out.println("0 - Sair");
            System.out.println("Digite uma opcao: ");
            comando = entrada.nextInt();

            switch (comando) {
                case 1:
                    l.Acender();
                    System.out.println("Lâmpada ligada💡 \n");
                    break;
                case 2:
                    l.Apagar();
                    System.out.println("Lâmpada desligada\n ");
                    break;

                case 3:
                    l.Estadol();
                    break;
            }
            }
            while (comando != 0) ;
        }
    }