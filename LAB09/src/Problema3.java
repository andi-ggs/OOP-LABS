import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Problema3 extends JFrame implements ItemListener, ActionListener {
    JTextField quiz;
    JCheckBox r1, r2, r3, r4;
    //ButtonGroup group;
    JButton button;
    JLabel label;

    public Problema3(String fis) {
        super("Problema 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("", JLabel.CENTER);
        label.setSize(100, 100);

        quiz = new JTextField(50);
        quiz.setEditable(false);
        r1 = new JCheckBox();
        r2 = new JCheckBox();
        r3 = new JCheckBox();
        r4 = new JCheckBox();
        JPanel rb = new JPanel();
        rb.setLayout(new GridLayout(4, 1));
        rb.add(r1);
        rb.add(r2);
        rb.add(r3);
        rb.add(r4);

        button = new JButton("Raspunde");
        button.setEnabled(false);
        button.addActionListener(this);

        r1.addItemListener(this);
        r2.addItemListener(this);
        r3.addItemListener(this);
        r4.addItemListener(this);

        add(quiz, BorderLayout.NORTH);
        add(rb, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);


        quiz.add(label);

        pack();

        setVisible(true);
        try {
            RandomAccessFile br = new RandomAccessFile(fis, "r");
            quiz.setText(br.readLine());
            r1.setText(br.readLine());
            r2.setText(br.readLine());
            r3.setText(br.readLine());
            r4.setText(br.readLine());

        } catch (IOException ex) {
            System.err.println("Exceptie");
        }
    }

    public void itemStateChanged(ItemEvent e) {

        if (e.getSource() instanceof JCheckBox) {
            button.setEnabled(true);
        }
}

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() instanceof JCheckBox) {
                button.setEnabled(true);
            } else if (e.getSource() instanceof JButton) {
                if (r1.isSelected() || r3.isSelected()) {
                    r1.setForeground(Color.green);
                    r3.setForeground(Color.green);
                    r2.setForeground(Color.red);
                    r4.setForeground(Color.red);
                } else {
                    r1.setForeground(Color.green);
                    r3.setForeground(Color.green);
                    r2.setForeground(Color.red);
                    r4.setForeground(Color.red);
                }
                button.setEnabled(false);
            }
        }
    }