/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Requerimiento_1;
import modelo.Requerimiento_1Dao;
import modelo.Requerimiento_2;
import modelo.Requerimiento_3;
import util.JDBCUtilities;
import static vista.VistaRequerimientos.controlador;

/**
 *
 * @author Mateo
 */
public class ProyectoConstruccionGui extends javax.swing.JFrame {
     Requerimiento_1Dao req1Dao=new Requerimiento_1Dao();
       Requerimiento_1 re=new Requerimiento_1();
      

    /**
     * Creates new form ProyectoConstruccionGui
     */
    public ProyectoConstruccionGui() throws SQLException {
        
        initComponents();
        actualizarTabla();
        actualizarTabla1();
        actualizarTabla2();
        

        
       
    }
    

    
     public void actualizarTabla() throws SQLException {
         jTableConsulta1.getColumnModel().getColumn(0).setPreferredWidth(-8);
         ArrayList<Requerimiento_1> requerimiento1 = controlador.consultarRequerimiento1();
        DefaultTableModel modelo = (DefaultTableModel) jTableConsulta1.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        int numcols = modelo.getColumnCount();
        for (Requerimiento_1 requerimiento : requerimiento1) {
            Object[] fila = new Object[numcols];
            fila[0]= requerimiento.getIdProyecto();
            fila[1] = requerimiento.getConstructora();
            fila[2] = requerimiento.getCiudad();
            fila[3] = requerimiento.getBanco();
            fila[4] = requerimiento.getPorcentaje();
            fila[5] = requerimiento.getClasificacion();
            fila[6] = requerimiento.getFecha();
            
            modelo.addRow(fila);
            //ExcelAdapter myAd = new ExcelAdapter(jTableAF);

        }
        
        

    }
     
     
     public void actualizarTabla1() throws SQLException {
         
      
        ArrayList<Requerimiento_2> requerimiento2 = controlador.consultarRequerimiento2();
        DefaultTableModel modelo1 = (DefaultTableModel) jTableConsulta2.getModel();
        //DefaultTableModel modelo2 = (DefaultTableModel) jTableConsulta1.getModel();
        //recorre cada una de los registros obtenidos en la consulta retornaUsuario
        while (modelo1.getRowCount()>0){
            modelo1.removeRow(0);
        }
        int numero = modelo1.getColumnCount();
        for (Requerimiento_2 requerimiento2s : requerimiento2){
            Object[] fila1 = new Object[numero];
            fila1[0]= requerimiento2s.getProveedor();
            fila1[1]= requerimiento2s.getConstructora();
            fila1[2]= requerimiento2s.getPagado();
            
            modelo1.addRow(fila1);
        }  

    }
      public void actualizarTabla2() throws SQLException {
         
      
        ArrayList<Requerimiento_3> requerimiento3 = controlador.consultarRequerimiento3();
        DefaultTableModel modelo2 = (DefaultTableModel) jTableConsultar3.getModel();
        //DefaultTableModel modelo2 = (DefaultTableModel) jTableConsulta1.getModel();
        //recorre cada una de los registros obtenidos en la consulta retornaUsuario
        while (modelo2.getRowCount()>0){
            modelo2.removeRow(0);
        }
        int numero = modelo2.getColumnCount();
        for (Requerimiento_3 requerimiento3s : requerimiento3){
            Object[] fila2 = new Object[numero];
            fila2[0]= requerimiento3s.getCargo();
            fila2[1]= requerimiento3s.getMaxSalario();
            
            
            modelo2.addRow(fila2);
        }  

    }
      
     /**public void agregar() throws SQLException{
        
        
        String constructora=JTextConstructora.getText();
        int numeroBancos=Integer.parseInt(jTextNumBancos.getText());
        int numeroHabitaciones=Integer.parseInt(jTextNumHabitaciones.getText());
        String acabados=jComboAcabados.getSelectedItem().toString();
        String serial=jTextSerial.getText();
        int idTipo=Integer.parseInt(jTextTipo.getText());
        int idLider=Integer.parseInt(jTextLider.getText());
        String ciudad=jTextCiudad.getText();
        String banco=JTextBanco.getText();
        Double porcentaje=Double.parseDouble(jTextPorcentaje.getText());
        String clasificacion=jTextClasificacion.getText();
        String fecha=jTextFecha.getText();
        
         re.setConstructora(constructora);
         re.setNumeroBancos(numeroBancos);
         re.setNumeroHabitaciones(numeroHabitaciones);
         re.setAcabados(acabados);
         re.setSerial(serial);
         re.setIdTipo(idTipo);
         re.setIdLider(idLider);
         re.setCiudad(ciudad);
         re.setBanco(banco);
         re.setPorcentaje(porcentaje);
         re.setClasificacion(clasificacion);
         re.setFecha(fecha);
         
        
         
    }
  **/

     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTPprincipal = new javax.swing.JTabbedPane();
        jPConsulta1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFecha = new javax.swing.JTextField();
        JTextConstructora = new javax.swing.JTextField();
        jTextNumBancos = new javax.swing.JTextField();
        jTextNumHabitaciones = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JTextBanco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextPorcentaje = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextCiudad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextClasificacion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboAcabados = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jTextSerial = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextTipo = new javax.swing.JTextField();
        jTextLider = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsulta1 = new javax.swing.JTable();
        BtnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jPConsulta2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableConsulta2 = new javax.swing.JTable();
        jPConsulta3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSplitPane3 = new javax.swing.JSplitPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableConsultar3 = new javax.swing.JTable();
        jMOpciones = new javax.swing.JMenuBar();
        jMFile = new javax.swing.JMenu();
        jMExit = new javax.swing.JMenuItem();
        jMOpcion = new javax.swing.JMenu();
        jMConsulta1 = new javax.swing.JMenuItem();
        jMConsulta2 = new javax.swing.JMenuItem();
        jMConsulta3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyectos Construccion");

