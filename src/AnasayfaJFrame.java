
import java.awt.DisplayMode;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static Duenleyici.Duzenleyen.setBackgroundImage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class AnasayfaJFrame extends javax.swing.JFrame {

    /**
     * Creates new form AnasayfaJFrame
     */
    public AnasayfaJFrame() {
        initComponents();
        setBackgroundImage(logojLabel,"C:\\Users\\user\\Documents\\NetBeansProjects\\VTYS_grup_12\\src\\images\\kulup.png");
        setBackgroundImage(etknlk1imagejLabel,"C:\\Users\\user\\Documents\\NetBeansProjects\\VTYS_grup_12\\src\\images\\logoo.jpg");
        setBackgroundImage(etknlk2imagejLabel,"C:\\Users\\user\\Documents\\NetBeansProjects\\VTYS_grup_12\\src\\images\\logoo.jpg");
        setBackgroundImage(etknlk3imagejLabel,"C:\\Users\\user\\Documents\\NetBeansProjects\\VTYS_grup_12\\src\\images\\logoo.jpg");
    }

 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        anasayfajLabel = new javax.swing.JLabel();
        iletisimjLabel = new javax.swing.JLabel();
        hakkimizdajLabel = new javax.swing.JLabel();
        etkinlikjLabel = new javax.swing.JLabel();
        ekibimizjLabel = new javax.swing.JLabel();
        destekcilerimizjLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        etknlk1imagejLabel = new javax.swing.JLabel();
        etknlk2imagejLabel = new javax.swing.JLabel();
        etknlk3imagejLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        logojLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        anasayfajLabel.setText("Anasayfa");
        anasayfajLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anasayfajLabelMouseClicked(evt);
            }
        });
        anasayfajLabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                anasayfajLabelKeyPressed(evt);
            }
        });

        iletisimjLabel.setText("İletişim");
        iletisimjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iletisimjLabelMouseClicked(evt);
            }
        });

        hakkimizdajLabel.setText("Hakkımızda");

        etkinlikjLabel.setText("Etkinlik");

        ekibimizjLabel.setText("Ekiibimiz");

        destekcilerimizjLabel.setText("Destekçilerimiz");

        jButton1.setText("Giriş ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        etknlk1imagejLabel.setBackground(new java.awt.Color(255, 204, 204));
        etknlk1imagejLabel.setText("jLabel9");

        etknlk2imagejLabel.setText("jLabel11");

        etknlk3imagejLabel.setText("jLabel13");

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(240, 240, 240));
        jTextPane1.setText("önemli olayların listesini yaparlar. Listede yer alan olaylar arasından bazıları seçilerek\n zaman çizelgesine yerleştirilir. Her olay ait olduğu döneme yazılarak resimlenir ve k\nâğıtlar birleştirilerek sınıf duvarına asılır. Her öğrenci, seçtiği bir dönemde yaşayan g\nerçek veya hayalî bir şahsın yerine geçerek hikâyesini anlatır. Örneğin, bir öğrenci val\niyi temsil ediyorsa o dönemde yaşanan bir olayı");
        jTextPane1.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTextPane1);

        jTextPane2.setEditable(false);
        jTextPane2.setBackground(new java.awt.Color(240, 240, 240));
        jTextPane2.setText("önemli olayların listesini yaparlar. Listede yer alan olaylar arasından bazıları seçilerek\n zaman çizelgesine yerleştirilir. Her olay ait olduğu döneme yazılarak resimlenir ve k\nâğıtlar birleştirilerek sınıf duvarına asılır. Her öğrenci, seçtiği bir dönemde yaşayan g\nerçek veya hayalî bir şahsın yerine geçerek hikâyesini anlatır. Örneğin, bir öğrenci val\niyi temsil ediyorsa o dönemde yaşanan bir olayı");
        jScrollPane2.setViewportView(jTextPane2);

        jTextPane3.setEditable(false);
        jTextPane3.setBackground(new java.awt.Color(240, 240, 240));
        jTextPane3.setText("önemli olayların listesini yaparlar. Listede yer alan olaylar arasından bazıları seçilerek\n zaman çizelgesine yerleştirilir. Her olay ait olduğu döneme yazılarak resimlenir ve k\nâğıtlar birleştirilerek sınıf duvarına asılır. Her öğrenci, seçtiği bir dönemde yaşayan g\nerçek veya hayalî bir şahsın yerine geçerek hikâyesini anlatır. Örneğin, bir öğrenci val\niyi temsil ediyorsa o dönemde yaşanan bir olayı");
        jScrollPane3.setViewportView(jTextPane3);

        logojLabel.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etknlk3imagejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(etknlk2imagejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(etknlk1imagejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(anasayfajLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(iletisimjLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(hakkimizdajLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(etkinlikjLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ekibimizjLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(destekcilerimizjLabel))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(10, 10, 10)))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {etknlk2imagejLabel, etknlk3imagejLabel});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane2, jScrollPane3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logojLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(anasayfajLabel)
                        .addComponent(iletisimjLabel)
                        .addComponent(hakkimizdajLabel)
                        .addComponent(etkinlikjLabel)
                        .addComponent(ekibimizjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(destekcilerimizjLabel)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etknlk1imagejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etknlk2imagejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etknlk3imagejLabel)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {etknlk1imagejLabel, etknlk2imagejLabel, etknlk3imagejLabel, jScrollPane1, jScrollPane2, jScrollPane3, logojLabel});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void anasayfajLabelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_anasayfajLabelKeyPressed
    
        
// TODO add your handling code here:
    }//GEN-LAST:event_anasayfajLabelKeyPressed

    private void anasayfajLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anasayfajLabelMouseClicked
        new  AnasayfaJFrame().setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_anasayfajLabelMouseClicked

    private void iletisimjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iletisimjLabelMouseClicked
       new IletisimJFrame().setVisible(true);
       dispose();    
        // TODO add your handling code here:
    }//GEN-LAST:event_iletisimjLabelMouseClicked

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
            java.util.logging.Logger.getLogger(AnasayfaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnasayfaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnasayfaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnasayfaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnasayfaJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anasayfajLabel;
    private javax.swing.JLabel destekcilerimizjLabel;
    private javax.swing.JLabel ekibimizjLabel;
    private javax.swing.JLabel etkinlikjLabel;
    private javax.swing.JLabel etknlk1imagejLabel;
    private javax.swing.JLabel etknlk2imagejLabel;
    private javax.swing.JLabel etknlk3imagejLabel;
    private javax.swing.JLabel hakkimizdajLabel;
    private javax.swing.JLabel iletisimjLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JLabel logojLabel;
    // End of variables declaration//GEN-END:variables
}
