import java.util.Scanner;

/**
 * Programa que lee varias notas, comprueba si son válidas y muestra
 * la calificación correspondiente. Termina cuando se introduce -1.
 * @author Maitane Navarro
 */
public class ControlNotas {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota = 0;
        int suma = 0;
        int cantidad = 0;

        // Repetimos hasta que se introduzca -1.
        while (nota != -1) {
            System.out.print("Introduce una nota (0-10) o -1 para terminar: ");
            nota = teclado.nextInt();

            if (nota == -1) {
                break;
            }

            // Comprobamos que la nota esté entre 0 y 10.
            if (nota < 0 || nota > 10) {
                System.out.println("La nota no es válida.");
                continue;
            }

            // Clasificamos la nota.
            if (nota < 5) {
                System.out.println("Insuficiente");
            } else if (nota == 5) {
                System.out.println("Suficiente");
            } else {
                switch (nota) {
                    case 6:
                        System.out.println("Bien");
                        break;
                    case 7:
                    case 8:
                        System.out.println("Notable");
                        break;
                    case 9:
                    case 10:
                        System.out.println("Sobresaliente");
                        break;
                    default:
                        System.out.println("Nota no válida.");
                        break;
                }
            }

            suma = suma + nota;
            cantidad++;
        }

        if (cantidad > 0) {
            double media = (double) suma / cantidad;
            System.out.println("Notas válidas: " + cantidad);
            System.out.println("Suma: " + suma);
            System.out.println("Media: " + media);
        } else {
            System.out.println("No se han introducido notas válidas.");
        }

        teclado.close();
    }
}
