/*
 * UrlDecoder.java
 *
 * Created on 30/07/2011, 19:12:58
 */
package net.ericroberto.projects.urldecoder;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import javax.swing.UIManager;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Eric Silva
 */
public class UrlDecoder extends javax.swing.JFrame {

    /** Creates new form UrlDecoder */
    public UrlDecoder() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtReverseString = new javax.swing.JTextField();
        txtBase64Decoded = new javax.swing.JTextField();
        txtHexToString = new javax.swing.JTextField();
        lblReverseString = new javax.swing.JLabel();
        lblBase64Decoded = new javax.swing.JLabel();
        lblHexToString = new javax.swing.JLabel();
        txtStringToDecode = new javax.swing.JTextField();
        lblStringToDecode = new javax.swing.JLabel();
        btnDecode = new javax.swing.JButton();
        lblHexToStringSecond = new javax.swing.JLabel();
        txtHexToStringSecond = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("URL Decoder");

        txtReverseString.setEditable(false);

        txtBase64Decoded.setEditable(false);

        txtHexToString.setEditable(false);

        lblReverseString.setText("Reverse String:");

        lblBase64Decoded.setText("Base64 Decoded:");

        lblHexToString.setText("Hex To String:");

        lblStringToDecode.setText("String to Decode:");

        btnDecode.setText("Decode");
        btnDecode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecodeActionPerformed(evt);
            }
        });

        lblHexToStringSecond.setText("Hex To String (Second):");

        txtHexToStringSecond.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblStringToDecode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStringToDecode, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecode))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHexToStringSecond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHexToString, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBase64Decoded, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblReverseString, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHexToStringSecond)
                            .addComponent(txtHexToString)
                            .addComponent(txtBase64Decoded, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                            .addComponent(txtReverseString, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStringToDecode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStringToDecode)
                    .addComponent(btnDecode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReverseString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReverseString))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBase64Decoded, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBase64Decoded))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHexToString)
                    .addComponent(txtHexToString, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHexToStringSecond)
                    .addComponent(txtHexToStringSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnDecodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecodeActionPerformed
        String urlEncoded = txtStringToDecode.getText();
        txtReverseString.setText(new StringBuilder(urlEncoded).reverse().toString());
        try {
        txtBase64Decoded.setText(new String(base64ToString(urlEncoded.getBytes())));
        } catch (Exception ex ){
            txtBase64Decoded.setText("Não é base64");
        } 
        txtHexToString.setText(new String(hexStringToByteArray(urlEncoded)));
        txtHexToStringSecond.setText(new String(hexStringToByteArray(new String(hexStringToByteArray(urlEncoded)))));
        
}//GEN-LAST:event_btnDecodeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new WindowsLookAndFeel());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UrlDecoder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new UrlDecoder().setVisible(true);
            }
        });
    }

    public static byte[] base64ToString(byte[] b) throws Exception {
        return Base64.decodeBase64(b);
    }

    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i + 1), 16));
        }
        return data;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDecode;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBase64Decoded;
    private javax.swing.JLabel lblHexToString;
    private javax.swing.JLabel lblHexToStringSecond;
    private javax.swing.JLabel lblReverseString;
    private javax.swing.JLabel lblStringToDecode;
    private javax.swing.JTextField txtBase64Decoded;
    private javax.swing.JTextField txtHexToString;
    private javax.swing.JTextField txtHexToStringSecond;
    private javax.swing.JTextField txtReverseString;
    private javax.swing.JTextField txtStringToDecode;
    // End of variables declaration//GEN-END:variables
}
