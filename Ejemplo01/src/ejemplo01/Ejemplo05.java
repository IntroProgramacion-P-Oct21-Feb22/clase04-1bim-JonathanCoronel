/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    public static void main(String[] args) {
        // Secuencia de escape \n y \t
        String nombreEstudiante = "Jonathan Anibal";
        String apellidoEstudiante = "Coronel Alulima";
        int nacimiento = 1983;

        System.out.println(nombreEstudiante + "\n" + apellidoEstudiante
                + "\n" + nacimiento);
        System.out.println(nombreEstudiante + "\n" + "\n" + apellidoEstudiante
                + "\n" + "\n" + nacimiento);
        System.out.println(nombreEstudiante + "\n\n" + apellidoEstudiante
                + "\n\n" + nacimiento);
        //System.out.println(nombreEstudiante+"\t"+apellidoEstudiante);   
    }
}
