package labs.lab7;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CatchButtonGameV2 {
    private JFrame frame;
    private JButton[] buttons;
    private int index;

    public CatchButtonGameV2(int numButtons) {
        frame = new JFrame("Catch me if you can!");
        buttons = new JButton[numButtons];

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout((int) Math.sqrt(numButtons), (int) Math.sqrt(numButtons)));
        frame.setSize(600, 600);
        frame.setVisible(true);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            frame.add(buttons[i]);
        }

        MouseListener l = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JButton b = (JButton) e.getSource();
                b.setText("");
                b.removeMouseListener(this);
                index = (index + (int) (Math.random() * (buttons.length - 1) + 1)) % buttons.length;
                buttons[index].addMouseListener(this);
                buttons[index].setText("Click me");
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };

        index = (index + (int) (Math.random() * (buttons.length - 1) + 1)) % buttons.length;
        buttons[index].addMouseListener(l);
        buttons[index].setText("Click me");
    }

    public static void main(String[] args) {
        new CatchButtonGameV2(Integer.parseInt(args[0]));
    }
}