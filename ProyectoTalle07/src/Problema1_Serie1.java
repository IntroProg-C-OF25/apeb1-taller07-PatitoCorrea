/***
/*Realizar un programa Java que permita presentar en pantalla 
la siguiente secuencia: 1/10, 2/11, 3/12, 4/13, 5/14, 6/15, ....."
*/
import java.util.Scanner;
public class Problema1_Serie1 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int cont = 1, limite;
        System.out.print("DAME EL LIMITE: ");
        limite = tcl.nextInt();
        while (cont <= limite){
            System.out.print(cont + "/" + (cont + 9) + ", ");
            cont++;
        }
        System.out.println("");
    }    
}
/***
 * DAME EL LIMITE: 10
 * 1/10, 2/11, 3/12, 4/13, 5/14, 6/15, 7/16, 8/17, 9/18, 10/19
 */

