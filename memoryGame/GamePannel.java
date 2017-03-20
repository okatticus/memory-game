package memoryGame;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author srb
 */
public class GamePannel extends javax.swing.JPanel {

    int win=0,levelwin,level,maxlevel=2;
    
    Border darkborder = new LineBorder(Color.DARK_GRAY, 1);
    Border lightborder = new LineBorder(Color.lightGray, 1);
    Border nullborder = new LineBorder(Color.darkGray, 0);
    JLabel imageLabel=new JLabel();
    JPanel stage = new JPanel();
    
    CardLayout card=new CardLayout();//layout for controlPannel
  
    //game variables
    int maxpics=8,a,b,c,d,e,i;
    
    public GamePannel() {
        initComponents();
        myinit();
    }//constructor
    
    public void updateBox(){
        
    }
    
    public final void myinit(){
        setSize(820, 620);//our standard game pannel size
        setOpaque(false);//to make buttons transparent
        
        controlPannel.setBounds(60,150,500,288);//ratio 585:495 :: 13:11
        controlPannel.setLayout(null);
        controlPannel.setFocusable(true);
        controlPannel.setOpaque(false);//to make buttons transparent
        controlPannel.setFocusTraversalKeysEnabled(false);
        imageLabel.setBounds(0,0,588,288);
        //imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/a.png")));
        //controlPannel.add(imageLabel);
        
        initBoard();
   
    }//my init
    
    public boolean wincheck(){
        levelwin=1;
        if(levelwin==1){
            if(level<maxlevel){
                JOptionPane.showMessageDialog(controlPannel,"Move to next level","Level Complete",JOptionPane.INFORMATION_MESSAGE);
                    level=2;
                    maxpics=12;
                    initBoard();
            }
            else if(level==maxlevel){
                win=1;
                JOptionPane.showMessageDialog(controlPannel,"Yippee you won the game","Game Complete",JOptionPane.INFORMATION_MESSAGE);
            }   
        }
        return true;
    }// return true if level completes
    
    public void initBoard(){
        ImageTry it=new ImageTry();
        it.run();
    }
    
    public void changeImage(){
        //Counter
        int rnd;
    //    for(int i=0;i<maxpics;i++)
    //    {
            if(i%2==0)
            {
               rnd=(int)(Math.random()*3)+1;
               switch(rnd)
               {
                   case 1:
                       imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/a.png")));
                       controlPannel.add(imageLabel);
                       break;
                   case 2:
                       imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b.png")));
                       controlPannel.add(imageLabel);
                       break;
                   case 3:
                       imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/c.png")));
                       controlPannel.add(imageLabel);
                       break;     
               }
            }//end if
            else
            {          
                rnd=(int)(Math.random()*2)+1;
                switch(rnd)
                {
                   case 1:
                       imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/d.png")));
                       controlPannel.add(imageLabel);
                       break;
                   case 2:
                        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/e.png")));
                        controlPannel.add(imageLabel);
                        break;
                   default:
                        break;
                }
            }//end else
            controlPannel.repaint();
          
            i++;
    //    }//end for
    }//end method changeImage
    
    class ImageTry implements Runnable
    {
        
        @Override
        public void run() 
        {
          a=0;b=0;c=0;d=0;e=0;i=0;
          changeImage();
          Timer
        }//end run
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        heading = new javax.swing.JLabel();
        controlPannel = new javax.swing.JPanel();
        newButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        levelLabel = new javax.swing.JLabel();
        footerLabel = new javax.swing.JLabel();
        background_Image = new javax.swing.JLabel();

        setLayout(null);

        heading.setFont(new java.awt.Font("DejaVu Serif", 1, 48)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 25, 255));
        heading.setText("Memory Game");
        add(heading);
        heading.setBounds(220, 0, 360, 90);

        javax.swing.GroupLayout controlPannelLayout = new javax.swing.GroupLayout(controlPannel);
        controlPannel.setLayout(controlPannelLayout);
        controlPannelLayout.setHorizontalGroup(
            controlPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        controlPannelLayout.setVerticalGroup(
            controlPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(controlPannel);
        controlPannel.setBounds(60, 150, 500, 288);
        controlPannel.getAccessibleContext().setAccessibleName("");

        newButton.setText("reset");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });
        add(newButton);
        newButton.setBounds(670, 290, 110, 23);

        submitButton.setText("submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        add(submitButton);
        submitButton.setBounds(670, 360, 110, 23);

        helpButton.setText("help");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });
        add(helpButton);
        helpButton.setBounds(670, 440, 110, 23);

        levelLabel.setFont(new java.awt.Font("TakaoPGothic", 1, 24)); // NOI18N
        levelLabel.setForeground(new java.awt.Color(252, 236, 236));
        levelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        levelLabel.setText("Level : 1/2");
        add(levelLabel);
        levelLabel.setBounds(630, 140, 180, 50);

        footerLabel.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        footerLabel.setForeground(new java.awt.Color(255, 244, 244));
        footerLabel.setText("made with love by Team .EXE");
        add(footerLabel);
        footerLabel.setBounds(40, 590, 250, 20);

        background_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gamePannelBackground.jpg"))); // NOI18N
        add(background_Image);
        background_Image.setBounds(0, 0, 820, 620);
    }// </editor-fold>//GEN-END:initComponents

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        initBoard();
        controlPannel.grabFocus();//get focus back to control pannel
    }//GEN-LAST:event_newButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
            updateBox();
            controlPannel.grabFocus();//get focus back to control pannel
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        JOptionPane.showMessageDialog(controlPannel,"* use W A S D keys to move player\n"
                                            +"* Red dots are your target point\n"
                                            +"* Yellow boxes are to be placed on target points (Red Dot)\n"
                                            +"* you can undo only the last move\n"
                                            +"* There are total 3 levels\n"
                                            +"* Each level carries 10 points\n"
                                            ,"Instructions"
                                            ,JOptionPane.INFORMATION_MESSAGE                                    
        );
        controlPannel.grabFocus();//get focus back to control pannel
    }//GEN-LAST:event_helpButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_Image;
    private javax.swing.JPanel controlPannel;
    private javax.swing.JLabel footerLabel;
    private javax.swing.JLabel heading;
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JButton newButton;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
