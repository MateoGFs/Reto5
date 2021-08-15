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
public class Requerimiento_2Dao {
     public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        // Su código

        ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();
        Connection conexion = JDBCUtilities.getConnection();
        String consultaSql="SELECT Proveedor, Constructora, Pagado from Compra c  inner join Proyecto p  ON c.ID_Proyecto = p.ID_Proyecto WHERE c.Proveedor IN ('Homecenter','JUMBO') AND c.Pagado ='Si'  and p.Constructora LIKE  '%S.A.' ORDER BY c.Proveedor";

        try {
            Statement statement = conexion.createStatement();
            ResultSet resultado = statement.executeQuery(consultaSql);
            while (resultado.next()) {
                Requerimiento_2 requerimiento2=new Requerimiento_2();
                requerimiento2.setProveedor(resultado.getString("Proveedor"));
                requerimiento2.setConstructora(resultado.getString("Constructora"));
                requerimiento2.setPagado(resultado.getString("Pagado"));

                respuesta.add(requerimiento2);

                
            }
            // Recorrer los registros en los VO específicos
            statement.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error al consultar los datos requerimiento2");
            e.printStackTrace();

        } finally {
            if(conexion!=null){
                conexion.close();
            }

        }

        // Retornar la colección de vo's
        return respuesta;

    }
    
}
