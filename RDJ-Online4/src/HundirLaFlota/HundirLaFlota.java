/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HundirLaFlota;

import static Utilidades.IO_ES.*;

/**
 * Hemos creado varios metodos para dar lugar al famoso juego Hundir la Flota,
 * en el cual, se genera la posicion de los barcos de manera aleatoria y gana el
 * jugador que hunda todos los barcos del equipo enemigo. El jugador contra el
 * que juega el usuario es la máquina, que generá los puntos donde se dispara de
 * forma aleatoria.
 *
 * @author Jose Luis Romero De Los Ángeles
 * @version 1.0
 */
public class HundirLaFlota {

    public static void mostrarTablero(String tableroEnemigo[][], String tableroAliado[][]) {

        String resultadoEnemigo = "";
        String resultadoAliado = "";
        int i, j, m, a;
        int r = 0;
        char b;

        System.out.println(" -------------- TABLERO ENEMIGO ----------");

        for (a = 0; a < 10; a++) {

            b = deIntAChar(a);
            resultadoEnemigo = (b + "| ");

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

        for (a = 0; a < 10; a++) {

            b = deIntAChar(a);
            resultadoAliado = (b + "| ");

            for (m = 0; m < tableroAliado[a].length; m++) {

                resultadoAliado = resultadoAliado + tableroAliado[a][m] + " | ";

            }

            System.out.println(resultadoAliado);
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

        boolean bandera = false;
        int orientacion, primeraColumna, primeraFila;
        int contador = 0;

        do {

            orientacion = (int) (Math.random() * 3); // Generamos la orientación de los barcos (0 = arriba; 1 = derecha; 2 = abajo; 3 = izquierda)

            switch (orientacion) {

                case 0:

                    bandera = false;
                    do {
                        primeraFila = (int) (Math.random() * 10 - (tamañoBarcos - 1)) + (tamañoBarcos - 1);
                        primeraColumna = (int) (Math.random() * 10);

                        //System.out.println(primeraFila);  // Compronamos que fila ha salido del Math.random.
                        //System.out.println(primeraColumna);   // Compronamos que columna ha salido del Math.random.
                        for (int i = primeraFila; i >= (primeraFila - (tamañoBarcos - 1)); i--) { // Comprobamos si donde vamos a colocar el barco se encuentra vacio.

                            try {

                                if (" ".equals(tablero[i][primeraColumna])) {

                                    bandera = true;

                                } else {

                                    bandera = false;
                                    i = 100;

                                }

                            } catch (Exception e) {

                                bandera = false;
                                i = -100;

                            }

                        }

                    } while (bandera != true);

                    if (bandera == true) {
                        for (int j = primeraFila; j >= (primeraFila - (tamañoBarcos - 1)); j--) {

                            tablero[j][primeraColumna] = "B";

                        }
                    }
                    contador++;

                    break;

                case 1:

                    bandera = false;

                    do {

                        primeraFila = (int) (Math.random() * (10));
                        primeraColumna = (int) (Math.random() * ((10 - (tamañoBarcos - 1))));

                        //System.out.println(primeraFila);  // Compronamos que fila ha salido del Math.random.
                        //System.out.println(primeraColumna);   // Compronamos que columna ha salido del Math.random.
                        for (int i = primeraColumna; i <= (primeraColumna + (tamañoBarcos - 1)); i++) {  // Comprobamos si donde vamos a colocar el barco se encuentra vacio.

                            if (" ".equals(tablero[primeraFila][i])) {

                                bandera = true;

                            } else {

                                bandera = false;
                                i = 100;

                            }

                        }

                    } while (bandera != true);

                    if (bandera == true) {

                        for (int j = primeraColumna; j <= (primeraColumna + (tamañoBarcos - 1)); j++) {

                            tablero[primeraFila][j] = "B";

                        }

                        contador++;

                    }

                    break;

                case 2:

                    bandera = false;

                    do {

                        primeraFila = (int) (Math.random() * ((10 - (tamañoBarcos - 1))));
                        primeraColumna = (int) (Math.random() * 10);

                        //System.out.println(primeraFila);  // Compronamos que fila ha salido del Math.random.
                        //System.out.println(primeraColumna);   // Compronamos que columna ha salido del Math.random.
                        for (int i = primeraFila; i <= (primeraFila + (tamañoBarcos - 1)); i++) {   // Comprobamos si donde vamos a colocar el barco se encuentra vacio.

                            try {

                                if (" ".equals(tablero[i][primeraColumna])) {

                                    bandera = true;

                                } else {

                                    bandera = false;
                                    i = 100;

                                }

                            } catch (Exception e) {

                                bandera = false;
                                i = 100;

                            }

                        }

                    } while (bandera != true);

                    if (bandera == true) {

                        for (int j = primeraFila; j <= (primeraFila + (tamañoBarcos - 1)); j++) {

                            tablero[j][primeraColumna] = "B";

                        }

                    }

                    contador++;

                    break;

                case 3:

                    bandera = false;

                    do {

                        primeraFila = (int) (Math.random() * (10));
                        primeraColumna = (int) (Math.random() * (10 - (tamañoBarcos - 1)) + (tamañoBarcos - 1));

                        //System.out.println(primeraFila);  // Compronamos que fila ha salido del Math.random.
                        //System.out.println(primeraColumna);   // Compronamos que columna ha salido del Math.random.
                        for (int i = primeraColumna; i >= (primeraColumna - 4); i--) {  // Comprobamos si donde vamos a colocar el barco se encuentra vacio.

                            if (" ".equals(tablero[primeraFila][i])) {

                                bandera = true;

                            } else {

                                bandera = false;
                                i = -100;

                            }

                        }

                    } while (bandera != true);

                    if (bandera == true) {

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

    public static char deIntAChar(int num) {

        char resultado = ' ';

        switch (num) {

            case 0:

                resultado = 'A';
                break;

            case 1:

                resultado = 'B';
                break;

            case 2:

                resultado = 'C';
                break;

            case 3:

                resultado = 'D';
                break;

            case 4:

                resultado = 'E';
                break;

            case 5:

                resultado = 'F';
                break;

            case 6:

                resultado = 'G';
                break;

            case 7:

                resultado = 'H';
                break;

            case 8:

                resultado = 'I';
                break;

            case 9:

                resultado = 'J';
                break;

        }

        return resultado;

    }

    public static int deCharAInt(char letra) {

        int resultado = 1000;

        switch (letra) {

            case 'A':

                resultado = 0;
                break;

            case 'B':

                resultado = 1;
                break;

            case 'C':

                resultado = 2;
                break;

            case 'D':

                resultado = 3;
                break;

            case 'E':

                resultado = 4;
                break;

            case 'F':

                resultado = 5;
                break;

            case 'G':

                resultado = 6;
                break;

            case 'H':

                resultado = 7;
                break;

            case 'I':

                resultado = 8;
                break;

            case 'J':

                resultado = 9;
                break;

        }

        return resultado;

    }

    public static String[][] rellenarTablero(String tablero[][], String relleno) {

        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                tablero[fila][columna] = relleno;
            }
        }

        return tablero;

    }

    public static void hundirLaFlota() {

        final char FILA = 10;
        final int COLUMNA = 10;
        boolean terminado = false;
        int puntosenemigos = 24;
        int puntos = 24;
        int x, y;
        char h;
        boolean golpeado = false;
        boolean bandera1 = false;
        boolean vacia = true;

        System.out.println("\n------------------------ HUNDIR LA FLOTA ---------------------");

        // Creamos los tableros que visualizará el jugador.
        String[][] tableroEnemigo;
        tableroEnemigo = new String[FILA][COLUMNA];
        String[][] tableroAliado;
        tableroAliado = new String[FILA][COLUMNA];

        // Creamos el tablero enemigo que se completaran con los barcos.
        String[][] tableroEnemigoBarcos;
        tableroEnemigoBarcos = new String[FILA][COLUMNA];

        // Los rellenamos con espacios para poder visualizarlos limpios.
        tableroEnemigo = rellenarTablero(tableroEnemigo, " ");
        tableroAliado = rellenarTablero(tableroAliado, " ");
        tableroEnemigoBarcos = rellenarTablero(tableroEnemigoBarcos, " ");

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
                    h = leerChar("Indica las coordenadas Y (verticales) para lanzar la bomba: ", 'A', 'J');
                    y = deCharAInt(h);

                    if ("X".equals(tableroEnemigoBarcos[y][x]) || "*".equals(tableroEnemigoBarcos[y][x])) { // Comprobamos que la posicion donde disparamos, no hayamos disparado anteriomente.

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
                    if (puntos <= 0 || puntosenemigos <= 0) {

                        terminado = true;

                    }

                }

                System.out.println("La puntuciación va: ");
                System.out.println("Tu equipo: " + puntos + " - " + puntosenemigos + ": Equipo Enemigo.");

            } while (golpeado == true && terminado == false);

            if (terminado == false) {

                do {
                    int xEnemiga, yEnemiga;
                    char hEnemiga;
                    golpeado = false;

                    do {

                        xEnemiga = (int) (Math.random() * 10);
                        hEnemiga = (char) ((Math.random() * (75 - 65)) + 65);
                        yEnemiga = deCharAInt(hEnemiga);

                        if ("*".equals(tableroAliado[yEnemiga][xEnemiga]) || "X".equals(tableroAliado[yEnemiga][xEnemiga])) { // Comprobamos que el lugar donde vamos a disparar no hayamos disparado anteriormente.

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
                        if (puntos <= 0 || puntosenemigos <= 0) {

                            terminado = true;

                        }

                    }

                } while (golpeado == true && terminado == false);

            }

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
