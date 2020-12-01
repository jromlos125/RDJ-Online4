/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HundirLaFlota;

import static Utilidades.IO_ES.*;

/**
 * Hemos creado 3 métodos diferentes, en el 1o mostramos el tablero del juego
 * Hundir La Flota. En el 2o Colocamos los barcos en los tableros de manera
 * aleatoria. y el 3er método implementamos todo el juego según las
 * instrucciones.
 *
 * @author Jose Luis Romero De Los Ángeles
 * @version 1.0
 */
public class HundirLaFlota {

    public static void mostrarTablero(String tableroEnemigo[][], String tableroAliado[][]) {

        String resultadoEnemigo = "";
        String resultadoAliado = "";
        int i, j, m;
        int r = 0;
        char a;

        System.out.println(" -------------- TABLERO ENEMIGO ----------");

        for (a = 'A'; a < 'K'; a++) {

            resultadoEnemigo = (a + "| ");

            for (m = 0; m < tableroEnemigo[a].length; m++) {

                resultadoEnemigo = resultadoEnemigo + tableroEnemigo[a][m] + " | ";

            }

            System.out.println(resultadoEnemigo);
        }

        System.out.println("------------------------------------------");

        System.out.print("  ");

        for (i = 0; i < 1; i++) {
            for (j = 0; j < tableroEnemigo[i].length; j++) {

                System.out.print(" " + j + "  ");

            }
        }

        System.out.println("\n\n\n---------------- TU TABLERO --------------");

        for (a = 'A'; a < 'K'; a++) {

            resultadoEnemigo = (a + "| ");

            for (m = 0; m < tableroAliado[a].length; m++) {

                resultadoEnemigo = resultadoEnemigo + tableroAliado[a][m] + " | ";

            }

            System.out.println(resultadoEnemigo);
        }

        System.out.println("------------------------------------------");

        System.out.print("  ");

        for (i = 0; i < 1; i++) {
            for (j = 0; j < tableroAliado[i].length; j++) {

                System.out.print(" " + j + "  ");

            }
        }

        System.out.println("\n");

    }

