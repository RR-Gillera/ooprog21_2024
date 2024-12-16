import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.util.Random;

public class Reciept extends javax.swing.JFrame {
    
    private String name, cardNum, date, cvv, steam, iName;
    private int price;
    private TransactionHistory transFrame = TransactionHistory.getInstance();

    public Reciept(String name, String cardNumber, String expiryDate, String cvv, String steam, String itemName, int price) {
        initComponents();
        try {
            File marioFont = new File("src\\MarioFont.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, marioFont).deriveFont(20f);
            wallet.setFont(font);
        }catch(Exception e){
            e.printStackTrace();
        }
         setImageIcon();
         
        this.name = name;
        this.cardNum = cardNumber;
        this.date = expiryDate;
        this.cvv = cvv;
        this.steam = steam;
        this.iName = itemName;
        this.price = price;
 
        accName.setText(this.name);
        accNum.setText(maskCardNumber(this.cardNum));
        steamID.setText(this.steam);
        itemPurc.setText(this.iName);
        amount.setText("P " + this.price);
        refNum.setText(generateReferenceNumber());
        
        transFrame.AddDetails(new Object[]{
            iName,
            price,
            refNum.getText(), // Correctly pass the reference number as text
        });
                 
    }
    
    
    private String maskCardNumber(String cardNumber) {
        if (cardNumber.length() < 4) return "****";
        return "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
    }
    
    private String generateReferenceNumber() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; 
        Random random = new Random();

        StringBuilder referenceNumber = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(characters.length());
            referenceNumber.append(characters.charAt(index));
        }

        int refDigits = 1000 + random.nextInt(9000);
        referenceNumber.append(refDigits);

        return referenceNumber.toString();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        wallet = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        itemPurc = new javax.swing.JLabel();
        refNum = new javax.swing.JLabel();
        accNum = new javax.swing.JLabel();
        steamID = new javax.swing.JLabel();
        accName = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wallet.setForeground(new java.awt.Color(204, 0, 0));
        wallet.setText("ANCIENT PAY");
        jPanel1.add(wallet, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 250, 40));

        jLabel1.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Reference Number");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 150, 20));

        jLabel2.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Item Purchased");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, 20));

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Steam ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 150, 20));

        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Amount");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 150, 20));

        jLabel5.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Account Number");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 150, 20));

        jLabel6.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Account Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 150, 20));

        itemPurc.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        itemPurc.setForeground(new java.awt.Color(255, 255, 0));
        itemPurc.setText("Russell Kyut");
        jPanel1.add(itemPurc, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 230, 20));

        refNum.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        refNum.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(refNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 230, 20));

        accNum.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        accNum.setForeground(new java.awt.Color(255, 255, 0));
        accNum.setText("1234-5678-9012-****");
        jPanel1.add(accNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 230, 20));

        steamID.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        steamID.setForeground(new java.awt.Color(255, 255, 0));
        steamID.setText("1234567891011");
        jPanel1.add(steamID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 230, 20));

        accName.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        accName.setForeground(new java.awt.Color(255, 255, 0));
        accName.setText("Russell Ray Y Gillera");
        jPanel1.add(accName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 230, 20));

        amount.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        amount.setForeground(new java.awt.Color(255, 255, 0));
        amount.setText("P12412");
        jPanel1.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 230, 20));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Thank you for trusting AncientGoods.");

        jLabel9.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("Cheap and Trusted 100%");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel7)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 450, 210));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BCKGRND.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 520, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
 
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
            java.util.logging.Logger.getLogger(Reciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reciept("Russell Ray Y Gillera","1234-1234-1234-1234","11/24","123","1234567890","Russell Kyut",500).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accName;
    private javax.swing.JLabel accNum;
    private javax.swing.JLabel amount;
    private javax.swing.JLabel itemPurc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel refNum;
    private javax.swing.JLabel steamID;
    private javax.swing.JLabel wallet;
    // End of variables declaration//GEN-END:variables
    
    private void setImageIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("AncientGoodsLogo.png")));
    }
}
