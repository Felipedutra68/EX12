package EX12;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX1_Notas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double[] set = new double[5];
        double n2 = 0;
        for (int i = 0; i < set.length; i++) {

            System.out.println("Digite as notas");
            set[i] = teclado.nextDouble();
            n2 += set[i];

        }

        double n3 = n2 / set.length;
        System.out.println("A media das notas eh : " + n3);

    }

}
