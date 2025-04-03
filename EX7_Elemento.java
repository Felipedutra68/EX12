package EX12;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX7_Elemento {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] set = new String[5];

        for (int i = 0; i < set.length; i++) {

            System.out.println("Digite uma palavra");
            set[i] = teclado.nextLine();

        }

        System.out.println("Qual palavra voce quer procurar");
        String n1 = teclado.nextLine();

        boolean cont1 = Arrays.asList(set).contains(n1);

        System.out.println("A Palavra " + n1 + " esta na lista? " + cont1);
    }

}
