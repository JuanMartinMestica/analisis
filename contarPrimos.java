
public class contarPrimos {

    //fuerza bruta
    public static void main(String[] args) {

        int n = 10, cantPrimos = 0;

        //para cada numero
        for (int i = 2; i < n; i++) {

            if (esPrimo(i)) {

                cantPrimos++;

            }

        }

        System.out.println("Hay en total: " + cantPrimos);
    }

    public static boolean esPrimo(int numero) {

        boolean esPrimo = true, seguir = true;
        int i = 2;

        while (seguir && i < numero) {

            if (numero % i == 0) {

                esPrimo = false;
                seguir = false;

            }

            i++;

        }

        return esPrimo;
    }

}
