/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import des.DES;
import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author alesj
 */
public class DesGUI extends javax.swing.JFrame {

    public DesGUI() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        setLocationRelativeTo(null);
        setTitle("Cifrado DES para archivos");
    }
    
    String parent = "";
    
    void openFile(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        File f = fileChooser.getSelectedFile();
        if (f != null){
            String filename = f.getAbsolutePath();
            parent = f.getParent();
            txt_origen.setText(filename);
        }
    }
    
    boolean validateFiles(){
        if(parent.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Archivo a cifrar");
            return false;
        }
        if (txt_origen.getText().equals( parent + "\\" +txt_destino.getText())){
            JOptionPane.showMessageDialog(rootPane, "Los archivos son los mimos.");
            return false;
        }
        if(txt_destino.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Archivo donde se quiere guardar el texto cifrado.");
            return false;
        }
        if(txt_clave.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Escriba una llave.");
            return false;
        }
        if(txt_clave.getText().trim().length() < 6){
            JOptionPane.showMessageDialog(rootPane, "La llave es muy corta");
            return false;
        }
        return true;
    }
    
    void clean(){
        parent = "";
        txt_origen.setText("");
        txt_destino.setText("");
        txt_clave.setText("");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seleccionar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Encriptar = new javax.swing.JButton();
        Desenctripar = new javax.swing.JButton();
        txt_origen = new javax.swing.JTextField();
        txt_destino = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_clave = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.pink);
        setBounds(new java.awt.Rectangle(10, 0, 0, 0));

        seleccionar1.setBackground(new java.awt.Color(57, 57, 228));
        seleccionar1.setText("Seleccionar");
        seleccionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionar1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Archivo de origen : ");

        jLabel5.setText("Nombre archivo destino : ");

        Encriptar.setBackground(java.awt.Color.blue);
        Encriptar.setText("Cifrar");
        Encriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncriptarActionPerformed(evt);
            }
        });

        Desenctripar.setBackground(java.awt.Color.red);
        Desenctripar.setText("Descifrar");
        Desenctripar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesenctriparActionPerformed(evt);
            }
        });

        txt_origen.setFocusable(false);
        txt_origen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_origenMouseClicked(evt);
            }
        });

        jLabel2.setText("Clave : ");

        txt_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_claveActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Silva Juarez Alejandro 5IV8");

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("CIFRADO DES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(Encriptar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Desenctripar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txt_origen, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(seleccionar1))
                            .addComponent(txt_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(218, 218, 218))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(seleccionar1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_clave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Desenctripar, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(Encriptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionar1ActionPerformed
       openFile();
    }//GEN-LAST:event_seleccionar1ActionPerformed

    private void DesenctriparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesenctriparActionPerformed
        DES des = new DES();
        if(validateFiles()){
            des.applyDES("d", txt_clave.getText(), txt_origen.getText(), parent + "\\" +txt_destino.getText());
            JOptionPane.showMessageDialog(this,
                    "Se ah descifrado correctamente\n Está ubicado en: "+parent + "\\" +txt_destino.getText(),
                    "Descifrado exitoso",
                    JOptionPane.INFORMATION_MESSAGE);
            clean();
        }
    }//GEN-LAST:event_DesenctriparActionPerformed

    private void EncriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncriptarActionPerformed
        DES des = new DES();
        if(validateFiles()){
            des.applyDES("e", txt_clave.getText(), txt_origen.getText(), parent + "\\" +txt_destino.getText());
            JOptionPane.showMessageDialog(this,
                    "Se ah cifrado correctamente\n Está ubicado en: "+parent + "\\" +txt_destino.getText(),
                    "Cifrado exitoso",
                    JOptionPane.INFORMATION_MESSAGE);
            clean();
        }
    }//GEN-LAST:event_EncriptarActionPerformed

    private void txt_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_claveActionPerformed

    private void txt_origenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_origenMouseClicked
        openFile();
    }//GEN-LAST:event_txt_origenMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Desenctripar;
    private javax.swing.JButton Encriptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton seleccionar1;
    private javax.swing.JTextField txt_clave;
    private javax.swing.JTextField txt_destino;
    private javax.swing.JTextField txt_origen;
    // End of variables declaration//GEN-END:variables
}
