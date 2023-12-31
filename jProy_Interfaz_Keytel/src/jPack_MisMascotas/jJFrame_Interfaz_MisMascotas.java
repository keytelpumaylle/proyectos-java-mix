/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jPack_MisMascotas;

import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class jJFrame_Interfaz_MisMascotas extends javax.swing.JFrame {

    /**
     * Creates new form jJFrame_Interfaz_MisMascotas
     */
    public jJFrame_Interfaz_MisMascotas() {
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

        jLabel2 = new javax.swing.JLabel();
        jCheckBoxPerro = new javax.swing.JCheckBox();
        jCheckBoxGato = new javax.swing.JCheckBox();
        jCheckBoxLoro = new javax.swing.JCheckBox();
        jButtonAceptar = new javax.swing.JButton();
        jLabelRespuesta = new javax.swing.JLabel();
        jButtonLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Selecciona tu Mascota");

        jCheckBoxPerro.setText("Perro");

        jCheckBoxGato.setText("Gato");

        jCheckBoxLoro.setText("Loro");

        jButtonAceptar.setText("Seleccionar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonLimpiar)
                            .addComponent(jButtonAceptar)
                            .addComponent(jCheckBoxLoro)
                            .addComponent(jCheckBoxGato)
                            .addComponent(jCheckBoxPerro)
                            .addComponent(jLabelRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel2)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(jCheckBoxPerro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxGato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxLoro)
                .addGap(18, 18, 18)
                .addComponent(jButtonAceptar)
                .addGap(18, 18, 18)
                .addComponent(jLabelRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLimpiar)
                .addContainerGap(322, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        // Declaracion de Variables:
        String Mensaje = "Su animal de seleccion es: ";
        String Error = "[x]Error: Selecciona un animal";
                
        //Condiciones
        if (jCheckBoxPerro.isSelected()){
            Mensaje = Mensaje + " Perro ";
            jLabelRespuesta.setText(Mensaje);
        }else{jLabelRespuesta.setText(Error);}
        
        if (jCheckBoxGato.isSelected()){
            Mensaje = Mensaje + " Gato ";
            jLabelRespuesta.setText(Mensaje);
        }else{jLabelRespuesta.setText(Error);}
        
        if (jCheckBoxLoro.isSelected()){
            Mensaje = Mensaje + " Loro ";
            jLabelRespuesta.setText(Mensaje);
        }else{jLabelRespuesta.setText(Error);}
        
        
        
        
        
        
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // Limpiando el Mensaje:
        jLabelRespuesta.setText("");
        
        // Limpiando los CheckBoxs:
        if (jCheckBoxPerro.isSelected()){
            jCheckBoxPerro.setSelected(false);
        }
        if (jCheckBoxGato.isSelected()){
            jCheckBoxGato.setSelected(false);
        }
        if (jCheckBoxLoro.isSelected()){
            jCheckBoxLoro.setSelected(false);
        }
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(jJFrame_Interfaz_MisMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jJFrame_Interfaz_MisMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jJFrame_Interfaz_MisMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jJFrame_Interfaz_MisMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jJFrame_Interfaz_MisMascotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JCheckBox jCheckBoxGato;
    private javax.swing.JCheckBox jCheckBoxLoro;
    private javax.swing.JCheckBox jCheckBoxPerro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelRespuesta;
    // End of variables declaration//GEN-END:variables
}
