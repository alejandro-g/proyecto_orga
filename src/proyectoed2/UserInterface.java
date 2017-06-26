/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoed2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego
 */
public class UserInterface extends javax.swing.JFrame {

    Tda_arlf file;

    /**
     * Creates new form UserInterface
     */
    public UserInterface() {
        initComponents();
        try {
            file = new Tda_arlf(new File("./Registros.rg"));
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insertRegistro = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_salario = new javax.swing.JTextField();
        jb_addRegistro = new javax.swing.JButton();
        tf_birthdate = new javax.swing.JTextField();
        modifyRegistro = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        cb_registros = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_modifyNombre = new javax.swing.JTextField();
        tf_modifyID = new javax.swing.JTextField();
        tf_modifyBirthdate = new javax.swing.JTextField();
        tf_modifySalario = new javax.swing.JTextField();
        jb_modify = new javax.swing.JButton();
        listarRegistros = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_registros = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jb_agregar = new javax.swing.JButton();
        jb_listar = new javax.swing.JButton();
        jb_modificar = new javax.swing.JButton();
        jb_search = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        leerindex = new javax.swing.JButton();

        jLabel2.setText("Creacion de Registros");

        jLabel3.setText("Nombre: ");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ID: ");

        jLabel5.setText("Birthdate:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Salary:");

        jb_addRegistro.setText("Agregar Registro");
        jb_addRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_addRegistroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout insertRegistroLayout = new javax.swing.GroupLayout(insertRegistro.getContentPane());
        insertRegistro.getContentPane().setLayout(insertRegistroLayout);
        insertRegistroLayout.setHorizontalGroup(
            insertRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertRegistroLayout.createSequentialGroup()
                .addGroup(insertRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(insertRegistroLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(insertRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(insertRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_id)
                            .addComponent(tf_nombre)
                            .addComponent(tf_salario)
                            .addComponent(tf_birthdate, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)))
                    .addGroup(insertRegistroLayout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel2))
                    .addGroup(insertRegistroLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jb_addRegistro)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        insertRegistroLayout.setVerticalGroup(
            insertRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertRegistroLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(insertRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(insertRegistroLayout.createSequentialGroup()
                        .addGroup(insertRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(insertRegistroLayout.createSequentialGroup()
                                .addGroup(insertRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(39, 39, 39)
                                .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(44, 44, 44)
                        .addGroup(insertRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tf_birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addComponent(tf_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(136, 136, 136)
                .addComponent(jb_addRegistro)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jLabel7.setText("Modificar Registros");

        cb_registros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_registros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_registrosItemStateChanged(evt);
            }
        });

        jLabel8.setText("Nombre: ");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ID: ");

        jLabel10.setText("Birthdate:");

        jLabel11.setText("Salario:");

        jb_modify.setText("Modify Registro");

        javax.swing.GroupLayout modifyRegistroLayout = new javax.swing.GroupLayout(modifyRegistro.getContentPane());
        modifyRegistro.getContentPane().setLayout(modifyRegistroLayout);
        modifyRegistroLayout.setHorizontalGroup(
            modifyRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modifyRegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(312, 312, 312))
            .addGroup(modifyRegistroLayout.createSequentialGroup()
                .addGroup(modifyRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modifyRegistroLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(modifyRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addGroup(modifyRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(40, 40, 40)
                        .addGroup(modifyRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_registros, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(modifyRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tf_modifySalario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                .addComponent(tf_modifyBirthdate, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_modifyID, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_modifyNombre, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(modifyRegistroLayout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jb_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        modifyRegistroLayout.setVerticalGroup(
            modifyRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyRegistroLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addGap(33, 33, 33)
                .addComponent(cb_registros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(modifyRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_modifyNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(modifyRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_modifyID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(modifyRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(tf_modifyBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(modifyRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_modifySalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(jb_modify)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jLabel12.setText("Listar Registros");

        table_registros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table_registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Birthdate", "Id", "Salario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_registros);

        javax.swing.GroupLayout listarRegistrosLayout = new javax.swing.GroupLayout(listarRegistros.getContentPane());
        listarRegistros.getContentPane().setLayout(listarRegistrosLayout);
        listarRegistrosLayout.setHorizontalGroup(
            listarRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listarRegistrosLayout.createSequentialGroup()
                .addGroup(listarRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listarRegistrosLayout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel12))
                    .addGroup(listarRegistrosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        listarRegistrosLayout.setVerticalGroup(
            listarRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listarRegistrosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("User Interface");

        jb_agregar.setText("Agregar");
        jb_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarMouseClicked(evt);
            }
        });

        jb_listar.setText("Listar");
        jb_listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_listarMouseClicked(evt);
            }
        });
        jb_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_listarActionPerformed(evt);
            }
        });

        jb_modificar.setText("Modify");
        jb_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificarActionPerformed(evt);
            }
        });

        jb_search.setText("Search");

        jButton5.setText("Delete");

        leerindex.setText("leer index");
        leerindex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leerindexMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jb_listar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jb_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(77, 77, 77)
                        .addComponent(leerindex)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jb_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leerindex))
                .addGap(37, 37, 37)
                .addComponent(jb_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jb_search, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarMouseClicked
        openDialog(insertRegistro);
    }//GEN-LAST:event_jb_agregarMouseClicked

    private void jb_addRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_addRegistroMouseClicked
        if ((Integer.parseInt(tf_id.getText())) < 0 || tf_nombre.getText().isEmpty() || tf_birthdate.getText().isEmpty() || Float.parseFloat(tf_salario.getText()) < 0) { //verificar si alguno de los campos está vacío
            JOptionPane.showMessageDialog(this, "Uno de los campos esta vacío!", "Fatal Error!", JOptionPane.ERROR_MESSAGE);
        } else {
            String nombreRegistro = tf_nombre.getText();
            if (nombreRegistro.length() <= 40) {
                for (int i = nombreRegistro.length(); i < 40; i++) {
                    nombreRegistro += " ";//si el nombre es menor a 40 caracteres, llenamos lo que queda en el field con espacios para evitar fragmentacion
                }
                
                String birthdate = tf_birthdate.getText();//consigue birthdate del registro
                int id = Integer.parseInt(tf_id.getText());//consigue id del registro
                float salario = Float.parseFloat(tf_salario.getText());//consigue salario del registro
                try {
                    if (file.insertRegistro(new Registro(nombreRegistro, birthdate, id, salario, ' ', 0)));
                    //System.out.println("se creo " + nombreRegistro);
                    JOptionPane.showMessageDialog(this, "El nuevo registro fue agregado exitosamente!", "Exito en operación!", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    Logger.getLogger(UserInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        tf_nombre.setText("");
        tf_birthdate.setText("");
        tf_id.setText("");
        tf_salario.setText("");
    }//GEN-LAST:event_jb_addRegistroMouseClicked

    private void jb_listarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_listarMouseClicked
        file.listarRegistros((DefaultTableModel) table_registros.getModel());
        openDialog(listarRegistros);
    }//GEN-LAST:event_jb_listarMouseClicked

    private void jb_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificarActionPerformed
        openDialog(modifyRegistro);
    }//GEN-LAST:event_jb_modificarActionPerformed

    private void cb_registrosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_registrosItemStateChanged
        if(cb_registros.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this,"No se  ha seleccionado ningun registro","Error!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_cb_registrosItemStateChanged

    private void jb_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_listarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_listarActionPerformed

    private void leerindexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leerindexMouseClicked
        try {
            // TODO add your handling code here:
            file.ReadIndexFile();
        } catch (IOException ex) {
            Logger.getLogger(UserInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_leerindexMouseClicked

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
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_registros;
    private javax.swing.JDialog insertRegistro;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_addRegistro;
    private javax.swing.JButton jb_agregar;
    private javax.swing.JButton jb_listar;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JButton jb_modify;
    private javax.swing.JButton jb_search;
    private javax.swing.JButton leerindex;
    private javax.swing.JDialog listarRegistros;
    private javax.swing.JDialog modifyRegistro;
    private javax.swing.JTable table_registros;
    private javax.swing.JTextField tf_birthdate;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_modifyBirthdate;
    private javax.swing.JTextField tf_modifyID;
    private javax.swing.JTextField tf_modifyNombre;
    private javax.swing.JTextField tf_modifySalario;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_salario;
    // End of variables declaration//GEN-END:variables
    //File file = new File("./Registros.txt");
    //Tda_arlf metodos = new Tda_arlf(file);
    ArrayList<Registro> registros = new ArrayList();

    public void openDialog(JDialog Dialog) {
        Dialog.setModal(true);
        Dialog.setLocationRelativeTo(this);
        Dialog.pack();
        Dialog.setVisible(true);
    }
}
