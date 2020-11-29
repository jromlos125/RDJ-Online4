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

                System.out.println("El número introducido no es valido.");
                teclado.nextLine();
            }

        } while (correcto == false);

        return num;

    }

    public static int leerInteger(String mensaje, int min, int max) {

        Scanner teclado = new Scanner(System.in);
        int num = 0;
        boolean correcto = false;

        do {
            System.out.println(mensaje);
            try {

                num = teclado.nextInt();
                correcto = true;

            } catch (Exception e) {

                System.out.println("El número introducido no es valido.");
                teclado.nextLine();
            }

        } while (correcto == false || num < min || num > max);

        return num;

    }

    public static char leerChar(String mensaje, char max, char min) {

        Scanner teclado = new Scanner(System.in);
        char texto = ' ';
        boolean correcto = false;

        do {

            System.out.println(mensaje);
            try {

                texto = teclado.next().charAt(0);
                correcto = true;

            } catch (Exception e) {

                System.out.println("No se ha introducido un valor correcto.");

            }

        } while (correcto == false || texto < min || texto > max);

        return texto;

    }

    public static String leerString(String mensaje) {

        Scanner teclado = new Scanner(System.in);
        String texto = "";
        boolean correcto = false;

        do {
            System.out.println(mensaje);
            try {

                texto = teclado.nextLine();
                correcto = true;

            } catch (Exception e) {

                System.out.println("La matrícula introducida no es valida.");
                teclado.nextLine();
            }

        } while (correcto == false);

        return texto;

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
