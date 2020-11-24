/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

/**
 * Contiene dos metodos estaticos que se encargan de validad cadenas de
 * caracteres que se les pasa por parametros y devolveran True.
 *
 * @author Jose Luis Romero De Los Ángeles
 * @version: 1.0
 */
public class ValidarCadenas {

    public static boolean comprobarMatriculaAutomovil(char[] matricula) {

        boolean resultado = true;

        if (matricula.length != 7) {

            resultado = false;

        } else {

            for (int j = 4; j < 7; j++) {

                if (matricula[j] == 'A' || matricula[j] == 'E' || matricula[j] == 'I' || matricula[j] == 'O' || matricula[j] == 'U' || matricula[j] == 'Ñ') {

                    resultado = false;

                    }

                }
            
        }

        return resultado;

    }


    public static boolean comprobarMatriculaCiclomotor(char[] matricula) {

        boolean resultado = true;

        if (matricula.length != 8) {

            resultado = false;

        } else {

            if (matricula[1] == 'A' || matricula[1] == 'E' || matricula[1] == 'I' || matricula[1] == 'O' || matricula[1] == 'U' || matricula[1] == 'Ñ') {

                resultado = false;

            } else {

                for (int i = 5; i < 8; i++) {

                    if (matricula[i] == 'A' || matricula[i] == 'E' || matricula[i] == 'I' || matricula[i] == 'O' || matricula[i] == 'U' || matricula[i] == 'Ñ') {

                       resultado = false;

                    }

                }

            }

        }

        return resultado;

    }

}
