package EX12;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX2_Inverter {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] set = new String[1];

        for (int i = 0; i < set.length; i++) {

            System.out.println("Digite uma palavra");
            set[i] = teclado.nextLine();

            String n1 = new StringBuilder(set[i]).reverse().toString();
            System.out.println(n1);

                    }
                      
                      
        }

    }

    

