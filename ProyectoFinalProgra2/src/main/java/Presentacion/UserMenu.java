/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

/**
 *
 * @author Adriana Barboza
 */
public class UserMenu extends javax.swing.JFrame {

    /**
     * Creates new form ProductMenu
     */
    public UserMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_User = new javax.swing.JLabel();
        jLabel_Contrasenna = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jTextField_User = new javax.swing.JTextField();
        jButton_AddUser = new javax.swing.JButton();
        jButton_ModifyUser = new javax.swing.JButton();
        jButton_DeleteUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_User.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_User.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_User.setText("User");

        jLabel_Contrasenna.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_Contrasenna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Contrasenna.setText("Password");

        jPasswordField.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField.setText("jPasswordField1");

        jTextField_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UserActionPerformed(evt);
            }
        });

        jButton_AddUser.setBackground(new java.awt.Color(0, 153, 153));
        jButton_AddUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_AddUser.setText("Add User");

        jButton_ModifyUser.setBackground(new java.awt.Color(0, 153, 153));
        jButton_ModifyUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_ModifyUser.setText("Modify User");

        jButton_DeleteUser.setBackground(new java.awt.Color(255, 0, 51));
        jButton_DeleteUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_DeleteUser.setText("Delete User");
        jButton_DeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Contrasenna, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(jLabel_User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(jTextField_User)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton_AddUser)
                        .addGap(45, 45, 45)
                        .addComponent(jButton_ModifyUser)
                        .addGap(36, 36, 36)
                        .addComponent(jButton_DeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_User, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Contrasenna, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_AddUser, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jButton_ModifyUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_DeleteUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UserActionPerformed

    private void jButton_DeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_DeleteUserActionPerformed

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
            java.util.logging.Logger.getLogger(UserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AddUser;
    private javax.swing.JButton jButton_DeleteUser;
    private javax.swing.JButton jButton_ModifyUser;
    private javax.swing.JLabel jLabel_Contrasenna;
    private javax.swing.JLabel jLabel_User;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField_User;
    // End of variables declaration//GEN-END:variables
}
