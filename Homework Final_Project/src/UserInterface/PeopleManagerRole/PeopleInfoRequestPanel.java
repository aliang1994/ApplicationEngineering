/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PeopleManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.HomelessPeople;
import Business.HomelessPeopleDirectory;
import Business.InsuranceQuote;
import Business.InsuranceQuote.AgeType;
import Business.Organization.Organization;
import Business.Organization.PeopleManagingOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PeopleInfoRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Wenqing
 */
public class PeopleInfoRequestPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private PeopleManagingOrganization organization;
    private EcoSystem sys;
    private UserAccount userAccount;
    private HomelessPeopleDirectory hpd;

    /**
     * Creates new form PeopleInfoRequestPanel
     */
    public PeopleInfoRequestPanel(JPanel userProcessContainer, PeopleManagingOrganization organization,Enterprise enterprise, EcoSystem sys, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.sys = sys;
        this.userAccount = account;
        this.hpd = sys.getHpd();        
        populateCombo();
    }
    
    private void populateCombo(){
        for(HomelessPeople people: hpd.getPeoplelist()){
            PeopleCombo.addItem(people);
        }        
        for(AgeType type: AgeType.values()){
            InsuranceCombo.addItem(type);                  
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

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PeopleCombo = new javax.swing.JComboBox();
        InsuranceCombo = new javax.swing.JComboBox();
        SubmitButton = new javax.swing.JButton();
        BackBut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("Insurance Type:");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("Choose a Homeless People:");

        SubmitButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SubmitButton.setText("Submit Request");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        BackBut.setText("<<Back");
        BackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Send Insurance Request - Homeless People");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackBut)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PeopleCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(InsuranceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(107, 107, 107))))
            .addGroup(layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(BackBut)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PeopleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(InsuranceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(SubmitButton)
                .addContainerGap(92, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PeopleManagerRoleWorkAreaJPanel dwjp = (PeopleManagerRoleWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackButActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        HomelessPeople people = (HomelessPeople)PeopleCombo.getSelectedItem();            
        PeopleInfoRequest request = new PeopleInfoRequest();        
        request.setPeople(people);      
            
        AgeType ageType = (AgeType) InsuranceCombo.getSelectedItem();   
        request.setInsuranceType(ageType.toString());
                    
        Organization org = null;
        for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof PeopleManagingOrganization){
                org = organization;
                break;
            }
        }
        if(org !=null){
            org.getWorkQueue().getWorkRequestList().add(request);
        }   
        JOptionPane.showMessageDialog(null, "Request sent successfully!");
    }//GEN-LAST:event_SubmitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBut;
    private javax.swing.JComboBox InsuranceCombo;
    private javax.swing.JComboBox PeopleCombo;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
