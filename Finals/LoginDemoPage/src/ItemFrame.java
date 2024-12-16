
import java.awt.Color;
import java.awt.Toolkit;

public class ItemFrame extends javax.swing.JFrame {

    public ItemFrame(String imagePath, String iname, String definition, String price) {
        setUndecorated(true);
        initComponents();
        setIconImage();
        this.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
        
        setItemDetails(imagePath, iname, definition, price);
    }
    
    private void setItemDetails(String imagePath, String iname, String definition, String price) {
        itemName.setText(iname);
        itemDefinition.setText("<html>" +definition+ "<html>");
        
        jBuy.setText("Buy For - P " + price);

        java.net.URL imageUrl = getClass().getResource(imagePath);
        if (imageUrl != null) {
            itemImage.setIcon(new javax.swing.ImageIcon(imageUrl));
        } else {
            System.err.println("Error: Resource not found - " + imagePath);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        close1 = new javax.swing.JLabel();
        close2 = new javax.swing.JLabel();
        itemName = new javax.swing.JLabel();
        itemDefinition = new javax.swing.JLabel();
        jBuy = new javax.swing.JButton();
        frame = new javax.swing.JLabel();
        itemImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(102, 102, 102));
        setMinimumSize(new java.awt.Dimension(350, 490));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setMinimumSize(new java.awt.Dimension(370, 509));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 465, 320, 20));

        close1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close1.png"))); // NOI18N
        close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close1MouseEntered(evt);
            }
        });
        jPanel1.add(close1, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 14, 30, 30));

        close2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close2.png"))); // NOI18N
        close2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close2MouseExited(evt);
            }
        });
        jPanel1.add(close2, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 14, 30, 30));

        itemName.setFont(new java.awt.Font("Showcard Gothic", 1, 13)); // NOI18N
        itemName.setForeground(new java.awt.Color(204, 51, 0));
        itemName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemName.setText("Example");
        jPanel1.add(itemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 17, 290, 30));

        itemDefinition.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        itemDefinition.setForeground(new java.awt.Color(255, 255, 255));
        itemDefinition.setText("Lorem Ipsum");
        itemDefinition.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        itemDefinition.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(itemDefinition, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 290, 130));

        jBuy.setBackground(new java.awt.Color(204, 51, 0));
        jBuy.setFont(new java.awt.Font("Sitka Subheading", 0, 14)); // NOI18N
        jBuy.setText("BUY NOW!");
        jBuy.setMargin(new java.awt.Insets(3, 14, -1, 14));
        jBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuyActionPerformed(evt);
            }
        });
        jPanel1.add(jBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 170, 20));

        frame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Card.png"))); // NOI18N
        jPanel1.add(frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(itemImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 38, 360, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void close1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseEntered
        close2.setVisible(true);
        close1.setVisible(false);
    }//GEN-LAST:event_close1MouseEntered

    private void close2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close2MouseClicked
        this.dispose();
    }//GEN-LAST:event_close2MouseClicked

    private void close2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close2MouseExited
        close1.setVisible(true);
        close2.setVisible(false);
    }//GEN-LAST:event_close2MouseExited

    private void jBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuyActionPerformed
        String iname = itemName.getText();
        int price = Integer.parseInt(jBuy.getText().replaceAll("[^0-9]", "")); 
        new TransactionFrame(iname, price).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBuyActionPerformed


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemFrame("/BloodChaser.png", "Blood Chaser",
                        "A three section chained haft with double bladed axe head at the top. Nearly as dangerous to its wielder as it is to the enemy. Used by: Axe", "500")
                        .setVisible(true);
            }});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close1;
    private javax.swing.JLabel close2;
    private javax.swing.JLabel frame;
    private javax.swing.JLabel itemDefinition;
    private javax.swing.JLabel itemImage;
    private javax.swing.JLabel itemName;
    private javax.swing.JButton jBuy;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
private void setIconImage() {
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("AncientGoodsLogo.png")));
    }

}
