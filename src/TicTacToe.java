import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TicTacToe extends JFrame {

    public static void main(String[] args) {
        gui();
    }

    public static void gui() {
        TicTacToe frame = new TicTacToe();
        frame.setSize(600, 600);
        frame.setTitle("Tic Tac Toe");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container window = frame.getContentPane();
        window.setLayout(new GridLayout(3, 3));

        Panel l1 = new Panel();
        Panel m1 = new Panel();
        Panel r1 = new Panel();
        Panel l2 = new Panel();
        Panel m2 = new Panel();
        Panel r2 = new Panel();
        Panel l3 = new Panel();
        Panel m3 = new Panel();
        Panel r3 = new Panel();

        window.add(l1);
        window.add(m1);
        window.add(r1);
        window.add(l2);
        window.add(m2);
        window.add(r2);
        window.add(l3);
        window.add(m3);
        window.add(r3);

        l1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("lafds");
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

        m1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("31");
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

        r1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("rechts");
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


    }

    public static void logic(){

    }

    public void nought(){

    }

    public void cross(){

    }
}
