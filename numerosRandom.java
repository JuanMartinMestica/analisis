package tp0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author usuario
 */
public class numerosRandom {

    public static void main(String[] args) {

        String nombreArchivoSalida = "src/tp0/salidaNumeros.txt";

        try {

            FileWriter escritorArchivo = new FileWriter(nombreArchivoSalida);

            BufferedWriter bufferEscritura = new BufferedWriter(escritorArchivo);

            int n = 100;
            double random_double;
            int piso = -100;
            int techo = 100;

            for (int i = 0; i < n; i++) {

                random_double = piso + (Math.random() * (techo - piso));

                bufferEscritura.write(random_double + "\n");

            }

            bufferEscritura.close();
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage() + "\nSignifica que el archivo del "
                    + "que queriamos leer no existe.");
        } catch (IOException ex) {
            System.err.println("Error leyendo o escribiendo en algun archivo.");
        }

    }

}


