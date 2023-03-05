import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExempluSwing extends JFrame{
    public ExempluSwing ( String titlu ) {
        super ( titlu );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// pt inchiderea ferestrei
        setLayout (new FlowLayout ());
        add( new JLabel ("Swing"));
        JButton b = new JButton ("Close");
        add(b);
        pack ();
        setVisible(true);
    }
}
