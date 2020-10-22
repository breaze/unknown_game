/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import chat.Chat;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import unknown_game_client.Unknown_game_client;

/**
 *
 * @author alejopc
 */
public class ChatGUI extends javax.swing.JFrame {

    /**
     * Creates new form Chat
     */
    private Chat chat;
    public ChatGUI(String name, int playerNumber) {
        initComponents();
        jLPlayerName2.setText(name);
        jLPlayerNumber.setText("Jugador "+playerNumber);
        this.chat = new Chat(name, this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jLPlayerName1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMessages = new javax.swing.JTextPane();
        jLPlayerNumber = new javax.swing.JLabel();
        jLPlayerName2 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLPlayerName1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLPlayerName1.setText("Player Name");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 102));

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 600));
        jPanel1.setLayout(null);

        txtMessages.setEditable(false);
        jScrollPane2.setViewportView(txtMessages);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 160, 380, 340);

        jLPlayerNumber.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLPlayerNumber.setForeground(new java.awt.Color(255, 255, 255));
        jLPlayerNumber.setText("Player Number");
        jPanel1.add(jLPlayerNumber);
        jLPlayerNumber.setBounds(220, 30, 159, 63);

        jLPlayerName2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLPlayerName2.setForeground(new java.awt.Color(255, 255, 255));
        jLPlayerName2.setText("Player Name");
        jPanel1.add(jLPlayerName2);
        jLPlayerName2.setBounds(30, 30, 163, 63);

        txtMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMessageActionPerformed(evt);
            }
        });
        jPanel1.add(txtMessage);
        txtMessage.setBounds(10, 510, 190, 30);

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnviar);
        btnEnviar.setBounds(220, 510, 61, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/chat.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(450, 600));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 410, 600);

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
    }// </editor-fold>//GEN-END:initComponents

    private void txtMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        //Scanner in = new Scanner(System.in);
        /*BufferedReader reader = 
                   new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese su nombre");*/
        String msg = null;
        try {
            msg = txtMessage.getText();   
            this.chat.newMessage(msg);
            txtMessage.setText("");
        } catch (UnknownHostException ex) {
            Logger.getLogger(Unknown_game_client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    
    public void updateChat(String msg){
        String message = txtMessages.getText();
        message+= "\n"+msg;
        txtMessages.setText(message);
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLPlayerName1;
    private javax.swing.JLabel jLPlayerName2;
    private javax.swing.JLabel jLPlayerNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextPane txtMessages;
    // End of variables declaration//GEN-END:variables
}
