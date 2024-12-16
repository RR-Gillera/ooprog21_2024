import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.logging.*;
import javax.swing.JOptionPane;

public class SignUpPage extends javax.swing.JFrame {

    int ln;
    File f = new File("D:\\JavaGUI");
    
    String Username,Age,Email,Password2,Password;
    
    public SignUpPage() {
        initComponents();
        this.setLocationRelativeTo(null);
         try {
            File marioFont = new File("src\\MarioFont.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, marioFont).deriveFont(15f);
            Font dialougeFont = Font.createFont(Font.TRUETYPE_FONT, marioFont).deriveFont(30f);
            Dialogue.setFont(dialougeFont);
            UsernameText.setFont(font);
            PasswordText.setFont(font);
            ConfirmPasswordText.setFont(font);
            EmailText.setFont(font);
            jReg.setFont(font);
        }catch(Exception e){
            e.printStackTrace();
        }
         setImageIcon();
         
    }
    
    void createFolder(){
        if(!f.exists()){
            f.mkdirs();
        }
    }
    
    void readFile(){
        try {
            FileReader fr = new FileReader(f+"\\logins.txt");
            System.err.println("file exists!");
        } catch (FileNotFoundException ex){
            try {
                FileWriter fw = new FileWriter(f+"\\logins.txt");
                System.out.println("File created.");
            } catch (IOException ex1) {
                Logger.getLogger(SignUpPage.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
    }
    
    void addData(String usr,String pswd,String pswd2,String mail){
        
        try {
            RandomAccessFile raf = new RandomAccessFile(f+"\\logins.txt", "rw");
            for(int i=0;i<ln;i++){
                raf.readLine();
            }
            if(ln>0){
            raf.writeBytes("\r\n");
            raf.writeBytes("\r\n");
            }
            raf.writeBytes("Username:"+usr+ "\r\n");
            raf.writeBytes("Password:"+pswd+ "\r\n");
            raf.writeBytes("Password:"+pswd2+ "\r\n");
            raf.writeBytes("Email:"+mail);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SignUpPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SignUpPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
                
    void countLines(){
        try {
            ln=0;
            RandomAccessFile raf = new RandomAccessFile(f+"\\logins.txt", "rw");
            for(int i=0;raf.readLine()!=null;i++){
                ln++;
            }
            System.out.println("number of lines:"+ln);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SignUpPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SignUpPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Dialogue = new javax.swing.JLabel();
        UsernameText = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();
        PasswordText = new javax.swing.JLabel();
        ConfirmPasswordText = new javax.swing.JLabel();
        EmailText = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jReg = new javax.swing.JButton();
        tfPass = new javax.swing.JPasswordField();
        tfPass2 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        arrow1 = new javax.swing.JLabel();
        arrow2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AncientGoods");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppLabel.png"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, -1));

        Dialogue.setForeground(new java.awt.Color(152, 255, 152));
        Dialogue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dialogue.setText("Registration");
        jPanel1.add(Dialogue, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        UsernameText.setForeground(new java.awt.Color(152, 255, 152));
        UsernameText.setText("Username");
        jPanel1.add(UsernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        tfUser.setBackground(new java.awt.Color(78, 80, 82));
        tfUser.setForeground(new java.awt.Color(152, 255, 152));
        tfUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserActionPerformed(evt);
            }
        });
        tfUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfUserKeyPressed(evt);
            }
        });
        jPanel1.add(tfUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 220, -1));

        PasswordText.setForeground(new java.awt.Color(152, 255, 152));
        PasswordText.setText("Password");
        jPanel1.add(PasswordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));

