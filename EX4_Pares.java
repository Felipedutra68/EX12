package EX12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX4_Pares {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

         ArrayList<Integer> set1 = new ArrayList<>();
        
        int[] set = new int[5];

        for (int i = 1; i <= 5; i++) {

            System.out.println("Digite um numero");
            int n1 = teclado.nextInt();

            for (int nome2 : set) {
            
            set1.add(n1);
            }
        }

        set1.toArray();
        
        System.out.println("PARES\n " + set1);

      

    }

}
