/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cseproject;

import java.awt.Desktop;
import java.io.File;

/**
 *
 * @author Tohid_Fahim
 */
public class studentothers extends javax.swing.JFrame {

    /**
     * Creates new form studentothers
     */
    public studentothers() {
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

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cr = new javax.swing.JButton();
        ac = new javax.swing.JButton();
        syllabus = new javax.swing.JButton();
        pb = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setLayout(null);

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(560, 410, 120, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(24, 0, 255));
        jLabel2.setText("Others");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 100, 240, 40);

        cr.setText("Class Routine");
        cr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crActionPerformed(evt);
            }
        });
        jPanel1.add(cr);
        cr.setBounds(380, 270, 160, 40);

        ac.setText("Academic Calendar");
        ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acActionPerformed(evt);
            }
        });
        jPanel1.add(ac);
        ac.setBounds(380, 200, 160, 40);

        syllabus.setText("Syllabus");
        syllabus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                syllabusActionPerformed(evt);
            }
        });
        jPanel1.add(syllabus);
        syllabus.setBounds(180, 200, 160, 40);

        pb.setText("Prescribed Books");
        pb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbActionPerformed(evt);
            }
        });
        jPanel1.add(pb);
        pb.setBounds(180, 270, 160, 40);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tohid_Fahim\\Desktop\\Black-Textured-Widescreen-HD-Wallpaper.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 840, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new studentpage().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void syllabusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_syllabusActionPerformed
        // TODO add your handling code here:
        File fff = new File("C:\\Users\\Tohid_Fahim\\Desktop\\Others\\RUET CSE Syllabus + Credit.pdf");
    try {
      Desktop.getDesktop().open(fff);
  } catch (Exception ex) {
    System.out.println(ex);}
    }//GEN-LAST:event_syllabusActionPerformed

    private void crActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crActionPerformed
        // TODO add your handling code here:
        File f = new File("C:\\Users\\Tohid_Fahim\\Desktop\\Others\\-Routine_2016_-SeN-_FINAL-_.pdf");
    try {
      Desktop.getDesktop().open(f);
  } catch (Exception ex) {
    System.out.println(ex);}
        //Runtime.Getruntime().exec("rund1132 url.dll, FileProtocolHandler "+"C:\\Users\\Tohid_Fahim\\Desktop\\Others\\-Routine_2016_-SeN-_FINAL-_.pdf");
    }//GEN-LAST:event_crActionPerformed

    private void acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acActionPerformed
        // TODO add your handling code here:
        File ff = new File("C:\\Users\\Tohid_Fahim\\Desktop\\Others\\calendar-2016.pdf");
    try {
      Desktop.getDesktop().open(ff);
  } catch (Exception ex) {
    System.out.println(ex);}
    }//GEN-LAST:event_acActionPerformed

    private void pbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbActionPerformed
        // TODO add your handling code here:
        File ffff = new File("C:\\Users\\Tohid_Fahim\\Desktop\\Others\\AvailableBooksCSE.pdf");
    try {
      Desktop.getDesktop().open(ffff);
  } catch (Exception ex) {
    System.out.println(ex);}          
    }//GEN-LAST:event_pbActionPerformed

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
            java.util.logging.Logger.getLogger(studentothers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentothers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentothers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentothers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentothers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ac;
    private javax.swing.JButton back;
    private javax.swing.JButton cr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pb;
    private javax.swing.JButton syllabus;
    // End of variables declaration//GEN-END:variables
}
