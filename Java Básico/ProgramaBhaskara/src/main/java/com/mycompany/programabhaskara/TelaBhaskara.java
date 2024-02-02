/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.programabhaskara;

/**
 *
 * @author Marina
 */
public class TelaBhaskara extends javax.swing.JFrame {

    /**
     * Creates new form TelaBhaskara
     */
    public TelaBhaskara() {
        initComponents();
        jPanelResult.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinnerB = new javax.swing.JSpinner();
        jSpinnerA = new javax.swing.JSpinner();
        jSpinnerC = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonCalc = new javax.swing.JButton();
        jLabelA = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelB = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelC = new javax.swing.JLabel();
        jPanelResult = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelVDelta = new javax.swing.JLabel();
        jLabelTipR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSpinnerB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerBStateChanged(evt);
            }
        });

        jSpinnerA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerAStateChanged(evt);
            }
        });

        jSpinnerC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerCStateChanged(evt);
            }
        });

        jLabel1.setText("x2 +");

        jLabel2.setText(" x  +");

        jLabel3.setText("=  0");

        jLabel4.setText("Delta = ");

        jButtonCalc.setText("Calcular Delta");
        jButtonCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcActionPerformed(evt);
            }
        });

        jLabelA.setText("A");
        jLabelA.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jLabelAInputMethodTextChanged(evt);
            }
        });
        jLabelA.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabelAPropertyChange(evt);
            }
        });

        jLabel6.setText("2   -   4   *");

        jLabelB.setText("B");

        jLabel8.setText("*");

        jLabelC.setText("C");

        jLabel5.setText("Valor de Delta");

        jLabel11.setText("Tipo de Raízes");

        jLabelVDelta.setText("0");

        jLabelTipR.setText("0");

        javax.swing.GroupLayout jPanelResultLayout = new javax.swing.GroupLayout(jPanelResult);
        jPanelResult.setLayout(jPanelResultLayout);
        jPanelResultLayout.setHorizontalGroup(
            jPanelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(92, 92, 92)
                .addGroup(jPanelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelVDelta, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jLabelTipR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        jPanelResultLayout.setVerticalGroup(
            jPanelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelResultLayout.createSequentialGroup()
                        .addComponent(jLabelVDelta)
                        .addGap(28, 28, 28)
                        .addComponent(jLabelTipR))
                    .addGroup(jPanelResultLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel11)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSpinnerB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinnerA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonCalc)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelB, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelA)))
                                .addGap(12, 12, 12)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelC)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabelB)
                    .addComponent(jLabel8)
                    .addComponent(jLabelC)
                    .addComponent(jLabelA))
                .addGap(28, 28, 28)
                .addComponent(jButtonCalc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcActionPerformed
        int A = Integer.parseInt(jSpinnerA.getValue().toString());
        int B = Integer.parseInt(jSpinnerB.getValue().toString());
        int C = Integer.parseInt(jSpinnerC.getValue().toString());
        double R = (B*B) - 4 * A * C;
        
        jLabelVDelta.setText(String.format("%.1f", R));
        
        if (R < 0) {
            jLabelTipR.setText("Não existem reais iguais");
        } else 
            jLabelTipR.setText("Existem raízes reais");
        
        jPanelResult.setVisible(true);
    }//GEN-LAST:event_jButtonCalcActionPerformed

    private void jLabelAInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jLabelAInputMethodTextChanged
    }//GEN-LAST:event_jLabelAInputMethodTextChanged

    private void jLabelAPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabelAPropertyChange
    }//GEN-LAST:event_jLabelAPropertyChange

    private void jSpinnerBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerBStateChanged
        jLabelB.setText(jSpinnerB.getValue().toString());
    }//GEN-LAST:event_jSpinnerBStateChanged

    private void jSpinnerAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerAStateChanged
       jLabelA.setText(jSpinnerA.getValue().toString());
    }//GEN-LAST:event_jSpinnerAStateChanged

    private void jSpinnerCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerCStateChanged
       jLabelC.setText(jSpinnerC.getValue().toString());
    }//GEN-LAST:event_jSpinnerCStateChanged

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
            java.util.logging.Logger.getLogger(TelaBhaskara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBhaskara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBhaskara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBhaskara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBhaskara().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelA;
    private javax.swing.JLabel jLabelB;
    private javax.swing.JLabel jLabelC;
    private javax.swing.JLabel jLabelTipR;
    private javax.swing.JLabel jLabelVDelta;
    private javax.swing.JPanel jPanelResult;
    private javax.swing.JSpinner jSpinnerA;
    private javax.swing.JSpinner jSpinnerB;
    private javax.swing.JSpinner jSpinnerC;
    // End of variables declaration//GEN-END:variables
}
