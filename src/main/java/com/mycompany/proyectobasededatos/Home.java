package com.mycompany.proyectobasededatos;


public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        homeDesktop = new javax.swing.JDesktopPane();
        usuariosbtn = new javax.swing.JButton();
        comprabtn = new javax.swing.JButton();
        ventabtn = new javax.swing.JButton();
        inventariobtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout homeDesktopLayout = new javax.swing.GroupLayout(homeDesktop);
        homeDesktop.setLayout(homeDesktopLayout);
        homeDesktopLayout.setHorizontalGroup(
            homeDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        homeDesktopLayout.setVerticalGroup(
            homeDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(homeDesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, 930, -1));

        usuariosbtn.setText("USUARIOS");
        usuariosbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosbtnActionPerformed(evt);
            }
        });
        getContentPane().add(usuariosbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 115, 49));

        comprabtn.setText("COMPRA");
        comprabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprabtnActionPerformed(evt);
            }
        });
        getContentPane().add(comprabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 115, 49));

        ventabtn.setText("VENTA");
        ventabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventabtnActionPerformed(evt);
            }
        });
        getContentPane().add(ventabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 115, 49));

        inventariobtn.setText("INVENTARIO");
        inventariobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventariobtnActionPerformed(evt);
            }
        });
        getContentPane().add(inventariobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 123, 49));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("MUEBLERIA E'BAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inventariobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventariobtnActionPerformed
        // TODO add your handling code here:
        homeDesktop.removeAll();
        inventarioItem inventario =new inventarioItem();
        homeDesktop.add(inventario).setVisible(true);
    }//GEN-LAST:event_inventariobtnActionPerformed

    private void comprabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprabtnActionPerformed
        // TODO add your handling code here:
        homeDesktop.removeAll(); 
        compraItem compra =new compraItem();
        homeDesktop.add(compra).setVisible(true);
    
    }//GEN-LAST:event_comprabtnActionPerformed

    private void usuariosbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosbtnActionPerformed
        // TODO add your handling code here:
        homeDesktop.removeAll();
        usuariosItem u = new usuariosItem();
        homeDesktop.add(u).setVisible(true);
      
    }//GEN-LAST:event_usuariosbtnActionPerformed
                         
    private void ventabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventabtnActionPerformed
        // TODO add your handling code here:
        homeDesktop.removeAll();
        ventaItem venta=new ventaItem();
        homeDesktop.add(venta).setVisible(true);
    }//GEN-LAST:event_ventabtnActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comprabtn;
    private javax.swing.JDesktopPane homeDesktop;
    private javax.swing.JButton inventariobtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton usuariosbtn;
    private javax.swing.JButton ventabtn;
    // End of variables declaration//GEN-END:variables
}