        ConfirmPasswordText.setForeground(new java.awt.Color(152, 255, 152));
        ConfirmPasswordText.setText("Confirm Password");
        jPanel1.add(ConfirmPasswordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, 20));

        EmailText.setForeground(new java.awt.Color(152, 255, 152));
        EmailText.setText("Email");
        jPanel1.add(EmailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        tfEmail.setBackground(new java.awt.Color(78, 80, 82));
        tfEmail.setForeground(new java.awt.Color(152, 255, 152));
        tfEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });
        tfEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfEmailKeyPressed(evt);
            }
        });
        jPanel1.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 220, -1));

        jReg.setBackground(new java.awt.Color(102, 102, 102));
        jReg.setForeground(new java.awt.Color(204, 0, 0));
        jReg.setText("FINISH");
        jReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegActionPerformed(evt);
            }
        });
        jPanel1.add(jReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 120, 40));

        tfPass.setBackground(new java.awt.Color(78, 80, 82));
        tfPass.setForeground(new java.awt.Color(152, 255, 152));
        tfPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPassActionPerformed(evt);
            }
        });
        tfPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPassKeyPressed(evt);
            }
        });
        jPanel1.add(tfPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 220, -1));

        tfPass2.setBackground(new java.awt.Color(78, 80, 82));
        tfPass2.setForeground(new java.awt.Color(152, 255, 152));
        tfPass2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPass2KeyPressed(evt);
            }
        });
        jPanel1.add(tfPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 220, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resizedDawnBreaker.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserActionPerformed
        
    }//GEN-LAST:event_tfUserActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        
    }//GEN-LAST:event_tfEmailActionPerformed

    private void jRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegActionPerformed
        createFolder();
        readFile();
        
        String username = tfUser.getText();
        String password = tfPass.getText();
        String password2 = tfPass2.getText();
        String email = tfEmail.getText();
        

        if(username.isEmpty() || password.isEmpty() || password2.isEmpty() || email.isEmpty()){
            if(username.isEmpty()){
            JOptionPane.showMessageDialog(null, "Username should not be empty.");
            return;
            } if(password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Password should not be empty.");
            return;
            } if(password2.isEmpty()){
            JOptionPane.showMessageDialog(null, "Confirm Password should not be empty.");
            return;
            } if(email.isEmpty()){
            JOptionPane.showMessageDialog(null, "Email Address should not be empty.");
            return;
            }
            return;
        }
        if (!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$")) {
            JOptionPane.showMessageDialog(null, "Password must contain at least one uppercase letter, one lowercase letter, and one digit.");
            tfPass.setText("");
            return;
        }
        if (password.length() < 8) {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long.");
            tfPass.setText("");
            return;
        }
        if (!password.equals(password2)) {
            JOptionPane.showMessageDialog(null, "Passwords do not match.");
            tfPass.setText("");
            tfPass2.setText("");
            return;
        }
        if (!email.endsWith("@gmail.com")) {
            JOptionPane.showMessageDialog(null, "Invalid Email Address");
            tfEmail.setText("");
            return;
        }
        countLines();
        
        addData(username, password, password2, email);
        JOptionPane.showMessageDialog(null,"Data Registered");
        
        JFRAMELogin loginFrame = new JFRAMELogin();
        loginFrame.setVisible(true);
        this.setVisible(false);
        loginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jRegActionPerformed

    private void arrow1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrow1MouseEntered
        arrow2.setVisible(true);
        arrow1.setVisible(false);
    }//GEN-LAST:event_arrow1MouseEntered

    private void arrow2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrow2MouseClicked
        new JFRAMELogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_arrow2MouseClicked

    private void arrow2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrow2MouseEntered

    }//GEN-LAST:event_arrow2MouseEntered

    private void arrow2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrow2MouseExited
        arrow2.setVisible(false);
        arrow1.setVisible(true);
    }//GEN-LAST:event_arrow2MouseExited

    private void tfPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPassActionPerformed

    private void tfUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUserKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jReg.doClick();
        }
    }//GEN-LAST:event_tfUserKeyPressed

    private void tfPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jReg.doClick();
        }
    }//GEN-LAST:event_tfPassKeyPressed

    private void tfPass2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPass2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jReg.doClick();
        }
    }//GEN-LAST:event_tfPass2KeyPressed

    private void tfEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEmailKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jReg.doClick();
        }
    }//GEN-LAST:event_tfEmailKeyPressed

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
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConfirmPasswordText;
    private javax.swing.JLabel Dialogue;
    private javax.swing.JLabel EmailText;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel PasswordText;
    private javax.swing.JLabel UsernameText;
    private javax.swing.JLabel arrow1;
    private javax.swing.JLabel arrow2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jReg;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JPasswordField tfPass;
    private javax.swing.JPasswordField tfPass2;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables

    private void setImageIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("AncientGoodsLogo.png")));
    }
}
