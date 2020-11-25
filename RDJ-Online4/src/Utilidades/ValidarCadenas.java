/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

/**
 * Contiene dos metodos estaticos que se encargan de validad las matriculas de
 * coche y moto respectivamente que se les pasa por parametros y devolveran True
 * si son correctas.
 *
 * @author Jose Luis Romero De Los Ángeles
 * @version: 1.0
 */
public class ValidarCadenas {

    public static void comprobarMatriculaAutomovil(String matricula) {

        boolean resultado;

        resultado = matricula.matches("^[0-9]{4}[B-D|F-H|J-N|P-T|V-Z]{3}$");

        System.out.println(resultado);

    }

    public static void comprobarMatriculaCiclomotor(String matricula) {

        boolean resultado;

        resultado = matricula.matches("^[B-D|F-H|J-N|P-T|V-Z]{1}[0-9]{4}[B-D|F-H|J-N|P-T|V-Z]{3}$");

        System.out.println(resultado);

    }

}