        jTPprincipal.setBackground(new java.awt.Color(255, 255, 255));

        jPConsulta1.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Proyectos");
        jPConsulta1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel4.setText("Fecha:");

        jLabel5.setText("Constructora:");

        jLabel6.setText("Número Bancos:");

        jLabel7.setText("Habitaciones:");

        JTextConstructora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextConstructoraActionPerformed(evt);
            }
        });

        jLabel8.setText("Banco vinculado:");

        jLabel9.setText("Porcentaje:");

        jTextPorcentaje.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel10.setText("Ciudad:");

        jTextCiudad.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel11.setText("Clasificación:");

        jTextClasificacion.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel12.setText("Acabados:");

        jComboAcabados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        jComboAcabados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboAcabadosActionPerformed(evt);
            }
        });

        jLabel13.setText("Serial:");

        jLabel14.setText("Id Tipo:");

        jLabel15.setText("Id Lider:");

        jTableConsulta1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id_proyecto", "Constructora", "Ciudad", "Banco Vinculado", "Porcentaje", "Clasificación", "Fecha Inicio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableConsulta1);
        if (jTableConsulta1.getColumnModel().getColumnCount() > 0) {
            jTableConsulta1.getColumnModel().getColumn(0).setResizable(false);
            jTableConsulta1.getColumnModel().getColumn(1).setResizable(false);
            jTableConsulta1.getColumnModel().getColumn(2).setResizable(false);
            jTableConsulta1.getColumnModel().getColumn(3).setResizable(false);
            jTableConsulta1.getColumnModel().getColumn(4).setResizable(false);
            jTableConsulta1.getColumnModel().getColumn(5).setResizable(false);
            jTableConsulta1.getColumnModel().getColumn(6).setResizable(false);
        }

        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextNumBancos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextNumHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jTextFecha))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JTextConstructora)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(JTextBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jTextCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextLider, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboAcabados, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(22, 22, 22)
                                                .addComponent(jTextTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 277, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(JTextBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jComboAcabados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTextConstructora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jTextSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextNumBancos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jTextTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextNumHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jTextLider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jTextNumHabitaciones.getAccessibleContext().setAccessibleName("Número");
        jTextNumHabitaciones.getAccessibleContext().setAccessibleDescription("Número habitaciones");

        jPConsulta1.add(jPanel1, java.awt.BorderLayout.CENTER);

        jTPprincipal.addTab("Consulta1", jPConsulta1);

        jPConsulta2.setLayout(new java.awt.BorderLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Proveedor");
        jPConsulta2.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel3.setPreferredSize(new java.awt.Dimension(666, 500));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jSplitPane2.setTopComponent(jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jTableConsulta2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Proveedor", "Constructora", "Pagado"
            }
        ));
        jScrollPane2.setViewportView(jTableConsulta2);

        jPanel4.add(jScrollPane2, java.awt.BorderLayout.PAGE_START);

        jSplitPane2.setRightComponent(jPanel4);

        jPConsulta2.add(jSplitPane2, java.awt.BorderLayout.CENTER);

        jTPprincipal.addTab("Consulta2", jPConsulta2);

        jPConsulta3.setLayout(new java.awt.BorderLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Salario máximo");
        jPConsulta3.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jSplitPane3.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jSplitPane3.setTopComponent(jPanel5);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jTableConsultar3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cargo", "MAX(Salario)"
            }
        ));
        jScrollPane3.setViewportView(jTableConsultar3);
        if (jTableConsultar3.getColumnModel().getColumnCount() > 0) {
            jTableConsultar3.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel6.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jSplitPane3.setRightComponent(jPanel6);

        jPConsulta3.add(jSplitPane3, java.awt.BorderLayout.CENTER);

        jTPprincipal.addTab("Consulta3", jPConsulta3);

        getContentPane().add(jTPprincipal, java.awt.BorderLayout.CENTER);

        jMFile.setText("File");

        jMExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMExit.setText("Exit");
        jMExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMExitActionPerformed(evt);
            }
        });
        jMFile.add(jMExit);

        jMOpciones.add(jMFile);

        jMOpcion.setText("Edit");

        jMConsulta1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMConsulta1.setText("Consulta1");
        jMConsulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsulta1ActionPerformed(evt);
            }
        });
        jMOpcion.add(jMConsulta1);

        jMConsulta2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMConsulta2.setText("Consulta2");
        jMConsulta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsulta2ActionPerformed(evt);
            }
        });
        jMOpcion.add(jMConsulta2);

        jMConsulta3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMConsulta3.setText("Consulta3");
        jMConsulta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsulta3ActionPerformed(evt);
            }
        });
        jMOpcion.add(jMConsulta3);

        jMOpciones.add(jMOpcion);

        setJMenuBar(jMOpciones);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMConsulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsulta1ActionPerformed
        jTPprincipal.setSelectedIndex(0);
    }//GEN-LAST:event_jMConsulta1ActionPerformed

    private void jMConsulta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsulta2ActionPerformed
         jTPprincipal.setSelectedIndex(1);
        
    }//GEN-LAST:event_jMConsulta2ActionPerformed

    private void jMConsulta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsulta3ActionPerformed
        jTPprincipal.setSelectedIndex(2);
    }//GEN-LAST:event_jMConsulta3ActionPerformed

    private void jMExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMExitActionPerformed
                                             
        if (JOptionPane.showConfirmDialog(this, "¿Desea cerrar la aplicación?", 
             getTitle(), JOptionPane.YES_NO_OPTION,
             JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
         
         dispose();
     
     
    } 
    }//GEN-LAST:event_jMExitActionPerformed

    private void jComboAcabadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboAcabadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboAcabadosActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        // TODO add your handling code here:
        String sql="INSERT INTO Proyecto\n" +