    public static String[][] colocarBarcos(String tablero[][], int tamañoBarcos, int barcos) {

        boolean bandera1 = false;
        boolean bandera2 = false;
        int orientacion, primeraColumna;
        int contador = 0;
        char primeraFila;

        do {

            orientacion = (int) (Math.random() * 3); // Generamos la orientación de los barcos (0 = arriba; 1 = derecha; 2 = abajo; 3 = izquierda)

            switch (orientacion) {

                case 0:

                    bandera2 = false;
                    do {
                        primeraFila = (char) ((Math.random() * (75 - (65 - (tamañoBarcos - 1)))) + (65 - (tamañoBarcos - 1)));
                        primeraColumna = (int) (Math.random() * 10);

                        //System.out.println(primeraFila);  // Compronamos que fila ha salido del Math.random.
                        //System.out.println(primeraColumna);   // Compronamos que columna ha salido del Math.random.
                        for (char a = primeraFila; a >= (primeraFila - (tamañoBarcos - 1)); a--) { // Comprobamos si donde vamos a colocar el barco se encuentra vacio.

                            try {

                                if (" ".equals(tablero[a][primeraColumna])) {

                                    bandera2 = true;

                                }

                            } catch (Exception e) {

                                bandera2 = false;
                                a = '0';

                            }

                        }

                    } while (bandera2 != true);

                    if (bandera2 == true) {
                        for (char b = primeraFila; b >= (primeraFila - (tamañoBarcos - 1)); b--) {

                            tablero[b][primeraColumna] = "B";

                        }
                    }
                    contador++;

                    break;

                case 1:

                    bandera2 = false;

                    do {

                        primeraFila = (char) ((Math.random() * (75 - 65)) + 65);
                        primeraColumna = (int) (Math.random() * ((10 - (tamañoBarcos - 1))));

                        //System.out.println(primeraFila);  // Compronamos que fila ha salido del Math.random.
                        //System.out.println(primeraColumna);   // Compronamos que columna ha salido del Math.random.
                        for (int i = primeraColumna; i <= (primeraColumna + (tamañoBarcos - 1)); i++) {  // Comprobamos si donde vamos a colocar el barco se encuentra vacio.

                            if (" ".equals(tablero[primeraFila][i])) {

                                bandera2 = true;

                            } else {

                                bandera2 = false;
                                i = 10;

                            }

                        }

                    } while (bandera2 != true);

                    if (bandera2 == true) {

                        for (int j = primeraColumna; j <= (primeraColumna + (tamañoBarcos - 1)); j++) {

                            tablero[primeraFila][j] = "B";

                        }

                        contador++;

                    }

                    break;

                case 2:

                    bandera2 = false;

                    do {

                        primeraFila = (char) ((Math.random() * ((75 - (tamañoBarcos - 1)) - 65)) + 65);
                        primeraColumna = (int) (Math.random() * 10);

                        //System.out.println(primeraFila);  // Compronamos que fila ha salido del Math.random.
                        //System.out.println(primeraColumna);   // Compronamos que columna ha salido del Math.random.
                        for (char a = primeraFila; a <= (primeraFila + (tamañoBarcos - 1)); a++) {   // Comprobamos si donde vamos a colocar el barco se encuentra vacio.

                            try {

                                bandera2 = " ".equals(tablero[a][primeraColumna]);

                            } catch (Exception e) {

                                bandera2 = false;
                                a = 'W';

                            }

                        }

                    } while (bandera2 != true);

                    if (bandera2 == true) {

                        for (char b = primeraFila; b <= (primeraFila + (tamañoBarcos - 1)); b++) {

                            tablero[b][primeraColumna] = "B";

                        }

                    }

                    contador++;

                    break;

                case 3:

                    bandera2 = false;

                    do {

                        primeraFila = (char) ((Math.random() * (75 - 65)) + 65);
                        primeraColumna = (int) (Math.random() * (10 - (tamañoBarcos - 1)) + (tamañoBarcos - 1));

                        //System.out.println(primeraFila);  // Compronamos que fila ha salido del Math.random.
                        //System.out.println(primeraColumna);   // Compronamos que columna ha salido del Math.random.
                        for (int i = primeraColumna; i >= (primeraColumna - 4); i--) {  // Comprobamos si donde vamos a colocar el barco se encuentra vacio.

                            if (" ".equals(tablero[primeraFila][i])) {

                                bandera2 = true;

                            } else {

                                bandera2 = false;
                                i = -10;

                            }

                        }

                    } while (bandera2 != true);

                    if (bandera2 == true) {

                        for (int j = primeraColumna; j >= (primeraColumna - 4); j--) {

                            tablero[primeraFila][j] = "B";

                        }

                        contador++;

                    }

                    break;

            }

        } while (contador < barcos);

        return tablero;

    }

