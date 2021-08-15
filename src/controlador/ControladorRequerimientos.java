/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Requerimiento_1;
import modelo.Requerimiento_1Dao;
import modelo.Requerimiento_2;
import modelo.Requerimiento_2Dao;
import modelo.Requerimiento_3;
import modelo.Requerimiento_3Dao;
import vista.ProyectoConstruccionGui;
import vista.VistaRequerimientos;


/**
 *
 * @author Mateo
 */
public class ControladorRequerimientos implements ActionListener{
    private final Requerimiento_1Dao requerimiento1Dao;
    private final Requerimiento_2Dao requerimiento2Dao;
    private final Requerimiento_3Dao requerimiento3Dao;
    private ProyectoConstruccionGui pro;
    private Requerimiento_1 re;
    

    public ControladorRequerimientos(Requerimiento_1Dao requerimiento1Dao, Requerimiento_2Dao requerimiento2Dao, Requerimiento_3Dao requerimiento3Dao, ProyectoConstruccionGui pro, Requerimiento_1 re) {
        this.requerimiento1Dao = requerimiento1Dao;
        this.requerimiento2Dao = requerimiento2Dao;
        this.requerimiento3Dao = requerimiento3Dao;
        this.pro = pro;
        this.re = re;
        this.pro.BtnAgregar.addActionListener(this);
        //this.pro.btnActualizar.addActionListener(this);
        this.pro.btnEliminar.addActionListener(this);
    }
    
     
    
    
     
     public ControladorRequerimientos()  {
        this.requerimiento1Dao = new Requerimiento_1Dao();
        this.requerimiento2Dao = new Requerimiento_2Dao();
        this.requerimiento3Dao = new Requerimiento_3Dao();
       
        this.re = new Requerimiento_1();
        

    }
      public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
        // Su código
        return this.requerimiento1Dao.requerimiento1();

    }
    
    public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        // Su código
        return this.requerimiento2Dao.requerimiento2();
        

    }

    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        // Su código
        return this.requerimiento3Dao.requerimiento3();
       

    } 
    public void iniciar(){
        pro.setTitle("Proyecto");
        pro.setLocationRelativeTo(null);
        pro.txtID.setVisible(false);
        
    }
    
     @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==pro.BtnAgregar){
            
            re.setConstructora(pro.JTextConstructora.getText());
            re.setNumeroBancos(Integer.parseInt(pro.jTextNumBancos.getText()));
            re.setNumeroHabitaciones(Integer.parseInt(pro.jTextNumHabitaciones.getText()));
            re.setAcabados(pro.jComboAcabados.getSelectedItem().toString());
            re.setSerial(pro.jTextSerial.getText());
            re.setIdTipo(Integer.parseInt(pro.jTextTipo.getText()));
            re.setIdLider(Integer.parseInt(pro.jTextLider.getText()));
            re.setCiudad(pro.jTextCiudad.getText());
            re.setBanco(pro.JTextBanco.getText());
            re.setPorcentaje(Double.parseDouble(pro.jTextPorcentaje.getText()));
            re.setClasificacion(pro.jTextClasificacion.getText());
            re.setFecha(pro.jTextFecha.getText());
            
            try {
                if(requerimiento1Dao.agregar(re)){
                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                    limpiar();
                }else{
                    JOptionPane.showMessageDialog(null, "Error al guardar");
                }
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Registro inválido");
            }
        }

        
         if(e.getSource()==pro.btnEliminar){
             int fila=pro.jTableConsulta1.getSelectedRow();
             int id=Integer.parseInt((String) pro.jTableConsulta1.getValueAt(fila, 0).toString());
             if (fila==-1){
                 JOptionPane.showMessageDialog(null, "debe seleccionar una fila");
             }else{
                 try {
                     requerimiento1Dao.eliminar(id);
                     pro.actualizarTabla();
                     JOptionPane.showMessageDialog(null, "Proyecto eliminado");
                 } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null, "debe seleccionar una fila");
                 }
                 
             }
       
        }
        
        
    }
    
    public void limpiar(){
        pro.JTextConstructora.setText(null);
        pro.JTextBanco.setText(null);
        pro.jTextCiudad.setText(null);
        pro.jTextPorcentaje.setText(null);
        pro.jTextFecha.setText(null);
        pro.jTextLider.setText(null);
        pro.jTextNumBancos.setText(null);
        pro.jTextNumHabitaciones.setText(null);
        pro.jTextTipo.setText(null);
        pro.jTextSerial.setText(null);
        pro.txtID.setText(null);
        pro.jTextClasificacion.setText(null);
        
    }
    
    
}
