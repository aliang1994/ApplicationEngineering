/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Wenqing
 */

public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    private VitalSignsHistory vsHistory;
    public ViewPanel(VitalSignsHistory vsh) {
        initComponents();
        this.vsHistory = vsh;
        polulateTable();
    }
    
    public void polulateTable(){
        DefaultTableModel dtm =(DefaultTableModel) vsTable.getModel(); 
        dtm.setRowCount(0);
        
        for(VitalSigns vs: vsHistory.getVsHistory()){
            Object row[] = new Object[2];
            row[0] = vs;
            row[1] = vs.getBloodPressure();
            dtm.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vsTable = new javax.swing.JTable();
        ViewDetailButton = new javax.swing.JButton();
        DeleteItemButton = new javax.swing.JButton();
        TempLabel = new javax.swing.JLabel();
        TempTxt = new javax.swing.JTextField();
        TempLabel1 = new javax.swing.JLabel();
        BPTxt = new javax.swing.JTextField();
        TempLabel2 = new javax.swing.JLabel();
        PulseTxt = new javax.swing.JTextField();
        TempLabel3 = new javax.swing.JLabel();
        DateTxt = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("View Vital Sign");

        vsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Blood Pressure"
            }
        ));
        jScrollPane1.setViewportView(vsTable);

        ViewDetailButton.setText("View Details");
        ViewDetailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetailButtonActionPerformed(evt);
            }
        });

        DeleteItemButton.setText("Delete Item");
        DeleteItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteItemButtonActionPerformed(evt);
            }
        });

        TempLabel.setText("Temparature: ");

        TempTxt.setEnabled(false);

        TempLabel1.setText("Blood Pressure:");

        BPTxt.setEnabled(false);

        TempLabel2.setText("Pulse:");

        PulseTxt.setEnabled(false);

        TempLabel3.setText("Date:");

        DateTxt.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ViewDetailButton)
                        .addGap(46, 46, 46)
                        .addComponent(DeleteItemButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(253, 253, 253)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(87, 87, 87)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TempLabel1)
                                        .addComponent(TempLabel2)
                                        .addComponent(TempLabel)
                                        .addComponent(TempLabel3))
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PulseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewDetailButton)
                    .addComponent(DeleteItemButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TempLabel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TempLabel1)
                    .addComponent(BPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PulseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TempLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TempLabel3))
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ViewDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetailButtonActionPerformed
        int selectedRow = vsTable.getSelectedRow();
        if(selectedRow >= 0){
            VitalSigns vs = (VitalSigns)vsTable.getValueAt(selectedRow, 0);
            BPTxt.setText(String.valueOf(vs.getBloodPressure()));
            TempTxt.setText(String.valueOf(vs.getTemps()));
            PulseTxt.setText(String.valueOf(vs.getPulse()));
            DateTxt.setText(vs.getDate());
        }
        else{
            JOptionPane.showMessageDialog(null,"please select a row");
        }
    }//GEN-LAST:event_ViewDetailButtonActionPerformed

    private void DeleteItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteItemButtonActionPerformed
        int selectedRow = vsTable.getSelectedRow();
        if(selectedRow >= 0){
            VitalSigns vs = (VitalSigns)vsTable.getValueAt(selectedRow, 0);
            vsHistory.deleteVitals(vs);
            JOptionPane.showMessageDialog(null, "item successfully deleted");
            polulateTable();
        }
        else{
            JOptionPane.showMessageDialog(null,"please select a row");
        }
    }//GEN-LAST:event_DeleteItemButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BPTxt;
    private javax.swing.JTextField DateTxt;
    private javax.swing.JButton DeleteItemButton;
    private javax.swing.JTextField PulseTxt;
    private javax.swing.JLabel TempLabel;
    private javax.swing.JLabel TempLabel1;
    private javax.swing.JLabel TempLabel2;
    private javax.swing.JLabel TempLabel3;
    private javax.swing.JTextField TempTxt;
    private javax.swing.JButton ViewDetailButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable vsTable;
    // End of variables declaration//GEN-END:variables
}
