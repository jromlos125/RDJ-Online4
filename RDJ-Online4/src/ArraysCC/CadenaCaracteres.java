package ArraysCC;

import static Utilidades.IO_ES.*;
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

    public static void opcionesMenu() {

        String texto = "";
        int opcion;
        int contador = 0;

        do {

            try { // Realizamos el try dentro del bucle para que el texto se resetee cada vez que hacemos una de las opciones del menú.

                texto = new String(Files.readAllBytes(Paths.get("ficheros/Texto para lectura.txt"))); // Rellenamos la variable texto que contiene todo el texto del documento.

            } catch (IOException e) {

                System.out.println("ERROR: " + e.getMessage());

            }

            System.out.println("-------------------- MENÚ CADENA CARACTERES ------------------");
            System.out.println("1. Contar la palabra $Hyperboss.");
            System.out.println("2. Sustituir la palabra $Hyperboss por COÑAZO y colorearla de azul.");
            System.out.println("3. Mostrar la primera frase que contenga la palabra $Hyperboss.");
            System.out.println("0. Salir del programa.");
            opcion = leerInteger("Seleccione una de las opciones del menú: ", 0, 3);

            switch (opcion) {

                case 1:

                    contador = 0;
                    String palabraaBuscar = "$Hyperboss";
                    while (texto.indexOf(palabraaBuscar) > -1) {
                        texto = texto.substring(texto.indexOf(palabraaBuscar) + palabraaBuscar.length(), texto.length());
                        contador++;
                    }

                    System.out.println("------------------------------------");
                    System.out.println("La palabra $Hyperboss sale en el texto un total de : " + contador);
                    break;

                case 2:

                    String blue = "\033[34m";
                    String reset = "\u001B[0m";

                    texto = texto.replace("$Hyperboss", (blue + "COÑAZO" + reset));

                    System.out.println("Sustituimos la paralabra $Hyperboss por " + blue + "COÑAZO" + reset + " coloreandola de azul, el texto quedaría así: ");
                    System.out.println("------------------------------------");
                    System.out.println(texto);
                    break;

                case 3:

                    int j = texto.indexOf("$Hyperboss");
                    int primerPunto = texto.lastIndexOf(".", j);
                    int ultimoPunto = texto.indexOf(".", j);
                    String resultado = texto.substring((primerPunto + 1), (ultimoPunto + 1));

                    System.out.println("------------------------------------");
                    System.out.println("La primera frase que contiene la palabra $Hyperboss es: \n" + resultado);
                    break;

                case 0:
                    break;

            }

            System.out.println("------------------------------------");

        } while (opcion != 0);

    }

}
