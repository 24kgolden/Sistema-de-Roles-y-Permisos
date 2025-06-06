package com.mycompany.login.igu;

import com.mycompany.login.logica.ControladoraJPA;
import com.mycompany.login.logica.User;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class PrincipalUser extends javax.swing.JFrame {

    ControladoraJPA control;
    User usr;

    public PrincipalUser(ControladoraJPA control, User usr) {
        initComponents();
        this.control = control;
        this.usr = usr;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUser = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnRecargar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNameUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Unispace", 1, 24)); // NOI18N
        jLabel4.setText("Sistema Administrador de Usuarios");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\edwar\\Downloads\\Simple Lined Black Login Page Wireframe Website UI Prototype.png")); // NOI18N
        jLabel2.setText("jLabel1");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 60));

        tablaUser.setBackground(new java.awt.Color(0, 0, 0));
        tablaUser.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        tablaUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaUser);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 210, 70));

        btnRecargar.setBackground(new java.awt.Color(0, 0, 0));
        btnRecargar.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        btnRecargar.setText("Recargar Tabla");
        btnRecargar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRecargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 210, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\edwar\\Downloads\\Fondo de Pantalla Escritorio PC Abstracto Moderno Degradado Negro (1).png")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -10, 730, 510));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 730, 510));

        txtNameUser.setEditable(false);
        txtNameUser.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        txtNameUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNameUser.setText("jTextField1");
        txtNameUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtNameUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(858, 10, 180, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\edwar\\Downloads\\Fondo de Pantalla Escritorio PC Abstracto Moderno Degradado Negro (1).png")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.txtNameUser.setText(usr.getNameUser());
        cargarTabla();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        cargarTabla();
    }//GEN-LAST:event_btnRecargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRecargar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUser;
    private javax.swing.JTextField txtNameUser;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        //definir el modelo que quermos que tenga la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            
            //que fila y columnas no sean editables
            //@Override
            public boolean iscellEditable(int row, int column) {
                return false;
            }
        };
        
        //establecemos los nombre de las columnas
        String titulos[] = {"ID","USER","Roll"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //tarer de la bd la lista de Uusuarios
        List<User> listauser = control.traerUser();
        
        //preguntamos si la lista es vacía
        if (listauser != null) {
            //recorrer la lista 
            for (User usu: listauser) {
               Object[] obj = {usu.getId(), usu.getNameUser(), usu.getOneRol().getNameRol()};
               
               modeloTabla.addRow(obj);
                
            }
        }
        
        tablaUser.setModel(modeloTabla);

    }
}
