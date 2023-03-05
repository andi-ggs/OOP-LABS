import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Vector;

public class Problema5 extends JFrame implements ActionListener {
    JFrame frame;

    JButton button;

    Vector<Color> vector;

    Color def;

    static int i = 0;

    public Problema5() {
        super("Problema 5");

        frame = new JFrame();
        frame.setLayout(new FlowLayout());
        button = new JButton("Colors");
        vector = new Vector();
        vector.add(Color.RED);
        vector.add(Color.BLUE);
        vector.add(Color.GRAY);
        vector.add(Color.cyan);
        vector.add(Color.pink);
        vector.add(Color.yellow);

        button.addActionListener(this);
        button.setBackground(vector.get(i));
        button.setForeground(Color.black);
        button.setMnemonic(KeyEvent.VK_C);


        frame.add(button, BorderLayout.CENTER);
        frame.setSize(100, 100);
        pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            i++;
            if( i >= vector.size())
                i = 0;

            button.setBackground(vector.get(i));
            }
        }
    }
