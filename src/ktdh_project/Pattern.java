/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktdh_project;

import ktdh_project.AllPanel.PanelDraw3D;
import ktdh_project.AllPanel.PanelDraw2D;
import ktdh_project.AllPanel.PanelAction2D;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;


/**
 *
 * @author nguye
 */
public class Pattern extends javax.swing.JFrame {

    /**
     * Creates new form Pattern
     */
    public Pattern() {
        initComponents();
//        resetAll();
        this.setSize(1500, 1000);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelInput = new javax.swing.JPanel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(120, 0), new java.awt.Dimension(120, 0), new java.awt.Dimension(120, 32767));
        jPanelFunction = new javax.swing.JPanel();
        jButtonDraw2D = new javax.swing.JButton();
        jButtonAction2D = new javax.swing.JButton();
        jButtonDraw3D = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jButtonExit = new javax.swing.JButton();
        jPanelShow = new javax.swing.JPanel();
        jLabelWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelInput.setBackground(java.awt.SystemColor.controlDkShadow);
        jPanelInput.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelInput.add(filler3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 375, -1, -1));

        jPanelFunction.setBackground(java.awt.SystemColor.controlShadow);
        jPanelFunction.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonDraw2D.setText("Vẽ 2D");
        jButtonDraw2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDraw2DActionPerformed(evt);
            }
        });
        jPanelFunction.add(jButtonDraw2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 36, 100, 50));

        jButtonAction2D.setText("Cảnh 2D");
        jButtonAction2D.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonAction2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAction2DActionPerformed(evt);
            }
        });
        jPanelFunction.add(jButtonAction2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 36, 100, 50));

        jButtonDraw3D.setText("Vẽ 3D");
        jButtonDraw3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDraw3DActionPerformed(evt);
            }
        });
        jPanelFunction.add(jButtonDraw3D, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 36, 100, 50));
        jPanelFunction.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 0, -1, -1));
        jPanelFunction.add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 62, 11, -1));

        jButtonExit.setText("Thoát");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jPanelFunction.add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 36, 100, 50));

        jPanelShow.setBackground(new java.awt.Color(255, 255, 255));

        jLabelWelcome.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabelWelcome.setForeground(new java.awt.Color(0, 255, 0));
        jLabelWelcome.setText("PHẦN MỀM KỸ THUẬT ĐỒ HỌA NHÓM 7");

        javax.swing.GroupLayout jPanelShowLayout = new javax.swing.GroupLayout(jPanelShow);
        jPanelShow.setLayout(jPanelShowLayout);
        jPanelShowLayout.setHorizontalGroup(
            jPanelShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelShowLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabelWelcome)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanelShowLayout.setVerticalGroup(
            jPanelShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelShowLayout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabelWelcome)
                .addContainerGap(319, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelFunction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelFunction, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanelInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDraw2DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDraw2DActionPerformed
        setDraw2D();
//        resetDraw2D();
//        resetTextField();
        
    }//GEN-LAST:event_jButtonDraw2DActionPerformed

    private void jButtonDraw3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDraw3DActionPerformed
        setDraw3D();
//        resetDraw3D();
//        resetTextField();
        
    }//GEN-LAST:event_jButtonDraw3DActionPerformed

    private void jButtonAction2DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAction2DActionPerformed
        setAction2D();
//        resetAction2D();
//        resetTextField();
        
    }//GEN-LAST:event_jButtonAction2DActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public void setDraw2D(){
        jPanelInput.removeAll();
        jPanelShow.removeAll();
        PanelDraw2D panel = new PanelDraw2D();
        JPanel inputPanel = (JPanel)(panel.getComponent(0));
        JPanel showPanel = (JPanel)(panel.getComponent(1));