    public static void hundirLaFlota() {

        final char FILA = 'K';
        final int COLUMNA = 10;
        boolean terminado = false;
        int puntosenemigos = 24;
        int puntos = 24;
        int x;
        char y;
        boolean golpeado = false;
        boolean bandera1 = false;
        boolean vacia = true;

        System.out.println("\n------------------------ HUNDIR LA FLOTA ---------------------");

        // Creamos los tableros que visualizará el jugador.
        String[][] tableroEnemigo;
        tableroEnemigo = new String[FILA][COLUMNA];
        String[][] tableroAliado;
        tableroAliado = new String[FILA][COLUMNA];

        // Los rellenamos con espacios para poder visualizarlos limpios.
        for (int fila = 0; fila < FILA; fila++) {
            for (int columna = 0; columna < COLUMNA; columna++) {
                tableroEnemigo[fila][columna] = " ";
            }
        }

        for (int fila = 0; fila < FILA; fila++) {
            for (int columna = 0; columna < COLUMNA; columna++) {
                tableroAliado[fila][columna] = " ";
            }
        }

        // Creamos el tablero enemigo que se completaran con los barcos.
        String[][] tableroEnemigoBarcos;
        tableroEnemigoBarcos = new String[FILA][COLUMNA];

        // Lo rellenamos primero con espacios para poderlo llenar posteriormente de barcos.
        for (int fila = 0; fila < FILA; fila++) {
            for (int columna = 0; columna < COLUMNA; columna++) {
                tableroEnemigoBarcos[fila][columna] = " ";
            }
        }

        // Los rellenamos con los barcos.
        colocarBarcos(tableroAliado, 5, 2);
        colocarBarcos(tableroAliado, 3, 3);
        colocarBarcos(tableroAliado, 1, 5);
        colocarBarcos(tableroEnemigoBarcos, 5, 2);
        colocarBarcos(tableroEnemigoBarcos, 3, 3);
        colocarBarcos(tableroEnemigoBarcos, 1, 5);

        do {

            do {
                mostrarTablero(tableroEnemigo, tableroAliado);
                golpeado = false;

                do {
                    // Solicitamos al usuario que nos indique las coordenadas donde desea disparar su bomba.
                    x = leerInteger("Indica las coordenadas X (horizontales) para lanzar la bomba: ", 0, 9);
                    y = leerChar("Indica las coordenadas Y (verticales) para lanzar la bomba: ", 'A', 'J');

                    if ("X".equals(tableroEnemigoBarcos[y][x]) || "*".equals(tableroEnemigoBarcos[y][x])) {

                        vacia = false;

                    } else {

                        vacia = true;

                    }

                } while (vacia == false);
                // Comprobamos si la bomba ha golpeado en algun barco o en agua.

                if (" ".equals(tableroEnemigoBarcos[y][x])) {

                    System.out.println("¡Tu disparo ha golpeado en el agua!");
                    tableroEnemigo[y][x] = "X"; // Representa que se ha golpeado agua.

                } else {

                    System.out.println("¡Bíen!, has dado en un objetivo.");
                    tableroEnemigo[y][x] = "*"; // Representa que ha golpeado un barco.
                    puntosenemigos--;
                    golpeado = true;
                    if (puntosenemigos <= 0) {

                        terminado = true;

                    }

                }

            } while (golpeado == true || terminado == true);

            do {
                int xEnemiga;
                char yEnemiga;
                golpeado = false;

                do {

                    xEnemiga = (int) (Math.random() * 10);
                    yEnemiga = (char) ((Math.random() * (75 - 65)) + 65);

                    if ("*".equals(tableroAliado[yEnemiga][xEnemiga]) || "X".equals(tableroAliado[yEnemiga][xEnemiga])) {

                        bandera1 = true;

                    } else {

                        bandera1 = false;

                    }

                } while (bandera1 == true);

                if (" ".equals(tableroAliado[yEnemiga][xEnemiga])) {

                    System.out.println("El contrincante ha golpeado en el agua.");
                    tableroAliado[yEnemiga][xEnemiga] = "X";

                } else {

                    System.out.println("El contrincante ha golpeado uno de tus barcos. ");
                    tableroAliado[yEnemiga][xEnemiga] = "*"; // Representa que ha golpeado un barco.
                    puntos--;
                    golpeado = true;
                    if (puntos <= 0) {

                        terminado = true;

                    }

                }

            } while (golpeado == true || terminado == true);

            System.out.println("La puntuciación va: ");
            System.out.println("Tu equipo: " + puntos + " - " + puntosenemigos + ": Equipo Enemigo.");

        } while (terminado == false);

        if (puntos <= 0) {

            System.out.println("Lo sentimos. Has perdido. Vuelve a intentarlo.");

        } else {

            System.out.println("¡Enhorabuena! Has ganado.");

        }

    }

}
