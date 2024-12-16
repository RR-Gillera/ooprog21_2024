import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JOptionPane;

public class TransactionFrame extends javax.swing.JFrame {

    private String itemName;
    private int price;
    
    public TransactionFrame(String itemName, int price) {
        initComponents();
        
        try {
            File marioFont = new File("src\\MarioFont.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, marioFont).deriveFont(24f);
            wallet.setFont(font);
        }catch(Exception e){
            e.printStackTrace();
        }
         setImageIcon();
        jPanel1.requestFocusInWindow();
        this.itemName = itemName;
        this.price = price;
        
        pay.setText("Pay for - P "+price);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        arrow1 = new javax.swing.JLabel();
        arrow2 = new javax.swing.JLabel();
        wallet = new javax.swing.JLabel();
        cardName = new javax.swing.JTextField();
        cardNum = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        steamID = new javax.swing.JTextField();
        security = new javax.swing.JTextField();
        pay = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        arrow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrow1.png"))); // NOI18N
        arrow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                arrow1MouseEntered(evt);
            }
        });
        jPanel1.add(arrow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        arrow2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrow2.png"))); // NOI18N
        arrow2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arrow2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                arrow2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arrow2MouseExited(evt);
            }
        });
        jPanel1.add(arrow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        wallet.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        wallet.setForeground(new java.awt.Color(255, 255, 0));
        wallet.setText("ANCIENT PAY");
        jPanel1.add(wallet, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 240, 40));

        cardName.setBackground(new java.awt.Color(204, 204, 204));
        cardName.setForeground(new java.awt.Color(102, 102, 102));
        cardName.setText("Card Holder Name");
        cardName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cardNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cardNameFocusLost(evt);
            }
        });
        cardName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardNameMouseClicked(evt);
            }
        });
        cardName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNameActionPerformed(evt);
            }
        });
        jPanel1.add(cardName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 290, 40));

        cardNum.setBackground(new java.awt.Color(204, 204, 204));
        cardNum.setForeground(new java.awt.Color(102, 102, 102));
        cardNum.setText("Card Number");
        cardNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cardNumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cardNumFocusLost(evt);
            }
        });
        cardNum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardNumMouseClicked(evt);
            }
        });
        cardNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cardNumKeyTyped(evt);
            }
        });
        jPanel1.add(cardNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 290, 40));

        date.setBackground(new java.awt.Color(204, 204, 204));
        date.setForeground(new java.awt.Color(102, 102, 102));
        date.setText("MM/YY");
        date.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dateFocusLost(evt);
            }
        });
        date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateMouseClicked(evt);
            }
        });
        date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dateKeyTyped(evt);
            }
        });
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 130, 40));

        steamID.setBackground(new java.awt.Color(204, 204, 204));
        steamID.setForeground(new java.awt.Color(102, 102, 102));
        steamID.setText("Enter Your Steam ID");
        steamID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                steamIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                steamIDFocusLost(evt);
            }
        });
        steamID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                steamIDMouseClicked(evt);
            }
        });
        steamID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                steamIDKeyTyped(evt);
            }
        });
        jPanel1.add(steamID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 290, 40));

        security.setBackground(new java.awt.Color(204, 204, 204));
        security.setForeground(new java.awt.Color(102, 102, 102));
        security.setText("CVV");
        security.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                securityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                securityFocusLost(evt);
            }
        });
        security.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                securityMouseClicked(evt);
            }
        });
        security.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                securityActionPerformed(evt);
            }
        });
        security.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                securityKeyTyped(evt);
            }
        });
        jPanel1.add(security, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 130, 40));

        pay.setBackground(new java.awt.Color(153, 255, 153));
        pay.setText("Pay for - P");
        pay.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        jPanel1.add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 290, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tiny.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 1160, 500));

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(321, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(69, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(59, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(441, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cardNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNameActionPerformed
 
    }//GEN-LAST:event_cardNameActionPerformed

    private void arrow1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrow1MouseEntered
        arrow2.setVisible(true);
        arrow1.setVisible(false);
    }//GEN-LAST:event_arrow1MouseEntered

    private void arrow2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrow2MouseClicked
        this.dispose();
    }//GEN-LAST:event_arrow2MouseClicked

    private void arrow2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrow2MouseEntered

    }//GEN-LAST:event_arrow2MouseEntered

    private void arrow2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrow2MouseExited
        arrow1.setVisible(true);
        arrow2.setVisible(false);
    }//GEN-LAST:event_arrow2MouseExited

    private void cardNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardNameMouseClicked

    }//GEN-LAST:event_cardNameMouseClicked

    private void steamIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_steamIDMouseClicked

    }//GEN-LAST:event_steamIDMouseClicked

    private void cardNumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardNumMouseClicked

    }//GEN-LAST:event_cardNumMouseClicked

    private void securityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_securityMouseClicked

    }//GEN-LAST:event_securityMouseClicked

    private void dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseClicked

    }//GEN-LAST:event_dateMouseClicked

    private void securityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_securityActionPerformed
        
    }//GEN-LAST:event_securityActionPerformed

    private void dateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateKeyTyped
        char c = evt.getKeyChar();
        String text = date.getText();
 
        if (!Character.isDigit(c) && c != java.awt.event.KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            return;
        }
         
        if (text.length() >= 5 && c != java.awt.event.KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            return;
        }
         
        if (text.length() == 2 && c != java.awt.event.KeyEvent.VK_BACK_SPACE) {
            date.setText(text + "/");
        }
    }//GEN-LAST:event_dateKeyTyped

    private void dateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dateFocusGained
        if (date.getText().equals("MM/YY")) {
            date.setText("");
            date.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_dateFocusGained

    private void dateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dateFocusLost
        if (date.getText().isEmpty()) {
            date.setText("MM/YY");
            date.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_dateFocusLost

    private void securityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_securityKeyTyped
        char c = evt.getKeyChar();
        String text = security.getText();
 
        if (!Character.isDigit(c)) {
            evt.consume();
            return;
        }
 
        if (text.length() >= 3) {
            evt.consume();
        }
    }//GEN-LAST:event_securityKeyTyped

    private void securityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_securityFocusGained
        if (security.getText().equals("CVV")) {
            security.setText("");
            security.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_securityFocusGained

    private void securityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_securityFocusLost
        if (security.getText().length() != 3) {
            security.setText("");
        }
        if (security.getText().isEmpty()) {
            security.setText("CVV");
            security.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_securityFocusLost

    private void cardNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cardNameFocusLost
        String name = cardName.getText();
        if (!name.matches("[a-zA-Z\\s]+")) {
            cardName.setText("");
        }
        if (cardName.getText().isEmpty()) {
            cardName.setText("Card Holder Name");
            cardName.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_cardNameFocusLost

    private void cardNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardNumKeyTyped
        char c = evt.getKeyChar();
        String text = cardNum.getText().replace("-", ""); 
 
        if (!Character.isDigit(c) && c != java.awt.event.KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            return;
        }
 
        if (text.length() >= 16 && c != java.awt.event.KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            return;
        }
 
        if (text.length() % 4 == 0 && text.length() > 0 && c != java.awt.event.KeyEvent.VK_BACK_SPACE) {
            cardNum.setText(cardNum.getText() + "-");
        }
    }//GEN-LAST:event_cardNumKeyTyped

    private void cardNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cardNumFocusLost
        String text = cardNum.getText().replace("-", "");
        if (text.length() != 16) {
            cardNum.setText("");
        }
        if (cardNum.getText().isEmpty()) {
            cardNum.setText("Card Number");
            cardNum.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_cardNumFocusLost

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        String steam = steamID.getText();
        
        String name = cardName.getText();
        if (name.isEmpty() || !name.matches("[a-zA-Z\\s]+.") || name.matches("Card Holder Name")) {
            JOptionPane.showMessageDialog(null, "Invalid Card Holder Name. Please enter a valid name.");
            return;
        }
 
        String cardNumber = cardNum.getText().replace("-", "");
        if (cardNumber.length() != 16 || !cardNumber.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Invalid Card Number. Please enter a valid 16-digit card number.");
            return;
        }
 
        String expiryDate = date.getText();
        if (!expiryDate.matches("\\d{2}/\\d{2}")) {
            JOptionPane.showMessageDialog(null, "Invalid Expiry Date. Please enter in MM/YY format.");
            return;
        }

        String[] parts = expiryDate.split("/");
        int month = Integer.parseInt(parts[0]);
        int year = Integer.parseInt(parts[1]) + 2000;  
        
        if (month < 1 || month > 12 || year < java.time.Year.now().getValue()) {
            JOptionPane.showMessageDialog(null, "Invalid Card. Your Card is Expired.");
            return;
        }
 
        String cvv = security.getText();
        if (cvv.length() != 3 || !cvv.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Invalid CVV. Please enter a 3-digit CVV.");
            return;
        }
 
        JOptionPane.showMessageDialog(null, "Transaction Successful!");
 
        cardName.setText("");
        cardNum.setText("");
        date.setText("MM/YY");
        security.setText("");
        steamID.setText("");
        cardName.setForeground(Color.GRAY);
        cardNum.setForeground(Color.GRAY);
        date.setForeground(Color.GRAY);
        security.setForeground(Color.GRAY);
        steamID.setForeground(Color.GRAY);
        new Reciept(name, cardNumber, expiryDate, cvv, steam , itemName, price).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_payActionPerformed

    private void cardNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cardNameFocusGained
        if (cardName.getText().equals("Card Holder Name")) {
            cardName.setText("");
            cardName.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_cardNameFocusGained

    private void cardNumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cardNumFocusGained
        if (cardNum.getText().equals("Card Number")) {
            cardNum.setText("");
            cardNum.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_cardNumFocusGained

    private void steamIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_steamIDFocusGained
        if (steamID.getText().equals("Enter Your Steam ID")) {
            steamID.setText("");
            steamID.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_steamIDFocusGained

    private void steamIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_steamIDFocusLost
        
        
        if (steamID.getText().isEmpty()) {
            steamID.setText("Enter Your Steam ID");
            steamID.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_steamIDFocusLost

    private void steamIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_steamIDKeyTyped
        char c = evt.getKeyChar();
        String text = security.getText();
 
        if (!Character.isDigit(c)) {
            evt.consume();
            return;
        }
    }//GEN-LAST:event_steamIDKeyTyped

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransactionFrame("Blood Chaser", 500).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrow1;
    private javax.swing.JLabel arrow2;
    private javax.swing.JTextField cardName;
    private javax.swing.JTextField cardNum;
    private javax.swing.JTextField date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton pay;
    private javax.swing.JTextField security;
    private javax.swing.JTextField steamID;
    private javax.swing.JLabel wallet;
    // End of variables declaration//GEN-END:variables

    private void setImageIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("AncientGoodsLogo.png")));
    }
}
