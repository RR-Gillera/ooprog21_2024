import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;

public class PageStart extends javax.swing.JFrame {

    public PageStart() {
        initComponents();
        try {
            File marioFont = new File("src\\MarioFont.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, marioFont).deriveFont(15f);
            Font Label = Font.createFont(Font.TRUETYPE_FONT, marioFont).deriveFont(30f);
            WelcomeDialogue.setFont(Label);
            subDialogue.setFont(font);
            StartButton.setFont(font);
        }catch(Exception e){
            e.printStackTrace();
        }
        
        setImageIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        WelcomeDialogue = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        subDialogue = new javax.swing.JLabel();
        StartButton = new javax.swing.JButton();
        FireFX01 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WelcomeDialogue.setForeground(new java.awt.Color(152, 255, 152));
        WelcomeDialogue.setText("WELCOME BUYER! ");
        jPanel1.add(WelcomeDialogue, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 460, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppLabel.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 430, -1));

        subDialogue.setForeground(new java.awt.Color(152, 255, 152));
        subDialogue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subDialogue.setText("Market for the budget ballers!");
        jPanel1.add(subDialogue, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 460, 30));

        StartButton.setBackground(new java.awt.Color(0, 153, 0));
        StartButton.setForeground(new java.awt.Color(152, 255, 152));
        StartButton.setText("Start!");
        StartButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        StartButton.setBorderPainted(false);
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });
        jPanel1.add(StartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 230, 40));

        FireFX01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fire Effect 02.gif"))); // NOI18N
        jPanel1.add(FireFX01, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 130, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fire Effect 02.gif"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 140, 140));

        jButton1.setBackground(new java.awt.Color(51, 255, 153));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 70, 30));

        jButton2.setBackground(new java.awt.Color(51, 255, 153));
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, 70, 30));

        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton3.setBackground(new java.awt.Color(51, 255, 153));
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 70, 20));

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

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        JFRAMELogin LoginFrame = new JFRAMELogin();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_StartButtonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PageStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PageStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PageStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PageStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageStart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FireFX01;
    private javax.swing.JButton StartButton;
    private javax.swing.JLabel WelcomeDialogue;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel subDialogue;
    // End of variables declaration//GEN-END:variables

    private void setImageIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("AncientGoodsLogo.png")));
    }
}
