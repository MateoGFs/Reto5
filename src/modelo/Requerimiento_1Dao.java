/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.JDBCUtilities;

/**
 *
 * @author Mateo
 */
public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        // Su código
        ArrayList<Requerimiento_1> respuesta = new ArrayList<Requerimiento_1>();
        Connection conexion = JDBCUtilities.getConnection();

        try {

            String consulta = "select ID_Proyecto,Constructora, Ciudad, Banco_Vinculado, Porcentaje_Cuota_Inicial, Clasificacion, Fecha_Inicio from Proyecto where Ciudad = 'Pereira'; ";

            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);

            // Recorrer los registros en los VO específicos
            while (resultSet.next()) {

                Requerimiento_1 requerimiento1 = new Requerimiento_1();
                requerimiento1.setIdProyecto(resultSet.getInt("ID_Proyecto"));
                requerimiento1.setConstructora(resultSet.getString("Constructora"));
                requerimiento1.setCiudad(resultSet.getString("Ciudad"));
                requerimiento1.setBanco(resultSet.getString("Banco_Vinculado"));
                requerimiento1.setPorcentaje(resultSet.getDouble("Porcentaje_Cuota_Inicial"));
                requerimiento1.setClasificacion(resultSet.getString("Clasificacion"));
                requerimiento1.setFecha(resultSet.getString("Fecha_Inicio"));
                // Se agrega cada registro como un objeto del ArrayList que contiene la consulta
                respuesta.add(requerimiento1);
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            System.err.println("Error consultando ranking de los 10 proyectos con mayor gasto por compras: " + e);
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }

        // Retornar la colección de vo's
        return respuesta;

    }
    
    public boolean agregar(Requerimiento_1 re) throws SQLException{
        Connection conexion = JDBCUtilities.getConnection();
         String sql="INSERT INTO Proyecto\n" +
"( Fecha_Inicio, Constructora, Numero_Banos, Numero_Habitaciones, Banco_Vinculado, Porcentaje_Cuota_Inicial, Ciudad, Clasificacion, Acabados, Serial, ID_Tipo, ID_Lider)\n" +
"VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
         try {
            
            PreparedStatement statement =conexion.prepareStatement(sql);
            statement.setString(1, re.getFecha());
            statement.setString(2, re.getConstructora());
            statement.setInt(3, re.getNumeroBancos());
            statement.setInt(4, re.getNumeroHabitaciones());
            statement.setString(5, re.getBanco());
            statement.setDouble(6, re.getPorcentaje());
            statement.setString(7, re.getCiudad());
            statement.setString(8, re.getClasificacion());
            statement.setString(9, re.getAcabados());
            statement.setString(10, re.getSerial());
            statement.setInt(11, re.getIdTipo());
            statement.setInt(12, re.getIdLider());
            
            statement.executeUpdate();
            return true;
            
            
            
        } catch (Exception e) {
             System.err.println("Error al insertar");
             return false;
        } finally{
             try {
                 conexion.close();
             } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "Registro inválido");
             }
         }
         
        
    }

    
   
 public boolean modificar(Requerimiento_1 re) throws SQLException{
        Connection conexion = JDBCUtilities.getConnection();
         String sql="UPDATE Proyecto\n" +
"SET Fecha_Inicio=?, Constructora=?, Numero_Banos=?, Numero_Habitaciones=?, Banco_Vinculado=?, Porcentaje_Cuota_Inicial=?, Ciudad=?, Clasificacion=?, Acabados=?, Serial=?, ID_Tipo=?, ID_Lider=?\n" +
"WHERE ID_Proyecto=?";
         try {
            
            PreparedStatement statement =conexion.prepareStatement(sql);
            statement.setString(1, re.getFecha());
            statement.setString(2, re.getConstructora());
            statement.setInt(3, re.getNumeroBancos());
            statement.setInt(4, re.getNumeroHabitaciones());
            statement.setString(5, re.getBanco());
            statement.setDouble(6, re.getPorcentaje());
            statement.setString(7, re.getCiudad());
            statement.setString(8, re.getClasificacion());
            statement.setString(9, re.getAcabados());
            statement.setString(10, re.getSerial());
            statement.setInt(11, re.getIdTipo());
            statement.setInt(12, re.getIdLider());
            statement.setInt(13, re.getIdProyecto());
            
            statement.executeUpdate();
            
            return true;
            
        } catch (Exception e) {
             System.err.println("Error al modificar");
             return false;
        } finally{
             try {
                 conexion.close();
             } catch (Exception e) {
                 System.err.println(e);
             }
         }
        
        
    }
 
 
 public boolean eliminar(int id) throws SQLException{
        Connection conexion = JDBCUtilities.getConnection();
         String sql="DELETE FROM Proyecto\n" +
"WHERE ID_Proyecto=?";
         try {
            
            PreparedStatement statement =conexion.prepareStatement(sql);
            
            statement.setInt(1, id);
            
            statement.executeUpdate();
            return true;
            
            
            
        } catch (Exception e) {
             System.err.println("Error al eliminar");
             return false;
        } finally{
             try {
                 conexion.close();
             } catch (Exception e) {
                 System.err.println("Error al desconectar");
             }
         }
      
        
    }
            
    
}
