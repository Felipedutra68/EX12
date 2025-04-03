package EX12;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX4_Pares {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] set = new int[5];

        for (int i = 1; i <= 5; i++) {

            System.out.println("Digite um numero");
            set[i] = teclado.nextInt();

        }

        System.out.println("Pares presentes");

        for (int nome2 : set) {
            if (nome2 % 2 == 0) {
               
                System.out.println(nome2);
            }
        }

    }

}
