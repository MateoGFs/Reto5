/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorRequerimientos;
import java.util.ArrayList;
import modelo.Requerimiento_1;

/**
 *
 * @author Mateo
 */
public class VistaRequerimientos {
    
    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1() {

        System.out.println("----------Listado de Proyectos de la ciudad de Pereira----------");
        try {
            // Su código
            ArrayList<Requerimiento_1> requerimiento1 = controlador.consultarRequerimiento1();

            // Encabezado del resultado
            System.out
                    .println("Constructora Ciudad Banco_Vinculado Porcentaje_Cuota_Inicial Clasificacion Fecha_Inicio");

            // Cada VO cargado, mostrarlo en la vista
            for (Requerimiento_1 proyecto : requerimiento1) {
                System.out.printf("%s %s %s %f %s %s %n",

                        proyecto.getConstructora(), proyecto.getCiudad(), proyecto.getBanco(), proyecto.getPorcentaje(),
                        proyecto.getClasificacion(), proyecto.getFecha());

            }

        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }
}
