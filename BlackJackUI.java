/* 
 * BlackJackUI.java 
 * 
 * @ Version: 
 *     $Id: BlackJackUI.java  , Version 1.0 11/18/2013 $ 
 * 
 * Revisions: 
 *     $Log Initial Version $ 
 */


import java.awt.Color;
import java.util.HashSet;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * This program simulates the game blackjack.
 *
 * @author Pradeep Kumar Duvvur
 */
public class BlackJackUI extends javax.swing.JFrame {

    HashSet<Integer> cardListPl1 = new HashSet<Integer>();
    static String cardSuit; // Suit of the card
    static String displayThis; // Information to be displayed
    static int currRoundScore = 0; // score for a card
    static int pl1TotalScore = 0; // Player 1 score
    static int pl1CountA11 = 0; // Number of A cards received
    static int pl2TotalScore = 0; // Player 2 score
    static int pl2CountA11 = 0; // Number of A cards received
    static boolean pl1Busted = false; // Player1 is busted
    static boolean pl2Busted = false; // Player2 is busted
    static boolean pl1Stands = false; // PLayer 1 stands
    static boolean pl2Stands = false; // Player 2 stands

    /**
     * Creates new form BlackJackUI
     */
    public BlackJackUI() {
        initComponents();
        standPlayer1.setEnabled(false);
        hitPlayer2.setEnabled(false);
        standPlayer2.setEnabled(false);
        bustedPlayer1.setVisible(false);
        bustedPlayer2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hitPlayer1 = new javax.swing.JButton();
        standPlayer1 = new javax.swing.JButton();
        hitPlayer2 = new javax.swing.JButton();
        standPlayer2 = new javax.swing.JButton();
        dispCardPlayer1 = new javax.swing.JLabel();
        dispScorePlayer1 = new javax.swing.JLabel();
        dispCardPlayer2 = new javax.swing.JLabel();
        dispScorePlayer2 = new javax.swing.JLabel();
        bustedPlayer1 = new javax.swing.JLabel();
        bustedPlayer2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("   PLAYER 1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("   PLAYER 2");

        hitPlayer1.setBackground(new java.awt.Color(0, 255, 102));
        hitPlayer1.setText("Hit !");
        hitPlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitPlayer1ActionPerformed(evt);
            }
        });

        standPlayer1.setBackground(new java.awt.Color(255, 51, 51));
        standPlayer1.setText("Stand !");
        standPlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standPlayer1ActionPerformed(evt);
            }
        });

        hitPlayer2.setBackground(new java.awt.Color(0, 255, 102));
        hitPlayer2.setText("Hit !");
        hitPlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitPlayer2ActionPerformed(evt);
            }
        });

        standPlayer2.setBackground(new java.awt.Color(255, 51, 51));
        standPlayer2.setText("Stand !");
        standPlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standPlayer2ActionPerformed(evt);
            }
        });

        bustedPlayer1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bustedPlayer1.setForeground(new java.awt.Color(255, 0, 0));
        bustedPlayer1.setText("YOU ARE BUSTED");

        bustedPlayer2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bustedPlayer2.setForeground(new java.awt.Color(255, 0, 0));
        bustedPlayer2.setText("YOU ARE BUSTED");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Your Card :");

        jLabel4.setText("Your Score :");

        jLabel5.setText("Your Card : ");

        jLabel6.setText("Your Score: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dispCardPlayer1))
                                    .addComponent(hitPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dispScorePlayer1))
                                    .addComponent(standPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bustedPlayer1)
                        .addGap(125, 125, 125)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(hitPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dispCardPlayer2)
                                        .addGap(12, 12, 12)))
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(standPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dispScorePlayer2))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(bustedPlayer2)))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel2)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(bustedPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(bustedPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dispCardPlayer1)
                    .addComponent(dispScorePlayer1)
                    .addComponent(dispCardPlayer2)
                    .addComponent(dispScorePlayer2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hitPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(standPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hitPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(standPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>                        

    /**
     * It generates a random card without any repetition.
     *
     * @return card returns a unique card.
     */
    public int generateRandomNum() {
        Random random = new Random();
        int card = 1 + (Math.abs(random.nextInt(52)));
        if (!cardListPl1.contains(card)) { // checks for duplicate
            cardListPl1.add(card);
            return card;
        } else {
            return generateRandomNum();
        }
    }

    /**
     * It returns the value that corresponds to a card.
     *
     * @param card The card which the player received
     *
     * @return currRoundScore Value of the card received.
     */
    public int scoreCalculator(int card) {
        if (card >= 1 && card <= 13) { // SPADE SUIT
            cardSuit = "SPADE";
            if (card == 1) {
                displayThis = "A - SPADE";
                currRoundScore = 11;
            } else if (card >= 2 && card <= 10) {
                displayThis = String.valueOf(card) + " - SPADE";
                currRoundScore = card;
            } else if (card == 11) {
                displayThis = "J - SPADE";
                currRoundScore = 10;
            } else if (card == 12) {
                displayThis = "Q - SPADE";
                currRoundScore = 10;
            } else if (card == 13) {
                displayThis = "K - SPADE";
                currRoundScore = 10;
            }
        } else if (card >= 14 && card <= 26) { // HEART SUIT
            cardSuit = "HEART";
            card = card % 13;
            if (card == 1) {
                displayThis = "A - HEART";
                currRoundScore = 11;
            } else if (card >= 2 && card <= 10) {
                displayThis = String.valueOf(card) + " - HEART";
                currRoundScore = card;
            } else if (card == 11) {
                displayThis = "J - HEART";
                currRoundScore = 10;
            } else if (card == 12) {
                displayThis = "Q - HEART";
                currRoundScore = 10;
            } else if (card == 0) {
                displayThis = "K - HEART";
                currRoundScore = 10;
            }
        } else if (card >= 27 && card <= 39) { // CLUBS SUIT
            cardSuit = "CLUBS";
            card = card % 13;
            if (card == 1) {
                displayThis = "A - CLUBS";
                currRoundScore = 11;
            } else if (card >= 2 && card <= 10) {
                displayThis = String.valueOf(card) + " - CLUBS";
                currRoundScore = card;
            } else if (card == 11) {
                displayThis = "J - CLUBS";
                currRoundScore = 10;
            } else if (card == 12) {
                displayThis = "Q - CLUBS";
                currRoundScore = 10;
            } else if (card == 0) {
                displayThis = "K - CLUBS";
                currRoundScore = 10;
            }
        } else if (card >= 40 && card <= 52) { // DIAMOND SUIT
            cardSuit = "DIAMOND";
            card = card % 13;
            if (card == 1) {
                displayThis = "A - DIAMOND";
                currRoundScore = 11;
            } else if (card >= 2 && card <= 10) {
                displayThis = String.valueOf(card) + " - DIAMOND";
                currRoundScore = card;
            } else if (card == 11) {
                displayThis = "J - DIAMOND";
                currRoundScore = 10;
            } else if (card == 12) {
                displayThis = "Q - DIAMOND";
                currRoundScore = 10;
            } else if (card == 0) {
                displayThis = "K - DIAMOND";
                currRoundScore = 10;
            }
        }
        return currRoundScore;
    }

    /**
     * Action event for the HIT button.
     *
     * @param evt Click event
     *
     */

    private void hitPlayer1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        int card = generateRandomNum();
        int currScore = scoreCalculator(card);
        if (currScore == 11) { // SPecial case for A card , either 1 or 11
            if (pl1TotalScore + currScore > 21) {
                pl1TotalScore += 1;
            } else {
                pl1TotalScore += 11;
                pl1CountA11++; // number of A cards received.
            }
        } else {
            pl1TotalScore += currScore;
        }
        if (pl1TotalScore > 21 && pl1CountA11 == 1) { // Eg case like A , 6 , 8
            pl1CountA11--;
            pl1TotalScore -= 10;
        }
        if (pl1TotalScore > 21) {
            bustedPlayer1.setVisible(true); // Displays player is busted.
            pl1Busted = true;
        }

        // Sets red colour font if suit is Diamond or Heart
        if (cardSuit.equals("DIAMOND") || cardSuit.equals("HEART")) {
            dispCardPlayer1.setForeground(Color.RED);
        } else {
            dispCardPlayer1.setForeground(Color.BLACK);
        }

        dispCardPlayer1.setText(displayThis);
        dispScorePlayer1.setText(String.valueOf(pl1TotalScore));

        // Displays Player 2 won if player 1 is busted.
        if (pl1Busted) {
            JOptionPane.showMessageDialog(this, "Player 2 Wins !");
            System.exit(0);
        }

        // Turns alternate between players only if other player
        // doesn't hit stand.
        if (!pl2Stands) {
            hitPlayer1.setEnabled(false);
            standPlayer1.setEnabled(false);
            hitPlayer2.setEnabled(true);
            standPlayer2.setEnabled(true);
        }
    }                                          

    /**
     * Action event for the HIT button.
     *
     * @param evt Click event
     *
     */

    private void hitPlayer2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        int card = generateRandomNum(); // Generates a random card
        int currScore = scoreCalculator(card); // Calculates value of the card
        if (currScore == 11) { // Special case for A card
            if (pl2TotalScore + currScore > 21) {
                pl2TotalScore += 1;
            } else {
                pl2TotalScore += 11;
                pl2CountA11++; // Number of A cards received
            }
        } else {
            pl2TotalScore += currScore; // Add value of card to total score
        }
        if (pl2TotalScore > 21 && pl2CountA11 == 1) {
            pl2CountA11--;
            pl2TotalScore -= 10;
        }
        if (pl2TotalScore > 21) {
            bustedPlayer2.setVisible(true); // Displays that player is busted
            pl2Busted = true;

        }
        
        // Displays card in red color if suit is DIAMOND or HEART
        
        if (cardSuit.equals("DIAMOND") || cardSuit.equals("HEART")) {
            dispCardPlayer2.setForeground(Color.RED);
        } else {
            dispCardPlayer2.setForeground(Color.BLACK);
        }

        dispCardPlayer2.setText(displayThis);
        dispScorePlayer2.setText(String.valueOf(pl2TotalScore));
        
        // PLayer 1 wins if player 2 is busted.
        
        if (pl2Busted) {
            JOptionPane.showMessageDialog(this, "Player 1 Wins !");
            System.exit(0);
        }
        
        // Turn alternates between 2 players only if player 1
        // doesn't hit stand.
        
        if (!pl1Stands) {
            hitPlayer2.setEnabled(false);
            standPlayer2.setEnabled(false);
            hitPlayer1.setEnabled(true);
            standPlayer1.setEnabled(true);
        }
    }                                          

    /**
     * Action event for the STAND button.
     *
     * @param evt                 Click event
     *
     */
    private void standPlayer1ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        pl1Stands = true;
        
        // If player 2 already pressed STAND, it compares scores 
        // between the 2 players.
        
        if (pl2Stands) {
            if (pl1TotalScore > pl2TotalScore) {
                JOptionPane.showMessageDialog(this, "Player 1 Wins !");
                System.exit(0);
            } else if (pl1TotalScore < pl2TotalScore) {
                JOptionPane.showMessageDialog(this, "Player 2 Wins !");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(this, "Match ends in a Tie!");
                System.exit(0);
            }
        }

        hitPlayer1.setEnabled(false);
        standPlayer1.setEnabled(false);
        if (!pl2Busted) {
            hitPlayer2.setEnabled(true);
            standPlayer2.setEnabled(true);
        }
    }                                            

    /**
     * Action event for the STAND button.
     *
     * @param evt             Click event
     *
     */

    private void standPlayer2ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        pl2Stands = true;
        
        // If player 2 already pressed STAND, it compares scores 
        // between the 2 players.

        if (pl1Stands) {
            if (pl1TotalScore > pl2TotalScore) {
                JOptionPane.showMessageDialog(this, "Player 1 Wins !");
                System.exit(0);
            } else if (pl1TotalScore < pl2TotalScore) {
                JOptionPane.showMessageDialog(this, "Player 2 Wins !");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(this, "Match ends in a Tie!");
                System.exit(0);
            }
        }
        hitPlayer2.setEnabled(false);
        standPlayer2.setEnabled(false);
        if (!pl1Busted) {
            hitPlayer1.setEnabled(true);
            standPlayer1.setEnabled(true);
        }
    }                                            

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
            java.util.logging.Logger.getLogger(BlackJackUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlackJackUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlackJackUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlackJackUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlackJackUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JLabel bustedPlayer1;
    private javax.swing.JLabel bustedPlayer2;
    private javax.swing.JLabel dispCardPlayer1;
    private javax.swing.JLabel dispCardPlayer2;
    private javax.swing.JLabel dispScorePlayer1;
    private javax.swing.JLabel dispScorePlayer2;
    private javax.swing.JButton hitPlayer1;
    private javax.swing.JButton hitPlayer2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton standPlayer1;
    private javax.swing.JButton standPlayer2;
    // End of variables declaration                   
}

