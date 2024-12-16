import java.awt.*;
import java.awt.event.*;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.*;

public class MarketArea extends javax.swing.JFrame {
    private String pswd, mail;

    public MarketArea(String usr, String pswd, String mail) {
        initComponents();
        this.Username.setText("WELCOME "+usr+"!");
        this.pswd = pswd;
        this.mail = mail;
        try {
            File marioFont = new File("src\\MarioFont.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, marioFont).deriveFont(15f);
            Username.setFont(font);
            AboutUsButton.setFont(font);
        }catch(Exception e){
            e.printStackTrace();
        }       
        setIconImage();
        
        addHoverEffects();
    }
    
    private void openItemFrame(String imagePath, String iname, String definition, String price) {
        ItemFrame itemFrame = new ItemFrame(imagePath, iname, definition, price);
        itemFrame.dispose();
        itemFrame.setVisible(true);
        itemFrame.setLocationRelativeTo(null);
    }
    
    private void addHoverEffects() {
        for (Component component : jPanel1.getComponents()) {
            if (component instanceof JLabel) {
                JLabel itemLabel = (JLabel) component;

                itemLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        itemLabel.setOpaque(true);
                        itemLabel.setBackground(new java.awt.Color(200, 200, 200));
                        itemLabel.setForeground(new java.awt.Color(0, 0, 0));
                        itemLabel.setFont(new Font("Verdana", Font.BOLD, 10));
                        itemLabel.repaint();
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        itemLabel.setOpaque(false);
                        itemLabel.setBackground(null);
                        itemLabel.setForeground(new java.awt.Color(152, 255, 152));
                        itemLabel.setFont(new Font("Verdana", Font.PLAIN, 10));
                        itemLabel.repaint();
                    }
                    
                });
            }
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        AboutUsButton1 = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        TopLogo = new javax.swing.JLabel();
        AboutUsButton = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Item02 = new javax.swing.JLabel();
        Item01 = new javax.swing.JLabel();
        Item03 = new javax.swing.JLabel();
        Item04 = new javax.swing.JLabel();
        Item05 = new javax.swing.JLabel();
        Item06 = new javax.swing.JLabel();
        Item07 = new javax.swing.JLabel();
        Item08 = new javax.swing.JLabel();
        Item09 = new javax.swing.JLabel();
        Item10 = new javax.swing.JLabel();
        Item11 = new javax.swing.JLabel();
        Item12 = new javax.swing.JLabel();
        Item13 = new javax.swing.JLabel();
        Item14 = new javax.swing.JLabel();
        Item15 = new javax.swing.JLabel();
        Item16 = new javax.swing.JLabel();
        Item17 = new javax.swing.JLabel();
        Item18 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AncientGoods");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1007, 545));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AboutUsButton1.setBackground(new java.awt.Color(51, 51, 51));
        AboutUsButton1.setForeground(new java.awt.Color(152, 255, 152));
        AboutUsButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AboutUsButton1.setText("TransactionHistory");
        AboutUsButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AboutUsButton1.setOpaque(true);
        AboutUsButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutUsButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AboutUsButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutUsButton1MouseExited(evt);
            }
        });
        jPanel2.add(AboutUsButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 250, 60));

        Username.setBackground(new java.awt.Color(51, 51, 51));
        Username.setForeground(new java.awt.Color(152, 255, 152));
        Username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Username.setText("Username");
        Username.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Username.setOpaque(true);
        Username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsernameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UsernameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UsernameMouseExited(evt);
            }
        });
        jPanel2.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 60));

        TopLogo.setBackground(new java.awt.Color(51, 51, 51));
        TopLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AncientGoodsLogo02.png"))); // NOI18N
        TopLogo.setOpaque(true);
        jPanel2.add(TopLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, -1));

        AboutUsButton.setBackground(new java.awt.Color(51, 51, 51));
        AboutUsButton.setForeground(new java.awt.Color(152, 255, 152));
        AboutUsButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AboutUsButton.setText("About Us");
        AboutUsButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AboutUsButton.setOpaque(true);
        AboutUsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutUsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AboutUsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutUsButtonMouseExited(evt);
            }
        });
        jPanel2.add(AboutUsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 220, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 60));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(152, 255, 152));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Item02.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Item02.setForeground(new java.awt.Color(152, 255, 152));
        Item02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item02.png"))); // NOI18N
        Item02.setText("Genuine Molten Claw: P500");
        Item02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Item02MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Item02MouseEntered(evt);
            }
        });
        jPanel1.add(Item02, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 280, -1));

        Item01.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Item01.setForeground(new java.awt.Color(152, 255, 152));
        Item01.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Item01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item01.png"))); // NOI18N
        Item01.setText("Blood Chaser: P500");
        Item01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Item01MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Item01MouseEntered(evt);
            }
        });
        jPanel1.add(Item01, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, -1));

        Item03.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Item03.setForeground(new java.awt.Color(152, 255, 152));
        Item03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item03.png"))); // NOI18N
        Item03.setText("Mantle Of The Cinder Baron: P50");
        Item03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Item03MouseClicked(evt);
            }
        });
        jPanel1.add(Item03, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 280, -1));

        Item04.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Item04.setForeground(new java.awt.Color(152, 255, 152));
        Item04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item04.png"))); // NOI18N
        Item04.setText("Genuine Wyvernguard Edge: P1,050");
        Item04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Item04MouseClicked(evt);
            }
        });
        jPanel1.add(Item04, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 280, -1));

        Item05.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Item05.setForeground(new java.awt.Color(152, 255, 152));
        Item05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item05.png"))); // NOI18N
        Item05.setText("Genuine Mountain Splitter: P80");
        Item05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Item05MouseClicked(evt);
            }
        });
        jPanel1.add(Item05, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 280, -1));

        Item06.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Item06.setForeground(new java.awt.Color(152, 255, 152));
        Item06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item06.png"))); // NOI18N
        Item06.setText("Corruptor: P100");
        Item06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Item06MouseClicked(evt);
            }
        });
        jPanel1.add(Item06, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 280, -1));

        Item07.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Item07.setForeground(new java.awt.Color(152, 255, 152));
        Item07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item07.png"))); // NOI18N
        Item07.setText("Vindicator: P80");
        Item07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Item07MouseClicked(evt);
            }
        });
        jPanel1.add(Item07, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 330, -1));

        Item08.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Item08.setForeground(new java.awt.Color(152, 255, 152));
        Item08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item08.png"))); // NOI18N
        Item08.setText("Half Measure: P200");
        Item08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Item08MouseClicked(evt);
            }
        });
        jPanel1.add(Item08, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 330, -1));

        Item09.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Item09.setForeground(new java.awt.Color(152, 255, 152));
        Item09.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item09.png"))); // NOI18N
        Item09.setText("Inscribed Totem of Deep Magma: P150");
        Item09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Item09MouseClicked(evt);
            }
        });
        jPanel1.add(Item09, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 330, -1));

        Item10.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Item10.setForeground(new java.awt.Color(152, 255, 152));
        Item10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item10.png"))); // NOI18N
        Item10.setText("Inscribed Totem of the Crimson Beast: P104");
        Item10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Item10MouseClicked(evt);
            }
        });
        jPanel1.add(Item10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 330, 60));

        Item11.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Item11.setForeground(new java.awt.Color(152, 255, 152));
        Item11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item11.png"))); // NOI18N
        Item11.setText("Genuine Golden Gravelmaw: P17,604");
        Item11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Item11MouseClicked(evt);
            }
        });
        jPanel1.add(Item11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 330, -1));

        Item12.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Item12.setForeground(new java.awt.Color(152, 255, 152));
        Item12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item12.png"))); // NOI18N
        Item12.setText("Inscribed Helm Of Impasse: P75");
        Item12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Item12MouseClicked(evt);
            }
        });
        jPanel1.add(Item12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 330, -1));

        Item13.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Item13.setForeground(new java.awt.Color(152, 255, 152));
        Item13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item13.png"))); // NOI18N
        Item13.setText("Inscribed Belt Of The Behemoth: P100");
        Item13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Item13MouseClicked(evt);
            }
        });
        jPanel1.add(Item13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 320, -1));

        Item14.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Item14.setForeground(new java.awt.Color(152, 255, 152));
        Item14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item14.png"))); // NOI18N
        Item14.setText("Gravelmaw: P317");
        Item14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Item14MouseClicked(evt);
            }
        });
        jPanel1.add(Item14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 320, -1));

        Item15.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Item15.setForeground(new java.awt.Color(152, 255, 152));
        Item15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item15.png"))); // NOI18N
        Item15.setText("Genuine Gravelmaw: P359");
        Item15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Item15MouseClicked(evt);
            }
        });
        jPanel1.add(Item15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 320, -1));

        Item16.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Item16.setForeground(new java.awt.Color(152, 255, 152));
        Item16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item16.png"))); // NOI18N
        Item16.setText("Auspicious Stoneshard Crown: P105");
        Item16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Item16MouseClicked(evt);
            }
        });
        jPanel1.add(Item16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 320, -1));

        Item17.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Item17.setForeground(new java.awt.Color(152, 255, 152));
        Item17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item17.png"))); // NOI18N
        Item17.setText("Auspicious Arms of Deep Magma: P160");
        Item17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Item17MouseClicked(evt);
            }
        });
        jPanel1.add(Item17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 320, -1));

        Item18.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Item18.setForeground(new java.awt.Color(152, 255, 152));
        Item18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item18.png"))); // NOI18N
        Item18.setText("Exalted Feast of Abscession Bundle: P1,770");
        Item18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Item18MouseClicked(evt);
            }
        });
        jPanel1.add(Item18, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 320, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 970, 430));

        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1010, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Item01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Item01MouseClicked
        openItemFrame("/BloodChaser.png", "Blood Chaser",
                        "A three section chained haft with double bladed axe head at the top. Nearly as dangerous to its wielder as it is to the enemy. Used by: Axe", 
                        "500");
    }//GEN-LAST:event_Item01MouseClicked

    private void Item02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Item02MouseClicked
        openItemFrame("/GenuineMoltenClaw.png", "Genuine Molten Claw",
                "In a rush to lay his enemies down, Axe burst into a forge to scrounge for suitable armor. What he found was still fresh from the fire, which suited Axe just fine. Includes ambient particle. Used by: Axe",
                "500");
    }//GEN-LAST:event_Item02MouseClicked

    private void Item01MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Item01MouseEntered
       
    }//GEN-LAST:event_Item01MouseEntered

    private void Item02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Item02MouseEntered
       
    }//GEN-LAST:event_Item02MouseEntered

    private void UsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsernameMouseClicked
        String usr = Username.getText().replace("WELCOME ", "").replace("!", "");
        UserSpace userFrame = new UserSpace(usr, pswd, mail);
        userFrame.setVisible(true);
        userFrame.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_UsernameMouseClicked

    private void Item03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Item03MouseClicked
        openItemFrame("/Mantle.png", "Mantle of the Cinder Baron", 
                "The Sorcerer King of Valhessi is but one title among many that the doppelganger Niyish has worn. Impersonating the Cinder Baron, the imposter led his forces on a disastrous military campaign, finally gaining an audience with the powerful Valhessian King during their surrender. Now, as the Inferno Keep melts into its volcanic foundations, this mantle is all that remains of the Cinder Baron's reign. Used by: Axe",
                "50");
    }//GEN-LAST:event_Item03MouseClicked

    private void Item04MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Item04MouseClicked
        openItemFrame("/GenuineWyvern.png", "Genuine Wyvernguard Edge",
                "No mere woodcutter's hatchet, the Wyvernguard Edge is a great-axe with the bite of a dragon. Forged from the knights' steel found fused and glowing in the molten guts of a dozen slaughtered Pyrexae, the blade of Wyvernguard penetrates to the bleeding heart of any battle. Used by: Axe" ,
                "1,050");
    }//GEN-LAST:event_Item04MouseClicked

    private void Item05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Item05MouseClicked
        openItemFrame("/GenuineMountain.png", "Genuine Mountain Splitter",
                "Usually used only by the Sagesmiths of Vuur, the stone antlers of the Murex elk are one of few tools capable of grasping the burning heartflint of the Vuurcrag mountains. Used by: Axe" ,
                "80");
    }//GEN-LAST:event_Item05MouseClicked

    private void Item06MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Item06MouseClicked
        openItemFrame("/Corruptor.png", "Corruptor",
                "Infused with pustulent power, Corruptor must feed on flesh or else Axe will suffer a troubling rash no apothecary's salves can soothe. Used by: Axe" ,
                "100");
    }//GEN-LAST:event_Item06MouseClicked

    private void Item07MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Item07MouseClicked
        openItemFrame("/Vindicator.png", "Vindicator",
                "To wrong Axe is dangerous. To suffer his vindication is deadly. Used by: Axe" ,
                "80");
    }//GEN-LAST:event_Item07MouseClicked

    private void Item08MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Item08MouseClicked
        openItemFrame("/HalfMeasure.png", "Half Measure",
                "The other blade was just for show. Used by: Axe" ,
                "200");
    }//GEN-LAST:event_Item08MouseClicked

    private void Item09MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Item09MouseClicked
        openItemFrame("/InscribedTotem.png", "Inscribed Totem of Deep Magma",
                "These Player Items are created in partnership with Evil Geniuses, who receives a portion of every purchase. Used by: Earthshaker" ,
                "150");
    }//GEN-LAST:event_Item09MouseClicked

    private void Item10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Item10MouseClicked
        openItemFrame("/InscribedTotemofCrimson.png", "Inscribed Totem of the Crimson Beast",
                "The rarity of Totem of the Crimson Beast is Uncommon, and been equipped it takes a “weapon” slot. The skin doesn’t have alternative styles. At this moment the item is available for trade. Used by: Earthshaker" ,
                "104");
    }//GEN-LAST:event_Item10MouseClicked

    private void Item11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Item11MouseClicked
        openItemFrame("/GenuineGoldenGravel.png", "Genuine Golden Gravelmaw",
                "That which the strength of earth may create, the strength of earth may destroy, chewed into dust by shifting rock. Where once, in a time before knowledge of time, great stone giants built their cities, now lies an endless sea of pebbles. At its center yawns a great fissure, filled with the gravel remains of the countless many. Only a single segment of a single pillar remains to mark a grave for this ancient civilization. Used by: Earthshaker" ,
                "17,604");
    }//GEN-LAST:event_Item11MouseClicked

    private void Item12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Item12MouseClicked
        openItemFrame("/HelmofImpasse.png", "Inscribed Helm of Impasse",
                "A helm featuring horns touched by enchantment. Used by: Earthshaker" ,
                "75");
    }//GEN-LAST:event_Item12MouseClicked

    private void Item13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Item13MouseClicked
        openItemFrame("/BeltofBehemoth.png", "Inscribed Belt Of The Behemoth",
                "Tine of the Behemoth. Used by Earthshaker" ,
                "100");
    }//GEN-LAST:event_Item13MouseClicked

    private void Item14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Item14MouseClicked
        openItemFrame("/Gravel.png", "Gravelmaw",
                "That which the strength of earth may create, the strength of earth may destroy, chewed into dust by shifting rock. Where once, in a time before knowledge of time, great stone giants built their cities, now lies an endless sea of pebbles. At its center yawns a great fissure, filled with the gravel remains of the countless many. Only a single segment of a single pillar remains to mark a grave for this ancient civilization. Used by Earthshaker" ,
                "317");
    }//GEN-LAST:event_Item14MouseClicked

    private void Item15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Item15MouseClicked
        openItemFrame("/Gravel.png", "Genuine Gravelmaw",
                "That which the strength of earth may create, the strength of earth may destroy, chewed into dust by shifting rock. Where once, in a time before knowledge of time, great stone giants built their cities, now lies an endless sea of pebbles. At its center yawns a great fissure, filled with the gravel remains of the countless many. Only a single segment of a single pillar remains to mark a grave for this ancient civilization. Used by Earthshaker" ,
                "359");
    }//GEN-LAST:event_Item15MouseClicked

    private void Item16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Item16MouseClicked
        openItemFrame("/Stoneshard.png", "Auspicious Stoneshard Crown",
                "" ,
                "105");
    }//GEN-LAST:event_Item16MouseClicked

    private void Item17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Item17MouseClicked
        openItemFrame("/arms.png", "Auspicious Arms of Deep Magma",
                "As the molten earth cooled, its will was manifested in the Stoneshard Crown; but there was no coronation until Earthshaker's arrival. Used by: Earthshaker" ,
                "160");
    }//GEN-LAST:event_Item17MouseClicked

    private void Item18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Item18MouseClicked
        openItemFrame("/exalted.png", "Exalted Feast of Abscession Bundle",
                "Centuries ago, the Rumusque priestess Crella forged unbreakable links of hook and chain to bind the powerful servants of the Dead God. The Dead God's corruption grew too strong even for Crella's revered enchantments. Her chains abandoned their charge, turning to carry out the destruction of Crella's homeland at the Dead God's command. Their vile purpose long since served, the Chains of Abscession have sworn service to a new master, and the delights of butchery. Used by: Pudge" ,
                "1,770");
    }//GEN-LAST:event_Item18MouseClicked

    private void AboutUsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsButtonMouseClicked
        new AboutUs().setVisible(true);
    }//GEN-LAST:event_AboutUsButtonMouseClicked

    private void UsernameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsernameMouseEntered
        Username.setForeground(Color.WHITE);
    }//GEN-LAST:event_UsernameMouseEntered

    private void AboutUsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsButtonMouseEntered
        AboutUsButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_AboutUsButtonMouseEntered

    private void UsernameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsernameMouseExited
        Username.setForeground(Color.decode("#98FF98"));
    }//GEN-LAST:event_UsernameMouseExited

    private void AboutUsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsButtonMouseExited
        AboutUsButton.setForeground(Color.decode("#98FF98"));
    }//GEN-LAST:event_AboutUsButtonMouseExited

    private void AboutUsButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsButton1MouseClicked
        TransactionHistory.getInstance().setVisible(true);
    }//GEN-LAST:event_AboutUsButton1MouseClicked

    private void AboutUsButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutUsButton1MouseEntered

    private void AboutUsButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsButton1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutUsButton1MouseExited
 
    
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
            java.util.logging.Logger.getLogger(MarketArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarketArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarketArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarketArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        String tfUser = "DefaultUsername";
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarketArea(tfUser, "Password", "Email").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutUsButton;
    private javax.swing.JLabel AboutUsButton1;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Item01;
    private javax.swing.JLabel Item02;
    private javax.swing.JLabel Item03;
    private javax.swing.JLabel Item04;
    private javax.swing.JLabel Item05;
    private javax.swing.JLabel Item06;
    private javax.swing.JLabel Item07;
    private javax.swing.JLabel Item08;
    private javax.swing.JLabel Item09;
    private javax.swing.JLabel Item10;
    private javax.swing.JLabel Item11;
    private javax.swing.JLabel Item12;
    private javax.swing.JLabel Item13;
    private javax.swing.JLabel Item14;
    private javax.swing.JLabel Item15;
    private javax.swing.JLabel Item16;
    private javax.swing.JLabel Item17;
    private javax.swing.JLabel Item18;
    private javax.swing.JLabel TopLogo;
    private javax.swing.JLabel Username;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("AncientGoodsLogo.png")));
    }
}
