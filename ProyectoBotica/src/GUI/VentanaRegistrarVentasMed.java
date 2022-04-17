package GUI;

import Codigo.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaRegistrarVentasMed extends javax.swing.JFrame {
    
    Medicamento[] aux;
    DefaultTableModel modelo;
    Venta v = new Venta(new Cliente(VentanaRegistrarVentas.dni, VentanaRegistrarVentas.nombre, VentanaRegistrarVentas.edad), VentanaRegistrarVentas.mes); //Cliente(String DNI, String nombre, int edad)
    
    public VentanaRegistrarVentasMed() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(new Color (0, 0, 0, 0));
	jPanel1.setBackground (new Color (0, 0, 0, 0));
        botonCerrar.setBackground (new Color (0, 0, 0, 0));
        
        aux =Botica.inv.obtenerArrayDeListaMedicamento();
        
        int cantInventario = Botica.inv.cantElementos();
        for(int i=0;i<cantInventario;i++){
            ListaMedicamentos.addItem(aux[i].getNombre());
        }
        
        modelo = new DefaultTableModel();
        modelo.addColumn("Descripcion");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio/unidad");
        modelo.addColumn("Total");
        this.jTableVentas.setModel(modelo);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        ListaMedicamentos = new javax.swing.JComboBox<>();
        jSpinnerCantidad = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVentas = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BotonAgregar = new javax.swing.JButton();
        BotonSiguiente = new javax.swing.JButton();
        botonCerrar = new javax.swing.JButton();
        BotonRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ListaMedicamentos.setFont(new java.awt.Font("Berlin Sans FB", 2, 18)); // NOI18N
        ListaMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaMedicamentosActionPerformed(evt);
            }
        });
        jPanel1.add(ListaMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 160, 30));

        jSpinnerCantidad.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jSpinnerCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000, 1));
        jPanel1.add(jSpinnerCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 186, 50, 30));

        jTableVentas.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jTableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Descripción", "Cantidad", "Precio/Unidad", "Total"
            }
        ));
        jScrollPane2.setViewportView(jTableVentas);
        if (jTableVentas.getColumnModel().getColumnCount() > 0) {
            jTableVentas.getColumnModel().getColumn(0).setResizable(false);
            jTableVentas.getColumnModel().getColumn(1).setResizable(false);
            jTableVentas.getColumnModel().getColumn(2).setResizable(false);
            jTableVentas.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 660, 270));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 1, 50)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Registrar Ventas");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 420, 70));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Botica TuSalud");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 130, 30));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        jLabel10.setText("Siguiente");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, 120, 50));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel4.setText("Medicamento:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 150, 27));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel5.setText("Agregar");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 90, 30));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel6.setText("Cantidad: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 110, 28));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel7.setText("Cantidad: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 110, 28));

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel11.setText("Cantidad: ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 110, 28));

        BotonAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VentanaRegistrarVentasMedB1.png"))); // NOI18N
        BotonAgregar.setBorderPainted(false);
        BotonAgregar.setContentAreaFilled(false);
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 190, 60));

        BotonSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VentanaRegistrarVentasMedB2.png"))); // NOI18N
        BotonSiguiente.setToolTipText("");
        BotonSiguiente.setBorderPainted(false);
        BotonSiguiente.setContentAreaFilled(false);
        BotonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(BotonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 210, 60));

        botonCerrar.setForeground(new java.awt.Color(252, 96, 92));
        botonCerrar.setText(".....");
        botonCerrar.setToolTipText("");
        botonCerrar.setBorder(null);
        botonCerrar.setBorderPainted(false);
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, 20));

        BotonRegresar.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        BotonRegresar.setText("Regresar");
        BotonRegresar.setBorderPainted(false);
        BotonRegresar.setContentAreaFilled(false);
        BotonRegresar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BotonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 590, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VentanaRegistrarVentasMed.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 680));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiguienteActionPerformed
        // TODO add your handling code here:
        if(modelo.getRowCount()!=0){
            Botica.vent.AgregarVenta(v);

            VentanaRegistrarVentasVoucher ventReg3 = new VentanaRegistrarVentasVoucher();
            ventReg3.setVisible(true);
            this.setVisible(false);
            setLocationRelativeTo(null);      
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos un producto para la registrar venta");
        }
    }//GEN-LAST:event_BotonSiguienteActionPerformed

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
        // TODO add your handling code here:
        VentanaRegistrarVentas ventReg = new VentanaRegistrarVentas();
        this.setVisible(false);
        ventReg.setVisible(true);
    }//GEN-LAST:event_BotonRegresarActionPerformed

    private void ListaMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaMedicamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaMedicamentosActionPerformed

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        // TODO add your handling code here:
        if((Integer)jSpinnerCantidad.getValue()!=0){
            for(int i = 0; i < Botica.inv.cantElementos(); i++){

                if(aux[i].getNombre().equals((String) ListaMedicamentos.getSelectedItem())){

                    int stock = aux[i].getStock();
                    int cantVender = (Integer) jSpinnerCantidad.getValue();

                    if(stock-cantVender<0){
                        JOptionPane.showMessageDialog(null, "No hay stock suficiente");
                    }
                    else{
                        aux[i].setStock(stock-cantVender);
                        Botica.inv.modificarMedicamento(i, aux[i]);

                        String[] newRow={aux[i].getNombre(),Integer.toString(cantVender),Double.toString(aux[i].getPrecio()),Double.toString(cantVender*aux[i].getPrecio())};
                        modelo.addRow(newRow);
                        v.agregarDetalleVenta(aux[i], cantVender);
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe indicar la cantidad de medicamentos a comprar");
        }
    }//GEN-LAST:event_BotonAgregarActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonCerrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JButton BotonSiguiente;
    private javax.swing.JComboBox<String> ListaMedicamentos;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableVentas;
    // End of variables declaration//GEN-END:variables
}
