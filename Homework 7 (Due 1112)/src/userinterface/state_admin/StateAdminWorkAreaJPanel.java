/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.state_admin;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.state.State;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yizhe Liu
 */
public class StateAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    State state;

    public StateAdminWorkAreaJPanel(JPanel userProcessContainer, State state) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.state = state;

        txtV1.setText(String.valueOf(state.getStateV1Quantity()));
        txtV2.setText(String.valueOf(state.getStateV2Quantity()));

        populateCBEnterprise();
        populateTable();
        //System.out.println(state.getName());
    }

    public void populateCBEnterprise() {
        cbEnterprise.removeAllItems();
        for (Enterprise enterprise : state.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Providor) {
                cbEnterprise.addItem(enterprise);
            }
        }
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblProvidors.getModel();
        model.setRowCount(0);

        for (Enterprise enterprise : state.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Providor) {
                Object row[] = new Object[4];
                row[0] = enterprise;
                row[1] = state;
                row[2] = enterprise.getEnterpriseV1Quantity();
                row[3] = enterprise.getEnterpriseV2Quantity();
                model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProvidors = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbEnterprise = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cbVaccine = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        lblAmount1 = new javax.swing.JLabel();
        txtV1 = new javax.swing.JTextField();
        txtV2 = new javax.swing.JTextField();
        btnReplenish = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        spinnerQuan = new javax.swing.JSpinner();

        tblProvidors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise", "State", "HEPA Quan", "HIN1 Quan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProvidors);
        if (tblProvidors.getColumnModel().getColumnCount() > 0) {
            tblProvidors.getColumnModel().getColumn(0).setResizable(false);
            tblProvidors.getColumnModel().getColumn(1).setResizable(false);
            tblProvidors.getColumnModel().getColumn(2).setResizable(false);
            tblProvidors.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage State-Level Provider");

        btnSubmit.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnSubmit.setText("Deliver to Provider");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel2.setText("Enterprise:");

        cbEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEnterpriseActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel3.setText("Vaccine:");

        cbVaccine.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "HEPATITIS", "H1N1" }));

        jLabel4.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel4.setText("Quantity:");

        lblAmount.setText("H1N1:");

        lblAmount1.setText("HEPATITIS:");

        txtV1.setEditable(false);
        txtV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtV1ActionPerformed(evt);
            }
        });

        txtV2.setEditable(false);
        txtV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtV2ActionPerformed(evt);
            }
        });

        btnReplenish.setText("RELOAD From supplier");
        btnReplenish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplenishActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton1.setText("Manage Providers");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        spinnerQuan.setModel(new javax.swing.SpinnerNumberModel(50, 1, 1000, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbVaccine, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbEnterprise, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(spinnerQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAmount1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAmount, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtV1)
                                    .addComponent(txtV2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnReplenish, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbVaccine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnReplenish, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit)
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEnterpriseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEnterpriseActionPerformed

    private void txtV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtV1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtV1ActionPerformed

    private void txtV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtV2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtV2ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        Enterprise enterprise = (Enterprise) cbEnterprise.getSelectedItem();
        String v = String.valueOf(cbVaccine.getSelectedItem());
        if (enterprise == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }

        int v1 = enterprise.getEnterpriseV1Quantity();
        int v2 = enterprise.getEnterpriseV2Quantity();
        int sv1 = state.getStateV1Quantity();
        int sv2 = state.getStateV2Quantity();
        int quantity = (int) spinnerQuan.getValue();

        if (v.equals("HEPATITIS")) {
            if (quantity > sv1) {
                JOptionPane.showMessageDialog(null, "number out of boundary");
                return;
            }
            enterprise.setEnterpriseV1Quantity(v1 + quantity);
            state.setStateV1Quantity(sv1 - quantity);
            txtV1.setText(String.valueOf(state.getStateV1Quantity()));
        } else if (v.equals("H1N1")) {
            if (quantity > sv2) {
                JOptionPane.showMessageDialog(null, "number out of boundary");
                return;
            }
            enterprise.setEnterpriseV2Quantity(v2 + quantity);
            state.setStateV2Quantity(sv2 - quantity);
            txtV2.setText(String.valueOf(state.getStateV2Quantity()));
        }

        populateTable();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnReplenishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplenishActionPerformed
        // TODO add your handling code here:
        state.setStateV1Quantity(7999);
        state.setStateV2Quantity(7999);
        txtV1.setText(String.valueOf(state.getStateV1Quantity()));
        txtV2.setText(String.valueOf(state.getStateV2Quantity()));
    }//GEN-LAST:event_btnReplenishActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ManageProvidersJPanel manageProvidersJPanel = new ManageProvidersJPanel(userProcessContainer, state);
        userProcessContainer.add("ManageProvidersJPanel", manageProvidersJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReplenish;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cbEnterprise;
    private javax.swing.JComboBox cbVaccine;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblAmount1;
    private javax.swing.JSpinner spinnerQuan;
    private javax.swing.JTable tblProvidors;
    private javax.swing.JTextField txtV1;
    private javax.swing.JTextField txtV2;
    // End of variables declaration//GEN-END:variables
}
