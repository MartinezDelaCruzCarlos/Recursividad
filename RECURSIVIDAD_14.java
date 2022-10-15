package recursividad_14;
/*
 * @author USER MARTINEZ DE LA CRUZ CARLOS
 */
public class RECURSIVIDAD_14 {

    public static void main(String[] args) {
        //valor del número analizado
        int num = 4121;

        //creciente
        if (ordenado_cre(num)) {
            System.out.println("Está ordenado de forma creciente");
        } else {
            System.out.println("NO está ordenado de forma creciente");
        }

        //decreciente
        if (ordenado_decre(num)) {
            System.out.println("Está ordenado de forma decreciente");
        } else {
            System.out.println("NO está ordenado de forma decreciente");
        }
    }
//obtiene base elevado a exp

    static int poten(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else {
            return base * poten(base, exp - 1);
        }
    }
//obtiene la cantidad de dígitos de num

    static int digitos(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + digitos(num / 10);
    }
//comprueba si un num está ordenado de forma creciente
//ejemplo: num = 1234 -> true

    static boolean ordenado_cre(int num) {
        if (num < 10) {
            return true;
        } else {
            int num_izq = num / poten(10, digitos(num) - 1);
            num = num - num_izq * poten(10, digitos(num) - 1);
            int num_der = num / poten(10, digitos(num) - 1);
            if (num_izq <= num_der) {
                return ordenado_cre(num);
            } else {
                return false;
            }
        }
    }
//comprueba si un num está ordenado de forma decreciente
//ejemplo: num = 4321 -> true

    static boolean ordenado_decre(int num) {
        if (num < 10) {
            return true;
        } else {
            int num_izq = num / poten(10, digitos(num) - 1);
            num = num - num_izq * poten(10, digitos(num) - 1);
            int num_der = num / poten(10, digitos(num) - 1);
            if (num_izq >= num_der) {
                return ordenado_decre(num);
            } else {
                return false;
            }
        }
    }
}

