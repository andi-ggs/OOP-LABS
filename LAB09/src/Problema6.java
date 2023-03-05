import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Problema6 extends JFrame implements ActionListener {

    JFrame frame;

    JTextField text;

    JLabel label;

    JPanel panel;

    JButton button;

    JScrollPane scrollpanel;

    JTextArea textarea;

    public Problema6(){
        super("Problema 6");

        button = new JButton("OK");
        frame = new JFrame();
        frame.setLayout(new FlowLayout());
        label = new JLabel("Path");
        text = new JTextField(50);
        textarea = new JTextArea(10,50);
        scrollpanel = new JScrollPane(textarea);
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.addActionListener(this);

        panel.add(label);
        panel.add(text);
        panel.add(button);
        panel.add(scrollpanel);
        frame.add(panel, BorderLayout.NORTH);

        frame.setSize(800, 400);
        pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button) {
            String cale = text.getText();
            File f = new File(cale);
            if(f.exists() && !f.isDirectory()) {
                scrollpanel.setVisible(true);

                FileReader file = null;
                try {
                    file = new FileReader(f);
                }catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                BufferedReader b = new BufferedReader(file);
                String line;

                while(true){
                    try{
                        if(!((line = b.readLine()) != null)) break;
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    textarea.append(line);
                    textarea.append("\n");
                }
            }
            else {
                text.setText("");
                scrollpanel.setVisible(false);
            }
        }

    }
}
