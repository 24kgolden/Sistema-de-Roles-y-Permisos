package com.mycompany.login.igu;

//import com.mycompany.login.logica.AltasUser;
import com.mycompany.login.logica.ControladoraJPA;
import com.mycompany.login.logica.User;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PrincipalAdmin extends javax.swing.JFrame {

    ControladoraJPA control;
    User usr;

    public PrincipalAdmin(ControladoraJPA control, User usr) {
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
        btnNuevoUsuario = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnRecargar = new javax.swing.JButton();
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
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 210, 70));

        btnNuevoUsuario.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevoUsuario.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        btnNuevoUsuario.setText("Crear Nuevo Usuario");
        btnNuevoUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 210, 70));

        btnEditar.setBackground(new java.awt.Color(0, 0, 0));
        btnEditar.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        btnEditar.setText("Editar Usuario");
        btnEditar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 210, 70));

        btnBorrar.setBackground(new java.awt.Color(0, 0, 0));
        btnBorrar.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        btnBorrar.setText("Borrar Usuario");
        btnBorrar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 210, 70));

        btnRecargar.setBackground(new java.awt.Color(0, 0, 0));
        btnRecargar.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        btnRecargar.setText("Recargar Tabla");
        btnRecargar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRecargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 210, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 730, 510));

        txtNameUser.setEditable(false);
        txtNameUser.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        txtNameUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNameUser.setText("jTextField1");
        txtNameUser.setBorder(null);
        jPanel1.add(txtNameUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 10, 200, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\edwar\\Downloads\\Fondo de Pantalla Escritorio PC Abstracto Moderno Degradado Negro (2).png")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.txtNameUser.setText(usr.getNameUser());
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

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
        String titulos[] = {"ID", "USER", "Roll"};
        modeloTabla.setColumnIdentifiers(titulos);

        //tarer de la bd la lista de Uusuarios
        List<User> listauser = control.traerUser();

        //preguntamos si la lista es vacía
        if (listauser != null) {
            //recorrer la lista 
            for (User usu : listauser) {
                Object[] obj = {usu.getId(), usu.getNameUser(), usu.getOneRol().getNameRol()};

                modeloTabla.addRow(obj);

            }
        }

        tablaUser.setModel(modeloTabla);

    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
        AltasUser altaUsu = new AltasUser(control);
        altaUsu.setVisible(true);
        altaUsu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        cargarTabla();
    }//GEN-LAST:event_btnRecargarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        //Validar que la tabla tenga elementos
        if (tablaUser.getRowCount() > 0) {
            //Controlor que se haya seleccioando un elemento
            if (tablaUser.getSelectedRow() != -1) {
                //obtengo la id del elemento a elimnar
                int id_user = Integer.parseInt(String.valueOf(tablaUser.getValueAt(tablaUser.getSelectedRow(), 0)));
                //llamo al metodo borrar
                control.borrarUser(id_user);
                //avisar al usuario que se borro correctamente
                mostrarMensaje("Se borró el usuario correctamente", "Info", "Eliminación Correcta");
                //Cargar datos
                cargarTabla();
            } else {
                mostrarMensaje("No se lecciono ningún registro", "Error", "Error al borrar");
            }

        } else {
            mostrarMensaje("La tabla está vacía", "Error", "Error al borrar");
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //Validar que la tabla tenga elementos
        if (tablaUser.getRowCount() > 0) {
            //Controlor que se haya seleccioando un elemento
            if (tablaUser.getSelectedRow() != -1) {
                //obtengo la id del elemento a elimnar
                int id_user = Integer.parseInt(String.valueOf(tablaUser.getValueAt(tablaUser.getSelectedRow(), 0)));
                
                //llamo a la bentana de edicion
                EdicionUser pantallEdic = new EdicionUser(control,id_user);
                pantallEdic.setVisible(true);
                pantallEdic.setLocationRelativeTo(null);
            } 
        } 
    }//GEN-LAST:event_btnEditarActionPerformed

    //Metodo mostrar mensaje
    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUser;
    private javax.swing.JTextField txtNameUser;
    // End of variables declaration//GEN-END:variables
}
