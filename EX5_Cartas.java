package EX12;

import java.util.Arrays;

/**
 *
 * @author ADM
 */
public class EX5_Cartas {

    public static void main(String[] args) {

        String[] n1 = {"Copas", "Ouros", "Paus", "Espadas"};
        String[] n2 = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        String[] n3 = new String[52];

        int n4 = 0;

        for (String n7 : n1) {
            for (String n8 : n2) {

                n3[n4++] = n8 + "de" + n7;

            }

        }

        System.out.println(Arrays.toString(n3));

    }
    
}
