/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jPack_CajaFuerte;

/**
 *
 * @author pc
 */
public class jFrame_CajaFuerte extends javax.swing.JFrame {

    /**
     * Creates new form jFrame_CajaFuerte
     */
    public jFrame_CajaFuerte() {
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

        jPanel_cuerpo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSpinner_Clave1 = new javax.swing.JSpinner();
        jSpinner_Clave2 = new javax.swing.JSpinner();
        jSpinner_Variable3 = new javax.swing.JSpinner();
        jButton_Abrir = new javax.swing.JButton();
        jLabel_Respuesta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_cuerpo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("CAJA FUERTE");
        jPanel_cuerpo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));
        jPanel_cuerpo.add(jSpinner_Clave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 50, 40));
        jPanel_cuerpo.add(jSpinner_Clave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 50, 40));
        jPanel_cuerpo.add(jSpinner_Variable3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 50, 40));

        jButton_Abrir.setText("Abir");
        jButton_Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AbrirActionPerformed(evt);
            }
        });
        jPanel_cuerpo.add(jButton_Abrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 250, 30));

        jLabel_Respuesta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_cuerpo.add(jLabel_Respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 250, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_cuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_cuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AbrirActionPerformed
        // Variables:
        int Clave1, Clave2, Clave3 =0;
        String caja = "";
        
        //Recuperacion de datos
        Clave1 = Integer.parseInt(jSpinner_Clave1.getValue().toString());
        Clave2 = Integer.parseInt(jSpinner_Clave2.getValue().toString());
        Clave3 = Integer.parseInt(jSpinner_Variable3.getValue().toString());
        
        //Decifrando Caja Fuerte
        if(Clave1==2){
            if(Clave2==5){
                if(Clave3==8){
                    caja = "Caja Abierta: 252";
                }else{
                    caja = "Constraseña Incorecta";
                }
            }else{
                caja = "Constraseña Incorecta";
            }
        }else{
            caja = "Constraseña Incorecta";
        }
        //Mostrando datos
        jLabel_Respuesta.setText(caja);
    }//GEN-LAST:event_jButton_AbrirActionPerformed

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
            java.util.logging.Logger.getLogger(jFrame_CajaFuerte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrame_CajaFuerte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrame_CajaFuerte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrame_CajaFuerte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrame_CajaFuerte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Abrir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Respuesta;
    private javax.swing.JPanel jPanel_cuerpo;
    private javax.swing.JSpinner jSpinner_Clave1;
    private javax.swing.JSpinner jSpinner_Clave2;
    private javax.swing.JSpinner jSpinner_Variable3;
    // End of variables declaration//GEN-END:variables
}
