package ArraysCC;

import Utilidades.IO_ES;
import java.io.IOException;
import java.nio.file.*;

/**
 * Tenemos un metodo en el que sacamos un menú que nos permite hacer 3 opciones
 * y pulsar el 0 para salir. Opcion 1: Contar el número de veces que sale la
 * palabra $Hyperboss; Opcion 2: Sustituir la palabra $Hyperboss por COÑAZO y
 * colorearla de azul; Opcion 3: Mostrar la promera frase que contenga la
 * palabra $Hyperboss.
 *
 * @author Jose Luis Romero De Los Ángeles
 * @version: 1.0
 */
public class CadenaCaracteres {

    public static void opcionesMenu() throws IOException {

        String contenido = new String(Files.readAllBytes(Paths.get("Texto para lectura.txt")));
        int i = 0;

        do {

            System.out.println("Selecciona una de las siguientes opciones del menú: ");
            System.out.println("1. Contar palabra la $Hyperboss.");
            System.out.println("2. Sustituir la palabra $Hyperboss por COÑAZO y colorearla de azul.");
            System.out.println("3. Mostrar la primera frase que contenga la palabra $Hyperboss.");
            System.out.println("0. Salir del programa.");
            i = IO_ES.leerInteger();

            switch (i) {

                case 0:

                    break;

                case 1:

                    int position,
                     contador = 0;
                    position = contenido.indexOf("$Hyperboss");
                    while (position != -1) {
                        contador++;
                        position = contenido.indexOf("$Hyperboss", position++);

                    }
                    System.out.println("El número de veces que aparece la palabra $Hyperboss es: " + contador);

                case 2:

                    System.out.println(contenido);

                case 3:

                    System.out.println("La primera frase que contiene la palabra $Hyperboss es: \n");

            }

        } while (i == 0);

    }

}
