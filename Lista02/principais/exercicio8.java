package principais;

import classes.ClasseEx8;

import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ClasseEx8 cont = new ClasseEx8();
        int comando;

        do {
            System.out.println("1 - Zerar valor");
            System.out.println("2 - Incrementar valor");
            System.out.println("3 - Obter valor");
            System.out.println("0 - Sair");
            System.out.print("Digite uma opcao: ");
            comando = entrada.nextInt();

            switch (comando) {
                case 1:
                    cont.Zerar();
                    System.out.println("Zerando o contador: " +cont.Zerar());
                    break;
                case 2:
                    System.out.println("Incrementando valor : " +cont.Incrementar() );
                    break;

                case 3:
                    cont.ObterValor();
                    System.out.println("Retornando Valor : " +cont.ObterValor() );
                    break;
            }
        }
        while (comando != 0) ;

    }
}