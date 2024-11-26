/***
 *Generar un programa Java que permita ingresar 4 estudiantes; 
 * por cada uno de ellos ingresar el nombre del estudiante, el promedio de ciclo. 
 * Presentar el siguiente reporte
 * Estudiante 1	10	Aprobado
 * Estudiante 2	6.9	Reprobado
 * Estudiante 3	7	Aprobado
 * Estudiante 4	5	Reprobado
 * Atención; con base al valor del promedio, usted debe asignar en cada 
 * registro el tipo Aprobado o Reprobado.
 */
import java.util.Scanner;
public class Problema5_EstudianteReporte {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, estado;
        double promedio;
        int cont = 1;
        while (cont <= 4){
            System.out.print("DAME EL NOMBRE DEL ESTUDIANTE Y PROMEDIO DEL EST_" + cont + ":");
            nombre = tcl.nextLine(); promedio = tcl.nextDouble();
            if (promedio < 6.5)
                estado = "Reprobado";
            else
                estado = "Aprobado";
            System.out.printf("| %s | %s | %s |\n","NOMBRE","PROMEDIO","ESTADO");
            System.out.printf("| %s | %.2f | %s |\n",nombre,promedio,estado);
            cont++;
            System.out.println("");
        }
    }
}
 /***
 * DAME EL NOMBRE DEL ESTUDIANTE Y PROMEDIO DEL EST_1: Manuel 10
 * | NOMBRE | PROMEDIO | ESTADO |
 * | Manuel | 10,00 | Aprobado |
 */