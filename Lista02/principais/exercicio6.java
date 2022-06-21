package principais;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {

        Scanner raiz = new Scanner(System.in);

        int i = 0;

        while(i < 10){
            System.out.printf("Digite um número:");
            double num = raiz.nextDouble();
            System.out.printf("A raiz quadrada de " + num + " é igual a " + Math.sqrt(num) + "\n");
            i += 1;
        }



    }
}