package recursividad_07;
/*
 * @author USER MARTINEZ DE LA CRUZ CARLOS
 */
public class RECURSIVIDAD_07 {

    public static void main(String[] args) {
        //numero a invertir
        int n = 1234;
        inv(n);
    }
//método que dado un número, lo imprime por pantalla invertido
//ejemplo: n = 1234 -> 4321

    static void inv(int n) {
        if (n < 10) {
            System.out.print(n);
        } else {
            System.out.print(n % 10);
            inv(n / 10);
        }

    }
}
