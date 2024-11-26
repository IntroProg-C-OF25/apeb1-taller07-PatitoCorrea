/***
 /* Realizar un programa Java que permita 
 * presentar en pantalla la siguiente secuencia: 5/10 10/12 15/14 20/16 25/18 30/20....
 */
import java.util.Scanner;
public class Problema2_Serie2 {
    public static void main(String[] args) {
        int cont = 0, num = 5,denom = 10, limite;
        Scanner tcl = new Scanner(System.in);
        System.out.print("INGRESE EL LIMITE: ");
        limite = tcl.nextInt();
        while (cont <= limite){
            System.out.print(num + "/" + denom + ",");
            num += 5;
            denom += 2;
        cont++;
      }
    }
}
/*** 
 * INGRESE EL LIMITE: 10
 * 5/10,10/12,15/14,20/16,25/18,30/20,35/22,40/24,45/26,50/28,55/30
 */
