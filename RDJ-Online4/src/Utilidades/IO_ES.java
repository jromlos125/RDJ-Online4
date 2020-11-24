/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.util.Scanner;

/**
 *
 * @author Semipresencial 1º
 */
public class IO_ES {

    public static int leerInteger() {

        Scanner teclado = new Scanner(System.in);
        int num = 0;
        boolean correcto = false;

        do {
            System.out.println("Introduce una opción: ");
            try {

                num = teclado.nextInt();
                correcto = true;

            } catch (Exception e) {

                //System.out.println("Error: " + e.getMessage());
                teclado.nextLine();
            }

        } while (correcto == false);

        return num;

    }

    public static int leerInteger(String mensaje) {

        Scanner teclado = new Scanner(System.in);
        int num = 0;
        boolean correcto = false;

        do {
            System.out.println(mensaje);
            try {

                num = teclado.nextInt();
                correcto = true;

            } catch (Exception e) {

                //System.out.println("Error: " + e.getMessage());
                teclado.nextLine();
            }

        } while (correcto == false);

        return num;

    }

    public static float leerReal(String mensaje) {

        Scanner teclado = new Scanner(System.in);
        float num = 0;
        boolean correcto = false;

        do {
            System.out.println("Introduce un número real: ");
            try {

                num = teclado.nextFloat();
                correcto = true;

            } catch (Exception e) {

                //System.out.println("Error: " + e.getMessage());
                teclado.nextLine();
            }

        } while (correcto == false);

        return num;

    }

    public static long leerIntegerLargo() {

        Scanner teclado = new Scanner(System.in);
        long num = 0;
        boolean correcto = false;

        do {
            System.out.println("Introduce un número entero largo: ");
            try {

                num = teclado.nextLong();
                correcto = true;

            } catch (Exception e) {

                //System.out.println("Error: " + e.getMessage());
                teclado.nextLine();
            }

        } while (correcto == false);

        return num;

    }

    public static double leerRealLargo() {

        Scanner teclado = new Scanner(System.in);
        double num = 0;
        boolean correcto = false;

        do {
            System.out.println("Introduce un número real largo: ");
            try {

                num = teclado.nextDouble();
                correcto = true;

            } catch (Exception e) {

                //System.out.println("Error: " + e.getMessage());
                teclado.nextLine();
            }

        } while (correcto == false);

        return num;

    }

    public static void escribir(String texto) {

        System.out.println(texto);

    }

    public static void escribirLN(String texto) {

        System.out.println(texto);

    }

}
