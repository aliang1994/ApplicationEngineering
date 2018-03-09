/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Employee;

import Business.*;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Wenqing
 */
public class SalesmanWorkingPanel extends javax.swing.JPanel {
    private JPanel card;
    private SupplierDirectory sd;
    private MarketOfferCatalogue moc;
    private MarketList ml;
    private Person p;

    public SalesmanWorkingPanel(JPanel cardPanel, SupplierDirectory sd, MarketOfferCatalogue moc, MarketList ml, Person per) {
        initComponents();
        this.card = cardPanel;
        this.sd = sd;
        this.moc = moc;
        this.ml = ml;
        this.p = per;
        loadCombo();
    }
    
    public void loadCombo(){
        for (Market m: ml.getList()){
            for(Customer cus: m.getCustomerList()){
                CustomerCombo.addItem(cus);
            }
        }        
    }
    
    public void removeCombo(){
        for (Market m: ml.getList()){
            for(Customer cus: m.getCustomerList()){
                CustomerCombo.removeItem(cus);
            }
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

        ServeBut = new javax.swing.JButton();
        RegisterBut = new javax.swing.JButton();
        CustomerCombo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        ViewBut = new javax.swing.JButton();
        BackBut = new javax.swing.JButton();

        ServeBut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ServeBut.setText("Serve Customer");
        ServeBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServeButActionPerformed(evt);
            }
        });

        RegisterBut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RegisterBut.setText("Register Customer");
        RegisterBut.setToolTipText("");
        RegisterBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Choose a Customer:");

        ViewBut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ViewBut.setText("View Order History");
        ViewBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButActionPerformed(evt);
            }
        });

        BackBut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BackBut.setText("Back<<");
        BackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RegisterBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ServeBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewBut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(CustomerCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BackBut)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(43, 43, 43)
                .addComponent(ServeBut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewBut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RegisterBut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(BackBut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ServeButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServeButActionPerformed
        Customer cus = (Customer)CustomerCombo.getSelectedItem();
        
        CustomerPanel cp = new CustomerPanel(card, sd, moc, ml, cus, p);
        card.add("CustomerPanel", cp);
        CardLayout lo = (CardLayout) card.getLayout();
        lo.next(card);
    }//GEN-LAST:event_ServeButActionPerformed

    private void RegisterButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButActionPerformed
        NewCustomerPanel ncp = new NewCustomerPanel(ml, card);
        card.add("NewCustomerPanel", ncp);
        CardLayout lo = (CardLayout) card.getLayout();
        lo.next(card);
    }//GEN-LAST:event_RegisterButActionPerformed

    private void ViewButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButActionPerformed
        ReviewOrdersPanel panel = new ReviewOrdersPanel(card,p,ml);
        card.add("ReviewOrdersPanel",panel);
        CardLayout layout = (CardLayout) card.getLayout();
        layout.next(card);
    }//GEN-LAST:event_ViewButActionPerformed

    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButActionPerformed
        card.remove(this);       
        CardLayout layout = (CardLayout) card.getLayout();
        layout.previous(card);
    }//GEN-LAST:event_BackButActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBut;
    private javax.swing.JComboBox CustomerCombo;
    private javax.swing.JButton RegisterBut;
    private javax.swing.JButton ServeBut;
    private javax.swing.JButton ViewBut;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}