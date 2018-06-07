/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.fernandasj.view;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author fernanda
 */
public class GeometryForm extends javax.swing.JFrame {

    /**
     * Creates new form GeometryForm
     */
    public GeometryForm() {
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

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frame"); // NOI18N
        setResizable(false);

        panel.setBackground(new java.awt.Color(236, 240, 241));
        panel.setForeground(new java.awt.Color(44, 62, 80));

        geometryALabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        geometryALabel.setForeground(new java.awt.Color(44, 62, 80));
        geometryALabel.setText("Geometry A");

        geometryBLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        geometryBLabel.setForeground(new java.awt.Color(44, 62, 80));
        geometryBLabel.setText("Geometry B");

        processButton.setBackground(new java.awt.Color(0, 153, 153));
        processButton.setFont(processButton.getFont().deriveFont(processButton.getFont().getStyle() | java.awt.Font.BOLD, processButton.getFont().getSize()+2));
        processButton.setForeground(new java.awt.Color(0, 51, 51));
        processButton.setText("PROCESS");
        processButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processActionPerformed(evt);
            }
        });

        equalsLabel.setFont(equalsLabel.getFont().deriveFont(equalsLabel.getFont().getStyle() | java.awt.Font.BOLD));
        equalsLabel.setForeground(new java.awt.Color(44, 62, 80));
        equalsLabel.setText("EQUALS");

        disjointLabel.setFont(disjointLabel.getFont().deriveFont(disjointLabel.getFont().getStyle() | java.awt.Font.BOLD));
        disjointLabel.setForeground(new java.awt.Color(44, 62, 80));
        disjointLabel.setText("DISJOINT");

        intersectsLabel.setFont(intersectsLabel.getFont().deriveFont(intersectsLabel.getFont().getStyle() | java.awt.Font.BOLD));
        intersectsLabel.setForeground(new java.awt.Color(44, 62, 80));
        intersectsLabel.setText("INTERSECTS");

        touchesLabel.setFont(touchesLabel.getFont().deriveFont(touchesLabel.getFont().getStyle() | java.awt.Font.BOLD));
        touchesLabel.setForeground(new java.awt.Color(44, 62, 80));
        touchesLabel.setText("TOUCHES");

        crossesLabel.setFont(crossesLabel.getFont().deriveFont(crossesLabel.getFont().getStyle() | java.awt.Font.BOLD));
        crossesLabel.setForeground(new java.awt.Color(44, 62, 80));
        crossesLabel.setText("CROSSES");

        withinLabel.setFont(withinLabel.getFont().deriveFont(withinLabel.getFont().getStyle() | java.awt.Font.BOLD));
        withinLabel.setForeground(new java.awt.Color(44, 62, 80));
        withinLabel.setText("WITHIN");

        containsLabel.setFont(containsLabel.getFont().deriveFont(containsLabel.getFont().getStyle() | java.awt.Font.BOLD));
        containsLabel.setForeground(new java.awt.Color(44, 62, 80));
        containsLabel.setText("CONTAINS");

        overlapsLabel.setFont(overlapsLabel.getFont().deriveFont(overlapsLabel.getFont().getStyle() | java.awt.Font.BOLD));
        overlapsLabel.setForeground(new java.awt.Color(44, 62, 80));
        overlapsLabel.setText("OVERLAPS");

        coversLabel.setFont(coversLabel.getFont().deriveFont(coversLabel.getFont().getStyle() | java.awt.Font.BOLD));
        coversLabel.setForeground(new java.awt.Color(44, 62, 80));
        coversLabel.setText("COVERS");

        coveredByLabel.setFont(coveredByLabel.getFont().deriveFont(coveredByLabel.getFont().getStyle() | java.awt.Font.BOLD));
        coveredByLabel.setForeground(new java.awt.Color(44, 62, 80));
        coveredByLabel.setText("COVEREDBY");

        equalsTextField.setEditable(false);
        equalsTextField.setBackground(new java.awt.Color(236, 240, 241));
        equalsTextField.setFont(equalsTextField.getFont().deriveFont(equalsTextField.getFont().getStyle() | java.awt.Font.BOLD));
        equalsTextField.setForeground(new java.awt.Color(44, 62, 80));

        disjointTextField.setEditable(false);
        disjointTextField.setBackground(new java.awt.Color(236, 240, 241));
        disjointTextField.setFont(disjointTextField.getFont().deriveFont(disjointTextField.getFont().getStyle() | java.awt.Font.BOLD));
        disjointTextField.setForeground(new java.awt.Color(44, 62, 80));

        intersectsTextField.setEditable(false);
        intersectsTextField.setBackground(new java.awt.Color(236, 240, 241));
        intersectsTextField.setFont(intersectsTextField.getFont().deriveFont(intersectsTextField.getFont().getStyle() | java.awt.Font.BOLD));
        intersectsTextField.setForeground(new java.awt.Color(44, 62, 80));

        touchesTextField.setEditable(false);
        touchesTextField.setBackground(new java.awt.Color(236, 240, 241));
        touchesTextField.setFont(touchesTextField.getFont().deriveFont(touchesTextField.getFont().getStyle() | java.awt.Font.BOLD));
        touchesTextField.setForeground(new java.awt.Color(44, 62, 80));

        crossesTextField.setEditable(false);
        crossesTextField.setBackground(new java.awt.Color(236, 240, 241));
        crossesTextField.setFont(crossesTextField.getFont().deriveFont(crossesTextField.getFont().getStyle() | java.awt.Font.BOLD));
        crossesTextField.setForeground(new java.awt.Color(44, 62, 80));

        withinTextField.setEditable(false);
        withinTextField.setBackground(new java.awt.Color(236, 240, 241));
        withinTextField.setFont(withinTextField.getFont().deriveFont(withinTextField.getFont().getStyle() | java.awt.Font.BOLD));
        withinTextField.setForeground(new java.awt.Color(44, 62, 80));

        containsTextField.setEditable(false);
        containsTextField.setBackground(new java.awt.Color(236, 240, 241));
        containsTextField.setFont(containsTextField.getFont().deriveFont(containsTextField.getFont().getStyle() | java.awt.Font.BOLD));
        containsTextField.setForeground(new java.awt.Color(44, 62, 80));

        overlapsTextField.setEditable(false);
        overlapsTextField.setBackground(new java.awt.Color(236, 240, 241));
        overlapsTextField.setFont(overlapsTextField.getFont().deriveFont(overlapsTextField.getFont().getStyle() | java.awt.Font.BOLD));
        overlapsTextField.setForeground(new java.awt.Color(44, 62, 80));

        coversTextField.setEditable(false);
        coversTextField.setBackground(new java.awt.Color(236, 240, 241));
        coversTextField.setFont(coversTextField.getFont().deriveFont(coversTextField.getFont().getStyle() | java.awt.Font.BOLD));
        coversTextField.setForeground(new java.awt.Color(44, 62, 80));

        coveredByTextField.setEditable(false);
        coveredByTextField.setBackground(new java.awt.Color(236, 240, 241));
        coveredByTextField.setFont(coveredByTextField.getFont().deriveFont(coveredByTextField.getFont().getStyle() | java.awt.Font.BOLD));
        coveredByTextField.setForeground(new java.awt.Color(44, 62, 80));

        geometryATextField.setBackground(new java.awt.Color(236, 240, 241));
        geometryATextField.setFont(geometryATextField.getFont().deriveFont(geometryATextField.getFont().getStyle() | java.awt.Font.BOLD));
        geometryATextField.setForeground(new java.awt.Color(44, 62, 80));

        geometryBTextField.setBackground(new java.awt.Color(236, 240, 241));
        geometryBTextField.setFont(geometryBTextField.getFont().deriveFont(geometryBTextField.getFont().getStyle() | java.awt.Font.BOLD));
        geometryBTextField.setForeground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(44, 62, 80));
        jLabel1.setText("AB");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(44, 62, 80));
        jLabel3.setText("DRAFT");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(geometryBLabel)
                            .addComponent(geometryALabel))
                        .addGap(93, 93, 93)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(geometryATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(geometryBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(processButton, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(crossesLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(withinLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(containsLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(overlapsLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(coversLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(coveredByLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(touchesLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(intersectsLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(disjointLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(equalsLabel)))
                        .addGap(45, 45, 45)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(intersectsTextField)
                            .addComponent(disjointTextField)
                            .addComponent(touchesTextField)
                            .addComponent(crossesTextField)
                            .addComponent(withinTextField)
                            .addComponent(containsTextField)
                            .addComponent(overlapsTextField)
                            .addComponent(coversTextField)
                            .addComponent(coveredByTextField)
                            .addComponent(equalsTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(187, 187, 187))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(geometryATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(geometryALabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(geometryBLabel)
                    .addComponent(geometryBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(processButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(equalsLabel)
                            .addComponent(equalsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(disjointTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disjointLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(intersectsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(intersectsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(touchesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(touchesLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(crossesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(crossesLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(withinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(withinLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(containsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(containsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(overlapsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(overlapsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coversTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coversLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coveredByTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coveredByLabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void processActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processActionPerformed
        try {
            final String inputGeometryA = geometryATextField.getText();
            final String inputGeometryB = geometryBTextField.getText();

            if (!inputGeometryA.equals("") && !inputGeometryB.equals("")) {
                WKTReader reader = new WKTReader();

                Geometry geometryA = reader.read(inputGeometryA);
                Geometry geometryB = reader.read(inputGeometryB);

                equalsTextField.setText("" + geometryA.contains(geometryB));
                disjointTextField.setText("" + geometryA.disjoint(geometryB));
                intersectsTextField.setText("" + geometryA.intersects(geometryB));
                touchesTextField.setText("" + geometryA.touches(geometryB));
                crossesTextField.setText("" + geometryA.crosses(geometryB));
                withinTextField.setText("" + geometryA.within(geometryB));
                containsTextField.setText("" + geometryA.contains(geometryB));
                overlapsTextField.setText("" + geometryA.overlaps(geometryB));
                coversTextField.setText("" + geometryA.covers(geometryB));
                coveredByTextField.setText("" + geometryA.coveredBy(geometryB));
            } else {

                JOptionPane.showMessageDialog(this, "Geometry is Empty", "Error", 
                        JOptionPane.ERROR_MESSAGE);

                equalsTextField.setText("");
                disjointTextField.setText("");
                intersectsTextField.setText("");
                touchesTextField.setText("");
                crossesTextField.setText("");
                withinTextField.setText("");
                containsTextField.setText("");
                overlapsTextField.setText("");
                coversTextField.setText("");
                coveredByTextField.setText("");
            }
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_processActionPerformed

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
            java.util.logging.Logger.getLogger(GeometryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeometryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeometryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeometryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GeometryForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private final javax.swing.JLabel containsLabel = new javax.swing.JLabel();
    private final javax.swing.JTextField containsTextField = new javax.swing.JTextField();
    private final javax.swing.JLabel coveredByLabel = new javax.swing.JLabel();
    private final javax.swing.JTextField coveredByTextField = new javax.swing.JTextField();
    private final javax.swing.JLabel coversLabel = new javax.swing.JLabel();
    private final javax.swing.JTextField coversTextField = new javax.swing.JTextField();
    private final javax.swing.JLabel crossesLabel = new javax.swing.JLabel();
    private final javax.swing.JTextField crossesTextField = new javax.swing.JTextField();
    private final javax.swing.JLabel disjointLabel = new javax.swing.JLabel();
    private final javax.swing.JTextField disjointTextField = new javax.swing.JTextField();
    private final javax.swing.JLabel equalsLabel = new javax.swing.JLabel();
    private final javax.swing.JTextField equalsTextField = new javax.swing.JTextField();
    private final javax.swing.JLabel geometryALabel = new javax.swing.JLabel();
    private final javax.swing.JTextField geometryATextField = new javax.swing.JTextField();
    private final javax.swing.JLabel geometryBLabel = new javax.swing.JLabel();
    private final javax.swing.JTextField geometryBTextField = new javax.swing.JTextField();
    private final javax.swing.JLabel intersectsLabel = new javax.swing.JLabel();
    private final javax.swing.JTextField intersectsTextField = new javax.swing.JTextField();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private final javax.swing.JLabel overlapsLabel = new javax.swing.JLabel();
    private final javax.swing.JTextField overlapsTextField = new javax.swing.JTextField();
    private javax.swing.JPanel panel;
    private final javax.swing.JButton processButton = new javax.swing.JButton();
    private final javax.swing.JLabel touchesLabel = new javax.swing.JLabel();
    private final javax.swing.JTextField touchesTextField = new javax.swing.JTextField();
    private final javax.swing.JLabel withinLabel = new javax.swing.JLabel();
    private final javax.swing.JTextField withinTextField = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
