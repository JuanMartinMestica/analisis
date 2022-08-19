
import java.util.Scanner;


public class adivinarNumero {

    public static void main(String[] args) {
        
        int min = 0;
        int max = 100;
        boolean adivino = false;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Adivinar un numero entre " + min + " y: " + max);
        
        int numeroSecreto = (int) Math.floor (Math.random() * (max-min+1) +min);
        
        while(!adivino){
        
            System.out.println("Ingresa tu intento");
            int intento = scanner.nextInt();
            
            if (intento == numeroSecreto) {
                
                System.out.println("Felicitaciones, adivinaste el numero");
                adivino = true;
                
            } else {
                
                if (intento < numeroSecreto) {
                    System.out.println("El numero secreto es mayor al ingresado");
                } else {
                    System.out.println("El numero secreto es menor al ingresado");
                }
            
            
            }
        
        }
//  n ≤ 1000000 y un usuario que siga de forma optima la logica del juego y que ´
//quiera dar la menor cantidad de pasos hasta adivinar el numero: ¿Cu ´ al es el m ´ aximo n ´ umero ´
//de intentos que puede necesitar el jugador hasta encontrar un numero dentro del intervalo?
        
        //en el peor de los casos realiza n-1 intentos
        //en el caso mas optimo, seria como una busqueda binaria seria log n
        
  
    }

    
}
