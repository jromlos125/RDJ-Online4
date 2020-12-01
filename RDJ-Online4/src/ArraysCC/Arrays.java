package ArraysCC;

import static Utilidades.IO_ES.*;

/**
 * Se tratan de unos métodos, los cuales son: Un método que genera un menú para
 * seleccionar el metodo que queramos. Un método que genera un array de 10
 * posiciones y lo rellena con los 10 primeros numeros pares y los muestra. Un
 * método que genera un array de 10 numeros aleatorios (del 0 al 20) y muestra
 * por pantalla la posicion cuando el usuario teclea un numero que se encuentre
 * dentro. Un método que pide por teclado el tamaño del array de numeros
 * decimales y lo recorre introduciendo numeros aleatorioas, muestra la media el
 * numero mas alto y el mas bajo. Un método que pide el tamaño del array a crear
 * y le asigna valores a cada uno de los huecos del array de manera aleatoria
 * entre 0 y 100. Muestra su contenido e indica que números son mayores que 50 y
 * cuantos menores.
 *
 * @author Jose Luis Romero De Los Ángeles
 * @version 1.0
 */
public class Arrays {

    public static void opcionesMenu() {
        int opcion;
        do {

            System.out.println("------------------------- MENÚ ARRAYS ------------------------");
            System.out.println("1. Crear un array de 10 posiciones y rellenarlo con los 10 primeros números pares.");
            System.out.println("2. Crear un array de 10 posiciones con números aleatorios (entre 0 y 20) y se mostrará en la pantalla la posición del array que ocupe el número que indiques.");
            System.out.println("3. Crear un array de números decimales y mostrar la media, el más alto y el más bajo.");
            System.out.println("4. Crear un array de valores aleatorios entre 0 y 100. Mostrando su contenido e indicando cuántos números son mayores de 50 y cuántos son menores.");
            System.out.println("0. Salir del programa.");

            opcion = leerInteger("Selecciona una de las opciones del menú anterior: ", 0, 4);

            switch (opcion) {

                case 1:
                    arrayDe10RellenoPares();
                    break;

                case 2:
                    arrayDe10RellenoAleatorio();
                    break;

                case 3:
                    arrayMasAltoyMasBajo();
                    break;

                case 4:
                    arrayMayoresyMenoresDe50();
                    break;

                case 0:
                    break;
            }

        } while (opcion != 0);

    }

    public static void arrayDe10RellenoPares() {

        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {

            array[i] = 2 * i; // Contamos el número 0 como el primer número par.

        }

        System.out.println("Los valores del array creado son: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + "; ");

        }

        System.out.println("\n--------------------------------------------------------------");

    }

    public static void arrayDe10RellenoAleatorio() {

        int[] array = new int[10];
        boolean bandera = false;
        int posicion = 0;
        int num;

        for (int i = 0; i < 10; i++) {

            array[i] = (int) Math.floor(Math.random() * 20);

        }

        do {

            num = leerInteger("Introduce un número para conocer cual es su posición en el array: ", 0, 20);
            for (int j = 0; j < 10; j++) {

                if (num == array[j]) {

                    bandera = true;
                    posicion = j;

                } else {

                    System.out.println("El número introducido no se encuentra en el array.");

                }

            }

        } while (bandera != true);

        System.out.println("El número " + num + " introducido se encuentra en la posición " + posicion + " del array.");

    }

    public static void arrayMasAltoyMasBajo() {

        int tam;
        double suma = 0;
        double media;

        tam = leerIntegerMayor0("Introduce el tamaño del array que deseas crear: ");
        double[] array = new double[tam];

        for (int i = 0; i < tam; i++) {

            array[i] = Math.floor(Math.random() * 1000); // Como no se indica, introducimos los valores aleatorios hasta el número 1000.
            suma = suma + array[i];

        }

        media = (suma / tam);

        for (int j = 0; j < (tam - 1); j++) {
            for (int k = 1; k < (tam - j); k++) {
                if (array[k - 1] > array[k]) {
                    double aux_elem = array[k];
                    array[k] = array[k - 1];
                    array[k - 1] = aux_elem;
                }

            }

        }

        System.out.println("La média de los elementos del array creado es: " + media);
        System.out.println("El número más grande que hay dentro del array es: " + array[tam - 1] + " y el número más pequeño que hay dentro del array es: " + array[0]);

    }

    public static void arrayMayoresyMenoresDe50() {

        int tam = 0;
        int mayores = 0;
        int menores = 0;
        tam = leerIntegerMayor0("Introduce el tamaño del array que deseas crear: ");
        int[] array = new int[tam];

        for (int i = 0; i < tam; i++) {

            array[i] = (int) Math.floor(Math.random() * 100);

        }
        System.out.println("Los números contenidos en el array son: ");
        for (int i = 0; i < tam; i++) {

            System.out.print(array[i] + "; ");

            if (array[i] <= 50) { // Como no se indica, incluyo el 50 en los números menores a 50.

                menores++;

            } else {

                mayores++;

            }

        }

        System.out.println("\nHay un total de " + mayores + " números mayores que 50.");
        System.out.println("Y un total de " + menores + " números menores o iguales a 50.");

    }

}
