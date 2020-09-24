import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;

public class TicTacToe extends JFrame {
    public static void main(String[] args) {
        new TicTacToe().initial();
        new TicTacToe().gui();
    }

    /*
    Some public variables for keeping track of the course of the game
     */
    public static ArrayList<String> values = new ArrayList<>(); //ArrayList to know which squares are filled by each shape
    private int turn = 1; //makes it possible to alternate the turns
    private int player1 = 0; //the score of player 1
    private int player2 = 0; //the score of player 2

    /**
     * Fills the ArrayList values with fillers
     */
    public void initial(){
        for (int i = 0; i < 9; i++){
            values.add("-");
        }
    }

    /**
     * The gui and the main logic of the game.
     */
    public void gui() {
        TicTacToe frame = new TicTacToe();
        frame.setSize(300, 337);
        frame.setTitle("Tic Tac Toe");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container window = frame.getContentPane();
        window.setLayout(new GridLayout(3, 3));

        JPanel l1 = new JPanel();
        l1.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel m1 = new JPanel();
        m1.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel r1 = new JPanel();
        r1.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel l2 = new JPanel();
        l2.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel m2 = new JPanel();
        m2.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel r2 = new JPanel();
        r2.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel l3 = new JPanel();
        l3.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel m3 = new JPanel();
        m3.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel r3 = new JPanel();
        r3.setBorder(BorderFactory.createLineBorder(Color.black));

        window.add(l1);
        window.add(m1);
        window.add(r1);
        window.add(l2);
        window.add(m2);
        window.add(r2);
        window.add(l3);
        window.add(m3);
        window.add(r3);

        ArrayList<JPanel> squares = new ArrayList<>(Arrays.asList(l1, m1, r1, l2, m2, r2, l3, m3, r3));

        window.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int width = window.getWidth();
                int height = window.getHeight();
                int xLoc = e.getX();
                int yloc = e.getY();

                if (xLoc < (width / 3) && yloc < (height / 3)){
                    if (turn %2 == 1){
                        if (values.get(0).equals("-")) {
                            circle(l1.getGraphics(), l1.getWidth(), l1.getHeight(), 0);
                        }
                    } else{
                        if (values.get(0).equals("-")) {
                            cross(l1.getGraphics(), l1.getWidth(), l1.getHeight(), 0);
                        }
                    }
                }

                else if (xLoc < (width / 3) * 2 && yloc < (height / 3)){
                    if (turn %2 == 1){
                        if (values.get(1).equals("-")) {
                            circle(m1.getGraphics(), m1.getWidth(), m1.getHeight(), 1);
                        }
                    } else{
                        if (values.get(1).equals("-")) {
                            cross(m1.getGraphics(), m1.getWidth(), m1.getHeight(), 1);
                        }
                    }
                }

                else if (xLoc < (width / 3) * 3 && yloc < (height / 3)){
                    if (turn %2 == 1){
                        if (values.get(2).equals("-")) {
                            circle(r1.getGraphics(), r1.getWidth(), r1.getHeight(), 2);
                        }
                    } else{
                        if (values.get(2).equals("-")) {
                            cross(r1.getGraphics(), r1.getWidth(), r1.getHeight(), 2);
                        }
                    }
                }

                else if (xLoc < (width / 3) && yloc < (height / 3) * 2){
                    if (turn %2 == 1){
                        if (values.get(3).equals("-")) {
                            circle(l2.getGraphics(), l2.getWidth(), l2.getHeight(), 3);
                        }
                    } else{
                        if (values.get(3).equals("-")) {
                            cross(l2.getGraphics(), l2.getWidth(), l2.getHeight(), 3);
                        }
                    }
                }

                else if (xLoc < (width / 3) * 2 && yloc < (height / 3) * 2){
                    if (turn %2 == 1){
                        if (values.get(4).equals("-")) {
                            circle(m2.getGraphics(), m2.getWidth(), m2.getHeight(), 4);
                        }
                    } else{
                        if (values.get(4).equals("-")) {
                            cross(m2.getGraphics(), m2.getWidth(), m2.getHeight(), 4);
                        }
                    }
                }

                else if (xLoc < (width / 3) * 3 && yloc < (height / 3) * 2){
                    if (turn %2 == 1){
                        if (values.get(5).equals("-")) {
                            circle(r2.getGraphics(), r2.getWidth(), r2.getHeight(), 5);
                        }
                    } else{
                        if (values.get(5).equals("-")) {
                            cross(r2.getGraphics(), r2.getWidth(), r2.getHeight(), 5);
                        }
                    }
                }

                else if (xLoc < (width / 3) && yloc < (height / 3) * 3){
                    if (turn %2 == 1){
                        if (values.get(6).equals("-")) {
                            circle(l3.getGraphics(), l3.getWidth(), l3.getHeight(), 6);
                        }
                    } else{
                        if (values.get(6).equals("-")) {
                            cross(l3.getGraphics(), l3.getWidth(), l3.getHeight(), 6);
                        }
                    }
                }

                else if (xLoc < (width / 3) * 2 && yloc < (height / 3) * 3){
                    if (turn %2 == 1){
                        if (values.get(7).equals("-")) {
                            circle(m3.getGraphics(), m3.getWidth(), m3.getHeight(), 7);
                        }
                    } else{
                        if (values.get(7).equals("-")) {
                            cross(m3.getGraphics(), m3.getWidth(), m3.getHeight(), 7);
                        }
                    }
                }

                else if (xLoc < (width / 3) * 3 && yloc < (height / 3) * 3){
                    if (turn %2 == 1){
                        if (values.get(8).equals("-")) {
                            circle(r3.getGraphics(), r3.getWidth(), r3.getHeight(), 8);
                        }
                    } else{
                        if (values.get(8).equals("-")) {
                            cross(r3.getGraphics(), r3.getWidth(), r3.getHeight(), 8);
                        }
                    }
                }

                if (checkWon(frame)){
                    int reply = JOptionPane.showConfirmDialog(frame, "Do you want to play again?",
                            "Continue?", JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION) {
                        frame.setVisible(false);
                        for (JPanel square : squares) {
                            clearField(square.getGraphics(), square.getWidth(), square.getHeight());
                        }
                        for (int i = 0; i < 9; i++){
                            values.set(i, "-");
                        }
                        frame.setVisible(true);
                        if (turn %2 ==1){
                            JOptionPane.showMessageDialog(frame, "First up: circle (Player 1)",
                                    "Score", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(frame, "First up: cross (Player 2)",
                                    "Score", JOptionPane.INFORMATION_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(frame, "Player 1: " + player1 + "\nPlayer 2: " + player2,
                                "Score", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
                    }
                }

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        frame.setVisible(true);

        if (turn %2 ==1){
            JOptionPane.showMessageDialog(frame, "First up: circle (Player 1)",
                    "Score", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(frame, "First up: cross (Player 2)",
                    "Score", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    /**
     * Function to draw a circle in one of the shapes
     * @param g The graphics of the square where the circle gets drawn
     * @param width The width of the square where the circle gets drawn
     * @param height The height of the square where the circle gets drawn
     * @param position The number of the square where the circle gets drawn
     */
    private void circle(Graphics g, int width, int height, int position){
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.blue);
        g2D.setStroke(new BasicStroke(10F));
        g2D.drawOval(5, 5, width - 10, height - 10);
        values.set(position, "O");
        turn++;
    }

    /**
     * Function to draw a cross in one of the shapes
     * @param g The graphics of the square where the cross gets drawn
     * @param width The width of the square where the cross gets drawn
     * @param height The height of the square where the cross gets drawn
     * @param position The number of the square where the cross gets drawn
     */
    private void cross(Graphics g, int width, int height, int position){
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.red);
        g2D.setStroke(new BasicStroke(10F));
        g2D.drawLine(0, 0, width, height);
        g2D.drawLine(width, 0, 0, height);
        values.set(position, "X");
        turn++;
    }


    /**
     * The logic to check who's the winner of the game
     * @param frame The gui created in the function gui(), used as parent component for the MessageDialog.
     * @return A boolean. True if the game has come to an end, false if there are ampty square and no one has won.
     */
    private boolean checkWon(TicTacToe frame){
        if (values.get(0).equals("O") && values.get(1).equals("O") && values.get(2).equals("O") ||
            values.get(3).equals("O") && values.get(4).equals("O") && values.get(5).equals("O") ||
            values.get(6).equals("O") && values.get(7).equals("O") && values.get(8).equals("O") ||
            values.get(0).equals("O") && values.get(3).equals("O") && values.get(6).equals("O") ||
            values.get(1).equals("O") && values.get(4).equals("O") && values.get(7).equals("O") ||
            values.get(2).equals("O") && values.get(5).equals("O") && values.get(8).equals("O") ||
            values.get(0).equals("O") && values.get(4).equals("O") && values.get(8).equals("O") ||
            values.get(2).equals("O") && values.get(4).equals("O") && values.get(6).equals("O")) {
            JOptionPane.showMessageDialog(frame, "Player 1 Wins!!!", "Winner!", JOptionPane.INFORMATION_MESSAGE);
            player1 ++;
            return true;
        } else if (values.get(0).equals("X") && values.get(1).equals("X") && values.get(2).equals("X") ||
                   values.get(3).equals("X") && values.get(4).equals("X") && values.get(5).equals("X") ||
                   values.get(6).equals("X") && values.get(7).equals("X") && values.get(8).equals("X") ||
                   values.get(0).equals("X") && values.get(3).equals("X") && values.get(6).equals("X") ||
                   values.get(1).equals("X") && values.get(4).equals("X") && values.get(7).equals("X") ||
                   values.get(2).equals("X") && values.get(5).equals("X") && values.get(8).equals("X") ||
                   values.get(0).equals("X") && values.get(4).equals("X") && values.get(8).equals("X") ||
                   values.get(2).equals("X") && values.get(4).equals("X") && values.get(6).equals("X")){
            JOptionPane.showMessageDialog(frame, "Player 2 Wins!!!", "Winner!", JOptionPane.INFORMATION_MESSAGE);
            player2 ++;
            return true;
        } else if (!values.contains("-")) {
            JOptionPane.showMessageDialog(frame, "Oops, it's a draw...", "Draw", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        return false;
    }

    /**
     * Clears the playing field
     * @param g The graphics of the square that needs to be emptied
     * @param width The width of the square that needs to be emptied
     * @param height The height of the square that needs to be emptied
     */
    public void clearField(Graphics g, int width, int height){
        g.clearRect(0, 0, width, height);
    }
}