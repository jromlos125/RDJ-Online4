/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import static Utilidades.IO_ES.*;

/**
 * Contiene dos metodos estaticos que se encargan de validad las matriculas de
 * coche y moto respectivamente que se les pasa por parametros y devolveran True
 * si son correctas.
 *
 * @author Jose Luis Romero De Los Ángeles
 * @version: 1.0
 */
public class ValidarCadenas {

    public static void opcionesMenu() {

        int opcion;
        String matricula;

        do {
            System.out.println("----------------- MENÚ EXPRESIONES REGULARES -----------------");
            System.out.println("1.- Validar matrícula de coche.");
            System.out.println("2.- Validar matrícula de ciclomotor.");
            System.out.println("0.- Salir (Volver al menú principal.)");
            opcion = leerInteger("Seleccione una de las opciones anteriores: ", 0, 2);

            switch (opcion) {

                case 1:
                    matricula = leerString("Introduce el número de matricula:");
                    if (comprobarMatriculaAutomovil(matricula) == true) {

                        System.out.println("La matricula introducida es correcta.");

                    } else {

                        System.out.println("La matrícula introducida no es correcta. Recuerda que el formato es 4 números seguidos de 3 letras mayusculas que no sean vocales ni la Ñ.");

                    }

                    break;

                case 2:
                    matricula = leerString("Introduce el número de matricula:");
                    if (comprobarMatriculaCiclomotor(matricula) == true) {

                        System.out.println("La matricula introducida es correcta.");

                    } else {

                        System.out.println("La matrícula introducida no es correcta.");
                        System.out.println("Recuerda que el formato es 1 letra mayuscula, seguida de 4 números y despues 3 letras mayusculas más.");
                        System.out.println("Las letras mayusculas no pueden ser ni vocales ni la Ñ.");

                    }

                    break;

                case 0:
                    break;
            }

        } while (opcion != 0);

    }

    public static boolean comprobarMatriculaAutomovil(String matricula) {

        boolean resultado;

        resultado = matricula.matches("^[0-9]{4}[B-D|F-H|J-N|P-T|V-Z]{3}$");

        return resultado;

    }

    public static boolean comprobarMatriculaCiclomotor(String matricula) {

        boolean resultado;

        resultado = matricula.matches("^[B-D|F-H|J-N|P-T|V-Z]{1}[0-9]{4}[B-D|F-H|J-N|P-T|V-Z]{3}$");

        return resultado;

    }

}
