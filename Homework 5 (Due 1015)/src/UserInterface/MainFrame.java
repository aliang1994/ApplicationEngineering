/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;
import Business.*;
import Business.Configuration.Configuration;
import java.awt.CardLayout;

/**
 *
 * @author Wenqing
 */
public class MainFrame extends javax.swing.JFrame {
    private Business b;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {        
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

        SplitPane = new javax.swing.JSplitPane();
        UpperPanel = new javax.swing.JPanel();
        launchBut = new javax.swing.JButton();
        CardPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        SplitPane.setMinimumSize(new java.awt.Dimension(600, 500));

        UpperPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        launchBut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        launchBut.setText("Launch");
        launchBut.setPreferredSize(new java.awt.Dimension(120, 30));
        launchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                launchButActionPerformed(evt);
            }
        });
        UpperPanel.add(launchBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 120, 40));

        SplitPane.setLeftComponent(UpperPanel);

        CardPanel.setLayout(new java.awt.CardLayout());
        SplitPane.setRightComponent(CardPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void launchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_launchButActionPerformed
        b=Configuration.initializeBusiness("aaa");
        
        loginPanel lp = new loginPanel(b, CardPanel);
        CardPanel.add("loginPanel", lp);
        CardLayout lo = (CardLayout) CardPanel.getLayout();
        lo.next(CardPanel);
    }//GEN-LAST:event_launchButActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardPanel;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JPanel UpperPanel;
    private javax.swing.JButton launchBut;
    // End of variables declaration//GEN-END:variables
}
