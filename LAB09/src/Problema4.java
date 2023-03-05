import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Problema4 extends JFrame implements ChangeListener {

    JSlider c1,c2,c3;

    JPanel panel;

    JTextField label;

    JFrame text;

    JLabel  labelR, labelG, labelB;

    Color color;

    int red, green, blue, val;


    public Problema4(){
        super("Problema 4");
        c1 = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        c2 = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        c3 = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);

        text = new JFrame();
        panel = new JPanel();
        label = new JTextField(20);
        labelR = new JLabel("RED");
        labelR.setFont(new Font("Serif", Font.BOLD, 20));
        labelB = new JLabel("BLUE");
        labelR.setFont(new Font("Serif", Font.BOLD, 20));
        labelG = new JLabel("GREEN");
        labelR.setFont(new Font("Serif", Font.BOLD, 20));
        Font font = new Font("Serif", Font.BOLD, 20);
        label.setFont(font);

        red = 0;
        blue = 0;
        green = 0;
        color = new Color(red, green, blue);

        c1.setPaintTicks(true);
        c1.setPaintTicks(true);
        c1.setPaintLabels(true);

        c2.setPaintTicks(true);
        c2.setPaintTicks(true);
        c2.setPaintLabels(true);

        c3.setPaintTicks(true);
        c3.setPaintTicks(true);
        c3.setPaintLabels(true);

        c1.setMajorTickSpacing(50);
        c1.setMinorTickSpacing(5);

        c2.setMajorTickSpacing(50);
        c2.setMinorTickSpacing(5);

        c3.setMajorTickSpacing(50);
        c3.setMinorTickSpacing(5);

        c1.setBackground(Color.red);
        c2.setBackground(Color.green);
        c3.setBackground(Color.blue);

        c3.setEnabled(true);
        c2.setEnabled(true);
        c1.setEnabled(true);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setAlignmentX(Component.LEFT_ALIGNMENT);

        panel.add(labelR);
        panel.add(c1);
        panel.add(labelB);
        panel.add(c2);
        panel.add(labelG);
        panel.add(c3);
        panel.add(label);

        c1.addChangeListener(this);
        c2.addChangeListener(this);
        c3.addChangeListener(this);

        text.add(panel, BorderLayout.NORTH);

        text.setSize(800,300);

        pack();

        text.setVisible(true);

        text.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource() instanceof  JSlider) {
            if(e.getSource() == c1)
                red = ((JSlider) e.getSource()).getValue();
            else if(e.getSource() == c2)
                green = ((JSlider) e.getSource()).getValue();
            else
                blue = ((JSlider) e.getSource()).getValue();
        }
        val = green + blue + red;
        label.setText("Valoarea cursorului este: "  + val);
        }
    }
