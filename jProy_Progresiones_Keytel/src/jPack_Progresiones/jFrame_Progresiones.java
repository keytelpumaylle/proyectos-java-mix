package jPack_Progresiones;

/**
 *keytel Pumaylle Ramirez
 */
public class jFrame_Progresiones extends javax.swing.JFrame {
    public jFrame_Progresiones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Cuerpo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_Progresion = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Inicio = new javax.swing.JTextField();
        jTextField_Fin = new javax.swing.JTextField();
        jTextField_Intervalo = new javax.swing.JTextField();
        jButton_Rellenar = new javax.swing.JButton();
        jButton_Vaciar = new javax.swing.JButton();
        jLabel_Respuesta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Progresion");

        jLabel2.setText("Inicio");

        jLabel3.setText("Fin");

        jLabel4.setText("Intervalo");

        jButton_Rellenar.setText("Rellenar");
        jButton_Rellenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RellenarActionPerformed(evt);
            }
        });

        jButton_Vaciar.setText("Vaciar");
        jButton_Vaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VaciarActionPerformed(evt);
            }
        });

        jLabel_Respuesta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel_CuerpoLayout = new javax.swing.GroupLayout(jPanel_Cuerpo);
        jPanel_Cuerpo.setLayout(jPanel_CuerpoLayout);
        jPanel_CuerpoLayout.setHorizontalGroup(
            jPanel_CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CuerpoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel_CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_CuerpoLayout.createSequentialGroup()
                        .addComponent(jButton_Rellenar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Vaciar))
                    .addGroup(jPanel_CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel_CuerpoLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField_Intervalo, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                        .addComponent(jLabel1)
                        .addComponent(jComboBox_Progresion, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel_CuerpoLayout.createSequentialGroup()
                            .addGroup(jPanel_CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(34, 34, 34)
                            .addGroup(jPanel_CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField_Inicio)
                                .addComponent(jTextField_Fin, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel_CuerpoLayout.setVerticalGroup(
            jPanel_CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_Progresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel_CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Intervalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Rellenar)
                    .addComponent(jButton_Vaciar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Cuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Cuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RellenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RellenarActionPerformed
        // Declaracion de Variables:
        int inicio, fin, in = 0;
        String resultado = "";
        int aux = 0;
        
        //Recuperando datos:
        inicio = Integer.parseInt(jTextField_Inicio.getText());
        in = Integer.parseInt(jTextField_Intervalo.getText());
        fin = Integer.parseInt(jTextField_Fin.getText());
        
        //Ejecucion de algoritmo:
         for(int i=inicio; i < fin;i++){
             aux = (in*i);
             if (aux <fin){
                 resultado += aux + " ,";
             }

         }
        
        //Mostrando Respuesta:
        jLabel_Respuesta.setText(resultado);
    }//GEN-LAST:event_jButton_RellenarActionPerformed

    private void jButton_VaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VaciarActionPerformed
        // Variables auxiliares
        jTextField_Inicio.setText("");
        jTextField_Intervalo.setText("");
        jTextField_Fin.setText("");
        jLabel_Respuesta.setText("");
        
    }//GEN-LAST:event_jButton_VaciarActionPerformed

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
            java.util.logging.Logger.getLogger(jFrame_Progresiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrame_Progresiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrame_Progresiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrame_Progresiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrame_Progresiones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Rellenar;
    private javax.swing.JButton jButton_Vaciar;
    private javax.swing.JComboBox<String> jComboBox_Progresion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Respuesta;
    private javax.swing.JPanel jPanel_Cuerpo;
    private javax.swing.JTextField jTextField_Fin;
    private javax.swing.JTextField jTextField_Inicio;
    private javax.swing.JTextField jTextField_Intervalo;
    // End of variables declaration//GEN-END:variables
}
