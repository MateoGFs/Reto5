/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerproyecto53;

import controlador.ControladorRequerimientos;
import java.sql.SQLException;
import javax.swing.table.TableColumn;
import modelo.Requerimiento_1;
import modelo.Requerimiento_1Dao;
import modelo.Requerimiento_2Dao;
import modelo.Requerimiento_3Dao;
import vista.ProyectoConstruccionGui;

/**
 *
 * @author Mateo
 */
public class MiPrimerProyecto53 {

    /**
     * @param args the command line arments
     */
    public static void main(String[] args) throws SQLException {
      System.out.println("Requerimiento 1");
       // VistaRequerimientos.requerimiento1();
        
        

//Remueve tercer columna
        
        Requerimiento_1 re= new Requerimiento_1();
        Requerimiento_1Dao reDao= new Requerimiento_1Dao();
        Requerimiento_2Dao reDao2= new Requerimiento_2Dao();
        Requerimiento_3Dao reDao3= new Requerimiento_3Dao();
        ProyectoConstruccionGui pro= new ProyectoConstruccionGui();
        
        TableColumn columna = pro.jTableConsulta1.getColumnModel().getColumn(0);
        columna.setMaxWidth(0);
        columna.setMinWidth(0);
        columna.setPreferredWidth(0);
        pro.jTableConsulta1.doLayout();
        
        ControladorRequerimientos co= new ControladorRequerimientos(reDao, reDao2, reDao3, pro, re);
        co.iniciar();
        pro.setVisible(true);
        pro.setDefaultCloseOperation(pro.EXIT_ON_CLOSE);
        
    }
    
}
