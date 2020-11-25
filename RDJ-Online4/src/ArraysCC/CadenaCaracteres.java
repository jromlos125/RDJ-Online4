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

        try {

            String texto = new String(Files.readAllBytes(Paths.get("ficheros/Texto para lectura.txt"))); // Creamos la variable texto que contiene todo el texto del documento.

        } catch (IOException e) {

            System.out.println("ERROR: " + e.getMessage());

        }

        int opcion = 0;
        int contador = 0;

        do {

            System.out.println("--------------- MENÚ ---------------");
            System.out.println("1. Contar palabra la $Hyperboss.");
            System.out.println("2. Sustituir la palabra $Hyperboss por COÑAZO y colorearla de azul.");
            System.out.println("3. Mostrar la primera frase que contenga la palabra $Hyperboss.");
            System.out.println("0. Salir del programa.");
            System.out.println("Selecciona una de las siguientes opciones del menú: ");
            opcion = IO_ES.leerInteger();

            switch (opcion) {

                case 0:

                    break;

                case 1:

                    for (int i = 0; i <= texto.length; i++) {

                        i = texto.indexOf("$Hyperboss", i);
                        contador++;

                    }

                    System.out.println("La palabra $Hyperboss sale en el texto un total de : " + contador);

                case 2:

                    String blue = "\033[34m";
                    String reset = "\u001B[0m";

                    texto.replace("$Hyperboss", (blue + "COÑAZO" + reset));

                    System.out.println(texto);

                case 3:

                    int j = texto.indexOf("$Hyperboss");
                    int primerPunto = texto.lastIndexOf(".", j);
                    int ultimoPunto = texto.indexOf(".", j);
                    String resultado = texto.substring((primerPunto + 1), (ultimoPunto + 1));

                    System.out.println("La primera frase que contiene la palabra $Hyperboss es: \n" + resultado);

            }

            System.out.println("------------------------------------");

        } while (opcion == 0);

    }

}
