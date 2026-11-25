/** Ejemplo de un bucle que termina al llegar al número cinco.
 * @author Maitane Navarro
 */
public class ejemploBreak {

    /** Recorre los números del 1 al 10 y se detiene al llegar al 5.
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