//        System.out.print(panel.getComponent(0));
        jPanelInput.setLayout(new BorderLayout());
        jPanelInput.add(inputPanel);
        jPanelShow.setLayout(new BorderLayout());
        jPanelShow.add(showPanel);
        jPanelShow.validate();
        jPanelInput.validate();
    }
    
    public void setDraw3D(){
        jPanelInput.removeAll();
        jPanelShow.removeAll();
        PanelDraw3D panel = new PanelDraw3D();
        JPanel inputPanel = (JPanel)(panel.getComponent(0));
        JPanel showPanel = (JPanel)(panel.getComponent(1));
        jPanelInput.setLayout(new BorderLayout());
        jPanelInput.add(inputPanel);
        jPanelShow.setLayout(new BorderLayout());
        jPanelShow.add(showPanel);
        jPanelShow.validate();
        jPanelInput.validate();
    }
    
        public void setAction2D(){
        jPanelInput.removeAll();
        jPanelShow.removeAll();
        PanelAction2D panel = new PanelAction2D();
        jPanelInput.setLayout(new BorderLayout());
        jPanelInput.add(panel.getComponent(0));
        jPanelShow.setLayout(new BorderLayout());
        jPanelShow.add(panel.getComponent(0));
        jPanelInput.validate();
    }
    
    public void checkNumberType(KeyEvent evt){
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') ||
            (c == KeyEvent.VK_BACK_SPACE) ||
            (c == KeyEvent.VK_DELETE) ||
            (c == KeyEvent.VK_MINUS))) {
            getToolkit().beep();
            evt.consume();
        }
    }
    
    
    public void showInput(){
        
    }
    
//    public void reset(){
//        jLabelZ2.setVisible(false);
//        jLabelX2.setVisible(false);
//        jLabelY2.setVisible(false);
//        jTextFieldZ2.setVisible(false);
//        jTextFieldX2.setVisible(false);
//        jTextFieldY2.setVisible(false);
//        jLabelZ1.setVisible(false);
//        jLabelX1.setVisible(false);
//        jLabelY1.setVisible(false);
//        jTextFieldZ1.setVisible(false);
//        jTextFieldX1.setVisible(false);
//        jTextFieldY1.setVisible(false);
//        jButtonDraw.setVisible(false);
//        jButtonClear.setVisible(false);
//    }
    
//    public void resetTextField(){
//        jTextFieldZ2.setText("");
//        jTextFieldX2.setText("");
//        jTextFieldY2.setText("");
//        jTextFieldZ1.setText("");
//        jTextFieldX1.setText("");
//        jTextFieldY1.setText("");
//    }
    
//    public void resetAll(){
//        reset();
//        jLabelWelcome.setVisible(true);
//    }
//    
//    public void resetAction2D(){
//        reset();
//        jLabelWelcome.setVisible(false);
//    }
//    
//    public void resetDraw2D(){
//        jLabelZ2.setVisible(false);
//        jLabelX2.setVisible(true);
//        jLabelY2.setVisible(true);
//        jLabelZ1.setVisible(false);
//        jLabelX1.setVisible(true);
//        jLabelY1.setVisible(true);
//        jTextFieldZ2.setVisible(false);
//        jTextFieldX2.setVisible(true);
//        jTextFieldY2.setVisible(true);
//        jTextFieldZ1.setVisible(false);
//        jTextFieldX1.setVisible(true);
//        jTextFieldY1.setVisible(true);
//        jButtonDraw.setVisible(true);
//        jButtonClear.setVisible(true);
//    }
//    
//    public void resetDraw3D(){
//        jLabelZ2.setVisible(true);
//        jLabelX2.setVisible(true);
//        jLabelY2.setVisible(true);
//        jLabelZ1.setVisible(true);
//        jLabelX1.setVisible(true);
//        jLabelY1.setVisible(true);
//        jTextFieldZ2.setVisible(true);
//        jTextFieldX2.setVisible(true);
//        jTextFieldY2.setVisible(true);
//        jTextFieldZ1.setVisible(true);
//        jTextFieldX1.setVisible(true);
//        jTextFieldY1.setVisible(true);
//        jButtonDraw.setVisible(true);
//        jButtonClear.setVisible(true);
//    }
    
    
//    public void draw2DLine(LineMode mode){
//        int x1 = Integer.parseInt(jTextFieldX1.getText());
//        int y1 = Integer.parseInt(jTextFieldY1.getText());
//        int x2 = Integer.parseInt(jTextFieldX2.getText());
//        int y2 = Integer.parseInt(jTextFieldY2.getText());
//        Point2D startPoint = new Point2D(x1, y1);
//        Point2D endPoint = new Point2D(x2, y2);
//        MyLibrary.drawLine2D(startPoint, endPoint, mode, jPanelShow);
//    }
    
    
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
            java.util.logging.Logger.getLogger(Pattern.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pattern.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pattern.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pattern.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pattern().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JButton jButtonAction2D;
    private javax.swing.JButton jButtonDraw2D;
    private javax.swing.JButton jButtonDraw3D;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabelWelcome;
    private javax.swing.JPanel jPanelFunction;
    private javax.swing.JPanel jPanelInput;
    private javax.swing.JPanel jPanelShow;
    // End of variables declaration//GEN-END:variables
}
