package GUI;

import Codigo.*;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class VentanaRegistrarVentasVoucher extends javax.swing.JFrame {
    
    Venta[] ventaAux;
    DefaultTableModel modelo;
    
    public VentanaRegistrarVentasVoucher() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(new Color (0, 0, 0, 0));
	jPanel1.setBackground (new Color (0, 0, 0, 0));
        botonCerrar.setBackground (new Color (0, 0, 0, 0));
        
        modelo = new DefaultTableModel();
        modelo.addColumn("Cantidad");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        this.jTableCompras.setModel(modelo);
        
        ventaAux = Botica.vent.obtenerArrayListaVenta();
        
        int cantVentas = Botica.vent.cantElementos();   //Cantidad de objetos Ventas(Almacena todas las "compras del cliente" en un momento dado)
        
        Cliente c = ventaAux[cantVentas-1].getC();
        jLabelNombre.setText(c.getNombre());
        jLabelDNI.setText(c.getDNI());
        jLabelMes.setText(Integer.toString(ventaAux[cantVentas-1].getMes()));
        
        //Añadiendo columnas de la venta
        DetalleVenta[] detAux;
        detAux = ventaAux[cantVentas-1].obtenerArrayListaDetalleVenta();    //detAux: array de compras realizadas por un cliente en instante dado
        int numeroCompras = ventaAux[cantVentas-1].contadorDetalleVenta();
        
        for(int i=0;i<numeroCompras;i++){
            String[] newRow={Integer.toString(detAux[i].getCantidadComprada()),detAux[i].getM().getNombre(),Double.toString(detAux[i].getSubtotal())};
            modelo.addRow(newRow);
        }
        jLabelPrecioTotal.setText(Double.toString(ventaAux[cantVentas-1].getTotal()));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelDNI = new javax.swing.JLabel();
        jLabelMes = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCompras = new javax.swing.JTable();
        jLabelPrecioTotal = new javax.swing.JLabel();
        botonCerrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BotonMenu = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombre.setFont(new java.awt.Font("Berlin Sans FB", 2, 18)); // NOI18N
        jPanel1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 290, 30));

        jLabelDNI.setFont(new java.awt.Font("Berlin Sans FB", 2, 18)); // NOI18N
        jPanel1.add(jLabelDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 142, 29));

        jLabelMes.setFont(new java.awt.Font("Berlin Sans FB", 2, 18)); // NOI18N
        jPanel1.add(jLabelMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 132, 31));

        jTableCompras.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jTableCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cantidad", "Descripción", "Precio"
            }
        ));
        jScrollPane3.setViewportView(jTableCompras);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 540, 150));

        jLabelPrecioTotal.setFont(new java.awt.Font("Berlin Sans FB", 2, 18)); // NOI18N
        jPanel1.add(jLabelPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 105, 31));

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

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Botica TuSalud");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 130, 40));

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 1, 50)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Voucher");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 220, 70));

        BotonMenu.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        BotonMenu.setText("Menú");
        BotonMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonMenu.setBorderPainted(false);
        BotonMenu.setContentAreaFilled(false);
        BotonMenu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BotonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenuActionPerformed(evt);
            }
        });
        jPanel1.add(BotonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, 100, 48));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 1, 20)); // NOI18N
        jLabel6.setText("Detalle de compra");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 210, 37));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 1, 20)); // NOI18N
        jLabel7.setText("Datos del cliente");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 210, 37));

        jLabel17.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel17.setText("Nombre:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 90, 27));

        jLabel18.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel18.setText("DNI:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 90, 27));

        jLabel19.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel19.setText("Mes:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 90, 27));

        jLabel20.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel20.setText("Precio Total:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 120, 27));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VentanaRegistrarVentasVoucher.png"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 730));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void BotonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenuActionPerformed
        // TODO add your handling code here:
        VentanaInicio v_inicial = new VentanaInicio();
        this.setVisible(false);
        v_inicial.setVisible(true);
    }//GEN-LAST:event_BotonMenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonMenu;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelMes;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPrecioTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableCompras;
    // End of variables declaration//GEN-END:variables
}
