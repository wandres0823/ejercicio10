/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazejercicio10;

import javax.swing.JOptionPane;

/**
 *
 * @author adalberto
 */
public class Ejrcicio10 extends javax.swing.JFrame {

    /**
     * Creates new form Ejrcicio10
     */
    public Ejrcicio10() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFotos = new javax.swing.JTextField();
        cmdPagar = new javax.swing.JButton();
        txtOperacion = new javax.swing.JTextField();
        cmBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 0, -1, 300));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("fotos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel2.setText("numero de fotos :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 130, -1));

        txtFotos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFotosKeyTyped(evt);
            }
        });
        getContentPane().add(txtFotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 100, -1));

        cmdPagar.setText("total a pagar");
        cmdPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPagarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        txtOperacion.setEditable(false);
        txtOperacion.setText(" ");
        getContentPane().add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 70, -1));

        cmBorrar.setText("Borrar");
        cmBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(cmBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFotosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFotosKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
              
          }
    }//GEN-LAST:event_txtFotosKeyTyped

    private void cmdPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPagarActionPerformed
        String res;
       double nf,mp,iva,mtp;
       
       if(txtFotos.getText().isEmpty()){
           JOptionPane.showMessageDialog (this, "digite la cantidadd de fotos","error",JOptionPane.ERROR_MESSAGE);
           txtFotos.requestFocusInWindow();
           
           }
       else {
       
       nf =Double.parseDouble(txtFotos.getText());
       iva=(1500*16)/100;
       mtp=(1500*nf)+iva;
       
       res=String.valueOf(mtp);
        txtOperacion.setText(res);
       }
    }//GEN-LAST:event_cmdPagarActionPerformed

    private void cmBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmBorrarActionPerformed
        txtFotos.setText("");
        txtOperacion.setText("");
        
        
        txtFotos.requestFocusInWindow();
    }//GEN-LAST:event_cmBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Ejrcicio10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejrcicio10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejrcicio10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejrcicio10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejrcicio10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmBorrar;
    private javax.swing.JButton cmdPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtFotos;
    private javax.swing.JTextField txtOperacion;
    // End of variables declaration//GEN-END:variables
}