"( Fecha_Inicio, Constructora, Numero_Banos, Numero_Habitaciones, Banco_Vinculado, Porcentaje_Cuota_Inicial, Ciudad, Clasificacion, Acabados, Serial, ID_Tipo, ID_Lider)\n" +
"VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection conexion = JDBCUtilities.getConnection();
            PreparedStatement statement =conexion.prepareStatement(sql);
            statement.setString(1, jTextFecha.getText());
            statement.setString(2, JTextConstructora.getText());
            statement.setInt(3, Integer.parseInt(jTextNumBancos.getText()));
            statement.setInt(4, Integer.parseInt(jTextNumHabitaciones.getText()));
            statement.setString(5, JTextBanco.getText());
            statement.setDouble(6, Double.parseDouble(jTextPorcentaje.getText()));
            statement.setString(7, jTextCiudad.getText());
            statement.setString(8, jTextClasificacion.getText());
            statement.setString(9, jComboAcabados.getSelectedItem().toString());
            statement.setString(10, jTextSerial.getText());
            statement.setInt(11, Integer.parseInt(jTextTipo.getText()));
            statement.setInt(12, Integer.parseInt(jTextLider.getText()));
            
            int res=statement.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null, "Guardado Correctamente");
            }else{
               JOptionPane.showMessageDialog(null, "Error");
            }
            conexion.close();
            
        } catch (Exception e) {
        }
         try {
             actualizarTabla();
         } catch (SQLException ex) {
             Logger.getLogger(ProyectoConstruccionGui.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void JTextConstructoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextConstructoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextConstructoraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProyectoConstruccionGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProyectoConstruccionGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProyectoConstruccionGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProyectoConstruccionGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ProyectoConstruccionGui().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ProyectoConstruccionGui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnAgregar;
    public javax.swing.JTextField JTextBanco;
    public javax.swing.JTextField JTextConstructora;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JComboBox<String> jComboAcabados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMConsulta1;
    private javax.swing.JMenuItem jMConsulta2;
    private javax.swing.JMenuItem jMConsulta3;
    private javax.swing.JMenuItem jMExit;
    private javax.swing.JMenu jMFile;
    private javax.swing.JMenu jMOpcion;
    private javax.swing.JMenuBar jMOpciones;
    private javax.swing.JPanel jPConsulta1;
    private javax.swing.JPanel jPConsulta2;
    private javax.swing.JPanel jPConsulta3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JTabbedPane jTPprincipal;
    public javax.swing.JTable jTableConsulta1;
    private javax.swing.JTable jTableConsulta2;
    private javax.swing.JTable jTableConsultar3;
    public javax.swing.JTextField jTextCiudad;
    public javax.swing.JTextField jTextClasificacion;
    public javax.swing.JTextField jTextFecha;
    public javax.swing.JTextField jTextLider;
    public javax.swing.JTextField jTextNumBancos;
    public javax.swing.JTextField jTextNumHabitaciones;
    public javax.swing.JTextField jTextPorcentaje;
    public javax.swing.JTextField jTextSerial;
    public javax.swing.JTextField jTextTipo;
    public javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
