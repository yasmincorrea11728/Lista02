package principais;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {

        Scanner agenda = new Scanner(System.in);

        int opcao = 0;
        do {
            System.out.println("----------Menu-----------");
            System.out.println("| 1 - Adicionar contato |");
            System.out.println("| 2 - buscar contato    |");
            System.out.println("| 3 - remover contato   |");
            System.out.println("| 4 - editar contato    |");
            System.out.println("| 0 - Sair              |");
            System.out.println("-------------------------");
            System.out.println("Digite uma opção: ");
            opcao = agenda.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Me diga o número de telefone: ");
                    int contato = agenda.nextInt();
                    break;
                case 2:
                    System.out.println("Procure o número de telefone: ");
                    int buscar = agenda.nextInt();
                    break;
                case 3:
                    System.out.println("Remover contato: ");
                    int remover = agenda.nextInt();
                    break;
                case 4:
                    System.out.println("Editar contato: ");
                    int editar = agenda.nextInt();
                    break;
            }
        }while (opcao != 0);
    }
}