/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import util.JDBCUtilities;

/**
 *
 * @author Mateo
 */
public class Requerimiento_3Dao {
     public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        // Su código
        ArrayList<Requerimiento_3> respuesta = new ArrayList<Requerimiento_3>();
        Connection conexion = JDBCUtilities.getConnection();
        String consulta="SELECT Cargo, MAX(l.Salario) FROM Lider l group by Cargo having MAX(Salario)>700000";

        try {
            Statement statement=conexion.createStatement();
            ResultSet resultado=statement.executeQuery(consulta);
            while (resultado.next()) {
                Requerimiento_3 requerimiento3=new Requerimiento_3();
                requerimiento3.setCargo(resultado.getString("Cargo"));
                requerimiento3.setMaxSalario(resultado.getInt("MAX(l.Salario)"));

                respuesta.add(requerimiento3);
                
            }
            // Recorrer los registros en los VO específicos
            statement.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error l consultar el requerimiento3");
            e.printStackTrace();

        } finally {
            if(respuesta!=null){
                conexion.close();

            }

        }

        // Retornar la colección de vo's
        return respuesta;

    }
    
}
