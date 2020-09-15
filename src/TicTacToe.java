import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class TicTacToe extends JFrame {

    public ArrayList<String> values = new ArrayList<>();

    public static void main(String[] args) {
        new TicTacToe().initial();
        new TicTacToe().gui();
    }

    private int ronde = 1;

    public void initial(){
        values.clear();
        for (int i = 0; i < 9; i++){
            values.add("-");
        }
        System.out.println(values.size());
    }

    public void gui() {
        System.out.println(values);
        TicTacToe frame = new TicTacToe();
        frame.setSize(300, 337);
        frame.setTitle("Tic Tac Toe");
        //frame.setResizable(false);
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

        window.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int width = window.getWidth();
                int height = window.getHeight();
                int xLoc = e.getX();
                int yloc = e.getY();

                if (xLoc < (width / 3) && yloc < (height / 3)){
                    System.out.println("l1");
                    if (ronde%2 == 1){
                        System.out.println("player 1");

                    } else{
                        System.out.println("player 2");

                    }
                } else if (xLoc < (width / 3) * 2 && yloc < (height / 3)){
                    System.out.println("m1");
                    if (ronde%2 == 1){
                        System.out.println("player 1");
                    } else{
                        System.out.println("player 2");
                    }
                } else if (xLoc < (width / 3) * 3 && yloc < (height / 3)){
                    System.out.println("r1");
                    if (ronde%2 == 1){
                        System.out.println("player 1");
                    } else{
                        System.out.println("player 2");
                    }
                }
                ronde++;
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
}
