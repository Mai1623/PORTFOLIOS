
import java.util.Scanner;

/**
 * Calcula el precio de una entrada de cine
 * según la edad del cliente.
 */
public class Ejercicio27 {

    /**
     * Lee los datos del cliente y muestra la tarifa correspondiente.
     */
    public static void main(String[] args) {

        // Crear Scanner para leer datos por teclado
        Scanner teclado = new Scanner(System.in);

        // Solicitar el nombre del cliente
        System.out.println("Introduce tu nombre: ");
        String nombreCliente = teclado.nextLine();

        // Solicitar la edad del cliente
        System.out.println("Introduce tu edad: ");
        int edadCliente = teclado.nextInt();

        // Calcular el precio mediante el operador ternario
        double precio = edadCliente < 12 ? 5.0 : 8.0;

        // Mostrar los datos del cliente
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Edad: " + edadCliente);
        System.out.println("Precio entrada: " + precio + " €");

        // Cerrar Scanner
        teclado.close();
    }
}
