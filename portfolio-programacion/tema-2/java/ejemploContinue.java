/** Ejemplo de un bucle que salta el número cinco.
 * @author Maitane Navarro
 */
public class ejemploContinue {

    /** Muestra los números del 1 al 10 excepto el 5.
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
