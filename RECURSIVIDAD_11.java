package recursividad_11;
/*
 * @author USER MARTINEZ DE LA CRUZ CARLOS
 */
public class RECURSIVIDAD_11 {

    public static void main(String[] args) {
        //palabra analizada
        String s = "reconocer";
        if (palin(s)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }
    }
//método que comprueba si una palabra es un palíndromo
//ejemplo: reconocer -> true

    public static boolean palin(String frase) {
        frase = frase.toLowerCase();
        if (frase.length() <= 1) {
            return true;
        } else {
            if (frase.charAt(0) == frase.charAt(frase.length() - 1)) {
                return palin(frase.substring(1, frase.length() - 1));
            } else {
                return false;
            }
        }
    }
}
