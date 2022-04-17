package GUI;

import Codigo.*;
import java.awt.Color;
import javax.swing.JOptionPane;

public class VentanaRegistrarVentas extends javax.swing.JFrame {
    
    public static String dni;
    public static String nombre;
    public static int edad;
    public static int mes;
    
    public VentanaRegistrarVentas() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(new Color (0, 0, 0, 0));
	jPanel1.setBackground (new Color (0, 0, 0, 0));
        botonCerrar.setBackground (new Color (0, 0, 0, 0));
        
        dni="";
        nombre="";
        edad=0;
        mes=0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextDNI = new javax.swing.JTextField();
        jTextDireccion = new javax.swing.JTextField();
        jTextEdad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        botonCerrar = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        BotonMenu = new javax.swing.JButton();
        jComboMes = new javax.swing.JComboBox<>();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel2.setText("DATOS PERSONALES DEL CLIENTE");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 340, 37));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel3.setText("Nombre y apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 190, 27));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel4.setText("Edad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 81, 29));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel5.setText("Dirección: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 97, 28));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel6.setText("Mes de compra:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 160, 32));

        jTextNombre.setFont(new java.awt.Font("Berlin Sans FB", 2, 18)); // NOI18N
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        jTextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreKeyTyped(evt);
            }
        });
        jPanel1.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 380, 37));

        jTextDNI.setFont(new java.awt.Font("Berlin Sans FB", 2, 18)); // NOI18N
        jTextDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDNIActionPerformed(evt);
            }
        });
        jTextDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDNIKeyTyped(evt);
            }
        });
        jPanel1.add(jTextDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 220, 37));

        jTextDireccion.setFont(new java.awt.Font("Berlin Sans FB", 2, 18)); // NOI18N
        jTextDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDireccionKeyTyped(evt);
            }
        });
        jPanel1.add(jTextDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 300, 37));

        jTextEdad.setFont(new java.awt.Font("Berlin Sans FB", 2, 18)); // NOI18N
        jTextEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEdadActionPerformed(evt);
            }
        });
        jTextEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextEdadKeyTyped(evt);
            }
        });
        jPanel1.add(jTextEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 100, 37));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel7.setText("DNI:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 81, 29));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Botica TuSalud");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 130, 40));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        jLabel10.setText("Siguiente");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, 120, 40));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 1, 50)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Registrar Ventas");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 420, 70));

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

        botonSiguiente.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        botonSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VentanaRegistrarVentas1B1.png"))); // NOI18N
        botonSiguiente.setBorderPainted(false);
        botonSiguiente.setContentAreaFilled(false);
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(botonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, 220, 70));

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
        jPanel1.add(BotonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, 100, 48));

        jComboMes.setFont(new java.awt.Font("Berlin Sans FB", 2, 18)); // NOI18N
        jComboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre" }));
        jComboMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboMesActionPerformed(evt);
            }
        });
        jPanel1.add(jComboMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 160, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VentanaRegistrarVentas1.png"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 690));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDNIActionPerformed

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        // TODO add your handling code here:
        if(!jTextNombre.getText().equals("")&&!jTextDNI.getText().equals("")&&!jTextDireccion.getText().equals("")&&!jTextEdad.getText().equals("")){
            //Validamos dni y edad
            if(validarDNI_EDAD(jTextDNI.getText(),jTextEdad.getText())){
                Cliente nuevo = new Cliente(jTextDNI.getText(),jTextNombre.getText(),Integer.parseInt(jTextEdad.getText())); //String DNI, String nombre, int edad
                dni = jTextDNI.getText();
                nombre = jTextNombre.getText();
                edad = Integer.parseInt(jTextEdad.getText());
                mes = jComboMes.getSelectedIndex() + 1;

                VentanaRegistrarVentasMed ventReg2 = new VentanaRegistrarVentasMed();
                ventReg2.setVisible(true);
                this.setVisible(false);
                setLocationRelativeTo(null);
            }else{
                JOptionPane.showMessageDialog(null, "Debe ingresar un numero valido para DNI y edad", "Error", JOptionPane.WARNING_MESSAGE);
                jTextNombre.setText("");
                jTextDNI.setText("");
                jTextDireccion.setText("");
                jTextEdad.setText("");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Complete todos los campos", "Error", JOptionPane.WARNING_MESSAGE);
        }  
    }//GEN-LAST:event_botonSiguienteActionPerformed

    public boolean validarDNI_EDAD(String dni, String edad){
        int numDni = Integer.parseInt(dni);
        int numedad = Integer.parseInt(edad);
        if((numDni>=10000000 && numDni<100000000) &&(numedad>=18 &&numedad<=100)){
                return true;
        }
        return false;
    }
    private void jTextEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEdadActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void BotonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenuActionPerformed
        // TODO add your handling code here:
        VentanaInicio v_inicial = new VentanaInicio();
        this.setVisible(false);
        v_inicial.setVisible(true);
    }//GEN-LAST:event_BotonMenuActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        
        if (!Character.isLetter(validar) && validar != ' ') {
            evt.consume();
            JOptionPane.showMessageDialog(null, "El campo NOMBRE Y APELLIDO solo requiere letras");
        }
    }//GEN-LAST:event_jTextNombreKeyTyped

    private void jTextDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDireccionKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        
        if (!Character.isLetter(validar) && !Character.isDigit(validar) && validar != ' ') {
            evt.consume();
            JOptionPane.showMessageDialog(null, "El campo DIRECCION no acepta símbolos");
        }
    }//GEN-LAST:event_jTextDireccionKeyTyped

    private void jComboMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboMesActionPerformed
        // TODO add your handling code here:    
    }//GEN-LAST:event_jComboMesActionPerformed

    private void jTextDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDNIKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        
        if (!Character.isDigit(validar)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "El campo DNI solo requiere números");
        }
    }//GEN-LAST:event_jTextDNIKeyTyped

    private void jTextEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextEdadKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        
        if (!Character.isDigit(validar)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "El campo EDAD solo requiere números");
        }
    }//GEN-LAST:event_jTextEdadKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonMenu;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JLabel fondo;
    private javax.swing.JComboBox<String> jComboMes;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextDNI;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextEdad;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables
}