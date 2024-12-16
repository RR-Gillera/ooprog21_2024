import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class UserSpace extends javax.swing.JFrame {

    private String pswd;
    public UserSpace(String usr, String pwd, String mail) {
        initComponents();
        this.user.setText(usr);
        this.pswd = pwd;
        this.pass.setText(maskPassword(pwd));
        this.email.setText(mail);
        try {
            File marioFont = new File("src\\MarioFont.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, marioFont).deriveFont(15f);
            UsernameText.setFont(font);
            LogoutButton.setFont(font);
            PasswordText.setFont(font);
            EmailText.setFont(font);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        setIconImage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        arrow1 = new javax.swing.JLabel();
        arrow2 = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        UsernameText = new javax.swing.JLabel();
        PasswordText = new javax.swing.JLabel();
        EmailText = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ChangePassword = new javax.swing.JLabel();
        ChangeEmail = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        pass.setBackground(new java.awt.Color(78, 80, 82));
        pass.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        pass.setForeground(new java.awt.Color(152, 255, 152));
        pass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 102, 0), new java.awt.Color(51, 102, 0), new java.awt.Color(51, 102, 0), new java.awt.Color(51, 102, 0)));
        pass.setOpaque(true);
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 220, 30));

        email.setBackground(new java.awt.Color(78, 80, 82));
        email.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(152, 255, 152));
        email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 102, 0), new java.awt.Color(51, 102, 0), new java.awt.Color(51, 102, 0), new java.awt.Color(51, 102, 0)));
        email.setOpaque(true);
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 220, 30));

        user.setBackground(new java.awt.Color(78, 80, 82));
        user.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        user.setForeground(new java.awt.Color(152, 255, 152));
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 102, 0), new java.awt.Color(51, 102, 0), new java.awt.Color(51, 102, 0), new java.awt.Color(51, 102, 0)));
        user.setOpaque(true);
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 220, 30));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppLabel.png"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, -1));

        UsernameText.setForeground(new java.awt.Color(152, 255, 152));
        UsernameText.setText("Username");
        jPanel1.add(UsernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        PasswordText.setForeground(new java.awt.Color(152, 255, 152));
        PasswordText.setText("Password");
        jPanel1.add(PasswordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, -1));

        EmailText.setForeground(new java.awt.Color(152, 255, 152));
        EmailText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmailText.setText("Email");
        jPanel1.add(EmailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, 20));

        LogoutButton.setBackground(new java.awt.Color(51, 51, 51));
        LogoutButton.setForeground(new java.awt.Color(255, 0, 0));
        LogoutButton.setText("Log Out");
        LogoutButton.setBorderPainted(false);
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 120, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chibi.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 150, 110));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, -1, -1));

        ChangePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reset Button02.png"))); // NOI18N
        ChangePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangePasswordMouseClicked(evt);
            }
        });
        jPanel1.add(ChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, -1, -1));

        ChangeEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reset Button02.png"))); // NOI18N
        ChangeEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangeEmailMouseClicked(evt);
            }
        });
        jPanel1.add(ChangeEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, -1, -1));

        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background.jpg"))); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reset (2).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 30, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reset (2).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        new PageStart().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void arrow1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrow1MouseEntered
        arrow2.setVisible(true);
        arrow1.setVisible(false);
    }//GEN-LAST:event_arrow1MouseEntered

    private void arrow2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrow2MouseClicked
        new MarketArea(user.getText(), pass.getText(), email.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_arrow2MouseClicked

    private void arrow2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrow2MouseEntered

    }//GEN-LAST:event_arrow2MouseEntered

    private void arrow2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrow2MouseExited
        arrow2.setVisible(false);
        arrow1.setVisible(true);
    }//GEN-LAST:event_arrow2MouseExited

    private void ChangePasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePasswordMouseClicked
        String currentPassword = JOptionPane.showInputDialog(this, "Enter your current password:");
            if (currentPassword == null || currentPassword.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Current Password should not be empty.");
                return;
            }

            if (!currentPassword.equals(this.pswd)) {
                JOptionPane.showMessageDialog(this, "Incorrect current password!");
                return;
            }

            int option = JOptionPane.showConfirmDialog(this, "Do you want to change your password?", 
                                                       "Change Password", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                String newPassword = JOptionPane.showInputDialog(this, "Enter your new password:");

                if (newPassword == null || newPassword.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "New Password should not be empty.");
                    return;
                }

                if (!newPassword.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$")) {
                    JOptionPane.showMessageDialog(this, "Password must contain at least one uppercase letter, one lowercase letter, and one digit.");
                    return;
                }
                if (newPassword.length() < 8) {
                    JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long.");
                    return;
                }

                String confirmPassword = JOptionPane.showInputDialog(this, "Confirm your new password:");

                if (confirmPassword == null || confirmPassword.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Confirm Password should not be empty.");
                    return;
                }
                if (!newPassword.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(this, "Passwords do not match.");
                    return;
                }

                updateFile("password", newPassword);
                this.pass.setText(maskPassword(newPassword));
            }
    }//GEN-LAST:event_ChangePasswordMouseClicked

    private void ChangeEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeEmailMouseClicked
        String currentPassword = JOptionPane.showInputDialog(this, "Enter your current password:");
            if (currentPassword == null || currentPassword.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Current Password should not be empty.");
                return;
            }

            if (!currentPassword.equals(this.pswd)) {
                JOptionPane.showMessageDialog(this, "Incorrect current password!");
                return;
            }

            int option = JOptionPane.showConfirmDialog(this, "Do you want to change your email?", 
                                                       "Change Email", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                String newEmail = JOptionPane.showInputDialog(this, "Enter your new email:");

                if (newEmail == null || newEmail.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Email Address should not be empty.");
                    return;
                }

                // Email Validation Check
                if (!newEmail.endsWith("@gmail.com")) {
                    JOptionPane.showMessageDialog(this, "Invalid Email Address");
                    return;
                }

                updateFile("email", newEmail);
                this.email.setText(newEmail);
            }
    }//GEN-LAST:event_ChangeEmailMouseClicked
    private void updateFile(String field, String newValue) {
        File loginFile = new File("D:/JavaGUI/logins.txt");

        if (!loginFile.exists()) {
            JOptionPane.showMessageDialog(this, "logins.txt file not found!");
            return;
        }

        try {
            Scanner scanner = new Scanner(loginFile);
            StringBuilder fileContent = new StringBuilder();
            String currentUsername = this.user.getText();

            boolean userFound = false;
            boolean userUpdated = false;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.startsWith("Username:") && line.equals("Username:" + currentUsername)) {
                    userFound = true;
                }

                if (userFound) {
                    if (line.startsWith("Password:") && field.equals("password")) {
                        line = "Password:" + newValue;
                        userUpdated = true;
                    } else if (line.startsWith("Email:") && field.equals("email")) {
                        line = "Email:" + newValue;
                        userUpdated = true;
                    }
                    if (line.startsWith("Username:") && !line.equals("Username:" + currentUsername)) {
                        userFound = false;
                    }
                }

                
                fileContent.append(line).append("\n");
            }
            scanner.close();

            String updatedContent = fileContent.toString().stripTrailing();

            if (userUpdated) {
                FileWriter writer = new FileWriter(loginFile);
                writer.write(updatedContent);
                writer.close();
                JOptionPane.showMessageDialog(this, field.substring(0, 1).toUpperCase() + field.substring(1) + " updated successfully!");
            } else if (!userFound) {
                JOptionPane.showMessageDialog(this, "User not found in the file!");
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "An error occurred while updating the file: " + e.getMessage());
        }
    }
    private String maskPassword(String password) {
        return "*".repeat(password.length());
    }
 
    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserSpace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserSpace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserSpace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserSpace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserSpace("Username", "Password", "Email").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel ChangeEmail;
    private javax.swing.JLabel ChangePassword;
    private javax.swing.JLabel EmailText;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JLabel PasswordText;
    private javax.swing.JLabel UsernameText;
    private javax.swing.JLabel arrow1;
    private javax.swing.JLabel arrow2;
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("AncientGoodsLogo.png")));
    }
}
