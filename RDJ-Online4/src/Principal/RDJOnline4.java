/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import ArraysCC.*;
import HundirLaFlota.*;
import Utilidades.*;
import static Utilidades.IO_ES.*;

/**
 *
 * @author Jose Luis Romero De Los Ángeles
 * @version 1.0
 */
public class RDJOnline4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int opcion;

        do {
            System.out.println("----------------------- MENÚ PRINCIPAL -----------------------");
            System.out.println("1.- Cadena de Caracteres.");
            System.out.println("2.- Expresiones Regulares.");
            System.out.println("3.- Ejercicio de Arrays.");
            System.out.println("4.- Hundir la flota.");
            System.out.println("0.- Salir.");
            opcion = leerInteger("Seleccione una de las opciones anteriores: ", 0, 4);

            switch (opcion) {

                case 1:
                    CadenaCaracteres.opcionesMenu();
                    break;

                case 2:
                    ValidarCadenas.opcionesMenu();
                    break;

                case 3:
                    Arrays.opcionesMenu();
                    break;

                case 4:
                    HundirLaFlota.hundirLaFlota();
                    break;

                case 0:
                    break;

            }

        } while (opcion != 0);

    }

}
