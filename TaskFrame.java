package tasktracker;

import javax.swing.JOptionPane;

public class TaskFrame extends javax.swing.JFrame {

    public TaskFrame() {
        initComponents();

        cmdStatus.removeAllItems();
        cmdStatus.addItem("Pending");
        cmdStatus.addItem("In Progress");
        cmdStatus.addItem("Completed");

        cmdStatus.setSelectedItem("Pending");
    }

    private void clearFields() {
        txtid.setText("");
        txtTitle.setText("");
        cmdStatus.setSelectedItem("Pending");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        cmdStatus = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtid.addActionListener(this::txtidActionPerformed);

        txtTitle.addActionListener(this::txtTitleActionPerformed);

        cmdStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAdd.setText("ADD");
        btnAdd.addActionListener(this::btnAddActionPerformed);

        btnSearch.setText("Search");
        btnSearch.addActionListener(this::btnSearchActionPerformed);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(this::btnUpdateActionPerformed);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(this::btnDeleteActionPerformed);

        btnClear.setText("Clear");
        btnClear.addActionListener(this::btnClearActionPerformed);

        jLabel1.setText("Text ID:");

        jLabel2.setText("Text Title:");

        jLabel3.setText("Status:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtid)
                            .addComponent(txtTitle)
                            .addComponent(cmdStatus, 0, 317, Short.MAX_VALUE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnSearch)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
         
    }//GEN-LAST:event_txtidActionPerformed

    private void txtTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitleActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
   try {

            int id = Integer.parseInt(txtid.getText());
            String title = txtTitle.getText();
            String status = cmdStatus.getSelectedItem().toString();

            Task task = new Task(id, title, status);

            TaskDAO dao = new TaskDAO();

            if (dao.addTask(task)) {
                JOptionPane.showMessageDialog(this,
                        "Task Added Successfully");
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this,
                        "Failed to Add Task");
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this,
                    "Task ID must be numeric");
        }      // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
 try {

            int id = Integer.parseInt(txtid.getText());

            TaskDAO dao = new TaskDAO();

            Task task = dao.searchTask(id);

            if (task != null) {

                txtTitle.setText(task.getTaskTitle());
                cmdStatus.setSelectedItem(task.getStatus());

            } else {

                JOptionPane.showMessageDialog(this,
                        "Task Not Found");
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this,
                    "Task ID must be numeric");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
   try {

            int id = Integer.parseInt(txtid.getText());
            String title = txtTitle.getText();
            String status = cmdStatus.getSelectedItem().toString();

            Task task = new Task(id, title, status);

            TaskDAO dao = new TaskDAO();

            if (dao.updateTask(task)) {

                JOptionPane.showMessageDialog(this,
                        "Task Updated Successfully");

            } else {

                JOptionPane.showMessageDialog(this,
                        "Update Failed");
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this,
                    "Task ID must be numeric");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    try {

            int id = Integer.parseInt(txtid.getText());

            TaskDAO dao = new TaskDAO();

            if (dao.deleteTask(id)) {

                JOptionPane.showMessageDialog(this,
                        "Task Deleted Successfully");

                clearFields();

            } else {

                JOptionPane.showMessageDialog(this,
                        "Delete Failed");
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this,
                    "Task ID must be numeric");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
  clearFields();        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmdStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
