/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.view;

import edu.neu.csye6200.controller.FeedbackService;
import edu.neu.csye6200.model.Feedback;
import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author varadakulkarni
 */
public class FeedbackUI extends javax.swing.JFrame {

    /**
     * Creates new form ViewFeedback
     */
    private String empId, tName, rating,review,lastFeedBackDate,nextFeedbackDate; 
    public FeedbackUI() {
        initComponents();
        jTableFeedback.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableFeedback.setAutoCreateColumnsFromModel(true);
        try {
        	fetchFeedbackDetails((DefaultTableModel)jTableFeedback.getModel());
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    public FeedbackUI(List<Feedback> fdlist) {
        initComponents();
     
        DefaultTableModel model = (javax.swing.table.DefaultTableModel)jTableFeedback.getModel(); 

        try {
        	fetchFeedbackDetails(model);
		} catch (Exception e) {
			e.printStackTrace();
		}
        jTableFeedback.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableFeedback.setAutoCreateColumnsFromModel(true);
        model.addRow(new Object[]{empId,tName,rating,review,lastFeedBackDate,nextFeedbackDate});
        
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
        jLabel2 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFeedback = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1324, 59));

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feeback1.png"))); // NOI18N
        jLabel2.setText(" Feedback  Info");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(592, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jInternalFrame1.setResizable(true);
        jInternalFrame1.setPreferredSize(new java.awt.Dimension(920, 454));
        jInternalFrame1.setRequestFocusEnabled(false);
        jInternalFrame1.setVerifyInputWhenFocusTarget(false);
        jInternalFrame1.setVisible(true);

        jTableFeedback.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Employee Id", "Teacher Name", "Review", "Rating", "Last Feedback Date", "Next Feedback Date"
            }
        ));
        jScrollPane1.setViewportView(jTableFeedback);

        jInternalFrame1.getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1456, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 1085, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FeedbackUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeedbackUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeedbackUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeedbackUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeedbackUI().setVisible(true);
            }
        });
    }
    
    private DefaultTableModel fetchFeedbackDetails(DefaultTableModel model) throws Exception {
        FeedbackService service = new FeedbackService();
        List<Feedback> feebbackList = new ArrayList<Feedback>();
        LocalDate date1 = LocalDate.of(2023, 04, 15);
        LocalDate date2 = LocalDate.of(2023, 03, 12);
        LocalDate date3 = LocalDate.of(2023, 03, 25);
        LocalDate date4 = LocalDate.of(2023, 04, 10);
        LocalDate date5 = LocalDate.of(2023, 02, 28);
        
        Feedback f1 = new Feedback();
        f1.setEmployeeId(1);
        f1.setTeacherName("Eddie");
        f1.setReview("Excellent!");
        f1.setRating(4.87);
        f1.setLastFeedBackDate(date1);
        f1.setNextFeedbackDate(date1.plusMonths(2));
        
        Feedback f2 = new Feedback();
        f2.setEmployeeId(2);
        f2.setTeacherName("Lawrence");
        f2.setReview("Good teaching style!");
        f2.setRating(4.65);
        f2.setLastFeedBackDate(date2);
        f2.setNextFeedbackDate(date2.plusMonths(2));
        
        Feedback f3 = new Feedback();
        f3.setEmployeeId(6);
        f3.setTeacherName("Ross");
        f3.setReview("Average!");
        f3.setRating(4.25);
        f3.setLastFeedBackDate(date3);
        f3.setNextFeedbackDate(date3.plusMonths(2));
        
        Feedback f4 = new Feedback();
        f4.setEmployeeId(8);
        f4.setTeacherName("Edward");
        f4.setReview("No interactive classes!");
        f4.setRating(2.81);
        f4.setLastFeedBackDate(date4);
        f4.setNextFeedbackDate(date4.plusMonths(2));
        
        Feedback f5 = new Feedback();
        f5.setEmployeeId(5);
        f5.setTeacherName("Hellen");
        f5.setReview("Need more practical teaching approach!");
        f5.setRating(3.93);
        f5.setLastFeedBackDate(date5);
        f5.setNextFeedbackDate(date5.plusMonths(2));
        
        feebbackList.add(f1);
        feebbackList.add(f2);
        feebbackList.add(f3);
        feebbackList.add(f4);
        feebbackList.add(f5);
        
        //List<Feedback>	 feebbackList = service.getAllTeacherReviews();
        
        for (Feedback feedback : feebbackList) {
            System.out.println("inside ");
            Object[] row = new Object[6];
            row[0] = feedback.getEmployeeId();
            row[1] = feedback.getTeacherName();
            row[2] = feedback.getReview();
            row[3] = feedback.getRating();
            row[4] = feedback.getLastFeedBackDate();
            row[5] = feedback.getNextFeedbackDate();
            
            model.addRow(row);
        }
        return model;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFeedback;
    // End of variables declaration//GEN-END:variables
}