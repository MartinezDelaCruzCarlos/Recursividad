package recursividad_12;
/*
 * @author USER MARTINEZ DE LA CRUZ CARLOS
 */
public class RECURSIVIDAD_12 {

    public static void main(String[] args) {
        //número a convertir
        int N = 10;
        binario(N);
        System.out.println();
        System.out.println(binario2(N));
    }
//solución1: método que imprime por pantalla n en binario

    public static void binario(int n) {
        if (n < 2) {
            System.out.print(n);
        } else {
            binario(n / 2);
            System.out.print(n % 2);
        }
    }
//solución2: método que devuelve el binario de n

    public static int binario2(int n) {
        if (n < 2) {
            return n;
        } else {
            return n % 2 + 10 * binario2(n / 2);
        }
    }
}
