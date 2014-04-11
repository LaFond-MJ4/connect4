package connect4;
import CIT230LaFond.Connect4.Menus.MainMenuView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kyle
 */
public class GUIMenu extends javax.swing.JFrame {
    private MainMenuView menu = new MainMenuView();

    static void despose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form Menu
     */
    public GUIMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Body = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        onePlayerGame = new javax.swing.JButton();
        twoPlayerGame = new javax.swing.JButton();
        satistics = new javax.swing.JButton();
        help = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainBox = new javax.swing.JTextArea();
        dropNumber = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        errorText = new javax.swing.JTextArea();
        title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connect 4");
        setBackground(new java.awt.Color(153, 208, 255));
        setForeground(new java.awt.Color(0, 204, 255));

        Body.setBackground(new java.awt.Color(204, 255, 255));
        Body.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Body.setForeground(new java.awt.Color(0, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        onePlayerGame.setText("One Player Game");
        onePlayerGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onePlayerGameActionPerformed(evt);
            }
        });

        twoPlayerGame.setText("Two Player Game");
        twoPlayerGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoPlayerGameActionPerformed(evt);
            }
        });

        satistics.setText("Satistics");
        satistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satisticsActionPerformed(evt);
            }
        });

        help.setText("Help");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exit)
                    .addComponent(help)
                    .addComponent(satistics)
                    .addComponent(twoPlayerGame)
                    .addComponent(onePlayerGame))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(onePlayerGame)
                .addGap(26, 26, 26)
                .addComponent(twoPlayerGame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(satistics)
                .addGap(26, 26, 26)
                .addComponent(help)
                .addGap(26, 26, 26)
                .addComponent(exit)
                .addContainerGap())
        );

        mainBox.setEditable(false);
        mainBox.setColumns(20);
        mainBox.setLineWrap(true);
        mainBox.setRows(5);
        mainBox.setText("The name of the game is Connect 4 \nPlayer 1 and Player 2 will take turns putting their pieces within the grid \nOnce someone gets 4 in a row, they are the winner!");
        mainBox.setWrapStyleWord(true);
        mainBox.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jScrollPane1.setViewportView(mainBox);

        submit.setText("submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        errorText.setEditable(false);
        errorText.setColumns(2);
        errorText.setRows(5);
        jScrollPane2.setViewportView(errorText);

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addComponent(dropNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(submit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dropNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submit)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        title.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 36)); // NOI18N
        jLabel1.setText("Connect 4");

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Body, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(964, 596));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void onePlayerGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onePlayerGameActionPerformed
        // TODO add your handling code here:
        EnterPlayerNames playerNameFrame = new EnterPlayerNames();
        //playerNameFrame.EnterPlayerNames();
        playerNameFrame.setVisible(true);
        String player1Name = playerNameFrame.getPlayer1Name();
        String player2Name = playerNameFrame.getPlayer2Name();
        
        Players player1 = new Players();
        //System.out.println("Player 1");
        player1.setPlayerName(player1Name);
        player1.setPlayerToken("X");

        Players player2 = new Players();
        player2.setPlayerName(player2Name);
        player2.setPlayerToken("O");      

        Board gameBoard = new Board();
        gameBoard.newBoard();
        mainBox.setText(gameBoard.displayBoard2(player1.getPlayerToken(), player2.getPlayerToken()));
        
        GetLocation location = new GetLocation();

        /* This will run till the game is over!*/
        while (gameBoard.isGameNotOver()) {
            System.out.println(player1.getPlayerName() + "'s turn");
            while (!gameBoard.dropPiece(userNumber, 1)) {
                System.out.println("Column is full please enter a valid move");
            }
            gameBoard.displayBoard(player1.getPlayerToken(), player2.getPlayerToken());

            gameBoard.checkBoard();
            if (!gameBoard.isGameNotOver()) {
                System.out.println(player1.getPlayerName() + " Wins");
                player1.addWin();
                continue;
            }
            System.out.println(player2.getPlayerName() + "'s turn");
            while (!gameBoard.dropPiece(Game.randInt(1,7), 2));
            gameBoard.displayBoard(player1.getPlayerToken(), player2.getPlayerToken());

            gameBoard.checkBoard();
            if (!gameBoard.isGameNotOver()) {
                System.out.println(player2.getPlayerName() + " Wins");
                player1.addLoss();
            }
        }
    
    }//GEN-LAST:event_onePlayerGameActionPerformed

    private void twoPlayerGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoPlayerGameActionPerformed
        // TODO add your handling code here:
        menu.getInput("2");
    }//GEN-LAST:event_twoPlayerGameActionPerformed

    private void satisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satisticsActionPerformed
        // TODO add your handling code here:
        menu.getInput("S");
    }//GEN-LAST:event_satisticsActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        // TODO add your handling code here:
        menu.getInput("H");        
    }//GEN-LAST:event_helpActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        menu.getInput("X");
    }//GEN-LAST:event_exitActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        userNumber = Integer.parseInt(dropNumber.getText());
    }//GEN-LAST:event_submitActionPerformed

    public int getUserNumber() {
        return userNumber;
    }

    private int userNumber;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JTextField dropNumber;
    private javax.swing.JTextArea errorText;
    private javax.swing.JButton exit;
    private javax.swing.JButton help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea mainBox;
    private javax.swing.JButton onePlayerGame;
    private javax.swing.JButton satistics;
    private javax.swing.JButton submit;
    private javax.swing.JPanel title;
    private javax.swing.JButton twoPlayerGame;
    // End of variables declaration//GEN-END:variables
}
