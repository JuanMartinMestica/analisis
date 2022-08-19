package tp0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ej1 {
    
    public static void main(String[] args) {
        
        String nombreArchivoEntrada = "src/tp0/entradaTest.txt";
        String nombreArchivoSalida = "src/tp0/salidaTest.txt";
        
         String linea = null;
     
         
           try {
         
            FileReader lectorArchivo = new FileReader(nombreArchivoEntrada);
            FileWriter escritorArchivo = new FileWriter(nombreArchivoSalida);
            
            BufferedReader bufferLectura = new BufferedReader(lectorArchivo);
            BufferedWriter bufferEscritura = new BufferedWriter(escritorArchivo);
            
            int lineaActual = 1;

            while ((linea = bufferLectura.readLine()) != null) {
               
                if (lineaActual % 2 == 0) {
                        System.out.println(linea);
                        bufferEscritura.write(linea + "\n");
                }
                
                lineaActual++;
            }

            bufferLectura.close();
            bufferEscritura.close();
        }
        catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage() + "\nSignifica que el archivo del "
                    + "que queriamos leer no existe.");
        }
        catch (IOException ex) {
            System.err.println("Error leyendo o escribiendo en algun archivo.");
        }
         
    }
    
    

    
}
