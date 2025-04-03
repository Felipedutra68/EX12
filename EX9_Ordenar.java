package EX12;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX9_Ordenar {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] set = new int[5];

        for (int i = 0; i < set.length; i++) {

            System.out.println("Digite um numero");
            set[i] = teclado.nextInt();

        }

        Arrays.sort(set);

        for (Integer nome2 : set) {

            System.out.println(nome2);

        }

    }
}
