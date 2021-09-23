import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.*;
import java.awt.event.ActionListener;

public class TTT extends JFrame {
    private static final long serialVersionUID = 1L;
	//private static ArrayList<JButton> list = new ArrayList<JButton>();
    //private JMenuBar menubar;
    //private JMenu file;
    //private JMenuItem restart;
    private JButton zero0;
    private JButton zero1;
    private JButton zero2;
    private JButton one0;
    private JButton one1;
    private JButton one2;
    private JButton two0;
    private JButton two1;
    private JButton two2;
    private int x = 0;
    private int scoreX = 0;
    private int score0 = 0;
    ImageIcon blank = new ImageIcon("default.png");
    ImageIcon markX = new ImageIcon("marked_X.png");
    ImageIcon markO = new ImageIcon("marked_O.png");
    ImageIcon markO_D = new ImageIcon("marked_O_Down.png");
    private static boolean enable = true;

    public TTT(){        
        setLayout(new GridLayout(3,3));

        /*menubar = new JMenuBar();
        setJMenuBar(menubar);

        file = new JMenu("File");
        menubar.add(file);
        

        restart = new JMenuItem("Replay");
        file.add(restart);
        restart.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();    
            }
        });*/

        zero0 = new JButton(blank);
        add(zero0);
        zero0.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                if(enable){
                    if(x == 0){
                        zero0.setIcon(markX);
                        x = 1;
                        zero0.setEnabled(false);
                        if(zero1.getIcon() == zero0.getIcon() && zero2.getIcon() == markX
                        || one1.getIcon() == markX && two2.getIcon() == markX
                        || one0.getIcon() == markX && two0.getIcon() == markX){
                            scoreX++;
                            infoBox("Result = X wins, Score = X:" + scoreX + " O:" + score0);
                        }
                        else if(zero0.getIcon() != blank
                                && zero1.getIcon() != blank
                                && zero2.getIcon() != blank
                                && one0.getIcon() != blank
                                && one1.getIcon() != blank
                                && one2.getIcon() != blank
                                && two0.getIcon() != blank
                                && two1.getIcon() != blank
                                && two2.getIcon() != blank){
                            stalemate();
                        }
                    }
                    else{
                        zero0.setIcon(markO);
                        x = 0;
                        zero0.setEnabled(false);
                        if(zero1.getIcon() == markO && zero2.getIcon() == markO
                            || one1.getIcon() == markO && two2.getIcon() == markO
                            || one0.getIcon() == markO && two0.getIcon() == markO){
                            score0++;
                            infoBox("Result = O wins, Score = X:" + scoreX + " O:" + score0);
                        }
                        else if(zero0.getIcon() != blank
                                && zero1.getIcon() != blank
                                && zero2.getIcon() != blank
                                && one0.getIcon() != blank
                                && one1.getIcon() != blank
                                && one2.getIcon() != blank
                                && two0.getIcon() != blank
                                && two1.getIcon() != blank
                                && two2.getIcon() != blank){
                            stalemate();
                        }
                    } 
                }
            }
        });
        zero1 = new JButton(blank);
        add(zero1);
        zero1.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                if(enable){
                    if(x == 0){
                        zero1.setIcon(markX);
                        x = 1;
                        zero1.setEnabled(false);
                        if(zero0.getIcon() == markX && zero2.getIcon() == markX
                        || one1.getIcon() == markX && two1.getIcon() == markX){
                            scoreX++;
                            infoBox("Result = X wins, Score = X:" + scoreX + " O:" + score0);
                        }
                        else if(zero0.getIcon() != blank
                                && zero1.getIcon() != blank
                                && zero2.getIcon() != blank
                                && one0.getIcon() != blank
                                && one1.getIcon() != blank
                                && one2.getIcon() != blank
                                && two0.getIcon() != blank
                                && two1.getIcon() != blank
                                && two2.getIcon() != blank){
                            stalemate();
                        }
                        
                    }
                    else{
                        zero1.setIcon(markO);
                        x = 0;
                        zero1.setEnabled(false);
                        if(zero2.getIcon() == markO && zero0.getIcon() == markO
                        || one1.getIcon() == markO && two1.getIcon() == markO){
                            zero1.setIcon(markO_D);
                            one1.setIcon(markO_D);
                            two1.setIcon(markO_D);
                            score0++;
                            infoBox("Result = O wins, Score = X:" + scoreX + " O:" + score0);
                        }
                        else if(zero0.getIcon() != blank
                                && zero1.getIcon() != blank
                                && zero2.getIcon() != blank
                                && one0.getIcon() != blank
                                && one1.getIcon() != blank
                                && one2.getIcon() != blank
                                && two0.getIcon() != blank
                                && two1.getIcon() != blank
                                && two2.getIcon() != blank){
                            stalemate();
                        }
                    } 
                } 
            }
        });
        zero2 = new JButton(blank);
        add(zero2);
        zero2.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                if(enable){
                    if(x == 0){
                        zero2.setIcon(markX);
                        x = 1;
                        zero2.setEnabled(false);
                        if(zero1.getIcon() == markX && zero0.getIcon() == markX
                        || one1.getIcon() == markX && two0.getIcon() == markX
                        || one2.getIcon() == markX && two2.getIcon() == markX){
                            scoreX++;
                            infoBox("Result = X wins, Score = X:" + scoreX + " O:" + score0);
                        }
                        else if(zero0.getIcon() != blank
                                && zero1.getIcon() != blank
                                && zero2.getIcon() != blank
                                && one0.getIcon() != blank
                                && one1.getIcon() != blank
                                && one2.getIcon() != blank
                                && two0.getIcon() != blank
                                && two1.getIcon() != blank
                                && two2.getIcon() != blank){
                            stalemate();
                        }
                    }
                    else{
                        zero2.setIcon(markO);
                        x = 0;
                        zero2.setEnabled(false);
                        if(zero1.getIcon() == markO && zero0.getIcon() == markO
                        || one1.getIcon() == markO && two0.getIcon() == markO
                        || one2.getIcon() == markO && two2.getIcon() == markO){
                            score0++;
                            infoBox("Result = O wins, Score = X:" + scoreX + " O:" + score0);
                        }
                        else if(zero0.getIcon() != blank
                                && zero1.getIcon() != blank
                                && zero2.getIcon() != blank
                                && one0.getIcon() != blank
                                && one1.getIcon() != blank
                                && one2.getIcon() != blank
                                && two0.getIcon() != blank
                                && two1.getIcon() != blank
                                && two2.getIcon() != blank){
                            stalemate();
                        }
                    } 
                } 
            }
        });
        one0 = new JButton(blank);
        add(one0);
        one0.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                if(enable){
                    if(x == 0){
                        one0.setIcon(markX);
                        x = 1;
                        one0.setEnabled(false);
                        if(one1.getIcon() == markX && one2.getIcon() == markX
                        || zero0.getIcon() == markX && two0.getIcon() == markX){
                            scoreX++;
                            infoBox("Result = X wins, Score = X:" + scoreX + " O:" + score0);
                        }
                        else if(zero0.getIcon() != blank
                                && zero1.getIcon() != blank
                                && zero2.getIcon() != blank
                                && one0.getIcon() != blank
                                && one1.getIcon() != blank
                                && one2.getIcon() != blank
                                && two0.getIcon() != blank
                                && two1.getIcon() != blank
                                && two2.getIcon() != blank){
                            stalemate();
                        }
                    }
                    else{
                        one0.setIcon(markO);
                        x = 0;
                        one0.setEnabled(false);
                        if(one1.getIcon() == markO && one2.getIcon() == markO
                        || zero0.getIcon() == markO && two0.getIcon() == markO){
                            score0++;
                            infoBox("Result = O wins, Score = X:" + scoreX + " O:" + score0);
                        }
                        else if(zero0.getIcon() != blank
                                && zero1.getIcon() != blank
                                && zero2.getIcon() != blank
                                && one0.getIcon() != blank
                                && one1.getIcon() != blank
                                && one2.getIcon() != blank
                                && two0.getIcon() != blank
                                && two1.getIcon() != blank
                                && two2.getIcon() != blank){
                            stalemate();
                        }
                    } 
                }  
            }
        });
        one1 = new JButton(blank);
        add(one1);
        one1.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                if(enable){
                    if(x == 0){
                        one1.setIcon(markX);
                        x = 1;
                        one1.setEnabled(false);
                        if(one0.getIcon() == markX && one2.getIcon() == markX
                        || zero1.getIcon() == markX && two1.getIcon() == markX){
                            scoreX++;
                            infoBox("Result = X wins, Score = X:" + scoreX + " O:" + score0);
                        }
                        else if(zero0.getIcon() != blank
                                && zero1.getIcon() != blank
                                && zero2.getIcon() != blank
                                && one0.getIcon() != blank
                                && one1.getIcon() != blank
                                && one2.getIcon() != blank
                                && two0.getIcon() != blank
                                && two1.getIcon() != blank
                                && two2.getIcon() != blank){
                            stalemate();
                        }
                    }
                    else{
                        one1.setIcon(markO);
                        x = 0;
                        one1.setEnabled(false);
                        if(one2.getIcon() == markO && one0.getIcon() == markO
                        || zero1.getIcon() == markO && two1.getIcon() == markO){
                            score0++;
                            infoBox("Result = O wins, Score = X:" + scoreX + " O:" + score0);
                        }
                        else if(zero0.getIcon() != blank
                                && zero1.getIcon() != blank
                                && zero2.getIcon() != blank
                                && one0.getIcon() != blank
                                && one1.getIcon() != blank
                                && one2.getIcon() != blank
                                && two0.getIcon() != blank
                                && two1.getIcon() != blank
                                && two2.getIcon() != blank){
                            stalemate();
                        }
                    } 
                }  
            }
        });
        one2 = new JButton(blank);
        add(one2);
        one2.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                if(enable){
                    if(x == 0){
                        one2.setIcon(markX);
                        x = 1;
                        one2.setEnabled(false);
                        if(one1.getIcon() == markX && one0.getIcon() == markX
                        || zero2.getIcon() == markX && two2.getIcon() == markX){
                            scoreX++;
                            infoBox("Result = X wins, Score = X:" + scoreX + " O:" + score0);
                        }
                        else if(zero0.getIcon() != blank
                                && zero1.getIcon() != blank
                                && zero2.getIcon() != blank
                                && one0.getIcon() != blank
                                && one1.getIcon() != blank
                                && one2.getIcon() != blank
                                && two0.getIcon() != blank
                                && two1.getIcon() != blank
                                && two2.getIcon() != blank){
                            stalemate();
                        }
                    }
                    else{
                        one2.setIcon(markO);
                        x = 0;
                        one2.setEnabled(false);
                        if(one1.getIcon() == markO && one0.getIcon() == markO
                        || zero2.getIcon() == markO && two2.getIcon() == markO){
                            score0++;
                            infoBox("Result = O wins, Score = X:" + scoreX + " O:" + score0);
                        }
                        else if(zero0.getIcon() != blank
                                && zero1.getIcon() != blank
                                && zero2.getIcon() != blank
                                && one0.getIcon() != blank
                                && one1.getIcon() != blank
                                && one2.getIcon() != blank
                                && two0.getIcon() != blank
                                && two1.getIcon() != blank
                                && two2.getIcon() != blank){
                            stalemate();
                        }
                    } 
                }  
            }
        });
        two0 = new JButton(blank);
        add(two0);
        two0.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                if(enable){
                    if(x == 0){
                        two0.setIcon(markX);
                        x = 1;
                        two0.setEnabled(false);
                        if(two1.getIcon() == markX && two2.getIcon() == markX
                        || one1.getIcon() == markX && zero2.getIcon() == markX
                        || one0.getIcon() == markX && zero0.getIcon() == markX){
                            scoreX++;
                            infoBox("Result = X wins, Score = X:" + scoreX + " O:" + score0);
                        }
                        else if(zero0.getIcon() != blank
                                && zero1.getIcon() != blank
                                && zero2.getIcon() != blank
                                && one0.getIcon() != blank
                                && one1.getIcon() != blank
                                && one2.getIcon() != blank
                                && two0.getIcon() != blank
                                && two1.getIcon() != blank
                                && two2.getIcon() != blank){
                            stalemate();
                        }
                    }
                    else{
                        two0.setIcon(markO);
                        x = 0;
                        two0.setEnabled(false);
                        if(two1.getIcon() == markO && two2.getIcon() == markO
                        || one1.getIcon() == markO && zero2.getIcon() == markO
                        || one0.getIcon() == markO && zero0.getIcon() == markO){
                            score0++;
                            infoBox("Result = O wins, Score = X:" + scoreX + " O:" + score0);
                        }
                        else if(zero0.getIcon() != blank
                                && zero1.getIcon() != blank
                                && zero2.getIcon() != blank
                                && one0.getIcon() != blank
                                && one1.getIcon() != blank
                                && one2.getIcon() != blank
                                && two0.getIcon() != blank
                                && two1.getIcon() != blank
                                && two2.getIcon() != blank){
                            stalemate();
                        }
                    } 
                } 
            }
        });
        two1 = new JButton(blank);
        add(two1);
        two1.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                if(enable){
                    if(x == 0){
                        two1.setIcon(markX);
                        x = 1;
                        two1.setEnabled(false);
                        if(two0.getIcon() == markX && two2.getIcon() == markX
                        || one1.getIcon() == markX && zero1.getIcon() == markX){
                            scoreX++;
                            infoBox("Result = X wins, Score = X:" + scoreX + " O:" + score0);
                        }
                        else if(zero0.getIcon() != blank
                                && zero1.getIcon() != blank
                                && zero2.getIcon() != blank
                                && one0.getIcon() != blank
                                && one1.getIcon() != blank
                                && one2.getIcon() != blank
                                && two0.getIcon() != blank
                                && two1.getIcon() != blank
                                && two2.getIcon() != blank){
                            stalemate();
                        }
                    }
                    else{
                        two1.setIcon(markO);
                        x = 0;
                        two1.setEnabled(false);
                        if(two2.getIcon() == markO && two0.getIcon() == markO
                        || one1.getIcon() == markO && zero1.getIcon() == markO){
                            score0++;
                            infoBox("Result = O wins, Score = X:" + scoreX + " O:" + score0);
                        }
                        else if(zero0.getIcon() != blank
                                && zero1.getIcon() != blank
                                && zero2.getIcon() != blank
                                && one0.getIcon() != blank
                                && one1.getIcon() != blank
                                && one2.getIcon() != blank
                                && two0.getIcon() != blank
                                && two1.getIcon() != blank
                                && two2.getIcon() != blank){
                            stalemate();
                        }
                    } 
                }  
            }
        });
        two2 = new JButton(blank);
        add(two2);
        two2.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                if(enable){
                    if(x == 0){
                        two2.setIcon(markX);
                        x = 1;
                        two2.setEnabled(false);
                        if(two1.getIcon() == markX && two0.getIcon() == markX
                        || one1.getIcon() == markX && zero0.getIcon() == markX
                        || one2.getIcon() == markX && zero2.getIcon() == markX){
                            scoreX++;
                            infoBox("Result = X wins, Score = X:" + scoreX + " O:" + score0);
                        }
                        else if(zero0.getIcon() != blank
                                && zero1.getIcon() != blank
                                && zero2.getIcon() != blank
                                && one0.getIcon() != blank
                                && one1.getIcon() != blank
                                && one2.getIcon() != blank
                                && two0.getIcon() != blank
                                && two1.getIcon() != blank
                                && two2.getIcon() != blank){
                            stalemate();
                        }
                    }
                    else{
                        two2.setIcon(markO);
                        x = 0;
                        two2.setEnabled(false);
                        if(two1.getIcon() == markO && two0.getIcon() == markO
                        || one1.getIcon() == markO && zero0.getIcon() == markO
                        || one2.getIcon() == markO && zero2.getIcon() == markO){
                            score0++;
                            infoBox("Result = O wins, Score = X:" + scoreX + " O:" + score0);
                        }
                        else if(zero0.getIcon() != blank
                                && zero1.getIcon() != blank
                                && zero2.getIcon() != blank
                                && one0.getIcon() != blank
                                && one1.getIcon() != blank
                                && one2.getIcon() != blank
                                && two0.getIcon() != blank
                                && two1.getIcon() != blank
                                && two2.getIcon() != blank){
                            stalemate();
                        }
                    } 
                } 
            }
        });
    }
    
    public void infoBox(String result)
    {
        //JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
        Object options[] = {"New Round", "Restart", "Exit"};
        int r = JOptionPane.showOptionDialog(null,
                             result,
                             "Game End",
                             JOptionPane.YES_NO_OPTION,
                             JOptionPane.INFORMATION_MESSAGE,
                             null,             
                             options,
                             "Replay");
        if(r == 1){
            reset();
        }
        else if(r == 0){
            newRound();
        }
        else{
            System.exit(0);
        }
    }

    public void stalemate()
    {
        Object options[] = {"New Round", "Restart", "Exit"};
        int r = JOptionPane.showOptionDialog(null,
                             "No Winner",
                             "Game End",
                             JOptionPane.YES_NO_OPTION,
                             JOptionPane.INFORMATION_MESSAGE,
                             null,             
                             options,
                             "Replay");
        if(r == 1){
            reset();
        }
        else if(r == 0){
            newRound();
        }
        else{
            System.exit(0);
        }
    }
    
    public void reset(){
        zero0.setEnabled(true);
        zero0.setIcon(blank);
        zero1.setEnabled(true);
        zero1.setIcon(blank);
        zero2.setEnabled(true);
        zero2.setIcon(blank);
        one0.setEnabled(true);
        one0.setIcon(blank);
        one1.setEnabled(true);
        one1.setIcon(blank);
        one2.setEnabled(true);
        one2.setIcon(blank);
        two0.setEnabled(true);
        two0.setIcon(blank);
        two1.setEnabled(true);
        two1.setIcon(blank);
        two2.setEnabled(true);
        two2.setIcon(blank);
        score0 = 0;
        scoreX = 0;
        x = 0;
    }        

    public void newRound(){
        zero0.setEnabled(true);
        zero0.setIcon(blank);
        zero1.setEnabled(true);
        zero1.setIcon(blank);
        zero2.setEnabled(true);
        zero2.setIcon(blank);
        one0.setEnabled(true);
        one0.setIcon(blank);
        one1.setEnabled(true);
        one1.setIcon(blank);
        one2.setEnabled(true);
        one2.setIcon(blank);
        two0.setEnabled(true);
        two0.setIcon(blank);
        two1.setEnabled(true);
        two1.setIcon(blank);
        two2.setEnabled(true);
        two2.setIcon(blank);
        x = 0;
    }
       
    public static void main(String args[]){
        TTT ttt = new TTT();
        ttt.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ttt.setSize(295, 340);
        ttt.setVisible(true);
        ttt.setTitle("Tic-Tac-Toe");
    }
}