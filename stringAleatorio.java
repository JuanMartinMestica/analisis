package tp0;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author usuario
 */
public class stringAleatorio {

    public static void main(String[] args) {

        FileWriter escritorArchivo = null;
        try {
            int piso = 33;
            int techo = 126;
            String nombreArchivoSalida = "src/tp0/salidaString.txt";

            escritorArchivo = new FileWriter(nombreArchivoSalida);
            BufferedWriter bufferEscritura = new BufferedWriter(escritorArchivo);

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {

                    char caracter = (char) Math.floor(Math.random() * (techo - piso + 1) + piso);
                    System.out.print(caracter);
                    bufferEscritura.write(caracter);

                }

                System.out.println("");
                bufferEscritura.write("\n");

            }
            int caracter = (int) Math.floor(Math.random() * (techo - piso + 1) + piso);
        } catch (IOException ex) {
            Logger.getLogger(stringAleatorio.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                escritorArchivo.close();
            } catch (IOException ex) {
                Logger.getLogger(stringAleatorio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
