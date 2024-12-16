import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.awt.event.*;
import java.io.*;
import java.util.logging.*;
import javax.swing.*;

public class JFRAMELogin extends javax.swing.JFrame {

    public JFRAMELogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            File marioFont = new File("src\\MarioFont.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, marioFont).deriveFont(15f);
            UserLabel.setFont(font);
            PassLabel.setFont(font);
            jLogin.setFont(font);
            jSignUp.setFont(font);
        }catch(Exception e){
            e.printStackTrace();
        }
        tfUser.setBorder(javax.swing.BorderFactory.createCompoundBorder(
            tfUser.getBorder(),
            javax.swing.BorderFactory.createEmptyBorder(3, 15, 3, 3)
        ));
        tfPass.setBorder(javax.swing.BorderFactory.createCompoundBorder(
            tfPass.getBorder(),
            javax.swing.BorderFactory.createEmptyBorder(3, 15, 3, 3)
        ));
        setImageIcon();
    }
    int ln;
    File f = new File("D:\\JavaGUI");
    

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

    void logic(String usr, String pswd){
        boolean userFound = false;
        boolean passFound = false;
        
        if(usr.isEmpty() && pswd.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Fill Out Username and Password.");
            return;
        }
        if(usr.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Fill Out Username.");
            return;
        }
        else if(pswd.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Fill Out Password.");
            return;
        }
        
        try {
            RandomAccessFile raf = new RandomAccessFile(f + "\\logins.txt", "rw");
            for (int i = 0; i < ln; i += 5) {
                String forUser = raf.readLine();
                String forPswd = raf.readLine();
                raf.readLine();
                String forEmail = raf.readLine();
                
                if (forUser != null && forUser.length() > 9) {
                    forUser = forUser.substring(9); 
                }
                if (forPswd != null && forPswd.length() > 9) {
                    forPswd = forPswd.substring(9); 
                }
                if (forEmail != null && forEmail.length() > 6) {
                    forEmail = forEmail.substring(6);  
                }
                if (usr.equals(forUser)) {
                    userFound = true;
                    if (pswd.equals(forPswd)) {
                        passFound = true;
                        JOptionPane.showMessageDialog(null, "Login Successfully!");
                        MarketArea marketFrame = new MarketArea(usr, pswd, forEmail);
                        marketFrame.setVisible(true);
                        this.setVisible(false);
                        marketFrame.setLocationRelativeTo(null);
                        break;
                    }
                }
                
                for (int k = 1; k <= 1; k++) {
                    raf.readLine();
                }
            }
            if(!userFound && !passFound){
                JOptionPane.showMessageDialog(null, "Incorrect Username and Password.");
                tfUser.setText("");
                tfPass.setText("");
                return;
            }
            if (!userFound) {
                JOptionPane.showMessageDialog(null, "Incorrect Username.");
                tfUser.setText("");
                tfPass.setText("");
            } else if (userFound && !passFound) {
                JOptionPane.showMessageDialog(null, "Incorrect Password.");
                tfPass.setText("");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JFRAMELogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JFRAMELogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    void countLines(){
        try (BufferedReader br = new BufferedReader(new FileReader(f + "\\logins.txt"))) {
            ln = 0;
            while (br.readLine() != null) {
                ln++;
            }
            System.out.println("number of lines:" + ln);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SignUpPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SignUpPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPageTitle = new javax.swing.JPanel();
        UserLabel = new javax.swing.JLabel();
        PassLabel = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();
        jLogin = new javax.swing.JButton();
        jSignUp = new javax.swing.JButton();
        tfPass = new javax.swing.JPasswordField();
        LoginPageImage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        LoginPageTitle.setBackground(new java.awt.Color(0, 0, 0));
        LoginPageTitle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        UserLabel.setForeground(new java.awt.Color(152, 255, 152));
        UserLabel.setText("Username");
        LoginPageTitle.add(UserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, 32));

        PassLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        PassLabel.setForeground(new java.awt.Color(152, 255, 152));
        PassLabel.setText("Password");
        LoginPageTitle.add(PassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));

        tfUser.setBackground(new java.awt.Color(153, 255, 255));
        tfUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        LoginPageTitle.add(tfUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 241, 32));

        jLogin.setBackground(new java.awt.Color(102, 102, 102));
        jLogin.setText("Login");
        jLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLogin.setBorderPainted(false);
        jLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginActionPerformed(evt);
            }
        });
        LoginPageTitle.add(jLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 164, 44));

        jSignUp.setBackground(new java.awt.Color(102, 102, 102));
        jSignUp.setText("Sign Up");
        jSignUp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSignUp.setBorderPainted(false);
        jSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSignUpActionPerformed(evt);
            }
        });
        LoginPageTitle.add(jSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, 167, 44));

        tfPass.setBackground(new java.awt.Color(153, 255, 255));
        tfPass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        LoginPageTitle.add(tfPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 241, 32));

        LoginPageImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MarciResized-removebg-preview.jpg"))); // NOI18N
        LoginPageTitle.add(LoginPageImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 539));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppLabel.png"))); // NOI18N
        LoginPageTitle.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPageTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 1005, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LoginPageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserActionPerformed

    }//GEN-LAST:event_tfUserActionPerformed

    private void jLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginActionPerformed
        String user = tfUser.getText();
        String pass = tfPass.getText();
        
        createFolder(); 
        readFile();
        countLines();
        logic(user, pass);
    }//GEN-LAST:event_jLoginActionPerformed

    private void jSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSignUpActionPerformed
        new SignUpPage().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jSignUpActionPerformed

    private void tfPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPassActionPerformed

    }//GEN-LAST:event_tfPassActionPerformed

    private void tfPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jLogin.doClick();
        }
    }//GEN-LAST:event_tfPassKeyPressed

    private void tfUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUserKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jLogin.doClick();
        }
    }//GEN-LAST:event_tfUserKeyPressed


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
            java.util.logging.Logger.getLogger(JFRAMELogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRAMELogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRAMELogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRAMELogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFRAMELogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginPageImage;
    private javax.swing.JPanel LoginPageTitle;
    private javax.swing.JLabel PassLabel;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jLogin;
    private javax.swing.JButton jSignUp;
    private javax.swing.JPasswordField tfPass;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables

    private void setImageIcon() {
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("AncientGoodsLogo.png")));
    }
}
