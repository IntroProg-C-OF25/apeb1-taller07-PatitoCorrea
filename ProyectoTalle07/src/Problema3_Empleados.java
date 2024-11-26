
/** *
 * Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados.
 * Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo del día trabajo.
 * Calcular el valor a cancelar por la empresa para cada empleado. Presentar un reporte como el siguiente:
 * Nombre 1	10	$2.5     $25
 * Nombre 2	11	$2	 $22
 * Nombre 3	9	$3	 $27
 * Nombre 4	5	$4 	 $20
 * Nombre 5	12	$2	 $24
 */
import java.util.Scanner;

public class Problema3_Empleados {

    public static void main(String[] args) {
        String Nombre;
        int cont = 1;
        double costoDT, costoTP, numDT;
        Scanner tcl = new Scanner(System.in);
        while (cont <= 5) {
            System.out.println("Ingrese el nombre del empleado: ");
            Nombre = tcl.nextLine();
            System.out.println("Ingrese el numero de dias trabajados: ");
            numDT = tcl.nextInt();
            System.out.println("Ingrese el costo por dia trabajado: ");
            costoDT = tcl.nextDouble();
            costoTP = numDT * costoDT;
            cont++;
            System.out.println("\nReporte de Empleados:");
            System.out.printf("| %s | %s | %s | %s |\n", "Nombres", "Num_dias trabajados", "Cost_Dias Trabajados", "CostoT a Pagar");
            System.out.printf("| %s | %.2f | %.2f | %.2f |\n", Nombre, numDT, costoDT, costoTP);
            cont++;
            }
        }

    }

