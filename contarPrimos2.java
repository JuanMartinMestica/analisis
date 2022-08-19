
public class contarPrimos2 {

    public static void main(String[] args) {

        int n = 10;
        int cantPrimos = 0;

        //arreglo de primos de n posiciones
        boolean primos[] = new boolean[n + 1];

        //se setean todas las posiciones en true
        for (int i = 0; i <= n; i++) {
            primos[i] = true;
        }

        //para cada i, setea los multiplos de i en falso.  
        for (int i = 2; i * i <= n; i++) {
       
            //verifica si es primo
            if (primos[i] == true) {
                
                //para cada multiplo de i, lo pone en falso, ya que es divisible
                for (int j = i * i; j <= n; j = j + i) {
                    primos[j] = false;
                }
            }
        }
        

        for (int i = 2; i < n; i++) {
            if (primos[i] == true) {
                cantPrimos++;
            }
        }
        
        
        System.out.println(cantPrimos);

    }

}
